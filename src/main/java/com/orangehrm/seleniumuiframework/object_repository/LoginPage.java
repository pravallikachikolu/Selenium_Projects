package com.orangehrm.seleniumuiframework.object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="username")
	private WebElement username;
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(css="[type='submit']")
	private WebElement loginBtn;
	
	@FindBy(xpath="//p[.='Forgot your password? ']")
	private WebElement forgotpwd;
	
	@FindBy(xpath="[href='https://www.linkedin.com/company/orangehrm/mycompany/']")
	private WebElement linkedIn;
	
	@FindBy(xpath="[href='https://www.facebook.com/OrangeHRM/']")
	private WebElement facebook;
	
	@FindBy(xpath="[href='https://twitter.com/orangehrm?lang=en']")
	private WebElement twitter;
	
	@FindBy(xpath="[href='https://www.youtube.com/c/OrangeHRMInc']")
	private WebElement youtube;

	public WebElement getUsername() {
		return username;
	}

	public void setUsername(String validUsername) {
		getUsername().sendKeys(validUsername);
	}

	public WebElement getPassword() {
		return password;
	}  

	public void setPassword(String validPassword) {
		getPassword().sendKeys(validPassword);
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	public void clickLoginBtn() {
		getLoginBtn().click();
	}

	public WebElement getForgotpwd() {
		return forgotpwd;
	}

	public void clickForgotpwd() {
		getForgotpwd().click();
	}

	public WebElement getLinkedIn() {
		return linkedIn;
	}

	public void clickLinkedIn() {
		getLinkedIn().click();
	}

	public WebElement getFacebook() {
		return facebook;
	}

	public void clickFacebook() {
		getFacebook().click();
	}

	public WebElement getTwitter() {
		return twitter;
	}

	public void clickTwitter() {
		getTwitter().click();
	}

	public WebElement getYoutube() {
		return youtube;
	}

	public void clickYoutube() {
		getYoutube().click();
	}
	
	//businness logic
	//login
	public void login(String validUsername,String validPassword) {
		setUsername(validUsername);
		setPassword(validPassword);
		clickLoginBtn();
	}
	
	
	

}
