package com.orangeHrm.seleniumUiframework.test;
import org.openqa.selenium.By;


import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.orangehrm.seleniumuiframework.object_repository.AddVacancyPage;
import com.orangehrm.seleniumuiframework.object_repository.DashBoardPage;
import com.orangehrm.seleniumuiframework.object_repository.RecruitmentPage;
import com.orangehrm.seleniumuiframework.object_repository.VacancyPage;
import com.orangehrm.selniumuiframework.gernericUtility.ActionsHelper;
import com.orangehrm.selniumuiframework.gernericUtility.BaseClass;
import com.orangehrm.selniumuiframework.gernericUtility.ExcelUtility;


public class AddVacancyTest extends BaseClass{
	
	@Test
	//TestCase 3
	public void addVacancy() throws IOException {
		DashBoardPage dbp=new DashBoardPage(driver);
		RecruitmentPage rp=new RecruitmentPage(driver);
		ActionsHelper ah=new ActionsHelper(driver);
		ExcelUtility eu=new ExcelUtility();
		VacancyPage vp=new VacancyPage(driver);
		AddVacancyPage addvp=new AddVacancyPage(driver);
		//Actions action = new Actions(driver);
			
		//dashboard
		dbp.clickRecruitment();
		//recruiment page
		rp.getVacanciesLink();
		//click add 
		rp.clickAddbtn();
		//recruiment vacancy
		
		String path="C:\\OrangeHRM_TestScript_Data\\Book1.xlsx";
		eu.loadExcelFile(path,"Sheet1");
		String vacancyName = eu.getDataFromSingleCell(1, 1);
		String description = eu.getDataFromSingleCell(1, 2);
		String hiringManager = eu.getDataFromSingleCell(1, 3);
		String positions = eu.getDataFromSingleCell(1, 4);
		
		addvp.setVacancyName(vacancyName);
		
		
		addvp.setDescription(description);
		
		ah.scrollDownAutoSuggestion(addvp.getHiringManagerTextField(),hiringManager, 5, 1);
		addvp.setNumberOfPositionTextField(positions);
		addvp.clickSaveBtn();
		
		//assertion
		List<WebElement> valiationVacancy = driver.findElements(By.xpath("//div[@class=\"oxd-table-row oxd-table-row--with-border\"]"));
		  
        for(WebElement vacancy: valiationVacancy) {
        	String name=vacancy.getText();
        	Assert.assertEquals(name,eu.getDataFromSingleCell(1, 1));
        	if(name.contains(eu.getDataFromSingleCell(1, 1))) {
        		Reporter.log("passed");
        	}else {
        		Reporter.log("failed");
        	}
        	
        	
        }		
	}

}
