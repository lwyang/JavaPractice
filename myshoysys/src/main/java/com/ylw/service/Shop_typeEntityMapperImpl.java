package com.ylw.service;

import java.util.List;

import javax.websocket.Session;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.springframework.stereotype.Service;

import com.ylw.dao.Shop_typeEntityMapper;
import com.ylw.dao.SqlsessionDao;

import com.ylw.pojo.Shop_typeEntity;
@Service
public class Shop_typeEntityMapperImpl implements Shop_typeEntityMapper {
/**
 * 删除商品类别信息
 */
	@Override
	public int deleteByPrimaryKey(int type_id) {
		SqlSession sqlsession = SqlsessionDao.getSqlsession();
		int result=sqlsession.delete("Shop_typeMapper.deleteType",type_id);
		sqlsession.commit();
		return result;
	}
/**
 * 增加商品类别
 */
	@Override
	public int insert(Shop_typeEntity record) {
		SqlSession sqlsession = SqlsessionDao.getSqlsession();
		int result=sqlsession.insert("Shop_typeMapper.insertType",record);
		sqlsession.commit();
		return result;
	}

	@Override
	public int insertSelective(Shop_typeEntity record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Shop_typeEntity selectByPrimaryKey(Integer type_id) {
		// TODO Auto-generated method stub
	
		return null;
	}
/**
 * 更新商品类别
 */
	@Override
	public int updateByPrimaryKey(Shop_typeEntity record) {
		SqlSession sqlsession = SqlsessionDao.getSqlsession();
		int result=sqlsession.update("Shop_typeMapper.updateType",record);
		sqlsession.commit();
		return result;
	}

	

	/**
	 * 商品类别显示
	 */
	@Override
	public List<Shop_typeEntity> selectAll() {
		SqlSession sqlsession = SqlsessionDao.getSqlsession();
		List<Shop_typeEntity> shop_typeEntity = sqlsession.selectList("Shop_typeMapper.selectAll");
		sqlsession.close();
		return shop_typeEntity;
	}
	/**
	 * 根据id找到商品别类
	 * @param type_id
	 * @return
	 */
	public Shop_typeEntity selectByPrimaryKey(int type_id) {
		SqlSession sqlsession = SqlsessionDao.getSqlsession();
		Shop_typeEntity shop_typeEntity=sqlsession.selectOne("Shop_typeMapper.selectById",type_id);
		return shop_typeEntity;
		
	}
	// @Test
	// public void selectAll1() {
	// // TODO Auto-generated method stub
	// SqlSession sqlsession=SqlsessionDao.getSqlsession();
	// List<Shop_typeEntity> shop_typeEntity =
	// sqlsession.selectList("Shop_typeMapper.selectAll");
	// for (Shop_typeEntity info : shop_typeEntity) {
	// System.out.println(info);
	// }
	// sqlsession.close();
	//
	// }

}
