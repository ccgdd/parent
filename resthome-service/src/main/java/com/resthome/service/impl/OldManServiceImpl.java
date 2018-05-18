package com.resthome.service.impl;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.resthome.mapper.OldmanMapper;
import com.resthome.pojo.Age;
import com.resthome.pojo.EasyUIDataGridRestful;
import com.resthome.pojo.Oldman;
import com.resthome.pojo.OldmanExample;
import com.resthome.pojo.QueryVo;
import com.resthome.service.OldManService;
@Service
public class OldManServiceImpl implements OldManService {

	@Autowired
	private OldmanMapper oldmanMapper;
	
	
	/**
	 * 老人信息分页查询
	 */
	@Override
	public EasyUIDataGridRestful getOldManList(QueryVo queryVo) {
		//设置分页信息
		PageHelper.startPage(queryVo.getPage(),queryVo.getRows());
		
		
		// 查询数据结果集
		
		List<Oldman> list = oldmanMapper.queryOldmanByQueryVo(queryVo);
		//创建一个对象
		EasyUIDataGridRestful result = new EasyUIDataGridRestful();
		result.setRows(list);
		//取分页结果
		PageInfo<Oldman> pageInfo  = new PageInfo<>(list);
		//取总记录数
		long total = pageInfo.getTotal();
		result.setTotal(total);
		
		return result;
	}

	/**
	 * 取出老人信息
	 */
	 public List<Oldman> getOldManList(){
		 OldmanExample example = new OldmanExample();
		 List<Oldman> list = oldmanMapper.selectByExample(example);
		 return list;
	 }
	 
	 
	 
	 /**
	  * 添加老人信息
	  */
	 public void insertOlaman(Oldman oldman){
		 
		  oldmanMapper.insertSelective(oldman);
		  
	 }
	 
	 
	 /**
	  * 修改老人信息
	  */
	 public void editOlaman(Oldman oldman){
		 
		  oldmanMapper.updateByPrimaryKeySelective(oldman);
		  
		  
		  
	 }
	 
	 /**
		 * 删除老人信息
		 */
		public void deleteBath(String ids){
			if (StringUtils.isNotBlank(ids)) {
				String[] staffIds = ids.split(",");
				
				for (String id : staffIds) {
					int parseInt = Integer.parseInt(id);
					
					oldmanMapper.deleteByPrimaryKey(parseInt);
					
				}
			}
		}

	@Override
	public List<Age> findGroupByAge() {
	List<Age> list	= oldmanMapper.findGroupByAge();
		return list;
	}
		
		
		
		
		
}
