package com.resthome.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.resthome.mapper.UserLeaveMapper;
import com.resthome.pojo.EasyUIDataGridRestful;
import com.resthome.pojo.UserLeave;
import com.resthome.service.UserLeaveService;
@Service
public class UserLeaveServiceImpl implements UserLeaveService {

	@Autowired
	private UserLeaveMapper mapper;
	
	@Override
	public void insertUserLeave(UserLeave userLeave) {

		mapper.insertSelective(userLeave);

	}

	@Override
	public EasyUIDataGridRestful queryUserLeave(UserLeave userLeave, int page, int rows) {
		//设置分页信息
		PageHelper.startPage(page, rows);
		//执行查询	
		List<UserLeave> list = mapper.queryUserLeave( userLeave);
		//创建一个对象
		EasyUIDataGridRestful result = new EasyUIDataGridRestful();
		result.setRows(list);
		//取分页结果
		PageInfo<UserLeave> pageInfo  = new PageInfo<>(list);
		//取总记录数
		long total = pageInfo.getTotal();
		result.setTotal(total);
		
		return result;
	}

	@Override
	public void editUserLeave(UserLeave userLeave) {
	
		mapper.updateByPrimaryKeySelective(userLeave);

	}

	@Override
	public void deleteUserLeave(Integer[] ids) {
		for (Integer id : ids) {
			mapper.deleteByPrimaryKey(id);
		}
		

	}

}
