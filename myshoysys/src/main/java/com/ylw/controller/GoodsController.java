package com.ylw.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ylw.dao.GoodsMapper;
import com.ylw.pojo.Goods;
import com.ylw.pojo.Shop_typeEntity;
import com.ylw.service.GoodsMapperImpl;
import com.ylw.service.Shop_typeEntityMapperImpl;

@Controller
@RequestMapping(value="/goods")
public class GoodsController {
@Autowired
GoodsMapperImpl goodsMapperImpl;
@Autowired
Shop_typeEntityMapperImpl shop_typeEntityMapperImpl;

//跳转到增加页面
@RequestMapping(value="/toAddGoods")
public String toadd(HttpServletRequest request) {
	List<String> listType=new ArrayList<String>(); 
	List<Shop_typeEntity> type= shop_typeEntityMapperImpl.selectAll();
	System.out.println(type);
	for(Shop_typeEntity t:type) {
		System.out.println(1);
		listType.add(t.getType_name());
	}
	request.setAttribute("listType", listType);
	return "addGoods";
	
}
//添加商品
@RequestMapping(value="/addGoods")
 public String addType(Goods record) {
	System.out.println(record);
	int result=goodsMapperImpl.insert(record);
	System.out.println("goods insert result"+result);
	return "goodsInsertSuccess";
	 
 }

@RequestMapping(value="/showGoods")
public String goodShow(HttpServletRequest request) {
	List<Goods> goods=goodsMapperImpl.selectAll();
	System.out.println(goods.size());
	request.setAttribute("goods", goods);
	return "goodsDisplay";
	
}
@RequestMapping(value="toDelete/{goods_id}")
public String doDelete(@PathVariable String goods_id,HttpServletRequest request) {
	int id=Integer.parseInt(goods_id);
	int result=goodsMapperImpl.deleteByPrimaryKey(id);
	System.out.println(result);
	return "Success";
	
}
@RequestMapping(value="toUpdate/{goods_id}")
public String doUpdate(@PathVariable String goods_id,HttpServletRequest request) {
	int id=Integer.parseInt(goods_id);
	Goods goods=goodsMapperImpl.selectByPrimaryKey(id);
	System.out.println("修改取数据"+goods);
	request.setAttribute("goods", goods);
	return "goodsEdit";
	
}
//类型信息修改,将新数据写回数据库
	@RequestMapping(value="/doUpdate")
	public String toUpdata(Goods record) {
		int result=goodsMapperImpl.updateByPrimaryKey(record);
		System.err.println("goods修改结果"+result);
		return "Success";
		
	}
}
