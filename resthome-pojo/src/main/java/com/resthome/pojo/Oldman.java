package com.resthome.pojo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Oldman {
    private Integer id;

    private String name;

    private String number;

    private String sex;

    private Date birthday;

    private Integer age;

    private String orgn;

    private String address;

    private Integer state;

    private String inCost;

    private String inCosted;

    private String checkinDate;

    private String personName;

    private String personDate;

    private String beginDate;

    private String endDate;

    private String withName;

    private String reason;

    private String handleName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }
    @JsonFormat(pattern="yyyy-MM-dd" ,timezone="GMT+8")
    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getOrgn() {
        return orgn;
    }

    public void setOrgn(String orgn) {
        this.orgn = orgn == null ? null : orgn.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getInCost() {
        return inCost;
    }

    public void setInCost(String inCost) {
        this.inCost = inCost == null ? null : inCost.trim();
    }

    public String getInCosted() {
        return inCosted;
    }

    public void setInCosted(String inCosted) {
        this.inCosted = inCosted == null ? null : inCosted.trim();
    }

    public String getCheckinDate() {
        return checkinDate;
    }

    public void setCheckinDate(String checkinDate) {
        this.checkinDate = checkinDate == null ? null : checkinDate.trim();
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName == null ? null : personName.trim();
    }

    public String getPersonDate() {
        return personDate;
    }

    public void setPersonDate(String personDate) {
        this.personDate = personDate == null ? null : personDate.trim();
    }

    public String getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(String beginDate) {
        this.beginDate = beginDate == null ? null : beginDate.trim();
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate == null ? null : endDate.trim();
    }

    public String getWithName() {
        return withName;
    }

    public void setWithName(String withName) {
        this.withName = withName == null ? null : withName.trim();
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    public String getHandleName() {
        return handleName;
    }

    public void setHandleName(String handleName) {
        this.handleName = handleName == null ? null : handleName.trim();
    }
}