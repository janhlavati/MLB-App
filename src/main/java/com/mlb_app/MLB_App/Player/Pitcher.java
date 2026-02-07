package com.mlb_app.MLB_App.Player;

public class Pitcher {

    private String name;
    private int age;
    private String pos;
    private String team;
    private String league;
    private double war;
    private int w;
    private int l;
    private double percentage;
    private double era;
    private int g;
    private int gs;
    private int gf;
    private int cg;
    private int sho;
    private int sv;
    private double ip;
    private int h;
    private int r;
    private int er;
    private int hr;
    private int bb;
    private int ibb;
    private int so;
    private int hbp;
    private int bk;
    private int wp;
    private int bf;
    private int eraPlus;
    private double fip;
    private double whip;
    private double h9;
    private double hr9;
    private double bb9;
    private double so9;
    private double so_bb;
    private String awards;

    public Pitcher() {

    }

    public Pitcher(String name, int age, String pos, String team, String league, double war, int w, int l, double percentage, double era, int g, int gs, int gf, int cg, int sho, int sv, double ip, int h, int r, int er, int hr, int bb, int ibb, int so, int hbp, int bk, int wp, int bf, int eraPlus, double fip, double whip, double h9, double hr9, double bb9, double so9, double so_bb, String awards) {
        this.name = name;
        this.age = age;
        this.pos = pos;
        this.team = team;
        this.league = league;
        this.war = war;
        this.w = w;
        this.l = l;
        this.percentage = percentage;
        this.era = era;
        this.g = g;
        this.gs = gs;
        this.gf = gf;
        this.cg = cg;
        this.sho = sho;
        this.sv = sv;
        this.ip = ip;
        this.h = h;
        this.r = r;
        this.er = er;
        this.hr = hr;
        this.bb = bb;
        this.ibb = ibb;
        this.so = so;
        this.hbp = hbp;
        this.bk = bk;
        this.wp = wp;
        this.bf = bf;
        this.eraPlus = eraPlus;
        this.fip = fip;
        this.whip = whip;
        this.h9 = h9;
        this.hr9 = hr9;
        this.bb9 = bb9;
        this.so9 = so9;
        this.so_bb = so_bb;
        this.awards = awards;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getLeague() {
        return league;
    }

    public void setLeague(String league) {
        this.league = league;
    }

    public double getWar() {
        return war;
    }

    public void setWar(double war) {
        this.war = war;
    }

    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }

    public int getL() {
        return l;
    }

    public void setL(int l) {
        this.l = l;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public double getEra() {
        return era;
    }

    public void setEra(double era) {
        this.era = era;
    }

    public int getG() {
        return g;
    }

    public void setG(int g) {
        this.g = g;
    }

    public int getGs() {
        return gs;
    }

    public void setGs(int gs) {
        this.gs = gs;
    }

    public int getGf() {
        return gf;
    }

    public void setGf(int gf) {
        this.gf = gf;
    }

    public int getCg() {
        return cg;
    }

    public void setCg(int cg) {
        this.cg = cg;
    }

    public int getSho() {
        return sho;
    }

    public void setSho(int sho) {
        this.sho = sho;
    }

    public int getSv() {
        return sv;
    }

    public void setSv(int sv) {
        this.sv = sv;
    }

    public double getIp() {
        return ip;
    }

    public void setIp(double ip) {
        this.ip = ip;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getEr() {
        return er;
    }

    public void setEr(int er) {
        this.er = er;
    }

    public int getHr() {
        return hr;
    }

    public void setHr(int hr) {
        this.hr = hr;
    }

    public int getBb() {
        return bb;
    }

    public void setBb(int bb) {
        this.bb = bb;
    }

    public int getIbb() {
        return ibb;
    }

    public void setIbb(int ibb) {
        this.ibb = ibb;
    }

    public int getSo() {
        return so;
    }

    public void setSo(int so) {
        this.so = so;
    }

    public int getHbp() {
        return hbp;
    }

    public void setHbp(int hbp) {
        this.hbp = hbp;
    }

    public int getBk() {
        return bk;
    }

    public void setBk(int bk) {
        this.bk = bk;
    }

    public int getWp() {
        return wp;
    }

    public void setWp(int wp) {
        this.wp = wp;
    }

    public int getBf() {
        return bf;
    }

    public void setBf(int bf) {
        this.bf = bf;
    }

    public int getEraPlus() {
        return eraPlus;
    }

    public void setEraPlus(int eraPlus) {
        this.eraPlus = eraPlus;
    }

    public double getFip() {
        return fip;
    }

    public void setFip(double fip) {
        this.fip = fip;
    }

    public double getWhip() {
        return whip;
    }

    public void setWhip(double whip) {
        this.whip = whip;
    }

    public double getH9() {
        return h9;
    }

    public void setH9(double h9) {
        this.h9 = h9;
    }

    public double getHr9() {
        return hr9;
    }

    public void setHr9(double hr9) {
        this.hr9 = hr9;
    }

    public double getBb9() {
        return bb9;
    }

    public void setBb9(double bb9) {
        this.bb9 = bb9;
    }

    public double getSo9() {
        return so9;
    }

    public void setSo9(double so9) {
        this.so9 = so9;
    }

    public double getSo_bb() {
        return so_bb;
    }

    public void setSo_bb(double so_bb) {
        this.so_bb = so_bb;
    }

    public String getAwards() {
        return awards;
    }

    public void setAwards(String awards) {
        this.awards = awards;
    }
}
