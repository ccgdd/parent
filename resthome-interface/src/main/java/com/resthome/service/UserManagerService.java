package com.resthome.service;

import com.resthome.pojo.EasyUIDataGridRestful;
import com.resthome.pojo.StaffTranfer;

public interface UserManagerService {

	void insertUserManager(StaffTranfer staffTranfer);

	EasyUIDataGridRestful selectUserManager(StaffTranfer staffTranfer, int page, int rows);

	void editUserManager(StaffTranfer staffTranfer);

	void deleteUserManager(Integer[] ids);

}
