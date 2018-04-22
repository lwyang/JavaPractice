package com.shopsys.serlevt;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DbOperation {
	public boolean LoginCheck(String name, String pwd) {
		String driverClassName = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/shopsys?useUnicode=true&characterEncoding=utf8";
		String user = "ylw2";
		String password = "123456";
		java.sql.Connection conn = null;
		java.sql.PreparedStatement pstm = null;
		ResultSet rs = null;
		String sql = null;
		// 安装驱动
		try {
			
			Class.forName(driverClassName);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			conn = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sql = "select * from shopsysLogin where username='" + name + "'";
		try {
			pstm = conn.prepareStatement(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			rs = pstm.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // 得到一组查询结果
		try {
			while (rs.next()) {
				String passwordR = new String(rs.getString("password"));
				if (passwordR.equals(pwd)) {
					return true;
				} else {
					return false;
				}
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	// public static void main(String[] args) {
	// DbOperation op=new DbOperation();
	// System.err.println(op.LoginCheck("admin1", "123456"));
	// }
}
