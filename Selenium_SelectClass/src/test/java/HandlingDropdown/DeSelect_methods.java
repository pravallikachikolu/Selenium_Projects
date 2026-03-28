package HandlingDropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeSelect_methods {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
		Thread.sleep(2000);
		
		Select sel=new Select(driver.findElement(By.id("select-multiple-native")));
		sel.selectByVisibleText("John Hardy Women's L...");
		sel.selectByVisibleText("Mens Casual Premium ...");
		sel.selectByVisibleText("Solid Gold Petite Mi...");
		sel.selectByVisibleText("White Gold Plated Pr...");
		Thread.sleep(2000);
		
		//deselect by index
		sel.deselectByIndex(5);
		Thread.sleep(2000);
		
		//deselect by value
		sel.deselectByValue("Mens Casual Premium Slim Fit T-Shirts ");
		Thread.sleep(2000);
		
		//deselect by visibleText
		sel.deselectByVisibleText("White Gold Plated Pr...");
		Thread.sleep(2000);
		
		//deselect by contains visibleText
		sel.deSelectByContainsVisibleText("John Hardy");
		
		//deselect all
		sel.deselectAll();
		
		//fetching the options from the dropdown
	    List<WebElement> allopt=sel.getOptions();
	    for(WebElement opt:allopt) {
	    	System.out.println(opt.getText());
	    }
		
	}

}
