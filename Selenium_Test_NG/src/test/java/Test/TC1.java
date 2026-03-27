package Test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC1 {
	WebDriver driver=null;
	@Test(priority=0)
	public void launchingBrowser() {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		options.addArguments("--incognito");
		driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.saucedemo.com/");
		
	}
	
	@Test(priority=1)
	public void logIn() {
		//Username
		driver.findElement(By.name("user-name")).sendKeys("standard_user");
		//password
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		//login button
		driver.findElement(By.cssSelector("[type='submit']")).click();
		//validating the page
		if(driver.getPageSource().contains("Swag Labs")) {
			System.out.println("page is valid");
		}
		else {
			System.out.println("page is invalid");
		}
	}
	@Test(priority=2)
	public void addtoCart() {
		//Adding to cart
		driver.findElement(By.xpath("//div[.='Sauce Labs Backpack']/../../..//button[.='Add to cart']")).click();
		driver.findElement(By.xpath("//div[.='Sauce Labs Bike Light']/../../..//button[.='Add to cart']")).click();
		//click on cart
		driver.findElement(By.cssSelector("[class='shopping_cart_link']")).click();
		//verifying the product is added to cart
		String cartItems="";
		List<WebElement> productsInCart=driver.findElements(By.cssSelector("[class='cart_list']"));
		for(WebElement verify:productsInCart) {
			cartItems=verify.getText();
		}
		if(cartItems.contains("Sauce Labs Backpack") && cartItems.contains("Sauce Labs Bike Light")) {
			System.out.println("The products are added");
		}
		else {
			System.out.println("The products are not added ");
		}
		//checkout
		driver.findElement(By.id("checkout")).click();
		//firstname after checkout
		driver.findElement(By.name("firstName")).sendKeys("kim");
		//lastname
		driver.findElement(By.name("lastName")).sendKeys("john");
		//postalcode
		driver.findElement(By.name("postalCode")).sendKeys("123456");
		//continue button
		driver.findElement(By.name("continue")).click();
		
		//verifying the total price
		String total=driver.findElement(By.cssSelector("[class=summary_total_label]")).getText();
		if(total.contains("Total: $43.18")) {
			System.out.println("validated order");
		}
		else {
			System.out.println("Not validated");
		}
		//click on finish button
		driver.findElement(By.name("finish")).click();
		
	}
	@Test(priority=3)
	public void logOut() {
		driver.findElement(By.xpath("//button[.='Open Menu']")).click();
		driver.findElement(By.id("logout_sidebar_link")).click();
		driver.quit();
	}

}
