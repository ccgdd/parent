package com.resthome.mapper;

import com.resthome.pojo.User;
import com.resthome.pojo.UserExample;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    int countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(String id);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    
    int insertUserAndRole(HashMap<Object, Object> saveParams);
    
    List<User> queryUserFunction(String id);
    
    int deleteRoleIdByUserId(String user_id);
    
    List<User> listajax();
}