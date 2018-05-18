package com.resthome.pojo;

public class ReceptCheckin extends User{
    private Long receptCheckinId;

    private String receptedName;

    private String receptDate;

    private String receptNameId;

    private String address;

    private String tel;

    private String handleName;

    private String handleDate;
    
    
    

    public Long getReceptCheckinId() {
        return receptCheckinId;
    }

    public void setReceptCheckinId(Long receptCheckinId) {
        this.receptCheckinId = receptCheckinId;
    }

    public String getReceptedName() {
        return receptedName;
    }

    public void setReceptedName(String receptedName) {
        this.receptedName = receptedName == null ? null : receptedName.trim();
    }

    public String getReceptDate() {
        return receptDate;
    }

    public void setReceptDate(String receptDate) {
        this.receptDate = receptDate == null ? null : receptDate.trim();
    }

    public String getReceptNameId() {
        return receptNameId;
    }

    public void setReceptNameId(String receptNameId) {
        this.receptNameId = receptNameId == null ? null : receptNameId.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
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