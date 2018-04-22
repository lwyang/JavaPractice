package com.shopsys.serlevt;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.shopsys.serlevt.DbOperation;

public class UserServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String action=request.getParameter("op");
		if("login".equals(action)) {
			login(request, response);
		}else {
			response.getWriter().println("暂时不支持此操作");
		}
		
		
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	protected void login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String username= request.getParameter("username");
        String password=request.getParameter("password");
        DbOperation us=new DbOperation();
        boolean b=us.LoginCheck(username, password);
        if(b) {
       	 response.sendRedirect("admin/index.jsp");
        }else {
       	 PrintWriter out= response.getWriter();
       	 out.println("login failue");
        }
	}
}
