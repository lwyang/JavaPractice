package com.ylw.entity;

public class Dog extends Pet implements Swim {

	@Override
	public void cry() {
		// TODO Auto-generated method stub
		System.out.println("������");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("�ܵÿ�");
	}
//	public void mySkill() {
//		System.out.println("�һ���Ӿ");
//	}

	@Override
	public void Swim() {
		// TODO Auto-generated method stub
		System.out.println("�һ���Ӿ");
	}
}
