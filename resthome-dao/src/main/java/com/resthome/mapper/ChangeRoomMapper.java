package com.resthome.mapper;

import com.resthome.pojo.ChangeRoom;
import com.resthome.pojo.ChangeRoomExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ChangeRoomMapper {
    int countByExample(ChangeRoomExample example);

    int deleteByExample(ChangeRoomExample example);

    int deleteByPrimaryKey(String id);

    int insert(ChangeRoom record);

    int insertSelective(ChangeRoom record);

    List<ChangeRoom> selectByExample(ChangeRoomExample example);

    ChangeRoom selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ChangeRoom record, @Param("example") ChangeRoomExample example);

    int updateByExample(@Param("record") ChangeRoom record, @Param("example") ChangeRoomExample example);

    int updateByPrimaryKeySelective(ChangeRoom record);

    int updateByPrimaryKey(ChangeRoom record);
}