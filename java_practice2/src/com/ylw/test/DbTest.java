package com.ylw.test;

import java.awt.List;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

import org.junit.Test;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class DbTest {
	public String name;
	public int id;
	public int age;
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	

	@Override
	public String toString() {
		return "DbTest [name=" + name + ", id=" + id + ", age=" + age + "]";
	}

	@SuppressWarnings("resource")
	@Test
   public void selectUsers() {
	   String driverClassName = "com.mysql.jdbc.Driver";
	   String url="jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=utf8";
	   String user="ylw2";
	   String password="123456";
	   java.sql.Connection conn=null;
	   java.sql.PreparedStatement pstm = null;
	   ResultSet rs = null;
	   String sql=null;
	   try {
		   //��װ����
		   Class.forName(driverClassName);
	   }catch(ClassNotFoundException e) {
		   e.printStackTrace();
	   }
	   try {
		   while(true) {
			   
		   
		   System.out.println("�������Ӧ���ֽ�����ز��� 1.���� 2ɾ�� 3.�޸� 4��ѯ (����-1���˳�)");
		   Scanner input=new Scanner(System.in);
		   //���ݿ����Ӷ����൱������
		   conn=DriverManager.getConnection(url,user,password);
		   int flag= input.nextInt();
		   if(flag==-1) {
			   System.out.println("���η��񵽴˽�����лл");
			   break;
		   }
			  
		   //��
		   if(flag==1) {
			   System.out.println("������name");
			   String names=input.next();
			   System.out.println("������age");
			   int ages=input.nextInt();
			   String sql2="select * from stu_info where name='"+names+"'" ;
			   pstm = conn.prepareStatement(sql2);
			   rs = pstm.executeQuery();//�õ�һ���ѯ���
				if(rs.next()) {
					
					System.out.println( "�ֶ��ظ����޷�����");
				}else {
					 sql="insert into stu_info(name,age) values(' "+names+"','"+ages+"')";
					   pstm = conn.prepareStatement(sql);
				   int a=pstm.executeUpdate();
				   if(a>0)
				   System.out.println("success");
				   else {
					   System.out.println("failue");
				   }
				}   
		   }
		   //ɾ
		   if(flag==2) {
			   System.out.println("��������ɾ����id");
			   int ids=input.nextInt();
			  sql="delete  from stu_info where id='"+ids+"'";
			  pstm = conn.prepareStatement(sql);
			  int a=pstm.executeUpdate();
			   if(a>0)
			   System.out.println("success");
			   else {
				   System.out.println("failue");
			   }
		   }
		   //��
		   if(flag==3) {
			   System.out.println("�����������޸ĵ��û���");
			   String name1=input.next();
			   System.out.println("�������µ��û���");
			   String name2=input.next();
			   String sql2="select * from stu_info where name='"+name2+"'" ;
			   pstm = conn.prepareStatement(sql2);
			   rs = pstm.executeQuery();//�õ�һ���ѯ���
				if(rs.next()) {
					
					System.out.println( "�ֶ��ظ����޷�����");
				}else {
					 sql="update stu_info set name='"+name2+"'where name='"+name1+"'";
					   pstm = conn.prepareStatement(sql);
				   int b=pstm.executeUpdate();
				   if(b>0) {
					   System.out.println("success");
				   }
				   else {
					   System.out.println("failue");
				   }
				}
			 
		   }
		   //��
		   if(flag==4) {
			   
			   sql="select * from stu_info" ;
			   pstm = conn.prepareStatement(sql);
			   rs = pstm.executeQuery();//�õ�һ���ѯ���
			   
			  ArrayList<DbTest> db=new ArrayList<DbTest>();
				while(rs.next()) {
					DbTest pt=new DbTest();
					pt.setName (rs.getString("name"));
					pt. setId (rs.getInt("id"));
					pt.setAge(rs.getInt("age"));	
					//System.out.println(pt.getName());
					//Date date = rs.getDate("rtime");//Date����Ҫ�� java.util.Date�������� java.sql.Date��
					db.add(pt);
					//System.out.println(pt.getName());
					
					
				}
			
				for(DbTest tmp:db) {
					//System.out.println(tmp.toString());
					System.out.println(tmp.toString());
					}
		   }
		 
		   }
	   }catch(SQLException e) {
		   e.printStackTrace();
	   }
	   finally {
		   if(conn!=null) {
			   try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			   if(pstm!=null) {
					try {
						pstm.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			   if(rs!=null) {
					try {
						rs.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

		   }
	   }
   }
}
