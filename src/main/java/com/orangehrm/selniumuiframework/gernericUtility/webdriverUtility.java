package com.orangehrm.selniumuiframework.gernericUtility;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class webdriverUtility {
	WebDriver driver;
	WebDriverWait wait;
	//manage
	//maximize
	public webdriverUtility(WebDriver driver) {
		this.driver=driver;
	}
	public void configMaximizedBrowser() {
		driver.manage().window().maximize();
	}
	//minimize
	public void configMinimizedBrowser() {
		driver.manage().window().minimize();
	}
	//fullscreen
	public void configFullscreenBrowser() {
		driver.manage().window().fullscreen();
	}
	//getsize
	public Dimension fetchBrowserSize() {
		Dimension dimension =driver.manage().window().getSize();
		return dimension;
	}
	//setsize
	public void configBrowserSize(int width,int height) {
		driver.manage().window().setSize(new Dimension(width, height));
	}
	//getposition
	public Point getPosition() {
		Point position=driver.manage().window().getPosition();
		return position;
	}
	//setposition
	public void configPosition(int x,int y) {
		driver.manage().window().setPosition(new Point(x,y));
	}
	
	//navigate
	//Navigate To
	public void navigateToApplication(String fullUrl) {
		driver.navigate().to(fullUrl);
	}
	//forward
	public void navigateForward() {
		driver.navigate().forward();
	}
	//backward
	public void navigateBackward() {
		driver.navigate().back();
	}
	//refresh
	public void refreshcurrentPage() {
		driver.navigate().refresh();
	}
	//get
	public void enterUrl(String url) {
		driver.get(url);
	}
	//get title
	public String fetchApplicationTitle() {
		String title=driver.getTitle();
		return title;
	}
	//get current url
	public String fetchApplicationUrl() {
		String url=driver.getCurrentUrl();
		return url;
	}
	//close
	public void closeBrowserTab() {
		driver.close();
	}
	//quit
	public void closeBrowserWindow() {
		driver.quit();
	}
	//timeouts
	public void waitForElementsToLoad(long TimeInSecond) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	//explicit wait
	public void waitTillLastElementIsClickable(WebElement element,long maximumTimeToWait) {
		wait=new WebDriverWait(driver, Duration.ofSeconds(maximumTimeToWait));
		wait.until(ExpectedConditions.visibilityOf(element));
		
	}
	//popups
	
	public void clickOnAccept() {
		driver.switchTo().alert().accept();
	}
	public void clickOnDismiss() {
		driver.switchTo().alert().dismiss();
	}
	public void typeMessageJavascriptPopupMessage(String text) {
		driver.switchTo().alert().sendKeys(text);
	}
	public String fetchJavascriptpopupMessage() {
		String message=driver.switchTo().alert().getText();
		return message;
	}
	//switch child window
	public void windowSwitching(String childApplicationTitle) { 
		String parentId=driver.getWindowHandle();
		Set<String> childIds=driver.getWindowHandles();
		childIds.remove(parentId);
		for(String child:childIds) {
			driver.switchTo().window(child);
			String title=driver.getCurrentUrl();
			if(title.contains(childApplicationTitle)) {
				break;
			}
		}
	}
	

}
