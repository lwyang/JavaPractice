package com.ylw.entity;

public class PetsArray {
	public static void main(String[] args) {
			Pet pets[]=new Pet[2];
			pets[0]=new Dog();
			pets[1]=new Cat();
			pets[0].setName("小狗");
			pets[0].setAge(3);
			pets[1].setName("小猫");
			pets[1].setAge(4);
			for(int i=0;i<2;i++) {
				System.out.println("我的名字叫"+pets[i].getName());
				System.out.println("今年"+pets[i].getAge()+"岁了");
				pets[i].cry();
				pets[i].run();
				if(pets[i] instanceof Swim ) {
					((Swim) pets[i]).Swim();
				}
				if(pets[i] instanceof CatchMouse) {
					((CatchMouse) pets[i]).CatchMouse();
				}
				System.out.println("---------------------");
			}
			
		
	}
	
	
	
}
