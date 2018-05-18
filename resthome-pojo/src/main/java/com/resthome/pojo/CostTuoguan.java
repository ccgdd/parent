package com.resthome.pojo;

public class CostTuoguan  extends Oldman {
    private Integer tuoguanId;

    private Integer oldmanId;

    private String costBalance;

    private String handleName;

    private String handleDate;

    public Integer getTuoguanId() {
        return tuoguanId;
    }

    public void setTuoguanId(Integer tuoguanId) {
        this.tuoguanId = tuoguanId;
    }

    public Integer getOldmanId() {
        return oldmanId;
    }

    public void setOldmanId(Integer oldmanId) {
        this.oldmanId = oldmanId;
    }

    public String getCostBalance() {
        return costBalance;
    }

    public void setCostBalance(String costBalance) {
        this.costBalance = costBalance == null ? null : costBalance.trim();
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