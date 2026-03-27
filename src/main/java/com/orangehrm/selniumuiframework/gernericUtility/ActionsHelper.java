package com.orangehrm.selniumuiframework.gernericUtility;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsHelper {
	WebDriver driver;
	Actions act;
	
	public ActionsHelper(WebDriver driver) {
		this.driver=driver;
		this.act=new Actions(driver);
		
	}
	
	//MovetoElement and click
	public void clickOnElement(WebElement element) {
		act.moveToElement(element).click().perform();
		
	}
	
	public void navigateDownDropDown(WebElement element,int downArrowIndex,long timeInSec) {
//		act.click(element).pause(3000).keyDown(Keys.DOWN).keyDown(Keys.DOWN).keyDown(Keys.DOWN).keyDown(Keys.ENTER);
//		/Action click=act.click(element).pause(3000).build();
		act.sendKeys(element).pause(Duration.ofSeconds(timeInSec)).perform();
		for(int i=1;i<=downArrowIndex;i++) {
			act.keyDown(Keys.DOWN).keyUp(Keys.DOWN).perform();
			
		}
		act.keyDown(Keys.ENTER).perform();
	}
	public void scrollDownAutoSuggestion(WebElement element,String text,long timeInSec,int downArrowIndex) {
		act.sendKeys(element,text).pause(Duration.ofSeconds(timeInSec)).perform();
		for(int i=1;i<=downArrowIndex;i++) {
			act.keyDown(Keys.DOWN).keyUp(Keys.DOWN).perform();
		    }
		act.keyDown(Keys.ENTER).keyUp(Keys.DOWN).perform();
		
		}

}
