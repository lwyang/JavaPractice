package com.ylw.service;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import com.ylw.dao.LoginEntityMapper;
import com.ylw.dao.SqlsessionDao;
import com.ylw.pojo.LoginEntity;
@Service
public class LoginImpl implements LoginEntityMapper {

	@Override
	public int deleteByPrimaryKey(String username) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(LoginEntity record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(LoginEntity record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public LoginEntity selectByPrimaryKey(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByPrimaryKeySelective(LoginEntity record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(LoginEntity record) {
		// TODO Auto-generated method stub
		return 0;
	}
    //µÇÂ½ÅÐ¶Ï
	@Override
	public String selsetByUsername(String username,String password) {
		String flag="no";
		SqlSession sqlsession = SqlsessionDao.getSqlsession();
		LoginEntity loginEntity=sqlsession.selectOne("LoginMapper.selectByUsername", username);
		if(loginEntity!=null) {
			if(loginEntity.getPassword().equals(password)) {
				//request.setAttribute("loginUser", loginEntity.getUsername());
				return loginEntity.getUsername();
			}
		}
		
		return flag;
	}

}
