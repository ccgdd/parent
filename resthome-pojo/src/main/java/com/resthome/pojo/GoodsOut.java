package com.resthome.pojo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;


public class GoodsOut extends GoodsOutDetail{
    private Integer outCode;

    private Date outDate;

    private String inName;

    private String personName;

    private String remark;

    private String address;

    private Integer oid;

    public Integer getOutCode() {
        return outCode;
    }

    public void setOutCode(Integer outCode) {
        this.outCode = outCode;
    }
    
    @JsonFormat(pattern="yyyy-MM-dd" ,timezone="GMT+8")
    public Date getOutDate() {
        return outDate;
    }

    public void setOutDate(Date outDate) {
        this.outDate = outDate;
    }

    public String getInName() {
        return inName;
    }

    public void setInName(String inName) {
        this.inName = inName == null ? null : inName.trim();
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName == null ? null : personName.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }
}