package Demo;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.orangehrm.seleniumuiframework.object_repository.LoginPage;
import com.orangehrm.selniumuiframework.gernericUtility.FileUtility;
import com.orangehrm.selniumuiframework.gernericUtility.webdriverUtility;


public class LoginTest {
	@Test
	public void login() throws IOException {
		ExtentReports extent=new ExtentReports();
		ExtentSparkReporter spark=new ExtentSparkReporter("./Reports/login_reprt.html");
		extent.attachReporter(spark);
		ExtentTest test=extent.createTest("Login Test");
		
		WebDriver driver=new ChromeDriver();
		webdriverUtility wu=new webdriverUtility(driver);
		FileUtility fu=new FileUtility();
		LoginPage lp=new LoginPage(driver);
		wu.configMaximizedBrowser();
		wu.waitForElementsToLoad(20);
		String urlPath=fu.getPropertyKeyValue("url");
		String un=fu.getPropertyKeyValue("username");
		String pass=fu.getPropertyKeyValue("password");
		
		//Navigating to application
		wu.navigateToApplication(urlPath);
//		test.log(Status.INFO, "Navigated to orangeHrm login page");
		test.info("Navigated to orangeHrm login page");
		lp.login(un, pass);
//		test.log(Status.PASS, "Login sucessfull");
		test.pass("Login sucessfull");
		extent.flush();
		
	}

}
