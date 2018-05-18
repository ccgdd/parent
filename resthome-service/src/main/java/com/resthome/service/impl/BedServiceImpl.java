package com.resthome.service.impl;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.resthome.mapper.BedMapper;
import com.resthome.mapper.BedMapperResver;
import com.resthome.pojo.Bed;
import com.resthome.pojo.EasyUIDataGridRestful;
import com.resthome.pojo.Search;
import com.resthome.service.BedService;
import com.resthome.utils.RestHomeResult;

@Service
public class BedServiceImpl implements BedService {

	@Autowired
	private BedMapper bedMapper;
	@Autowired 
	private BedMapperResver  bedMapperResver;
	
	/**
	 * 床位信息分页查询
	 * 
	 */
	public EasyUIDataGridRestful getBedList(int cid,int page, int rows) {
		//设置分页信息
		PageHelper.startPage(page, rows);
		//执行查询
		 List<Search> list = bedMapper.getBedlistBy(cid);
		//创建一个对象
		EasyUIDataGridRestful result = new EasyUIDataGridRestful();
		result.setRows(list);
		//取分页结果
		PageInfo<Search> pageInfo  = new PageInfo<>(list);
		//取总记录数
		long total = pageInfo.getTotal();
		result.setTotal(total);
		
		return result;
	}

	
	/**
	 * 新增床位信息
	 */
	


	@Override
	public RestHomeResult insertBed(Bed bed, int cid) {
		try {
			bed.setCid(cid);
			bedMapperResver.insertSelective(bed);
			return RestHomeResult.ok();
			
		} catch (Exception e) {
			e.printStackTrace();
			return RestHomeResult.build(500, "添加信息失败!");
		}
	}
	
	
	/**
	 * 编辑床位信息
	 */
	public RestHomeResult EditBed(Bed bed) {
	
		try {
			bedMapperResver.updateByPrimaryKeySelective(bed);
			return RestHomeResult.ok();
			
		} catch (Exception e) {
			e.printStackTrace();
			return RestHomeResult.build(500, "编辑床位信息失败!");
		}
	}

	/**
	 * 删除床位信息
	 */
	public RestHomeResult deleteBath(String ids){
		if (StringUtils.isNotBlank(ids)) {
			String[] staffIds = ids.split(",");
			
			for (String id : staffIds) {
				int parseInt = Integer.parseInt(id);
				
				bedMapperResver.deleteByPrimaryKey(parseInt);
				
			}
			return RestHomeResult.ok();
		}
		return RestHomeResult.build(500, "删除信息出错");
		
	}
	
	
}
