package com.resthome.pojo;

public class CollectionCost extends Oldman {
    private String costId;

    private String oldmanId;

    private String collectionCost;

    private String collectionDate;

    private String collectionName;

    private String handleName;

    private String handleDate;

    public String getCostId() {
        return costId;
    }

    public void setCostId(String costId) {
        this.costId = costId == null ? null : costId.trim();
    }

    public String getOldmanId() {
        return oldmanId;
    }

    public void setOldmanId(String oldmanId) {
        this.oldmanId = oldmanId == null ? null : oldmanId.trim();
    }

    public String getCollectionCost() {
        return collectionCost;
    }

    public void setCollectionCost(String collectionCost) {
        this.collectionCost = collectionCost == null ? null : collectionCost.trim();
    }

    public String getCollectionDate() {
        return collectionDate;
    }

    public void setCollectionDate(String collectionDate) {
        this.collectionDate = collectionDate == null ? null : collectionDate.trim();
    }

    public String getCollectionName() {
        return collectionName;
    }

    public void setCollectionName(String collectionName) {
        this.collectionName = collectionName == null ? null : collectionName.trim();
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