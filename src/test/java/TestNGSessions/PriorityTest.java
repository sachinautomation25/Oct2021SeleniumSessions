package TestNGSessions;

import org.testng.annotations.Test;

public class PriorityTest {

	@Test(priority = 2)
	public void test2() {
		System.out.println("test2");
	}

	@Test(priority = 1)
	public void test4() {
		System.out.println("test4");
	}

	@Test(priority = -1)
	public void test5() {
		System.out.println("test5");
	}

	@Test(priority = 3)
	public void test3() {
		System.out.println("test3");
	}

	@Test
	public void test1() {
		System.out.println("test1");

	}

}
