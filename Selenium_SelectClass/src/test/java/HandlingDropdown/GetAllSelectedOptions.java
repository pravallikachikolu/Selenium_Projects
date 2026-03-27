package HandlingDropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedOptions {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		Thread.sleep(2000);
		WebElement opt=driver.findElement(By.id("cars"));
		Select sel=new Select(opt);
		sel.selectByVisibleText("Audi");
		Thread.sleep(2000);
		sel.selectByVisibleText("Saab");
		Thread.sleep(2000);
		sel.selectByVisibleText("Volvo");
		
		
		List<WebElement> allopt=sel.getAllSelectedOptions();
		for(WebElement all:allopt) {
			System.out.println(all.getText());
		}
		
		
	}

}
