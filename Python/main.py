import pandas as pd
import io
import random
from time import sleep
from playwright.sync_api import sync_playwright

#List of every team abbreviation
teams = ["ARI", "ATL", "BAL", "BOS", "CHC", "CHW", "CIN", "CLE", "COL", "DET", "HOU", "KCR", "LAA",
         "LAD", "MIA", "MIL", "MIN", "NYM", "NYY", "OAK", "PHI", "PIT", "SDP", "SFG", "SEA", "STL", "TBR",
         "TEX", "TOR", "WSN"]

