package SeleniumWait;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class task1 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Facebook")).click();
		driver.findElement(By.linkText("Twitter")).click();
		driver.findElement(By.linkText("YouTube")).click();
		String parent=driver.getWindowHandle();
		Set<String> allwindow=driver.getWindowHandles();
		allwindow.remove(parent);
		for(String s:allwindow) {
			driver.switchTo().window(s);
			driver.switchTo().window(s);
			driver.findElement(By.name("search_query")).sendKeys("Night changes");
		}
//		driver.findElement(by)
		
	}

}
