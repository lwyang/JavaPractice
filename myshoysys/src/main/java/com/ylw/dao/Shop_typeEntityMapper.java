package com.ylw.dao;

import java.util.List;

import com.ylw.pojo.Shop_typeEntity;

public interface Shop_typeEntityMapper {
    int deleteByPrimaryKey(int type_id);

    int insert(Shop_typeEntity record);

    int insertSelective(Shop_typeEntity record);

    Shop_typeEntity selectByPrimaryKey(Integer type_id);

    int updateByPrimaryKey(Shop_typeEntity record);

//    int updateByPrimaryKey(Shop_typeEntity record);
    
    List<Shop_typeEntity> selectAll();
}