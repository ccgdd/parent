package com.resthome.mapper;

import com.resthome.pojo.GoodsInDetail;
import com.resthome.pojo.GoodsInDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsInDetailMapper {
    int countByExample(GoodsInDetailExample example);

    int deleteByExample(GoodsInDetailExample example);

    int deleteByPrimaryKey(Integer goodsDetailId);

    int insert(GoodsInDetail record);

    int insertSelective(GoodsInDetail record);

    List<GoodsInDetail> selectByExample(GoodsInDetailExample example);

    GoodsInDetail selectByPrimaryKey(Integer goodsDetailId);

    int updateByExampleSelective(@Param("record") GoodsInDetail record, @Param("example") GoodsInDetailExample example);

    int updateByExample(@Param("record") GoodsInDetail record, @Param("example") GoodsInDetailExample example);

    int updateByPrimaryKeySelective(GoodsInDetail record);

    int updateByPrimaryKey(GoodsInDetail record);

	
}