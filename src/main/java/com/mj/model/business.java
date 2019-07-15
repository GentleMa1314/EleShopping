package com.mj.model;

public class business {

    private int bid;
    private String bname;
    private String bpassword;
    private String bphone;
    private String bcode;
    private int bregister;

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public String getBpassword() {
        return bpassword;
    }

    public void setBpassword(String bpassword) {
        this.bpassword = bpassword;
    }

    public String getBphone() {
        return bphone;
    }

    public void setBphone(String bphone) {
        this.bphone = bphone;
    }

    public String getBcode() {
        return bcode;
    }

    public void setBcode(String bcode) {
        this.bcode = bcode;
    }

    public int getBregister() {
        return bregister;
    }

    public void setBregister(int bregister) {
        this.bregister = bregister;
    }

    @Override
    public String toString() {
        return "business{" +
                "bid=" + bid +
                ", bname='" + bname + '\'' +
                ", bpassword='" + bpassword + '\'' +
                ", bphone='" + bphone + '\'' +
                ", bcode='" + bcode + '\'' +
                ", bregister=" + bregister +
                '}';
    }

    public business(int bid, String bname, String bpassword, String bphone, String bcode, int bregister) {
        this.bid = bid;
        this.bname = bname;
        this.bpassword = bpassword;
        this.bphone = bphone;
        this.bcode = bcode;
        this.bregister = bregister;
    }
    public business(){

    }
}
