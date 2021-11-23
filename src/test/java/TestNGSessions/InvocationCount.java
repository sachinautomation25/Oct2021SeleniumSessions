package TestNGSessions;

import org.testng.annotations.Test;

public class InvocationCount {

	@Test(invocationCount = 10)
	public void createUser() {
	
		int n=(int)( Math.random()*1000);
		System.out.println("user created_"+n);
	}
}
