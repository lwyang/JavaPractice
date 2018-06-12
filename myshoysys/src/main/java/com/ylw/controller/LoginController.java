package com.ylw.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.catalina.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ylw.dao.LoginEntityMapper;

@Controller

public class LoginController {
	@Autowired
	LoginEntityMapper loginEntityMapper;

	@RequestMapping("/login")
	public String loginJudge(String username, String password, HttpServletRequest request) {
		String loginFlag = loginEntityMapper.selsetByUsername(username, password);
		if (loginFlag.equals("no")){
			return "Login";
		} else {
			//request.setAttribute("loginFlag", loginFlag);
			 HttpSession session = request.getSession();
			 session.setAttribute("username", loginFlag);
		}
		return "Index";
	}
	
	@RequestMapping("/toLogin")
	public String toLogin(HttpServletRequest request) {
		 HttpSession session = request.getSession();
		 session.invalidate();
		return "Login";
		
	}
}
