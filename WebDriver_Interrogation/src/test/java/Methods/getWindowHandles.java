package Methods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getWindowHandles {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/browser?sublist=0");
		Thread.sleep(4000);
		
		//fetching the parent window session ID
		String parentID=driver.getWindowHandle();
		System.out.println(parentID);
		
		//click on the tab to get child window popup tab
		driver.findElement(By.xpath("//h2[.='Watches']/..//button")).click();
		Thread.sleep(2000);
		Set<String> allwindowIds=driver.getWindowHandles();
		System.out.println(allwindowIds);
		
		//Removing parent ID from window Ids
		allwindowIds.remove(parentID);
		System.out.println(allwindowIds);
		
		//child ID is still in set
		for(String string:allwindowIds) {
			System.out.println(string);
		}
		driver.quit();
		
	}

}
