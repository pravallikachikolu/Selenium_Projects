package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TrailXpath {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://github.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class=\"mr-2 color-fg-muted\"]")).click();
		
		driver.findElement(By.xpath("//input[@role=\"combobox\"]")).sendKeys("selenium");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class=\"ActionListItem-label text-normal\"]")).click();
		
	}

}
