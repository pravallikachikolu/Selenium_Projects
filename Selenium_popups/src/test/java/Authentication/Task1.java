package Authentication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[class=\'main-3\']")).click();
		driver.findElement(By.id("resumeUpload")).sendKeys("C:\\Users\\chiko\\OneDrive\\Documents\\pravallika\\A13-Review 1.pdf");
		
	}

}
