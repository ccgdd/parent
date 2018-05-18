package com.resthome.mapper;

import com.resthome.pojo.GoodsOutDetail;
import com.resthome.pojo.GoodsOutDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsOutDetailMapper {
    int countByExample(GoodsOutDetailExample example);

    int deleteByExample(GoodsOutDetailExample example);

    int deleteByPrimaryKey(Integer goodsDetailId);

    int insert(GoodsOutDetail record);

    int insertSelective(GoodsOutDetail record);

    List<GoodsOutDetail> selectByExample(GoodsOutDetailExample example);

    GoodsOutDetail selectByPrimaryKey(Integer goodsDetailId);

    int updateByExampleSelective(@Param("record") GoodsOutDetail record, @Param("example") GoodsOutDetailExample example);

    int updateByExample(@Param("record") GoodsOutDetail record, @Param("example") GoodsOutDetailExample example);

    int updateByPrimaryKeySelective(GoodsOutDetail record);

    int updateByPrimaryKey(GoodsOutDetail record);
}