package Practice;

import org.testng.annotations.Test;

public class TestPractice {
	@Test
	public void loginTest() {
		System.out.println("---Executing login sequence---");
	}
	@Test(dependsOnMethods="loginTest")//for login and then logout
	public void logoutTest() {
		System.out.println("---Executing logout sequence---");
	}

}
