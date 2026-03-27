package Recruitment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.annotations.Test;

public class TS2 {
	WebDriver driver=null;
	
	@Test(priority=0)
	public void launchingBrowser() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	@Test(priority=1)
	public void logIn() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.cssSelector("[type='submit']")).click();
	}
	
	@Test(priority=2)
	public void Recruitment() throws InterruptedException {
		//clicking on recruitment
		driver.findElement(By.xpath("//span[text()='Recruitment']")).click();
		//clicking on add button
		driver.findElement(By.cssSelector("[class='oxd-icon bi-plus oxd-button-icon']")).click();
		//first name
		driver.findElement(By.name("firstName")).sendKeys("Virat");
		//middle name
		driver.findElement(By.name("middleName")).sendKeys("V");
		//last name
		driver.findElement(By.name("lastName")).sendKeys("Kohli");
		//vacancy
		WebElement vacancy=driver.findElement(By.xpath("//label[.='Vacancy']"));
		driver.findElement(RelativeLocator.with(By.cssSelector("[class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']")).below(vacancy)).click();
		driver.findElement(By.xpath("//div[@role='option']//span[text()='Junior Account Assistant']")).click();
		//Email
		WebElement email=driver.findElement(By.xpath("//label[.='Email']"));
		driver.findElement(RelativeLocator.with(By.xpath("//input[@class='oxd-input oxd-input--active']")).below(email)).sendKeys("abc@gmail.com");
		//contact number
		WebElement contact=driver.findElement(By.xpath("//label[.='Contact Number']"));
		driver.findElement(RelativeLocator.with(By.xpath("//input[@class=\"oxd-input oxd-input--active\" and @placeholder=\"Type here\"]")).below(contact)).sendKeys("123456789");
		//uploading the file
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\chiko\\OneDrive\\Documents\\Seminar Topics.docx");
		//keywords
		driver.findElement(By.xpath("//input[@placeholder='Enter comma seperated words...']")).sendKeys("Java,Python");
		//calender
		driver.findElement(By.xpath("//div[@class='oxd-date-input']")).click();
		driver.findElement(By.xpath("//div[text()='10']")).click();
		//save button
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//candidates
		driver.findElement(By.xpath("//a[.='Candidates']")).click();
		//job title
		WebElement title=driver.findElement(By.xpath("//label[.='Job Title']"));
		driver.findElement(RelativeLocator.with(By.xpath("//div[@class=\"oxd-select-text-input\"]")).below(title)).click();
		driver.findElement(By.xpath("//div[@role='option']//span[text()='Account Assistant']")).click();
		//vacancy
		WebElement vacancy1=driver.findElement(By.xpath("//label[.='Vacancy']"));
		driver.findElement(RelativeLocator.with(By.xpath("//div[@class=\"oxd-select-text-input\"]")).below(vacancy1)).click();
		driver.findElement(By.xpath("//div[@role='option']//span[text()='Junior Account Assistant']")).click();
//		//Hiring manager
		WebElement manager=driver.findElement(By.xpath("//div[@class=\"oxd-select-text-input\" and @tabindex=\"0\" and .='-- Select --']"));
		Thread.sleep(8000);
		manager.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER);
		//status
		WebElement status=driver.findElement(By.xpath("//label[.='Status']"));
		driver.findElement(RelativeLocator.with(By.xpath("//div[@class=\"oxd-select-text-input\"]")).below(status)).click();
		driver.findElement(By.xpath("//div[@role='option']//span[text()='Shortlisted']")).click();
		//employee name
		Actions act=new Actions(driver);
		WebElement candidateName = driver.findElement(By.cssSelector("[placeholder=\"Type for hints...\"]"));
		candidateName.sendKeys("Virat");
		act.click(candidateName).pause(6000).sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER).perform();
		//date of application
		driver.findElement(By.xpath("//input[@placeholder='From']")).click();
		driver.findElement(By.xpath("//div[text()='10']")).click();
		//search button
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	}
	@Test(priority=3)
	public void logOut() {
		driver.findElement(By.xpath("//i[@class=\"oxd-icon bi-caret-down-fill oxd-userdropdown-icon\"]")).click();
		driver.findElement(By.linkText("Logout")).click();
	}
	
}
