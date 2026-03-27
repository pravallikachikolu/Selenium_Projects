package Element_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextAndTag {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		Thread.sleep(2000);
		
		//locating link
		WebElement aboutLink=driver.findElement(By.id("navbarDropdown"));
		System.out.println(aboutLink.getText());
		
		//fetching the tagname
		System.out.println(aboutLink.getTagName());
		
	}

}
