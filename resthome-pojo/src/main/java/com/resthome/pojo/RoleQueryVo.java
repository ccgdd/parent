package com.resthome.pojo;

import java.io.Serializable;
import java.util.List;

public class RoleQueryVo implements Serializable {

	
	private AuthRole authRole;
	
	private List<String> functionIds;

	
	
	
	
	public AuthRole getAuthRole() {
		return authRole;
	}

	public void setAuthRole(AuthRole authRole) {
		this.authRole = authRole;
	}

	public List<String> getFunctionIds() {
		return functionIds;
	}

	public void setFunctionIds(List<String> functionIds) {
		this.functionIds = functionIds;
	}
	
	
	
	
	
}
