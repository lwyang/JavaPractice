package com.ylw.mvc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDao {
public static Connection getConn() {
	Connection conn=null;
	try {
		Class.forName("com.mysql.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/shopsys?useUnicode=true&characterEncoding=utf8","ylw2","123456");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return conn;
	
}
}
