package com.ylw.controller;



import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.eclipse.jdt.internal.compiler.util.Sorting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ylw.dao.GoodsMapper;
import com.ylw.dao.Shop_typeEntityMapper;
import com.ylw.pojo.Shop_typeEntity;
import com.ylw.service.Shop_typeEntityMapperImpl;



@Controller
@RequestMapping(value="/shop")
public class TypeShowController {
	@Autowired
	Shop_typeEntityMapperImpl shop_typeEntityMapperImpl;
	
	@RequestMapping(value="/type")
	 public String showType(HttpServletRequest request) {
		List<Shop_typeEntity> type=shop_typeEntityMapperImpl.selectAll();
		//System.out.println(type);
		request.setAttribute("types", type);
		return "ShopType";
		 
	 }
	//添加类别
	@RequestMapping(value="/addType",method = RequestMethod.POST)
	 public String addType(Shop_typeEntity record) {
		System.out.println(record.getType_name());
		int result=shop_typeEntityMapperImpl.insert(record);
		System.out.println("result"+result);
		return "successAddType";
	//return "redirect:/ shop/type";
		 
	 }
	//跳转到增加页面
	@RequestMapping(value="/addDo")
	public String toadd() {
		return "addType";
		
	}
	//类型信息修改,从数据库中读取原来数据
	@RequestMapping(value="/updateDo/{type_id}")
	public String getType(@PathVariable String type_id,HttpServletRequest request) {
		int id=Integer.parseInt(type_id);
System.out.println(id);
		Shop_typeEntity shop_typeEntity=shop_typeEntityMapperImpl.selectByPrimaryKey(id);
		System.out.println(shop_typeEntity);
		request.setAttribute("type", shop_typeEntity);
		return "updateType";
		
	}
	//类型信息修改,将新数据写回数据库
	@RequestMapping(value="/toUpdate")
	public String toUpdata(Shop_typeEntity record) {
		int result=shop_typeEntityMapperImpl.updateByPrimaryKey(record);
		System.err.println(result);
		return "successTypeUpdate";
		//return "redirect:com.ylw.shopsys/shop/type";
		
	}
	//删除商品类型
	@RequestMapping(value="/toDelete/{type_id}")
	public String toDelete(@PathVariable String type_id) {
		System.out.println("start delete");
		System.out.println(type_id);
		int id=Integer.parseInt(type_id);
		int result=shop_typeEntityMapperImpl.deleteByPrimaryKey(id);
		System.out.println(result);
		return "successTypeUpdate";
		
	}
}
