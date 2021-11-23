package com.qa.interfaceconcept;

public class FireFoxDriver implements WebDriver {

	@Override
	public void click() {
		System.out.println("FireFoxDriver click");

	}

	@Override
	public void sendKeys() {
		System.out.println("FireFoxDriver sendKeys");
	}
	
	public void specialMethodOfFF() {
		
	}

}
