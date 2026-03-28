package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class directLocator {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);
		
		WebElement name=driver.findElement(By.cssSelector("placeholder='First Name'"));
		name.sendKeys("pravallika");
		WebElement last=driver.findElement(RelativeLocator.with(By.tagName("input")).toRightOf(name));
		last.sendKeys("chikolu");
		driver.findElement(RelativeLocator.with(By.cssSelector("ng-model='Adress'"))).sendKeys("address");
	}

}
