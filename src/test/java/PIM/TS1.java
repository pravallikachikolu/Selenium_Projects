package PIM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.annotations.Test;

public class TS1 {
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
	public void Pim() throws InterruptedException {
		//navigate to PIM
		driver.findElement(By.xpath("//span[text()='PIM' and @class='oxd-text oxd-text--span oxd-main-menu-item--name']")).click();
		//add
		driver.findElement(By.partialLinkText("Add")).click();
		//adding first.middle,last name
		driver.findElement(By.name("firstName")).sendKeys("Mahendra");
		driver.findElement(By.name("middleName")).sendKeys("singh");
		driver.findElement(By.name("lastName")).sendKeys("Dhoni");
		Thread.sleep(3000);
		//clicking on the toggle button
		driver.findElement(By.cssSelector("[class='oxd-switch-input oxd-switch-input--active --label-right']")).click();
		//username and password
		WebElement username=driver.findElement(By.xpath("//label[text()='Username']"));
		driver.findElement(RelativeLocator.with(By.xpath("//input[@class='oxd-input oxd-input--active']")).below(username)).sendKeys("Dhoni");
		WebElement password=driver.findElement(By.xpath("//label[.='Password']"));
		driver.findElement(RelativeLocator.with(By.xpath("//input[@class=\"oxd-input oxd-input--active\"]")).below(password)).sendKeys("kohli123");
		driver.findElement(RelativeLocator.with(By.xpath("//input[@class='oxd-input oxd-input--active' and @type='password']")).toRightOf(password)).sendKeys("kohli123");
		//clicking on save button
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		
	}
	@Test(priority=3)
	public void Admin() {
		
		//back to admin
		driver.findElement(By.cssSelector("[class='oxd-main-menu-item']")).click();
		//adding username
		WebElement user=driver.findElement(By.xpath("//label[.='Username']"));
		driver.findElement(RelativeLocator.with(By.xpath("//input[@class='oxd-input oxd-input--active']")).below(user)).sendKeys("Dhoni");
		//selecting user role

		WebElement role=driver.findElement(RelativeLocator.with(By.tagName("div")).toRightOf(user));
		role.click();
		driver.findElement(By.xpath("//div[@role='option']//span[text()='ESS']")).click();
		
		//selecting the hints
		WebElement hint=driver.findElement(RelativeLocator.with(By.tagName("input")).toRightOf(role));
		hint.sendKeys("Mahendra");
		driver.findElement(By.xpath("//div[@role='option']//span[text()='Mahendra singh Dhoni']")).click();
		//selecting the status
		
		WebElement status=driver.findElement(RelativeLocator.with(By.tagName("div")).toRightOf(hint));
		status.click();
		driver.findElement(By.xpath("//div[@role='option']//span[text()='Enabled']")).click();
		
		//click on the search button
		driver.findElement(By.cssSelector("[class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")).click();
		
		//verification
		
		if(driver.getPageSource().contains("Dhoni")) {
			System.out.println("User Found");
		}
		else {
			System.out.println("User Not Found");
		}
		
	}
	
	@Test(priority=4)
	public void logout() {
		//logout
		driver.findElement(By.cssSelector("[class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
		driver.findElement(By.linkText("Logout")).click();
	}

}
