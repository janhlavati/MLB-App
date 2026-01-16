import pandas as pd
import io
import random
from time import sleep
from playwright.sync_api import sync_playwright

#List of every team abbreviation
teams = ["ARI", "ATL", "BAL", "BOS", "CHC", "CHW", "CIN", "CLE", "COL", "DET", "HOU", "KCR", "LAA",
         "LAD", "MIA", "MIL", "MIN", "NYM", "NYY", "OAK", "PHI", "PIT", "SDP", "SFG", "SEA", "STL", "TBR",
         "TEX", "TOR", "WSN"]

def get_specific_team_urls(teams, year="2025"):
    with sync_playwright() as p:
        browser = p.chromium.launch(headless=True)
        context = browser.new_context(
            user_agent="Mozilla/5.0 (Windows NT 10.0; Win64;x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36"
        )
        page = context.new_page()

        url = f"https://www.baseball-reference.com/teams/{teams}/{year}.shtml"
        print(f"Scraping {teams} for {year}...")
