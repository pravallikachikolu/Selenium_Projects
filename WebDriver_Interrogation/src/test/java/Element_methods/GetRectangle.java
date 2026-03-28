package Element_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class GetRectangle {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		WebElement registerLink=driver.findElement(By.linkText("Register"));
		
		//fetch the rectangle
		Rectangle rect=registerLink.getRect();
		
		//fetch the dimensions along height and width
		System.out.println(rect.getDimension());
		System.out.println(rect.height);
		System.out.println(rect.getHeight());
		System.out.println(rect.width);
		System.out.println(rect.getWidth());
		
		//fetch the point coordinates along with x and y offsets
		System.out.println(rect.getPoint());
		System.out.println(rect.getX());
		System.out.println(rect.x);
		System.out.println(rect.getY());
		System.out.println(rect.y);
		
		driver.quit();
	}

}
