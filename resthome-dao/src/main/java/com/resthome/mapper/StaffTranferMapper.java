package com.resthome.mapper;

import com.resthome.pojo.StaffTranfer;
import com.resthome.pojo.StaffTranferExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface StaffTranferMapper {
    int countByExample(StaffTranferExample example);

    int deleteByExample(StaffTranferExample example);

    int deleteByPrimaryKey(Integer staffId);

    int insert(StaffTranfer record);

    int insertSelective(StaffTranfer record);

    List<StaffTranfer> selectByExample(StaffTranferExample example);

    StaffTranfer selectByPrimaryKey(Integer staffId);

    int updateByExampleSelective(@Param("record") StaffTranfer record, @Param("example") StaffTranferExample example);

    int updateByExample(@Param("record") StaffTranfer record, @Param("example") StaffTranferExample example);

    int updateByPrimaryKeySelective(StaffTranfer record);

    int updateByPrimaryKey(StaffTranfer record);
    
    List<StaffTranfer> selectUserManager(Map<Object, Object> map);
}