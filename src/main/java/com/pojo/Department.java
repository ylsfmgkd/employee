package com.pojo;

public class Department
{
    private String did;
    private String dname;

    public String getDid() {
        return did;
    }

    public void setDid(String did) {
        this.did = did;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    @Override
    public String toString() {
        return "department{" +
                "did='" + did + '\'' +
                ", dname='" + dname + '\'' +
                '}';
    }
}
