package com.resthome.pojo;

public class CostJiesuan extends Oldman {
    private String costJiesuanId;

    private String oldmanId;

    private String jiesuanDate;

    private String jiesuanStatus;

    private String handleName;

    private String handleDate;

    public String getCostJiesuanId() {
        return costJiesuanId;
    }

    public void setCostJiesuanId(String costJiesuanId) {
        this.costJiesuanId = costJiesuanId == null ? null : costJiesuanId.trim();
    }

    public String getOldmanId() {
        return oldmanId;
    }

    public void setOldmanId(String oldmanId) {
        this.oldmanId = oldmanId == null ? null : oldmanId.trim();
    }

    public String getJiesuanDate() {
        return jiesuanDate;
    }

    public void setJiesuanDate(String jiesuanDate) {
        this.jiesuanDate = jiesuanDate == null ? null : jiesuanDate.trim();
    }

    public String getJiesuanStatus() {
        return jiesuanStatus;
    }

    public void setJiesuanStatus(String jiesuanStatus) {
        this.jiesuanStatus = jiesuanStatus == null ? null : jiesuanStatus.trim();
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