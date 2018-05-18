package com.resthome.mapper;

import com.resthome.pojo.CostTuoguan;
import com.resthome.pojo.CostTuoguanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CostTuoguanMapper {
    int countByExample(CostTuoguanExample example);

    int deleteByExample(CostTuoguanExample example);

    int deleteByPrimaryKey(Integer tuoguanId);

    int insert(CostTuoguan record);

    int insertSelective(CostTuoguan record);

    List<CostTuoguan> selectByExample(CostTuoguanExample example);

    CostTuoguan selectByPrimaryKey(Integer tuoguanId);

    int updateByExampleSelective(@Param("record") CostTuoguan record, @Param("example") CostTuoguanExample example);

    int updateByExample(@Param("record") CostTuoguan record, @Param("example") CostTuoguanExample example);

    int updateByPrimaryKeySelective(CostTuoguan record);

    int updateByPrimaryKey(CostTuoguan record);

	List<CostTuoguan> selectTuoguan();
}