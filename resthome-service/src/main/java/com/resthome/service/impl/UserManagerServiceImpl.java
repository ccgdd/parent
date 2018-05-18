package com.resthome.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.resthome.mapper.StaffTranferMapper;
import com.resthome.pojo.EasyUIDataGridRestful;
import com.resthome.pojo.StaffTranfer;
import com.resthome.service.UserManagerService;

@Service
public class UserManagerServiceImpl implements  UserManagerService{

	@Autowired
	private StaffTranferMapper staffTranferMapper;
	
	/**
	 * 添加
	 */
	public void insertUserManager(StaffTranfer staffTranfer){
		
		staffTranferMapper.insertSelective( staffTranfer);
		
	}


	/**
	 * 查询
	 */
	public EasyUIDataGridRestful selectUserManager(StaffTranfer staffTranfer, int page, int rows) {
		//设置分页信息
		PageHelper.startPage(page, rows);
		//设置查询条件
		Map<Object,Object> map = new HashMap<>();
		map.put("staffTranfer", staffTranfer);
		map.put("page", page);
		map.put("rows", rows);
		//执行查询	
		List<StaffTranfer> list = staffTranferMapper.selectUserManager(map);
		//创建一个对象
		EasyUIDataGridRestful result = new EasyUIDataGridRestful();
		result.setRows(list);
		//取分页结果
		PageInfo<StaffTranfer> pageInfo  = new PageInfo<>(list);
		//取总记录数
		long total = pageInfo.getTotal();
		result.setTotal(total);
		
		return result;

	}


	/**
	 * 修改
	 */
	public void editUserManager(StaffTranfer staffTranfer) {
		
		staffTranferMapper.updateByPrimaryKeySelective(staffTranfer);
		
	}


	/**
	 * 删除
	 */
	public void deleteUserManager(Integer[] ids) {
		for (Integer id : ids) {
			staffTranferMapper.deleteByPrimaryKey(id);
		}
		
	}
}
