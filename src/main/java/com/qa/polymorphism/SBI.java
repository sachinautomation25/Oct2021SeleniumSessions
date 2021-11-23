package com.qa.polymorphism;

public class SBI extends RBI{

	public static void main(String[] args) {
		
		SBI s=new SBI();
		s.getHomeLoanROI();
	}
	@Override
	public Integer getHomeLoanROI() {
		System.out.println("SBI getHomeLoanROI");
		return 9;
	}
}
