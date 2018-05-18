package com.resthome.pojo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class StaffTranfer {
    private Integer staffId;

    private String staffName;

    private String olddepartment;

    private String oldposition;

    private String transferdepartment;

    private String newposition;

    private Date tranferdate;

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName == null ? null : staffName.trim();
    }

    public String getOlddepartment() {
        return olddepartment;
    }

    public void setOlddepartment(String olddepartment) {
        this.olddepartment = olddepartment == null ? null : olddepartment.trim();
    }

    public String getOldposition() {
        return oldposition;
    }

    public void setOldposition(String oldposition) {
        this.oldposition = oldposition == null ? null : oldposition.trim();
    }

    public String getTransferdepartment() {
        return transferdepartment;
    }

    public void setTransferdepartment(String transferdepartment) {
        this.transferdepartment = transferdepartment == null ? null : transferdepartment.trim();
    }

    public String getNewposition() {
        return newposition;
    }

    public void setNewposition(String newposition) {
        this.newposition = newposition == null ? null : newposition.trim();
    }
    @JsonFormat(pattern="yyyy-MM-dd" ,timezone="GMT+8")
    public Date getTranferdate() {
        return tranferdate;
    }

    public void setTranferdate(Date tranferdate) {
        this.tranferdate = tranferdate;
    }
}