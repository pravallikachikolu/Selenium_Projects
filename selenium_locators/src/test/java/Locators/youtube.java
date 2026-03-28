package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class youtube {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.youtube.com/");
		Thread.sleep(5000);
		
		driver.findElement(By.name("search_query")).sendKeys("agar tum sath ho");
		driver.findElement(By.xpath("//button[@title='Search']")).click();
	}

}
