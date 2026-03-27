package com.orangehrm.seleniumuiframework.object_repository;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class AddVacancyPage {
		WebDriver driver;
		public AddVacancyPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath="//label[text()='Vacancy Name']/../..//input")
		private WebElement VacancyName;
		
		@FindBy(xpath="//label[.='Job Title']/../..//div[@class='oxd-select-text--after']")
		private WebElement JobTitle;
		
		@FindBy(css="[placeholder='Type description here']")
		private WebElement Description;
		
		@FindBy(xpath="//label[text()='Hiring Manager']/../..//input")
		private WebElement HiringMgr;
		
		@FindBy(xpath="//label[text()='Number of Positions']/../..//input")
		private WebElement NumOfPos;
		
		@FindBy(css="[class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
		private WebElement SaveBtn;

		public WebElement getVacancyName() {
			return VacancyName;
		}

		public void setVacancyName(String vacancyName) {
			getVacancyName().sendKeys(vacancyName);
		}

		public WebElement getJobTitle() {
			return JobTitle;
		}

		

		public WebElement getDescription() {
			return Description;
		}

		public void setDescription(String description) {
			getDescription().sendKeys("Recruitment of technically sound engineers");
		}

		public WebElement getHiringManagerTextField() {
			return HiringMgr;
		}

		public void setHiringManagerTextField(WebElement hiringManagerTextField) {
			this.HiringMgr = hiringManagerTextField;
		}

		public WebElement getNumberOfPositionTextField() {
			return NumOfPos;
		}

		public void setNumberOfPositionTextField(String numberOfPositionTextField) {
			getNumberOfPositionTextField().sendKeys(numberOfPositionTextField);
		}
		
		

		public WebElement getSaveBtn() {
			return SaveBtn;
		}

		public void clickSaveBtn() {
			getSaveBtn().click();
		}

		
		

}
