package com.ylw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/Test")
public class ControllerTest {
	
 @RequestMapping(value="/index")
 public String test1() {
	return "Index";
	 
 }
 
 @RequestMapping(value="/aaa")
 public String test2() {
	return "ShopType";
	 
 }
}
