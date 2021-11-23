package com.qa.interfaceconcept;

public class Test {

	public static void main(String[] args) {
		
		ChromeDriver cd=new ChromeDriver();
		cd.click();
		cd.sendKeys();
		
		System.out.println("--------");
		
		WebDriver d=new FireFoxDriver();
		d.click();
		d.sendKeys();
		d.specialMethodOfFF();
	}
}
