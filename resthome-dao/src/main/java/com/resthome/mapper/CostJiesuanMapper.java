package com.resthome.mapper;

import com.resthome.pojo.CollectionCost;
import com.resthome.pojo.CostJiesuan;
import com.resthome.pojo.CostJiesuanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CostJiesuanMapper {
    int countByExample(CostJiesuanExample example);

    int deleteByExample(CostJiesuanExample example);

    int deleteByPrimaryKey(String costJiesuanId);

    int insert(CostJiesuan record);

    int insertSelective(CostJiesuan record);

    List<CostJiesuan> selectByExample(CostJiesuanExample example);

    CostJiesuan selectByPrimaryKey(String costJiesuanId);

    int updateByExampleSelective(@Param("record") CostJiesuan record, @Param("example") CostJiesuanExample example);

    int updateByExample(@Param("record") CostJiesuan record, @Param("example") CostJiesuanExample example);

    int updateByPrimaryKeySelective(CostJiesuan record);

    int updateByPrimaryKey(CostJiesuan record);

	List<CostJiesuan> selectJiesuan();
}