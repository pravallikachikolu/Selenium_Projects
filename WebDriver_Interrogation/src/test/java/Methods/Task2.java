package Methods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		String parent=driver.getWindowHandle();
//		System.out.println("parent id:"+parent);
		
		driver.findElement(By.xpath("//a[.='Facebook']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Twitter']")).click();
		Set<String> allwindowIds=driver.getWindowHandles();
		for(String s:allwindowIds) {
			driver.switchTo().window(s);
			String title=driver.getTitle();
			Thread.sleep(2000);
			System.out.println("title:"+title);
			System.out.println("id:"+s);
		}
		
	}

}
