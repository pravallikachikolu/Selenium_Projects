package SeleniumWait;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildTabHandling {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/pageLoad?sublist=0");
		driver.findElement(By.linkText("Open In New Tab")).click();
		Set<String> allwindow=driver.getWindowHandles();
		allwindow.remove(driver.getWindowHandle());
		for(String child:allwindow) {
			driver.switchTo().window(child);
			driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		}
	}

}
