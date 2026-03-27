package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tagname {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		for(WebElement link:allLinks) {
			System.out.println(link.getText());
		}
		
		for(WebElement links:allLinks) {
		if(links.getText().equals("Store")) {
			links.click();
			break;
		}
			
		}
		
	}

}
