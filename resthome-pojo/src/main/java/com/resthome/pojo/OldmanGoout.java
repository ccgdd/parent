package com.resthome.pojo;

public class OldmanGoout extends Oldman{
    private String gooutId;

    private String beginDate;

    private String endDate;

    private String withName;

    private String reason;

    private String handleName;

    private Integer oldmanId;

    public String getGooutId() {
        return gooutId;
    }

    
    
    
    public void setGooutId(String gooutId) {
        this.gooutId = gooutId == null ? null : gooutId.trim();
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

    public Integer getOldmanId() {
        return oldmanId;
    }

    public void setOldmanId(Integer oldmanId) {
        this.oldmanId = oldmanId;
    }
}