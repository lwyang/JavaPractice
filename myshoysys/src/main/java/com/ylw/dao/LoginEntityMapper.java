package com.ylw.dao;

import com.ylw.pojo.LoginEntity;

public interface LoginEntityMapper {
    int deleteByPrimaryKey(String username);

    int insert(LoginEntity record);

    int insertSelective(LoginEntity record);

    LoginEntity selectByPrimaryKey(String username);

    int updateByPrimaryKeySelective(LoginEntity record);

    int updateByPrimaryKey(LoginEntity record);
    String selsetByUsername(String username,String password);
    
}