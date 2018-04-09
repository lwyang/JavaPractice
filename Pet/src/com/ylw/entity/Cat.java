package com.ylw.entity;

public class Cat extends Pet implements CatchMouse{

	@Override
	public void cry() {
		// TODO Auto-generated method stub
		System.out.println("喵喵喵");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("跑的慢");
	}
	public void mySkill() {
		System.out.println("我会抓老鼠");
	}

	@Override
	public void CatchMouse() {
		// TODO Auto-generated method stub
		System.out.println("我会抓老鼠");
	}

}
