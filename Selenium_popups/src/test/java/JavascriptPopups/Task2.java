package JavascriptPopups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[value=\'Search\']")).click();
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		driver.findElement(By.id("small-searchterms")).sendKeys("computers");
		driver.findElement(By.cssSelector("[value=\'Search\']")).click();
	}

}
