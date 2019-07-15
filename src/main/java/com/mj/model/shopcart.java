package com.mj.model;

public class shopcart {
    private int sid;
    private String uname;
    private String cname;

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public shopcart(int sid, String uname, String cname) {
        this.sid = sid;
        this.uname = uname;
        this.cname = cname;
    }

    @Override
    public String toString() {
        return "shopcart{" +
                "sid=" + sid +
                ", uname='" + uname + '\'' +
                ", cname='" + cname + '\'' +
                '}';
    }
    public shopcart(){

    }

}
