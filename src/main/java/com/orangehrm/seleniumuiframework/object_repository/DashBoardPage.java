package com.orangehrm.seleniumuiframework.object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage {
	WebDriver driver;
	public DashBoardPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText="PIM")
	private WebElement pimlink;
	
	@FindBy(linkText="Recruitment")
	private WebElement recruitment;
	
	@FindBy(xpath="//li[@class=\"oxd-userdropdown\"]")
	private WebElement logoutDropdown;
	
	@FindBy(linkText="Logout")
	private WebElement Clicklogout;

//	public WebElement getPimlink() {
//		return pimlink;
//	}
//
//	public void clickPimlink() {
//		getPimlink().click();
//	}
	
	public WebElement getRecruitment() {
		return recruitment;
	}

	public void clickRecruitment() {
		getRecruitment().click();
	}

	public WebElement getLogoutDropdown() {
		return logoutDropdown;
	}

	public void clickLogoutDropdown() {
		getLogoutDropdown().click();
	}
	
	
	public WebElement getClicklogout() {
		return Clicklogout;
	}

	public void clicklogout() {
		getClicklogout().click();
	}

	public void logout() {
		clickLogoutDropdown();
		clicklogout();
	}
	
	

}
