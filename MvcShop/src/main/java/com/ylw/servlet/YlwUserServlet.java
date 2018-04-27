package com.ylw.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.ylw.service.YlwUserInfoService;
import com.ylw.user.entiy.YlwUserInfo;

public class YlwUserServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String op=request.getParameter("op");
		if(op.equals("reg")) {
			doReg(request, response);
		}
	}
	protected void doReg(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("username");
		String password=request.getParameter("password");

		 YlwUserInfo user=new YlwUserInfo();
		  user.setPassword(password);
		  user.setUsername(username);
		  YlwUserInfoService service=new YlwUserInfoService();
		  int result= service.registerUser(user);
		  PrintWriter out= response.getWriter();
		  if(result>0){
				 response.sendRedirect("Login.jsp");
			  }else if(result==0){
				  out.println("<script>alert('注册失败');history.go(-1);<script/>");
			  }else{
				  out.println("<script>alert('注册失败,用户名已经存在');history.go(-1);<script/>");
			  }
	}
	

}
