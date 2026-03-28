package Navigation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateToString {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new  ChromeDriver();
		driver.manage().window().maximize();
		//navigate to google
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		
		//navigate to youtube
		driver.navigate().to("https://www.youtube.com/");
		Thread.sleep(2000);
		
		//navigate to wikipedia
		driver.navigate().to("https://www.wikipedia.org/");
		Thread.sleep(2000);
		
		driver.quit();
	}


}
