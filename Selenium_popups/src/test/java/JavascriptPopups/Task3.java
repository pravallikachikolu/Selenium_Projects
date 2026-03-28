package JavascriptPopups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Task3 {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("[type=\'submit\']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("[class='ng-tns-c69-9 ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted']")).click();
		
		driver.findElement(By.xpath("//a[@class=\"ui-state-default ng-tns-c69-9 ng-star-inserted\"]/following::a[.='11']")).click();//dynamic xpath
//		driver.findElement(By.linkText("11")).click();
	}

}
