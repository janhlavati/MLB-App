import pandas as pd
import io
import random
from time import sleep
from playwright.sync_api import sync_playwright

#List of every team abbreviation
teams = ["ARI", "ATL", "BAL", "BOS", "CHC", "CHW", "CIN", "CLE", "COL", "DET", "HOU", "KCR", "LAA",
         "LAD", "MIA", "MIL", "MIN", "NYM", "NYY", "OAK", "PHI", "PIT", "SDP", "SFG", "SEA", "STL", "TBR",
         "TEX", "TOR", "WSN"]

def scrape_by_name(team, year="2025"):
    with sync_playwright() as p:
        browser = p.chromium.launch(headless=True)
        context = browser.new_context(
            user_agent="Mozilla/5.0 (Windows NT 10.0; Win64;x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36"
        )
        page = context.new_page()

        url = f"https://www.baseball-reference.com/teams/{team}/{year}.shtml"
        print(f"Scraping {team} for {year}...")

        try:
            page.goto(url, wait_until="domcontentloaded")
            sleep(random.uniform(4,6))

            html_content = page.content()
            html_stream = io.StringIO(html_content)

            tables = pd.read_html(html_stream, attrs={'id': 'team_batting'})
            df = tables[0]

            if 'Name' in df.columns:
                df = df[~df['Name']].str.contains("Total|Rank|Average", na=False).copy()

                df['Team_Abbr'] = team
                df['Season'] = year

                return df
        except Exception as e:
            print(f"Error with {team}: {e}")
            return None
        finally:
            browser.close()

all_teams_data = []

for team in teams:
    data = scrape_by_name(teams)
    if data is not None:
        all_teams_data.append(data)

    sleep(2)

if all_teams_data:
    final_df = pd.concat(all_teams_data, ignore_index=True)
    final_df.to_csv("mlb_batting_stats_2025.csv", index=False)
    print("Success! Created mlb_batting_stats_2025.csv")
