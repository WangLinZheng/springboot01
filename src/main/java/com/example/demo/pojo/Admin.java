package com.example.demo.pojo;


public class Admin {

    private Integer adminid;
    private String adminaccount;
    private String adminpwd;

    public Admin() {
    }

    public Admin(Integer adminid, String adminaccount, String adminpwd) {
        this.adminid = adminid;
        this.adminaccount = adminaccount;
        this.adminpwd = adminpwd;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "adminid=" + adminid +
                ", adminaccount='" + adminaccount + '\'' +
                ", adminpwd='" + adminpwd + '\'' +
                '}';
    }

    public Integer getAdminid() {
        return adminid;
    }

    public void setAdminid(Integer adminid) {
        this.adminid = adminid;
    }

    public String getAdminaccount() {
        return adminaccount;
    }

    public void setAdminaccount(String adminaccount) {
        this.adminaccount = adminaccount;
    }

    public String getAdminpwd() {
        return adminpwd;
    }

    public void setAdminpwd(String adminpwd) {
        this.adminpwd = adminpwd;
    }
}
