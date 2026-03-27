package Navigation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateBackAndForth {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//navigate to myntra
		driver.get("https://www.myntra.com/");
		Thread.sleep(2000);
		
		//navigate to bigbasket
		driver.navigate().to("https://www.bigbasket.com/");
		Thread.sleep(2000);
		
		//navigate to zomato
		driver.navigate().to("https://www.zomato.com/");
		Thread.sleep(2000);
		
		//navigate back to bigbasket
		driver.navigate().back();
		
		//verifying the title
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		
		//navigate to zomato
		driver.navigate().forward();
		
		//verifying the title
		System.out.println(driver.getTitle());
		
		//closing the browser
		driver.quit();
	}

}
