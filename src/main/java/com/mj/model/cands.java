package com.mj.model;

public class cands {
    private int sid;
    private String uname;
    private String cname;
    private commodity comm;

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

    public commodity getComm() {
        return comm;
    }

    public void setComm(commodity comm) {
        this.comm = comm;
    }

    @Override
    public String toString() {
        return "cands{" +
                "sid=" + sid +
                ", uname='" + uname + '\'' +
                ", cname='" + cname + '\'' +
                ", comm=" + comm +
                '}';
    }
}
