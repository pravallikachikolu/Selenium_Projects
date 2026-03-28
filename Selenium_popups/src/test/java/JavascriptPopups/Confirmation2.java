package JavascriptPopups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Confirmation2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Alert with Textbox")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[class=\'btn btn-info\']")).click();
		Thread.sleep(2000);
		
		Alert prompt = driver.switchTo().alert();
		Thread.sleep(2000);
		prompt.sendKeys("pravallika");
		Thread.sleep(2000);
		System.out.println(prompt.getText());
		prompt.accept();
		
	}

}
