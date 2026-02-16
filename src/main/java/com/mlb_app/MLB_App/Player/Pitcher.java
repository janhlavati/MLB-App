package com.mlb_app.MLB_App.Player;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="pitchers")
public class Pitcher {

    @Id
    @Column(name = "name", nullable = false)
    private String name;
    private Integer age;
    private String pos;
    private String team;
    private String league;
    private Double war;
    private Integer w;
    private Integer l;
    private Double percentage;
    private Double era;
    private Integer g;
    private Integer gs;
    private Integer gf;
    private Integer cg;
    private Integer sho;
    private Integer sv;
    private Double ip;
    private Integer h;
    private Integer r;
    private Integer er;
    private Integer hr;
    private Integer bb;
    private Integer ibb;
    private Integer so;
    private Integer hbp;
    private Integer bk;
    private Integer wp;
    private Integer bf;
    private Integer eraPlus;
    private Double fip;
    private Double whip;
    private Double h9;
    private Double hr9;
    private Double bb9;
    private Double so9;
    private Double so_bb;
    private String awards;

    public Pitcher() {

    }

    public Pitcher(String name, int age, String pos, String team, String league, Double war, Integer w, Integer l, Double percentage, Double era, Integer g, Integer gs, Integer gf, Integer cg, Integer sho, Integer sv, Double ip, Integer h, Integer r, Integer er, Integer hr, Integer bb, Integer ibb, Integer so, Integer hbp, Integer bk, Integer wp, Integer bf, Integer eraPlus, Double fip, Double whip, Double h9, Double hr9, Double bb9, Double so9, Double so_bb, String awards) {
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
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

    public Integer getW() {
        return w;
    }

    public void setW(Integer w) {
        this.w = w;
    }

    public Integer getL() {
        return l;
    }

    public void setL(Integer l) {
        this.l = l;
    }

    public Double getPercentage() {
        return percentage;
    }

    public void setPercentage(Double percentage) {
        this.percentage = percentage;
    }

    public Double getEra() {
        return era;
    }

    public void setEra(Double era) {
        this.era = era;
    }

    public Integer getG() {
        return g;
    }

    public void setG(Integer g) {
        this.g = g;
    }

    public Integer getGs() {
        return gs;
    }

    public void setGs(Integer gs) {
        this.gs = gs;
    }

    public Integer getGf() {
        return gf;
    }

    public void setGf(Integer gf) {
        this.gf = gf;
    }

    public Integer getCg() {
        return cg;
    }

    public void setCg(Integer cg) {
        this.cg = cg;
    }

    public Integer getSho() {
        return sho;
    }

    public void setSho(Integer sho) {
        this.sho = sho;
    }

    public Integer getSv() {
        return sv;
    }

    public void setSv(Integer sv) {
        this.sv = sv;
    }

    public Double getIp() {
        return ip;
    }

    public void setIp(Double ip) {
        this.ip = ip;
    }

    public Integer getH() {
        return h;
    }

    public void setH(Integer h) {
        this.h = h;
    }

    public Integer getR() {
        return r;
    }

    public void setR(Integer r) {
        this.r = r;
    }

    public Integer getEr() {
        return er;
    }

    public void setEr(Integer er) {
        this.er = er;
    }

    public Integer getHr() {
        return hr;
    }

    public void setHr(Integer hr) {
        this.hr = hr;
    }

    public Integer getBb() {
        return bb;
    }

    public void setBb(Integer bb) {
        this.bb = bb;
    }

    public Integer getIbb() {
        return ibb;
    }

    public void setIbb(Integer ibb) {
        this.ibb = ibb;
    }

    public Integer getSo() {
        return so;
    }

    public void setSo(Integer so) {
        this.so = so;
    }

    public Integer getHbp() {
        return hbp;
    }

    public void setHbp(Integer hbp) {
        this.hbp = hbp;
    }

    public Integer getBk() {
        return bk;
    }

    public void setBk(Integer bk) {
        this.bk = bk;
    }

    public Integer getWp() {
        return wp;
    }

    public void setWp(Integer wp) {
        this.wp = wp;
    }

    public Integer getBf() {
        return bf;
    }

    public void setBf(Integer bf) {
        this.bf = bf;
    }

    public Integer getEraPlus() {
        return eraPlus;
    }

    public void setEraPlus(Integer eraPlus) {
        this.eraPlus = eraPlus;
    }

    public Double getFip() {
        return fip;
    }

    public void setFip(Double fip) {
        this.fip = fip;
    }

    public Double getWhip() {
        return whip;
    }

    public void setWhip(Double whip) {
        this.whip = whip;
    }

    public Double getH9() {
        return h9;
    }

    public void setH9(Double h9) {
        this.h9 = h9;
    }

    public Double getHr9() {
        return hr9;
    }

    public void setHr9(Double hr9) {
        this.hr9 = hr9;
    }

    public Double getBb9() {
        return bb9;
    }

    public void setBb9(Double bb9) {
        this.bb9 = bb9;
    }

    public Double getSo9() {
        return so9;
    }

    public void setSo9(Double so9) {
        this.so9 = so9;
    }

    public Double getSo_bb() {
        return so_bb;
    }

    public void setSo_bb(Double so_bb) {
        this.so_bb = so_bb;
    }

    public String getAwards() {
        return awards;
    }

    public void setAwards(String awards) {
        this.awards = awards;
    }
}
