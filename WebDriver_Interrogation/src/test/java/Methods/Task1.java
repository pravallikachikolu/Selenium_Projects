package Methods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		//fetching parent id
		String parentId=driver.getWindowHandle();
		System.out.println("Parent Id is :"+parentId);
		
		driver.findElement(By.xpath("//a[.='Facebook']")).click();
		Thread.sleep(2000);
		
		String Fb="";
		
		for(String string:driver.getWindowHandles()) {
			if(!string.equals(parentId)) {
				Fb=string;
				break;
			}
		
		}
		System.out.println("Fb Id :"+Fb);
		
		driver.findElement(By.xpath("//a[.='Twitter']")).click();
		
		String x="";
		for(String string:driver.getWindowHandles()) {
			if(!string.equals(parentId) && !string.equals(Fb)) {
				x=string;
				break;
			}
		}
		System.out.println("X id :"+ x);

		
	}

}
