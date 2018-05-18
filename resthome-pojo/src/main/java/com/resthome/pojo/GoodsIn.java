package com.resthome.pojo;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

public class GoodsIn {
    private Integer inCode;

    private String source;

    private String address;

    private Date inDate;

    private String handledName;
    //经办人
    
    private String userId;
    
    
    private String personName;
    
    //附加对象
    private List<GoodsInDetail> goodsInDetails;
    
    
    
    
    public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}



    public List<GoodsInDetail> getGoodsInDetails() {
		return goodsInDetails;
	}

	public void setGoodsInDetails(List<GoodsInDetail> goodsInDetails) {
		this.goodsInDetails = goodsInDetails;
	}

	public Integer getInCode() {
        return inCode;
    }

    public void setInCode(Integer inCode) {
        this.inCode = inCode;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }
    @JsonFormat(pattern="yyyy-MM-dd" ,timezone="GMT+8")
    public Date getInDate() {
        return inDate;
    }

    public void setInDate(Date inDate) {
        this.inDate = inDate;
    }

    public String getHandledName() {
        return handledName;
    }

    public void setHandledName(String handledName) {
        this.handledName = handledName == null ? null : handledName.trim();
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName == null ? null : personName.trim();
    }
}