package com.orangehrm.seleniumuiframework.object_repository;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class RecruitmentPage {
		public RecruitmentPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		@FindBy(linkText="Vacancies")
		private WebElement vacanciesLink;
		
		@FindBy(css="[class='oxd-button oxd-button--medium oxd-button--secondary']")
		private WebElement addbtn;
		
		public WebElement getAddbtn() {
			return addbtn;
		}
		public void clickAddbtn() {
			getAddbtn().click();
		}
		public WebElement getVacanciesLink() {
			return vacanciesLink;
		}
		public void clickVacanciesLink() {
			getVacanciesLink().click();
		}
		
		
	

}
