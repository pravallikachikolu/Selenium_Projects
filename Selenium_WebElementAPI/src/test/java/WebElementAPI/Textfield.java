package WebElementAPI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Textfield {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(5000);
		
		WebElement firstname=driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]"));
		firstname.sendKeys("Virat");
		
		driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]")).sendKeys("Kohli");
	
	
	Thread.sleep(2000);
	firstname.clear();
	Thread.sleep(2000);
	firstname.sendKeys("Anushka");
	
		
	}

}
