package com.qa.inheritance;

public class Cat extends Animal {

	public static void main(String[] args) {
		
		Cat c=new Cat();
		c.sound();
		c.add(10,20);
		c.add(10,20,30);
		
	}
	
	public void add(int... a) {
	
		int sum=0;
		for (int i = 0; i < a.length; i++) {
		sum=sum+a[i];
	}	
		System.out.println(sum);
	}
}
