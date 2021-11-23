package com.qa.interfaceconcept;

public class ChromeDriver implements WebDriver{

	@Override
	public void click() {
		System.out.println("ChromeDriver click");		
	}

	@Override
	public void sendKeys() {
		System.out.println("ChromeDriver sendKeys");		
		
	}

}
