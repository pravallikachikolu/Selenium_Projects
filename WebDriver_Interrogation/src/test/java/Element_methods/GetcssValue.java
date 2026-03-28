package Element_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetcssValue {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		Thread.sleep(2000);
		
		WebElement logo=driver.findElement(By.xpath("//*[name()='svg' and @id='Layer_1'] "));
		System.out.println(logo.getCssValue("font"));
		System.out.println(logo.getCssValue("color"));
		System.out.println(logo.getCssValue("backgroung-color"));
		System.out.println(logo.getCssValue("display"));
		
	}

}
