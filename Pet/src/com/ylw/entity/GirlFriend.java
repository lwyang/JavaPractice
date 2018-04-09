package com.ylw.entity;

public class GirlFriend {
	public void acceptGifts(Pet a) {
		System.out.println("我喜欢你送我的宠物:"+a.getName());
	}
	public static void main(String[] args) {
		GirlFriend girfriend=new GirlFriend();
		Pet animal=new Pet();
		animal.setName("小黑");
		girfriend.acceptGifts(animal);
		}
		
		
	
}
