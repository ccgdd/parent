package com.resthome.mapper;

import com.resthome.pojo.GoodsOut;
import com.resthome.pojo.GoodsOutExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsOutMapper {
    int countByExample(GoodsOutExample example);

    int deleteByExample(GoodsOutExample example);

    int deleteByPrimaryKey(Integer outCode);

    int insert(GoodsOut record);

    int insertSelective(GoodsOut record);

    List<GoodsOut> selectByExample(GoodsOutExample example);

    GoodsOut selectByPrimaryKey(Integer outCode);

    int updateByExampleSelective(@Param("record") GoodsOut record, @Param("example") GoodsOutExample example);

    int updateByExample(@Param("record") GoodsOut record, @Param("example") GoodsOutExample example);

    int updateByPrimaryKeySelective(GoodsOut record);

    int updateByPrimaryKey(GoodsOut record);

	List<GoodsOut> queryGoodsOut(GoodsOut goodsOut);
}