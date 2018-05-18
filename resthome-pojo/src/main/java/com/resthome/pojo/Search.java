package com.resthome.pojo;

import java.io.Serializable;

public class Search implements Serializable{

	private Integer id;

    private String name;

    private String style;

    private String buildnum;

    private String floor;

    private String roomnum;

    private Integer state;

    private String oldman_name;
    
    
    private String oid;

    
    
	public String getOid() {
		return oid;
	}

	public void setOid(String oid) {
		this.oid = oid;
	}

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
		this.name = name;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public String getBuildnum() {
		return buildnum;
	}

	public void setBuildnum(String buildnum) {
		this.buildnum = buildnum;
	}

	public String getFloor() {
		return floor;
	}

	public void setFloor(String floor) {
		this.floor = floor;
	}

	public String getRoomnum() {
		return roomnum;
	}

	public void setRoomnum(String roomnum) {
		this.roomnum = roomnum;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public String getOldman_name() {
		return oldman_name;
	}

	public void setOldman_name(String oldman_name) {
		this.oldman_name = oldman_name;
	}

	
	
}
