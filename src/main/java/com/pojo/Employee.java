package com.pojo;

public class Employee
{
    private String eid;
    private String ename;
    private String esex;
    private String eschool;
    private String wname;
    private String etel;
    private Work work;
    private String wid;
    private String did;

    public String getWid() {
        return wid;
    }

    public void setWid(String wid) {
        this.wid = wid;
    }

    public String getDid() {
        return did;
    }

    public void setDid(String did) {
        this.did = did;
    }

    public Work getWork() {
        return work;
    }

    public void setWork(Work work) {
        this.work = work;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    private Department department;

    public String getEid() {
        return eid;
    }

    public void setEid(String eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getEsex() {
        return esex;
    }

    public void setEsex(String esex) {
        this.esex = esex;
    }

    public String getEschool() {
        return eschool;
    }

    public void setEschool(String eschool) {
        this.eschool = eschool;
    }

    public String getWname() {
        return wname;
    }

    public void setWname(String wname) {
        this.wname = wname;
    }

    public String getEtel() {
        return etel;
    }

    public void setEtel(String etel) {
        this.etel = etel;
    }

    @Override
    public String toString() {
        return "employee{" +
                "eid='" + eid + '\'' +
                ", ename='" + ename + '\'' +
                ", esex='" + esex + '\'' +
                ", eschool='" + eschool + '\'' +
                ", wname='" + wname + '\'' +
                ", etel='" + etel + '\'' +
                '}';
    }
}
