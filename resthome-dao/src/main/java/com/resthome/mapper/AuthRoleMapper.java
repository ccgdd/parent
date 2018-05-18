package com.resthome.mapper;

import com.resthome.pojo.AuthRole;
import com.resthome.pojo.AuthRoleExample;
import com.resthome.pojo.RoleQueryVo;
import com.resthome.pojo.User;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AuthRoleMapper {
    int countByExample(AuthRoleExample example);

    int deleteByExample(AuthRoleExample example);

    int deleteByPrimaryKey(String id);

    int insert(AuthRole record);

    int insertSelective(AuthRole record);

    List<AuthRole> selectByExample(AuthRoleExample example);

    AuthRole selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") AuthRole record, @Param("example") AuthRoleExample example);

    int updateByExample(@Param("record") AuthRole record, @Param("example") AuthRoleExample example);

    int updateByPrimaryKeySelective(AuthRole record);

    int updateByPrimaryKey(AuthRole record);
    
    int  insertRoleAndFcuntion(RoleQueryVo roleQueryVo );
    
    List<User> queryUserAndRole();
    
}