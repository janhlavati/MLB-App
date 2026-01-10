package com.mlb_app.MLB_App.Player;

public class Batter {

    private String name;
    private int age;
    private String team;
    private String league;
    private double war;
    private int g;
    private int pa;
    private int ab;
    private int r;
    private int h;
    private int doubles;
    private int triples;
    private int hr;
    private int rbi;
    private int sb;
    private int cs;
    private int bb;
    private int so;
    private double ba;
    private double obp;
    private double slg;
    private double ops;
    private double opsPlus;
    private double rOba;
    private int rBatPlus;
    private int tb;
    private int gidp;
    private int hbp;
    private int sh;
    private int sf;
    private int ibb;
    private String pos;
    private String awards;

    public Batter() {

    }

    public Batter(String name, int age, String team, String league, double war, int g, int pa, int ab, int r, int h, int doubles, int triples, int hr, int rbi, int sb, int cs, int bb, int so, double ba, double obp, double slg, double ops, double opsPlus, double rOba, int rBatPlus, int tb, int gidp, int hbp, int sh, int sf, int ibb, String pos, String awards) {
        this.name = name;
        this.age = age;
        this.team = team;
        this.league = league;
        this.war = war;
        this.g = g;
        this.pa = pa;
        this.ab = ab;
        this.r = r;
        this.h = h;
        this.doubles = doubles;
        this.triples = triples;
        this.hr = hr;
        this.rbi = rbi;
        this.sb = sb;
        this.cs = cs;
        this.bb = bb;
        this.so = so;
        this.ba = ba;
        this.obp = obp;
        this.slg = slg;
        this.ops = ops;
        this.opsPlus = opsPlus;
        this.rOba = rOba;
        this.rBatPlus = rBatPlus;
        this.tb = tb;
        this.gidp = gidp;
        this.hbp = hbp;
        this.sh = sh;
        this.sf = sf;
        this.ibb = ibb;
        this.pos = pos;
        this.awards = awards;
    }
}
