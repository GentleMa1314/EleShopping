package com.mj.model;

public class User {

    private int uid;
    private String uusername;
    private String upassword;
    private String uname;
    private String usex;
    private String uphone;
    private String uaddress;




    public String getUusername() {
        return uusername;
    }

    public void setUusername(String uusername) {
        this.uusername = uusername;
    }

    public String getUpassword() {
        return upassword;
    }

    public void setUpassword(String upassword) {
        this.upassword = upassword;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUsex() {
        return usex;
    }

    public void setUsex(String usex) {
        this.usex = usex;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public User(int uid, String uusername, String upassword, String uname, String usex, String uphone, String uaddress) {
        this.uid = uid;
        this.uusername = uusername;
        this.upassword = upassword;
        this.uname = uname;
        this.usex = usex;
        this.uphone = uphone;
        this.uaddress = uaddress;
    }
    public User(){

    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", uusername='" + uusername + '\'' +
                ", upassword='" + upassword + '\'' +
                ", uname='" + uname + '\'' +
                ", usex='" + usex + '\'' +
                ", uphone='" + uphone + '\'' +
                ", uaddress='" + uaddress + '\'' +
                '}';
    }

    public String getUphone() {
        return uphone;
    }

    public void setUphone(String uphone) {
        this.uphone = uphone;
    }

    public String getUaddress() {
        return uaddress;
    }

    public void setUaddress(String uaddress) {
        this.uaddress = uaddress;
    }
}
