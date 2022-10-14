package com.pojo;

public class Work
{
    private int wid;
    private String wname;
    private float wsalary;

    public int getWid() {
        return wid;
    }

    public void setWid(int wid) {
        this.wid = wid;
    }

    public String getWname() {
        return wname;
    }

    public void setWname(String wname) {
        this.wname = wname;
    }

    public float getWsalary() {
        return wsalary;
    }

    public void setWsalary(float wsalary) {
        this.wsalary = wsalary;
    }

    @Override
    public String toString() {
        return "work{" +
                "wid=" + wid +
                ", wname='" + wname + '\'' +
                ", wsalary=" + wsalary +
                '}';
    }
}
