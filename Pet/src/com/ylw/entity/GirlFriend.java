package com.ylw.entity;

public class GirlFriend {
	public void acceptGifts(Pet a) {
		System.out.println("��ϲ�������ҵĳ���:"+a.getName());
	}
	public static void main(String[] args) {
		GirlFriend girfriend=new GirlFriend();
		Pet animal=new Pet();
		animal.setName("С��");
		girfriend.acceptGifts(animal);
		}
		
		
	
}
