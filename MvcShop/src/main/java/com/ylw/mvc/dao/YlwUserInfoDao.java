package com.ylw.mvc.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.ylw.user.entiy.YlwUserInfo;




public class YlwUserInfoDao extends YlwBaseDao {
	public int insertUser(Connection conn,YlwUserInfo user){
		String sql="insert into shopsyslogin(username,password)values(?,?)";
		int row= super.exeUpdate(conn, sql, user.getUsername(),user.getPassword());
		
		return row;
	}
	public YlwUserInfo selUserByUsername(Connection conn,String username){
		String sql="select * from userinfo where username=?";
		 ResultSet rs= super.exeQuery(conn, sql, username);
		 YlwUserInfo user=null;
		 if(rs!=null){
			 try {
				if(rs.next()){
					user=new YlwUserInfo(); 
					user.setPassword(rs.getString("password"));
					user.setUsername(username);
				 }
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
		 return user;
	}
}
