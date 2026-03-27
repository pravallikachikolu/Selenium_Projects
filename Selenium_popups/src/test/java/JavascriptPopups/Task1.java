package JavascriptPopups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@class=\"desktop-searchBar\"]")).sendKeys("dresses");
		driver.findElement(By.xpath("//a[@class=\"desktop-submit\"]")).click();
		driver.findElement(By.cssSelector("[title='Marks & Spencer Girls Tie-Dye Printed Fit & Flare Dress']")).click();
		
		driver.findElement(By.xpath("//span[@class=\"myntraweb-sprite pdp-notWishlistedIcon sprites-notWishlisted pdp-flex pdp-center \"]")).click();
		
	}

}
