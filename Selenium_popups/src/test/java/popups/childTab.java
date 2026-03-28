package popups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class childTab {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/browser?sublist=0/");
		Thread.sleep(2000);
		
		//clicking on view more on laptops
		driver.findElement(By.xpath("//h2[.='Laptop']/..//button")).click();
		
		//switching the tool control to child window to perform actions on its web element
		String parentId=driver.getWindowHandle();
		Set<String> allwindowId=driver.getWindowHandles();
		allwindowId.remove(parentId);
		for(String childId:allwindowId) {
			//switching the tool control to child window
			driver.switchTo().window(childId);
		}
		//click on add to cart in child window
		WebElement addToCart=driver.findElement(By.tagName("button"));
		addToCart.click();
		Thread.sleep(2000);
		
		//click on cart logo
		WebElement cartLogo=driver.findElement(By.xpath("//*[local-name()='svg']"));
		cartLogo.click();
		Thread.sleep(2000);
		
		//verify if the shopping list is visible
		WebElement shoppingCart=driver.findElement(By.tagName("h2"));
		if(shoppingCart.isDisplayed()) {
			System.out.println("Test case status: Pass");
		}
		else {
			System.out.println("Test case status: Fail");
		}
		driver.close();
		
		
		
	}

}
