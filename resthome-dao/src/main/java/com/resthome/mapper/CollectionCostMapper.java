package com.resthome.mapper;

import com.resthome.pojo.CollectionCost;
import com.resthome.pojo.CollectionCostExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CollectionCostMapper {
    int countByExample(CollectionCostExample example);

    int deleteByExample(CollectionCostExample example);

    int deleteByPrimaryKey(String costId);

    int insert(CollectionCost record);

    int insertSelective(CollectionCost record);

    List<CollectionCost> selectByExample(CollectionCostExample example);

    CollectionCost selectByPrimaryKey(String costId);

    int updateByExampleSelective(@Param("record") CollectionCost record, @Param("example") CollectionCostExample example);

    int updateByExample(@Param("record") CollectionCost record, @Param("example") CollectionCostExample example);

    int updateByPrimaryKeySelective(CollectionCost record);

    int updateByPrimaryKey(CollectionCost record);

	List<CollectionCost> selectCollection();
}