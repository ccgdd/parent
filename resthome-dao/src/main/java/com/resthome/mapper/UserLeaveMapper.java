package com.resthome.mapper;

import com.resthome.pojo.UserLeave;
import com.resthome.pojo.UserLeaveExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserLeaveMapper {
    int countByExample(UserLeaveExample example);

    int deleteByExample(UserLeaveExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserLeave record);

    int insertSelective(UserLeave record);

    List<UserLeave> selectByExample(UserLeaveExample example);

    UserLeave selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserLeave record, @Param("example") UserLeaveExample example);

    int updateByExample(@Param("record") UserLeave record, @Param("example") UserLeaveExample example);

    int updateByPrimaryKeySelective(UserLeave record);

    int updateByPrimaryKey(UserLeave record);
    
    List<UserLeave> queryUserLeave(UserLeave userLeave);
}