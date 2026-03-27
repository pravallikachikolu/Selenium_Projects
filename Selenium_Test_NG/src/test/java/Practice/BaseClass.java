package Practice;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	@BeforeSuite
	public void beforesuite() {
		Reporter.log("--executing before suite--",true);
	}
	
	@BeforeTest
	public void beforetest() {
		Reporter.log("--executing before test--",true);
	}
	
	@BeforeClass
	public void beforeclass() {
		Reporter.log("--executing before class--",true);
	}
	
	@BeforeMethod
	public void beforemethod() {
		Reporter.log("--executing before method--",true);
	}
	
	@AfterClass
	public void afterclass() {
		Reporter.log("--executing after class--",true);
	}
	
	

}
