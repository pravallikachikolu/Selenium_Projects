package Test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Tc2 {
	WebDriver driver=null;
	@Test
	public void launchinBrowser() {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		options.addArguments("--incognito");
		driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.saucedemo.com/");
	}
	@Test(priority=1)
	public void logIn() {
		//username
		driver.findElement(By.name("user-name")).sendKeys("standard_user");
		//password
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		//login button
		driver.findElement(By.cssSelector("[type='submit']")).click();
	}
	@Test(priority=2)
	public void homepage() {
		//sorting low to high
		driver.findElement(By.xpath("//span[@class=\"select_container\"]")).click();
		driver.findElement(By.xpath("//option[@value=\"lohi\"]")).click();
		//add cart to lowest price
		driver.findElement(By.xpath("//div[.='Sauce Labs Onesie']/../../..//button[.='Add to cart']")).click();
		//click on cart button
		driver.findElement(By.id("shopping_cart_container")).click();
		//verifying the product in the cart
		String cartItems="";
		List<WebElement> productsInCart=driver.findElements(By.cssSelector("[class='cart_list']"));
		for(WebElement verify:productsInCart) {
			cartItems=verify.getText();
		}
		if(cartItems.contains("Sauce Labs Onesie")) {
			System.out.println("The product present in the cart");
		}
		else {
			System.out.println("The product is not present in the cart");
		}
		//click on checkout button
		driver.findElement(By.name("checkout")).click();
		//firstname after checkout
		driver.findElement(By.name("firstName")).sendKeys("kim");
		//lastname
		driver.findElement(By.name("lastName")).sendKeys("john");
		//postalcode
		driver.findElement(By.name("postalCode")).sendKeys("123456");
		//continue button
		driver.findElement(By.name("continue")).click();
		//verify order summary
		if(cartItems.contains("Sauce Labs Onesie")) {
			System.out.println("Order summary is verified");
		}
		else {
			System.out.println("Order summary is not verified");
		}
		//click on finish button
		driver.findElement(By.name("finish")).click();
	}
	@Test(priority=3)
	public void logOut() {
		driver.findElement(By.xpath("//button[.='Open Menu']")).click();
		driver.findElement(By.id("logout_sidebar_link")).click();
	}

}
