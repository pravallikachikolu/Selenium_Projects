package com.orangeHrm.seleniumUiframework.test;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.orangehrm.seleniumuiframework.object_repository.AddCandidates;
import com.orangehrm.seleniumuiframework.object_repository.AddVacancyPage;
import com.orangehrm.seleniumuiframework.object_repository.DashBoardPage;
import com.orangehrm.seleniumuiframework.object_repository.RecruitmentPage;
import com.orangehrm.seleniumuiframework.object_repository.VacancyPage;
import com.orangehrm.selniumuiframework.gernericUtility.ActionsHelper;
import com.orangehrm.selniumuiframework.gernericUtility.BaseClass;
import com.orangehrm.selniumuiframework.gernericUtility.ExcelUtility;

public class CreateVacanctTest extends BaseClass {
	DashBoardPage dbp=new DashBoardPage(driver);
	RecruitmentPage rp=new RecruitmentPage(driver);
	
		@Test
//		public void addVacancy() throws IOException {
			
			
				
//				VacancyPage vp=new VacancyPage(driver);
//				AddVacancyPage addvp=new AddVacancyPage(driver);
//				//Actions action = new Actions(driver);
//				ActionsHelper ah=new ActionsHelper(driver);
//				ExcelUtility eu=new ExcelUtility();
//				
//				//dashboard
//				dbp.clickRecruitment();
//				//recruiment page
//				rp.clickVacanciesLink();
//				//click add 
//				vp.clickAddbtn();
//				//recruiment vacancy
//				
//				String path="./src/test/resources/OrangeHrm_CommomData/Vacancies.xlsx";
//				eu.loadExcelFile(path,"AddVacancy");
//				String vacancyName = eu.getDataFromSingleCell(1, 1);
//				String description = eu.getDataFromSingleCell(1, 2);
//				String hiringManager = eu.getDataFromSingleCell(1, 3);
//				String positions = eu.getDataFromSingleCell(1, 4);
//				
//				addvp.setVacancyName(vacancyName);
//				
//				ah.navigateDownDropDown(addvp.getJobTitle(),1,3);
//				addvp.setDescription(description);
//				
//				ah.scrollDownAutoSuggestion(addvp.getHiringManagerTextField(),hiringManager, 5, 1);
//				addvp.setNumberOfPositionTextField(positions);
//				addvp.clickSaveBtn();
//				
//				List<WebElement> valiationVacancy = driver.findElements(By.xpath("//div[@class=\"oxd-table-row oxd-table-row--with-border\"]"));
//				  
//		        for(WebElement vacancy: valiationVacancy) {
//		        	String name=vacancy.getText();
//		        	Assert.assertEquals(name,eu.getDataFromSingleCell(1, 1));
//		        	if(name.equals(eu.getDataFromSingleCell(1, 1))) {
//		        		Reporter.log("passed");
//		        	}else {
//		        		Reporter.log("failed");
//		        	}
//		        	
//		        	
//		        }		
//			}
		public void addCandidates() {
			AddCandidates acp=new AddCandidates(driver);
					
		
			//dashboard
			dbp.clickRecruitment();
			//recruitment page
			rp.clickAddbtn();
			//candidate page
			acp.setFirstname("mahendra");
			acp.setMiddlename("singh");
			acp.setLastname("dhoni");
		}

		

}
