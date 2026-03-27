package com.orangehrm.selniumuiframework.gernericUtility;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotUtility {
	WebDriver driver;
	TakesScreenshot ts = (TakesScreenshot) driver;
	public ScreenshotUtility(WebDriver driver) {
		this.driver=driver;
	}
	
public String captureScreenshot(WebDriver driver, String testName) {
		
		//creating a method for time-stamp
		String timeStamp = new SimpleDateFormat("yyyy-MM-dd[hh-mm-ss]").format(new Date());
		String path = System.getProperty("./Reports/"+timeStamp+".png");
		
		File temp = ts.getScreenshotAs(OutputType.FILE);
		try {
			File perm = new File(path);
			FileHandler.copy(temp, perm);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return path;
	}
//capture web element
public String captureScreenshot(WebElement element,String elementName) {
	String timestamp=new SimpleDateFormat("yyyy-MM-dd[hh-mm-ss]").format(new Date());
	String path="./Reports/"+elementName+""+timestamp+".png";
	File temp = ts.getScreenshotAs(OutputType.FILE);
	try {
		File perm = new File(path);
		FileHandler.copy(temp, perm);
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	return path;
}

//capture web element
public String captureScreenshot1(WebElement element, String elementName) {
	String timeStamp = new SimpleDateFormat("yyyy-MM-dd[hh-mm-ss]").format(new Date());
	String path = System.getProperty("./Reports/"+elementName+""+timeStamp+".png");
	File temp = element.getScreenshotAs(OutputType.FILE);
	try {
		File perm = new File(path);
		FileHandler.copy(temp, perm);
	}
	catch (Exception e) {
		e.getStackTrace();
	}
	return path;


}
}
