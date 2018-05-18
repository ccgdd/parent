package com.resthome.pojo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;


public class GoodsQueryVo {
	private String goodsName;

    private String goodsUnit;

    private Integer goodsNum;

    private Integer goodsPrice;
    
    private Integer inCode;
    
    private String source;

    private String address;

    private Date inDate;

    private String  handledName;
    
    //经办人
    private String  userId;
    


	private String personName;


	
	public String getHandledName() {
		return handledName;
	}


	public void setHandledName(String handledName) {
		this.handledName = handledName;
	}


	public String getUserId() {
		return userId;
	}
	
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	
	public String getGoodsName() {
		return goodsName;
	}


	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}


	public String getGoodsUnit() {
		return goodsUnit;
	}


	public void setGoodsUnit(String goodsUnit) {
		this.goodsUnit = goodsUnit;
	}


	public Integer getGoodsNum() {
		return goodsNum;
	}


	public void setGoodsNum(Integer goodsNum) {
		this.goodsNum = goodsNum;
	}


	public Integer getGoodsPrice() {
		return goodsPrice;
	}


	public void setGoodsPrice(Integer goodsPrice) {
		this.goodsPrice = goodsPrice;
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
		this.source = source;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}
	
	@JsonFormat(pattern="yyyy-MM-dd" ,timezone="GMT+8")
	public Date getInDate() {
		return inDate;
	}


	public void setInDate(Date inDate) {
		this.inDate = inDate;
	}




	public String getPersonName() {
		return personName;
	}


	public void setPersonName(String personName) {
		this.personName = personName;
	}



}
