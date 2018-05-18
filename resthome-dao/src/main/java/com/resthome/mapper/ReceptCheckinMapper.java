package com.resthome.mapper;

import com.resthome.pojo.ReceptCheckin;
import com.resthome.pojo.ReceptCheckinExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReceptCheckinMapper {
    int countByExample(ReceptCheckinExample example);

    int deleteByExample(ReceptCheckinExample example);

    int deleteByPrimaryKey(Long receptCheckinId);

    int insert(ReceptCheckin record);

    int insertSelective(ReceptCheckin record);

    List<ReceptCheckin> selectByExample(ReceptCheckinExample example);

    ReceptCheckin selectByPrimaryKey(Long receptCheckinId);

    int updateByExampleSelective(@Param("record") ReceptCheckin record, @Param("example") ReceptCheckinExample example);

    int updateByExample(@Param("record") ReceptCheckin record, @Param("example") ReceptCheckinExample example);

    int updateByPrimaryKeySelective(ReceptCheckin record);

    int updateByPrimaryKey(ReceptCheckin record);
    
    List<ReceptCheckin> selectReceptCheckin();
}