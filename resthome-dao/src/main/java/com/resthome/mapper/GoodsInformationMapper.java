package com.resthome.mapper;

import com.resthome.pojo.GoodsInformation;
import com.resthome.pojo.GoodsInformationExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsInformationMapper {
    int countByExample(GoodsInformationExample example);

    int deleteByExample(GoodsInformationExample example);

    int deleteByPrimaryKey(Integer goodsId);

    int insert(GoodsInformation record);

    int insertSelective(GoodsInformation record);

    List<GoodsInformation> selectByExample(GoodsInformationExample example);

    GoodsInformation selectByPrimaryKey(Integer goodsId);

    int updateByExampleSelective(@Param("record") GoodsInformation record, @Param("example") GoodsInformationExample example);

    int updateByExample(@Param("record") GoodsInformation record, @Param("example") GoodsInformationExample example);

    int updateByPrimaryKeySelective(GoodsInformation record);

    int updateByPrimaryKey(GoodsInformation record);

}