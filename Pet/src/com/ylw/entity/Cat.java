package com.ylw.entity;

public class Cat extends Pet implements CatchMouse{

	@Override
	public void cry() {
		// TODO Auto-generated method stub
		System.out.println("������");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("�ܵ���");
	}
	public void mySkill() {
		System.out.println("�һ�ץ����");
	}

	@Override
	public void CatchMouse() {
		// TODO Auto-generated method stub
		System.out.println("�һ�ץ����");
	}

}
