package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathstartsTrail {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[starts-with(@id,'gh')]")).sendKeys("Toys");
		driver.findElement(By.xpath("//span[starts-with(@class,'gh-search')]")).click();
	}

}
