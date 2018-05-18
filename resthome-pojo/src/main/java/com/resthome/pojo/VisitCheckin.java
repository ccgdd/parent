package com.resthome.pojo;

public class VisitCheckin extends User{
    private Long visitId;

    private String visitName;

    private String visitDatetime;

    private String tel;

    private String visitLeavetime;

    private String handleName;

    private String handleDate;

    public Long getVisitId() {
        return visitId;
    }

    public void setVisitId(Long visitId) {
        this.visitId = visitId;
    }

    public String getVisitName() {
        return visitName;
    }

    public void setVisitName(String visitName) {
        this.visitName = visitName == null ? null : visitName.trim();
    }

    public String getVisitDatetime() {
        return visitDatetime;
    }

    public void setVisitDatetime(String visitDatetime) {
        this.visitDatetime = visitDatetime == null ? null : visitDatetime.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getVisitLeavetime() {
        return visitLeavetime;
    }

    public void setVisitLeavetime(String visitLeavetime) {
        this.visitLeavetime = visitLeavetime == null ? null : visitLeavetime.trim();
    }

    public String getHandleName() {
        return handleName;
    }

    public void setHandleName(String handleName) {
        this.handleName = handleName == null ? null : handleName.trim();
    }

    public String getHandleDate() {
        return handleDate;
    }

    public void setHandleDate(String handleDate) {
        this.handleDate = handleDate == null ? null : handleDate.trim();
    }
}