package com.ylw.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import com.ylw.dao.GoodsMapper;
import com.ylw.dao.SqlsessionDao;
import com.ylw.pojo.Goods;
import com.ylw.pojo.Shop_typeEntity;
@Service
public class GoodsMapperImpl implements GoodsMapper {
//ɾ��
	@Override
	public int deleteByPrimaryKey(int goods_id) {
		SqlSession sqlsession = SqlsessionDao.getSqlsession();
		int result=sqlsession.delete("GoodsMapper.deleteGoods",goods_id);
		sqlsession.commit();
		return result;
	}
//���������Ϣ
	@Override
	public int insert(Goods record) {
		SqlSession sqlsession = SqlsessionDao.getSqlsession();
		int result=sqlsession.insert("GoodsMapper.insertGoods",record);
		sqlsession.commit();
		return result;
	}

	@Override
	public int insertSelective(Goods record) {
		// TODO Auto-generated method stub
		return 0;
	}
//����id���һ���
	@Override
	public Goods selectByPrimaryKey(int goods_id) {
		SqlSession sqlsession = SqlsessionDao.getSqlsession();
		Goods goods=sqlsession.selectOne("GoodsMapper.selectById",goods_id);
		return goods;
	}

	@Override
	public int updateByPrimaryKeySelective(Goods record) {
		// TODO Auto-generated method stub
		return 0;
	}
     //��Ʒ��Ϣ�޸�
	@Override
	public int updateByPrimaryKey(Goods record) {
		SqlSession sqlsession = SqlsessionDao.getSqlsession();
		int result=sqlsession.update("GoodsMapper.updateGoods",record);
		sqlsession.commit();
		return result;
		
	}

	@Override
	public List<Goods> selectAll() {
		SqlSession sqlsession = SqlsessionDao.getSqlsession();
		List<Goods> goods = sqlsession.selectList("GoodsMapper.selectAll");
		sqlsession.commit();
		return goods;
	}

}
