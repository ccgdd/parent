package com.resthome.mapper;

import com.resthome.pojo.GoodsIn;
import com.resthome.pojo.GoodsInExample;
import com.resthome.pojo.GoodsQueryVo;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsInMapper {
    int countByExample(GoodsInExample example);

    int deleteByExample(GoodsInExample example);

    int deleteByPrimaryKey(Integer inCode);

    int insert(GoodsIn record);

    int insertSelective(GoodsIn record);

    List<GoodsIn> selectByExample(GoodsInExample example);

    GoodsIn selectByPrimaryKey(Integer inCode);

    int updateByExampleSelective(@Param("record") GoodsIn record, @Param("example") GoodsInExample example);

    int updateByExample(@Param("record") GoodsIn record, @Param("example") GoodsInExample example);

    int updateByPrimaryKeySelective(GoodsIn record);

    int updateByPrimaryKey(GoodsIn record);
    
    List<GoodsQueryVo> queryGoodsIn(GoodsIn goodsIn);

}