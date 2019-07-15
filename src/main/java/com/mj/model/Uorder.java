package com.mj.model;

public class Uorder {
    private int oid;
    private String uname;
    private String oremark;
    private int oallprice;
    private String osubdate;
    private int oispay;
    private int oisship;
    private String oshipdate;
    private String oserialnumber;
    private int oreceive;

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }
    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getOremark() {
        return oremark;
    }

    public void setOremark(String oremark) {
        this.oremark = oremark;
    }

    public int getOallprice() {
        return oallprice;
    }

    public void setOallprice(int oallprice) {
        this.oallprice = oallprice;
    }

    public String getOsubdate() {
        return osubdate;
    }

    public void setOsubdate(String osubdate) {
        this.osubdate = osubdate;
    }

    public int getOispay() {
        return oispay;
    }

    public void setOispay(int oispay) {
        this.oispay = oispay;
    }

    public int getOisship() {
        return oisship;
    }

    public void setOisship(int oisship) {
        this.oisship = oisship;
    }

    public String getOshipdate() {
        return oshipdate;
    }

    public void setOshipdate(String oshipdate) {
        this.oshipdate = oshipdate;
    }

    public String getOserialnumber() {
        return oserialnumber;
    }

    public void setOserialnumber(String oserialnumber) {
        this.oserialnumber = oserialnumber;
    }

    public int getOreceive() {
        return oreceive;
    }

    public void setOreceive(int oreceive) {
        this.oreceive = oreceive;
    }

    public Uorder(int oid, String uname, String oremark, int oallprice, String osubdate, int oispay, int oisship, String oshipdate, String oserialnumber, int oreceive) {
        this.oid = oid;
        this.uname = uname;
        this.oremark = oremark;
        this.oallprice = oallprice;
        this.osubdate = osubdate;
        this.oispay = oispay;
        this.oisship = oisship;
        this.oshipdate = oshipdate;
        this.oserialnumber = oserialnumber;
        this.oreceive = oreceive;
    }
    public Uorder(){

    }

    @Override
    public String toString() {
        return "Uorder{" +
                "oid=" + oid +
                ", uname='" + uname + '\'' +
                ", oremark='" + oremark + '\'' +
                ", oallprice=" + oallprice +
                ", osubdate='" + osubdate + '\'' +
                ", oispay=" + oispay +
                ", oisship=" + oisship +
                ", oshipdate='" + oshipdate + '\'' +
                ", oserialnumber='" + oserialnumber + '\'' +
                ", oreceive=" + oreceive +
                '}';
    }
}
