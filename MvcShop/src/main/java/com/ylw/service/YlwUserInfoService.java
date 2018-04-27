package com.ylw.service;

import java.sql.Connection;
import java.sql.SQLException;

import com.ylw.mvc.dao.ConnectDao;
import com.ylw.mvc.dao.YlwUserInfoDao;
import com.ylw.user.entiy.YlwUserInfo;



public class YlwUserInfoService {
	private YlwUserInfoDao dao=new YlwUserInfoDao();
	public boolean login(YlwUserInfo user){
		boolean result=false;
		Connection conn=ConnectDao.getConn();
		YlwUserInfo realuser=dao.selUserByUsername(conn, user.getUsername());
		if(realuser!=null){
			if(realuser.getPassword().equals(user.getPassword())){
				result=true;
			}
			
		}
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
		
	}
	public int registerUser(YlwUserInfo user){
		int result=0;
		Connection conn=ConnectDao.getConn();
		YlwUserInfo realuser=dao.selUserByUsername(conn, user.getUsername());
		if(realuser==null){
			result=dao.insertUser(conn, user);
		}
		else{
			result=-1;
		}
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
}
