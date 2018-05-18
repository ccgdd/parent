package com.resthome.mapper;

import com.resthome.pojo.VisitCheckin;
import com.resthome.pojo.VisitCheckinExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VisitCheckinMapper {
    int countByExample(VisitCheckinExample example);

    int deleteByExample(VisitCheckinExample example);

    int deleteByPrimaryKey(Long visitId);

    int insert(VisitCheckin record);

    int insertSelective(VisitCheckin record);

    List<VisitCheckin> selectByExample(VisitCheckinExample example);

    VisitCheckin selectByPrimaryKey(Long visitId);

    int updateByExampleSelective(@Param("record") VisitCheckin record, @Param("example") VisitCheckinExample example);

    int updateByExample(@Param("record") VisitCheckin record, @Param("example") VisitCheckinExample example);

    int updateByPrimaryKeySelective(VisitCheckin record);

    int updateByPrimaryKey(VisitCheckin record);

}