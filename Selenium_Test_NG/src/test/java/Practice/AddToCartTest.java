package Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AddToCartTest {
	WebDriver driver=null;
	
	@Test(priority=0)
	public void launchingBrowser() {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		options.addArguments("--incognito");
		driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}
	@Test(priority=1, dependsOnMethods = "launchingBrowser")
	public void login() {
		//login with valid crenditials
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		//verifications
		WebElement swagLabTest = driver.findElement(By.xpath("//div[text()='Swag Labs']"));
		if(swagLabTest.getText().contains("Swag Labs")) {
			Reporter.log("Login successfull");
		}
		else {
			Reporter.log("Login failed");
		}
	}
	
	@Test(priority=2)
	public void addToCart() {
		// add to bag
		driver.findElement(By.xpath("//div[.='Sauce Labs Backpack']/../../..//button")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
		
		//verify
		driver.findElement(By.id("shopping_cart_container")).click();
		List<WebElement> productsInCart = driver.findElements(By.className("cart_list"));
		
		String addToCartVerify ="";
		for(WebElement cartProducts : productsInCart) {
			addToCartVerify = cartProducts.getText();
		}
		if(addToCartVerify.contains("Sauce Labs Backpack") && addToCartVerify.contains("Sauce Labs Bike Light")) {
			Reporter.log("The products are added | Status: pass", true);
		}
		else {
			Reporter.log("The products are not added | Status: fail", true);
		}	
	}
	@Test(priority=3, dependsOnMethods = "login")
	public void logout() {
		driver.findElement(By.id("react-burger-menu-btn")).click();
		driver.findElement(By.id("logout_sidebar_link")).click();
		Reporter.log("Logouted out successfully", true);

	}
}
