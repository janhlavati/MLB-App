package com.mlb_app.MLB_App.Player;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="batters")
public class Batter {

    @Id
    @Column(name = "name", nullable = false)
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

    public int getG() {
        return g;
    }

    public void setG(int g) {
        this.g = g;
    }

    public int getPa() {
        return pa;
    }

    public void setPa(int pa) {
        this.pa = pa;
    }

    public int getAb() {
        return ab;
    }

    public void setAb(int ab) {
        this.ab = ab;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public int getDoubles() {
        return doubles;
    }

    public void setDoubles(int doubles) {
        this.doubles = doubles;
    }

    public int getTriples() {
        return triples;
    }

    public void setTriples(int triples) {
        this.triples = triples;
    }

    public int getHr() {
        return hr;
    }

    public void setHr(int hr) {
        this.hr = hr;
    }

    public int getRbi() {
        return rbi;
    }

    public void setRbi(int rbi) {
        this.rbi = rbi;
    }

    public int getSb() {
        return sb;
    }

    public void setSb(int sb) {
        this.sb = sb;
    }

    public int getCs() {
        return cs;
    }

    public void setCs(int cs) {
        this.cs = cs;
    }

    public int getBb() {
        return bb;
    }

    public void setBb(int bb) {
        this.bb = bb;
    }

    public int getSo() {
        return so;
    }

    public void setSo(int so) {
        this.so = so;
    }

    public double getBa() {
        return ba;
    }

    public void setBa(double ba) {
        this.ba = ba;
    }

    public double getObp() {
        return obp;
    }

    public void setObp(double obp) {
        this.obp = obp;
    }

    public double getSlg() {
        return slg;
    }

    public void setSlg(double slg) {
        this.slg = slg;
    }

    public double getOps() {
        return ops;
    }

    public void setOps(double ops) {
        this.ops = ops;
    }

    public double getOpsPlus() {
        return opsPlus;
    }

    public void setOpsPlus(double opsPlus) {
        this.opsPlus = opsPlus;
    }

    public double getrOba() {
        return rOba;
    }

    public void setrOba(double rOba) {
        this.rOba = rOba;
    }

    public int getrBatPlus() {
        return rBatPlus;
    }

    public void setrBatPlus(int rBatPlus) {
        this.rBatPlus = rBatPlus;
    }

    public int getTb() {
        return tb;
    }

    public void setTb(int tb) {
        this.tb = tb;
    }

    public int getGidp() {
        return gidp;
    }

    public void setGidp(int gidp) {
        this.gidp = gidp;
    }

    public int getHbp() {
        return hbp;
    }

    public void setHbp(int hbp) {
        this.hbp = hbp;
    }

    public int getSh() {
        return sh;
    }

    public void setSh(int sh) {
        this.sh = sh;
    }

    public int getSf() {
        return sf;
    }

    public void setSf(int sf) {
        this.sf = sf;
    }

    public int getIbb() {
        return ibb;
    }

    public void setIbb(int ibb) {
        this.ibb = ibb;
    }

    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }

    public String getAwards() {
        return awards;
    }

    public void setAwards(String awards) {
        this.awards = awards;
    }
}
