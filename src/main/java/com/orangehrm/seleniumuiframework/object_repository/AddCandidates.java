package com.orangehrm.seleniumuiframework.object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCandidates {
	public AddCandidates(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(name="firstName")
	private WebElement firstname;
	
	@FindBy(name="middleName")
	private WebElement middlename;
	
	@FindBy(name="lastName")
	private WebElement lastname;
	
	@FindBy()

	public WebElement getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		getFirstname().sendKeys(firstname);
	}

	public WebElement getMiddlename() {
		return middlename;
	}

	public void setMiddlename(String middlename) {
		getMiddlename().sendKeys(middlename);
	}

	public WebElement getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		getLastname().sendKeys(lastname);
	}
	
	


}
