package WindowScrolling;

import java.time.Duration;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrolingByAndTo {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		//scrolling using  scroll By
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 1000)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0, 1500)");
		
		//scrolling using scroll To
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0,1000)");
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0,1500)");
		
	}

}
