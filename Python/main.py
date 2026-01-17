import pandas as pd
import io
import random
from time import sleep
from bs4 import BeautifulSoup
from playwright.sync_api import sync_playwright

#List of every team abbreviation
teams = ["ARI", "ATL", "BAL", "BOS", "CHC", "CHW", "CIN", "CLE", "COL", "DET", "HOU", "KCR", "LAA",
         "LAD", "MIA", "MIL", "MIN", "NYM", "NYY", "OAK", "PHI", "PIT", "SDP", "SFG", "SEA", "STL", "TBR",
         "TEX", "TOR", "WSN"]

def scrape_by_name(team, year="2025"):
    with sync_playwright() as p:
        browser = p.chromium.launch(headless=True)
        page = browser.new_page()

        url = f"https://www.baseball-reference.com/teams/{team}/{year}.shtml"
        print(f"Scraping {team} for {year}...")

        try:
            page.goto(url, wait_until="domcontentloaded")
            sleep(random.uniform(3,5))

            html_content = page.content()
            clean_html = html_content.replace("", "")

            soup = BeautifulSoup(clean_html, 'html.parser')
            table = soup.find('table', {'id': 'team_batting'})

            if table is None:
                table = soup.find('table', {'class': 'stats_table'})

            if table is None:
                print(f"Error: still couldn't find a table for {team}")
                return None

            df = pd.read_html(io.StringIO(str(table)))[0]

            if 'Name' in df.columns:
                df = df[~df['Name'].str.contains("Total|Rank|Average", na=False)].copy()
            df['Team_Abbr'] = team

            print(f"Captured {len(df)} players for {team}")
            return df
        except Exception as e:
            print(f"Error with {team}: {e}")
            return None
        finally:
            browser.close()

all_teams_data = []

for team in teams:
    data = scrape_by_name(team)
    if data is not None:
        all_teams_data.append(data)

    sleep(2)

if all_teams_data:
    final_df = pd.concat(all_teams_data, ignore_index=True)
    final_df.to_csv("mlb_batting_stats_2025.csv", index=False)
    print("Success! Created mlb_batting_stats_2025.csv")
