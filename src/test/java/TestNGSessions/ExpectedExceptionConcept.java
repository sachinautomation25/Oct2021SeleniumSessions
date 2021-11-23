package TestNGSessions;

import org.testng.annotations.Test;

public class ExpectedExceptionConcept {

	@Test(expectedExceptions = {ArithmeticException.class,NullPointerException.class})
	public void test() {
		System.out.println("started");
		int num = 9 / 0;
		System.out.println("ended");
	}
}
