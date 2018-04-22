package com.shopsys.dao;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;

public class DbLogin {
	@Test
public void connect() {
	 String driverClassName = "com.mysql.jdbc.Driver";
	   String url="jdbc:mysql://localhost:3306/shopsys?useUnicode=true&characterEncoding=utf8";
	   String user="ylw2";
	   String password="123456";
	   java.sql.Connection conn=null;
	   java.sql.PreparedStatement pstm = null;
	   ResultSet rs = null;
	   String sql=null;
	   try {
		   //°²×°Çý¶¯
		   Class.forName(driverClassName);
	   }catch(ClassNotFoundException e) {
		   e.printStackTrace();
	   }
	   try {
		conn=DriverManager.getConnection(url,user,password);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   sql="delete  from shopsysLogin where username='ylw'";
	   try {
		pstm = conn.prepareStatement(sql);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   
	try {
		int a = pstm.executeUpdate();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   
}
}
