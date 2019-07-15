package com.mj.model;


import java.util.Arrays;

public class commodity {

    private int cid;
    private String cname;
    private String cphote;
    private String ckind;
    private int cprice;
    private String cdesc;
    private int ccount;
    private String bname;

    @Override
    public String toString() {
        return "commodity{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                ", cphote='" + cphote + '\'' +
                ", ckind='" + ckind + '\'' +
                ", cprice=" + cprice +
                ", cdesc='" + cdesc + '\'' +
                ", ccount=" + ccount +
                ", bname='" + bname + '\'' +
                '}';
    }

    public int getCid() {
        return cid;
    }

    public String getCphote() {
        return cphote;
    }

    public commodity(int cid, String cname, String cphote, String ckind, int cprice, String cdesc, int ccount, String bname) {
        this.cid = cid;
        this.cname = cname;
        this.cphote = cphote;
        this.ckind = ckind;
        this.cprice = cprice;
        this.cdesc = cdesc;
        this.ccount = ccount;
        this.bname = bname;
    }

    public void setCphote(String cphote) {
        this.cphote = cphote;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }







    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }



    public String getCkind() {
        return ckind;
    }

    public void setCkind(String ckind) {
        this.ckind = ckind;
    }

    public int getCprice() {
        return cprice;
    }

    public void setCprice(int cprice) {
        this.cprice = cprice;
    }

    public String getCdesc() {
        return cdesc;
    }

    public void setCdesc(String cdesc) {
        this.cdesc = cdesc;
    }

    public int getCcount() {
        return ccount;
    }

    public void setCcount(int ccount) {
        this.ccount = ccount;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public commodity(){

    }


}
