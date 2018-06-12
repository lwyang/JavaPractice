package com.ylw.dao;

import java.util.List;

import com.ylw.pojo.Goods;

public interface GoodsMapper {
    int deleteByPrimaryKey(int goods_id);

    int insert(Goods record);

    int insertSelective(Goods record);

    Goods selectByPrimaryKey(int goods_id);

    int updateByPrimaryKeySelective(Goods record);

    int updateByPrimaryKey(Goods record);
    
     List<Goods> selectAll();
    
}