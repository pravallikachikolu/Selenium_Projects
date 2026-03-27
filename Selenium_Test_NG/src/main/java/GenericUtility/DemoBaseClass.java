package GenericUtility;

import java.lang.reflect.Method;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class DemoBaseClass {
	
	@BeforeSuite
	public void beforesuite() {
		System.out.println("--Executing beforesuite--" );
	}
	
	@BeforeTest
	public void beforetest() {
		System.out.println("--Executing beforetest--");
	}
	
	@BeforeClass
	public void beforeclass() {
		System.out.println("--Executing beforeclass--");
	}
	@BeforeMethod
	public void beforemethod() {
		System.out.println("--Executing beforemethod--");
	}
	@AfterMethod
	public void aftermethod() {
		System.out.println("--Executing aftermethod--");
	}
	
	@AfterClass
	public void afterclass() {
		System.out.println("--Executing afterclass--");
	}
	
	@AfterTest
	public void aftertest() {
		System.out.println("--Executing aftertest--");
	}
	@AfterSuite
	public void aftersuite() {
		System.out.println("--Executing aftersuite--");
	}

}
