package XpathConcept;

import org.openqa.selenium.By;

public class Custom_XPath_1 {

	public static void main(String[] args) {

		// text field
		// input[@id='username']
		// input[@id='username' and @type='email']
		// input[@id='username' and @type]
		// input[@id and @type='email']
		// input[@id and @type]

		// indexing
		// (//input[@type])[1]

		// position function
		// (//input[@type])[position()=1]

		// last function
		// (//input[@type])[last()]

		// link
		// i18n-string[text()='Sign up']
		// a//i18n-string[text()='Sign up']
		// a/i18n-string[text()='Sign up']
		// a[text()='Forgot Password?']
		// p//a[text()='Forgot Password?']
		// p/a[text()='Forgot Password?']

		// button
		// button[@id='loginBtn']
		// button[@type='submit']
		// button[@id='loginBtn' and @type='submit']
		// button[@id='loginBtn' and @type]
		// button[@id and @type='submit']

		// class attribute/property
		// xpath using class property to create xpath
		// input[@class='form-control private-form__control login-email']

		// By.className("form-control private-form__control login-email");wrong
		// By.className("login-email")

		// ul[@class='l-nav-list nav-main-menu']//li--44
		// ul[@class='l-nav-list nav-main-menu']/li -8
	}

}
