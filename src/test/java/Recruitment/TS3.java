package Recruitment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TS3 {
	@Test
	public static void clickOnReqirement() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);

		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.cssSelector("[type='submit']")).click();

		driver.findElement(By.xpath("//span[.='Recruitment']")).click();
		Thread.sleep(2000);

		// click on vacancies link
		driver.findElement(By.xpath("//a[.='Vacancies']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//label[.='Vacancy Name']/../..//div[2]//input")).sendKeys("Automaton Tester");
		driver.findElement(By.xpath("//label[.='Job Title']/../..//div[2]//div//div//div[1]")).click();
		driver.findElement(By.xpath("//div[@role='option']//span[text()='Automaton Tester']")).click();
		driver.findElement(By.tagName("textarea")).sendKeys("Vacancy for Data Analyst");   
		Actions act=new Actions(driver);
		WebElement name= driver.findElement(By.xpath("//div[@class='oxd-autocomplete-text-input oxd-autocomplete-text-input--active']//input"));
		name.sendKeys("Dharani");
		act.click(name).pause(6000).sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER).perform();
		driver.findElement(By.xpath("//label[.='Number of Positions']/../..//div[2]//input")).sendKeys("5");
		driver.findElement(By.cssSelector("[type='submit']")).click();
}

}
