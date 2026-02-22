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
    private Integer age;
    private String team;
    private String league;
    private Double war;
    private Integer g;
    private Integer pa;
    private Integer ab;
    private Integer r;
    private Integer h;
    private Integer doubles;
    private Integer triples;
    private Integer hr;
    private Integer rbi;
    private Integer sb;
    private Integer cs;
    private Integer bb;
    private Integer so;
    private Double ba;
    private Double obp;
    private Double slg;
    private Double ops;
    private Double opsPlus;
    private Double rOba;
    private Integer rBatPlus;
    private Integer tb;
    private Integer gidp;
    private Integer hbp;
    private Integer sh;
    private Integer sf;
    private Integer ibb;
    private String pos;
    private String awards;

    public Batter() {

    }

    public Batter(String name, Integer age, String team, String league, Double war, Integer g, Integer pa, Integer ab, Integer r, Integer h, Integer doubles, Integer triples, Integer hr, Integer rbi, Integer sb, Integer cs, Integer bb, Integer so, Double ba, Double obp, Double slg, Double ops, Double opsPlus, Double rOba, Integer rBatPlus, Integer tb, Integer gidp, Integer hbp, Integer sh, Integer sf, Integer ibb, String pos, String awards) {
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
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

    public Double getWar() {
        return war;
    }

    public void setWar(Double war) {
        this.war = war;
    }

    public Integer getG() {
        return g;
    }

    public void setG(Integer g) {
        this.g = g;
    }

    public Integer getPa() {
        return pa;
    }

    public void setPa(Integer pa) {
        this.pa = pa;
    }

    public Integer getAb() {
        return ab;
    }

    public void setAb(Integer ab) {
        this.ab = ab;
    }

    public Integer getR() {
        return r;
    }

    public void setR(Integer r) {
        this.r = r;
    }

    public Integer getH() {
        return h;
    }

    public void setH(Integer h) {
        this.h = h;
    }

    public Integer getDoubles() {
        return doubles;
    }

    public void setDoubles(Integer doubles) {
        this.doubles = doubles;
    }

    public Integer getTriples() {
        return triples;
    }

    public void setTriples(Integer triples) {
        this.triples = triples;
    }

    public Integer getHr() {
        return hr;
    }

    public void setHr(Integer hr) {
        this.hr = hr;
    }

    public Integer getRbi() {
        return rbi;
    }

    public void setRbi(Integer rbi) {
        this.rbi = rbi;
    }

    public Integer getSb() {
        return sb;
    }

    public void setSb(Integer sb) {
        this.sb = sb;
    }

    public Integer getCs() {
        return cs;
    }

    public void setCs(Integer cs) {
        this.cs = cs;
    }

    public Integer getBb() {
        return bb;
    }

    public void setBb(Integer bb) {
        this.bb = bb;
    }

    public Integer getSo() {
        return so;
    }

    public void setSo(Integer so) {
        this.so = so;
    }

    public Double getBa() {
        return ba;
    }

    public void setBa(Double ba) {
        this.ba = ba;
    }

    public Double getObp() {
        return obp;
    }

    public void setObp(Double obp) {
        this.obp = obp;
    }

    public Double getSlg() {
        return slg;
    }

    public void setSlg(Double slg) {
        this.slg = slg;
    }

    public Double getOps() {
        return ops;
    }

    public void setOps(Double ops) {
        this.ops = ops;
    }

    public Double getOpsPlus() {
        return opsPlus;
    }

    public void setOpsPlus(Double opsPlus) {
        this.opsPlus = opsPlus;
    }

    public Double getrOba() {
        return rOba;
    }

    public void setrOba(Double rOba) {
        this.rOba = rOba;
    }

    public Integer getrBatPlus() {
        return rBatPlus;
    }

    public void setrBatPlus(Integer rBatPlus) {
        this.rBatPlus = rBatPlus;
    }

    public Integer getTb() {
        return tb;
    }

    public void setTb(Integer tb) {
        this.tb = tb;
    }

    public Integer getGidp() {
        return gidp;
    }

    public void setGidp(Integer gidp) {
        this.gidp = gidp;
    }

    public Integer getHbp() {
        return hbp;
    }

    public void setHbp(Integer hbp) {
        this.hbp = hbp;
    }

    public Integer getSh() {
        return sh;
    }

    public void setSh(Integer sh) {
        this.sh = sh;
    }

    public Integer getSf() {
        return sf;
    }

    public void setSf(Integer sf) {
        this.sf = sf;
    }

    public Integer getIbb() {
        return ibb;
    }

    public void setIbb(Integer ibb) {
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
