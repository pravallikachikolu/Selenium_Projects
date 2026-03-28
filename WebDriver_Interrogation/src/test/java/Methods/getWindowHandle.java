package Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getWindowHandle {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		Thread.sleep(2000);
		
		//fetching the 32 char unique session ID
		System.out.println(driver.getWindowHandle());
		
		//refreshing the page
		driver.navigate().refresh();
		
		//checking whether the same session ID
		System.out.println(driver.getWindowHandle());
		
		driver.quit();
		
	}

}
