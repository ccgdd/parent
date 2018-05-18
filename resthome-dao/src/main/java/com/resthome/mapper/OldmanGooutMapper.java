package com.resthome.mapper;

import com.resthome.pojo.OldmanGoout;
import com.resthome.pojo.OldmanGooutExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OldmanGooutMapper {
    int countByExample(OldmanGooutExample example);

    int deleteByExample(OldmanGooutExample example);

    int deleteByPrimaryKey(String gooutId);

    int insert(OldmanGoout record);

    int insertSelective(OldmanGoout record);

    List<OldmanGoout> selectByExample(OldmanGooutExample example);

    OldmanGoout selectByPrimaryKey(String gooutId);

    int updateByExampleSelective(@Param("record") OldmanGoout record, @Param("example") OldmanGooutExample example);

    int updateByExample(@Param("record") OldmanGoout record, @Param("example") OldmanGooutExample example);

    int updateByPrimaryKeySelective(OldmanGoout record);

    int updateByPrimaryKey(OldmanGoout record);
    
    
    List<OldmanGoout> selectOldmanGoout(OldmanGoout oldmanGoout);
}