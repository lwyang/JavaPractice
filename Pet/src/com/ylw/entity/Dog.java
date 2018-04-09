package com.ylw.entity;

public class Dog extends Pet implements Swim {

	@Override
	public void cry() {
		// TODO Auto-generated method stub
		System.out.println("汪汪汪");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("跑得快");
	}
//	public void mySkill() {
//		System.out.println("我会游泳");
//	}

	@Override
	public void Swim() {
		// TODO Auto-generated method stub
		System.out.println("我会游泳");
	}
}
