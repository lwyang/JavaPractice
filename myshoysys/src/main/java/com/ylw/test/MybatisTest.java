package com.ylw.test;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.ylw.dao.SqlsessionDao;




//public class MybatisTest {
//	@Test
//	public void selectAll1() {
//		SqlSession sqlsession=SqlsessionDao.getSqlsession();
//		List<LoginEntity> users = sqlsession.selectList("LoginMapper.selectAll");
//		for (LoginEntity userinfo : users) {
//			System.out.println(userinfo);
//		}
//		sqlsession.close();
//	}
//	@Test
//	public void selectAll2() {
//		String resource = "config/Configuration.xml";//配置文件
//		Reader reader;
//		SqlSessionFactory sqlSessionFactory = null;//会话工厂
//		SqlSession sqlsession = null;
//		try {
//			reader = Resources.getResourceAsReader(resource);
//			sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
//			sqlsession = sqlSessionFactory.openSession();
//			List<LoginEntity> users = sqlsession.selectList("LoginMapper.selectAll");
//			for (LoginEntity userinfo : users) {
//				System.out.println(userinfo);
//			}
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} finally {
//			if (sqlsession != null) {
//				sqlsession.close();
//			}
//		}
//
//	}
//}
