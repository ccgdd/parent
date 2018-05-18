package com.resthome.service;

import com.resthome.pojo.EasyUIDataGridRestful;
import com.resthome.pojo.UserLeave;

public interface UserLeaveService {



	void insertUserLeave(UserLeave userLeave);

	EasyUIDataGridRestful queryUserLeave(UserLeave userLeave, int page, int rows);

	void editUserLeave(UserLeave userLeave);

	void deleteUserLeave(Integer[] ids);


	
}
