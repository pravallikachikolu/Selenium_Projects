package com.orangehrm.selniumuiframework.gernericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.orangehrm.seleniumuiframework.object_repository.DashBoardPage;
import com.orangehrm.seleniumuiframework.object_repository.LoginPage;

public class BaseClass {
	public WebDriver driver;
	Properties prop;
	String Browser;
	LoginPage lp;
	FileUtility fiu=new FileUtility();
	public  webdriverUtility wdu;
	public DashBoardPage dsp;
	@BeforeSuite
	public void beforesuite() {
		Reporter.log("--Executing beforesuite--" ,true);
	}
	
	@BeforeTest
	public void beforetest() {
		Reporter.log("--Executing beforetest--",true);
	}
	@Parameters("BROWSER")
	@BeforeClass(groups= {"Regression","Smoke"})
	public void beforeclass() throws IOException {
//		driver=new ChromeDriver();
//		FileInputStream fis=new FileInputStream("./src/test/resources/OrangeHrm_CommomData/commonData.propreties");
//		prop=new Properties();
//		prop.load(fis);
		Reporter.log("--Executing beforeclass--",true);
		Browser=fiu.getPropertyKeyValue("browser");
		
		if(Browser.contains("chrome"))
		{
			driver=new ChromeDriver();
		}
		
		else if(Browser.contains("edge"))
		{
			driver=new EdgeDriver();
		}
		else if(Browser.contains("firefox"))
		{
			driver=new FirefoxDriver();
		}
		wdu=new webdriverUtility(driver);
		lp=new LoginPage(driver);
		dsp=new DashBoardPage(driver);
		wdu.configMaximizedBrowser();
		wdu.waitForElementsToLoad(30);
		
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	}
	@BeforeMethod
	public void beforemethod() throws IOException {
		Reporter.log("--Navigating to the application and logging in--",true);
		String URL=fiu.getPropertyKeyValue("url");
		fiu.getPropertyKeyValue("username");
		String ValidUsername=fiu.getPropertyKeyValue("username");
		String ValidPassword=fiu.getPropertyKeyValue("password");

		
		//login
		wdu.navigateToApplication(URL);
		lp.login(ValidUsername,ValidPassword);
		
		
	}
	@AfterMethod
	public void aftermethod() {
		Reporter.log("--logging out--",true);
		dsp.logout();
	}
	
	@AfterClass
	public void afterclass() {
		Reporter.log("--Executing afterclass--",true);
		wdu.closeBrowserWindow();
	}
	
	@AfterTest
	public void aftertest() {
		Reporter.log("--Executing aftertest--",true);
	}
	@AfterSuite
	public void aftersuite() {
		Reporter.log("--Executing aftersuite--",true);
	}

}
