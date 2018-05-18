package com.resthome.pojo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;


import com.fasterxml.jackson.annotation.JsonFormat;

public class User implements Serializable {
	
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String id;

    private String username;

    private String password;

    private String role;

    private Date birthday;

    private String gender;

    private String station;

    private String telephone;

    private String remark;

    private Date workdate;

    private String education;

    private Integer age;

    private String nation;

    private String idcard;

    private String address;
    

    private String status;
    

	//附加对象List
	private List<AuthRole> rolesList;
	
	//附加权限对象
	private List<AuthFunction> functionsList;
	
	
	
	

	public List<AuthFunction> getFunctionsList() {
		return functionsList;
	}



	public void setFunctionsList(List<AuthFunction> functionsList) {
		this.functionsList = functionsList;
	}



	public String getRoleNames(){
		String roleNames="";
		if (rolesList!=null) {
			for (AuthRole authRole : rolesList) {
				String name = authRole.getName();
				roleNames +=name+",";
			}
		}
		return roleNames;
	}
	
    
    
    public List<AuthRole> getRolesList() {
		return rolesList;
	}



	public void setRolesList(List<AuthRole> rolesList) {
		this.rolesList = rolesList;
	}


	public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role == null ? null : role.trim();
    }
    @JsonFormat(pattern="yyyy-MM-dd" ,timezone="GMT+8")
    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station == null ? null : station.trim();
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
    @JsonFormat(pattern="yyyy-MM-dd ")
    public Date getWorkdate() {
        return workdate;
    }

    public void setWorkdate(Date workdate) {
        this.workdate = workdate;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education == null ? null : education.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation == null ? null : nation.trim();
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}