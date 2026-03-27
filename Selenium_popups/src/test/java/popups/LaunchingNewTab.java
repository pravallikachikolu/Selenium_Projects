package popups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingNewTab {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		Thread.sleep(2000);
		
		
		//Triggering a new tab in the same browser window and parallely switching the tool control
		driver.switchTo().newWindow(WindowType.TAB);//type is enum
		driver.get("https://github.com/");
	}

}
