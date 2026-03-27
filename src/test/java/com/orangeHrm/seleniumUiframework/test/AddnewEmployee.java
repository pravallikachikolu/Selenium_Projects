package com.orangeHrm.seleniumUiframework.test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.orangehrm.seleniumuiframework.object_repository.AddEmployeePage;
import com.orangehrm.seleniumuiframework.object_repository.DashBoardPage;
import com.orangehrm.seleniumuiframework.object_repository.LoginPage;
import com.orangehrm.seleniumuiframework.object_repository.PIMPage;

public class AddnewEmployee {
	WebDriver driver;
	@Test
	private void addNewEmployee() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		LoginPage lp=new LoginPage(driver);
		DashBoardPage dp=new DashBoardPage(driver);
		PIMPage pim=new PIMPage(driver);
		AddEmployeePage aemp=new AddEmployeePage(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//url
		driver.get("https://opensource-demo.orangehrmlive.com/");
		//login
		lp.login("Admin","admin123");
		
		//Pim
		dp.clickPimlink();
		pim.clickAddButton();
		//add emp
		//wait.until(ExpectedConditions.elementToBeClickable(aemp.getCreateLoginDetailsButton()));
		aemp.addEmployee("abc", "mno", "z","12335");
		
		
		//after toggle
		aemp.createCredentials("MNOPQRS","abc12345");
		
	}
	



}
