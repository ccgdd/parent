package com.resthome.controller;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.resthome.mapper.BedMapper;
import com.resthome.mapper.BedMapperResver;
import com.resthome.mapper.ChangeRoomMapper;
import com.resthome.mapper.OldmanMapper;
import com.resthome.mapper.UserMapper;
import com.resthome.pojo.AuthRole;
import com.resthome.pojo.Bed;
import com.resthome.pojo.BedExample;
import com.resthome.pojo.ChangeRoom;
import com.resthome.pojo.ChangeRoomExample;
import com.resthome.pojo.EasyUIDataGridRestful;
import com.resthome.pojo.Oldman;
import com.resthome.pojo.OldmanExample;
import com.resthome.pojo.OldmanExample.Criteria;
import com.resthome.pojo.RoleQueryVo;
import com.resthome.pojo.User;
import com.resthome.service.OldManService;
import com.resthome.service.RoleService;
import com.resthome.utils.GenerateId;

@Controller
public class ChangeRoomController {

	
	@Autowired
	private ChangeRoomMapper crMapper;
	@Autowired
	private OldmanMapper oldMapper;
	
	@RequestMapping("changeroom/insert")
	public String insertChangeRoom(ChangeRoom changeRoom){
		
		String localTrmSeqNum = GenerateId.getLocalTrmSeqNum().substring(6, 13);
		changeRoom.setId(localTrmSeqNum);
		
		String oldmanName = changeRoom.getOldmanName();
		Oldman oldman = oldMapper.selectByPrimaryKey(Integer.parseInt(oldmanName));
		changeRoom.setOldmanName(oldman.getName());
		crMapper.insertSelective(changeRoom);
		
		return "redirect:/page_recept_change-room.action";
		
	}
	
	
	@RequestMapping("changeroom/query")
	@ResponseBody
	public EasyUIDataGridRestful getBedList(int page,int rows){
		
		//设置分页信息
		PageHelper.startPage(page,rows);
		// 查询数据结果集
		ChangeRoomExample example = new ChangeRoomExample();
		List<ChangeRoom> list = crMapper.selectByExample(example);
		//创建一个对象
		EasyUIDataGridRestful result = new EasyUIDataGridRestful();
		result.setRows(list);
		//取分页结果
		PageInfo<ChangeRoom> pageInfo  = new PageInfo<>(list);
		//取总记录数
		long total = pageInfo.getTotal();
		result.setTotal(total);
		
		return result;
	}
	
	
	/**
	 * 删除信息
	 */
	@RequestMapping("changeroom/delete")
	public String deleteBath(String ids){
		if (StringUtils.isNotBlank(ids)) {
			String[] idss = ids.split(",");
			for (String id : idss) {
				crMapper.deleteByPrimaryKey(id);
			}
		}	
		
		
		return "redirect:/page_recept_change-room.action";
		
	}
	
	
	@Autowired BedMapperResver bedmapper;
	/**
	 * 查询所有床位信息
	 */
	@RequestMapping("bed/listajax")
	@ResponseBody
	public List<Bed> selectAllBed(){
		BedExample example = new BedExample();
		List<Bed> list = bedmapper.selectByExample(example);
		return list;
	}
	@Autowired
	UserMapper usermapper;
	
	/**
	 * 修改老人信息
	 */
	@RequestMapping("oldman/edit2")
	public String editOlaman2(Oldman oldman){
		OldmanExample example = new OldmanExample();
		Oldman oldman1 = oldMapper.selectByPrimaryKey(Integer.parseInt(oldman.getWithName()));
		oldman.setNumber(oldman.getNumber());
		oldman.setWithName(oldman1.getName());
		User user = usermapper.selectByPrimaryKey(oldman.getName());
		oldman.setHandleName(user.getUsername());
		Criteria createCriteria = example.createCriteria();
		createCriteria.andIdEqualTo(Integer.parseInt(oldman.getName()));
		oldMapper.updateByExampleSelective(oldman, example);
	return "redirect:/page_recept_goOut.action";
		
	}
}
