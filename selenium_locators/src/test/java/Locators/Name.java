package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Name {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(6000);
		//locating user name textfield
		driver.findElement(By.name("username")).sendKeys("Admin");
		//locating password text field
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		//navigate to url
		driver.get("https://www.google.com/");
		//loacte the text field
		driver.findElement(By.name("q")).sendKeys("pec");
	}

}
