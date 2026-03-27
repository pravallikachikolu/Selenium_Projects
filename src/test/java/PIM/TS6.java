package PIM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.annotations.Test;

public class TS6 {
	@Test
	public void TestMethod() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		//Login with valid credentials
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.cssSelector("[name='username']")).sendKeys("Admin");
		driver.findElement(By.cssSelector("[name='password']")).sendKeys("admin123");
		driver.findElement(By.cssSelector("[type='submit']")).click();
		
		//Click on PIM link
		driver.findElement(By.xpath("//span[.='PIM']")).click();
		
		//click configuration dropdown
		driver.findElement(By.xpath("//span[.='Configuration ']")).click();
		
		//click on Termination reasons
		driver.findElement(By.linkText("Termination Reasons")).click();
		
		//click on + Add button
		driver.findElement(By.xpath("//button[.=' Add ']")).click();
		
		//enter a reason in name input field
		WebElement namefield = driver.findElement(By.xpath("//label[.='Name']"));
		WebElement reason = driver.findElement(RelativeLocator.with(By.tagName("input")).below(namefield));
		reason.sendKeys("Got new offer");
		
		//click on save button 
		driver.findElement(By.xpath("//button[.=' Save ']")).click();
		
		//verify whether the reason is added to the Termination reasons
		String verifyReason = driver.findElement(By.xpath("//div[.='Got new offer']")).getText();
		if(verifyReason.contains("Got new offer")) {
			System.out.println("The reason is added to the Termination reasons successfully");
		}
		else {
			System.out.println("The reason is not added to the Termination reasons");
		}
		
		//logout
		driver.findElement(By.cssSelector("[class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
		driver.findElement(By.linkText("Logout")).click();
		
		driver.quit();
	}


}
