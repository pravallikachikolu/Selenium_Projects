package Navigation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//navigate to google
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		
		//type automation
		driver.findElement(By.xpath("//textarea[@title=\'Search\']")).sendKeys("Automation");
		
		//navigate to amazon
		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(6000);
		//verifying the title
		System.out.println(driver.getTitle());
		
		
		//type tools in amazon
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("tools");
		
		//refreshing the page
		driver.navigate().refresh();
		Thread.sleep(4000);
		
		//navigating back to google
		driver.navigate().back();
		System.out.println(driver.getTitle());
		
		driver.quit();
				
	}

}
