package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MakeMyTrip {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.makemytrip.com/flights/?cmp=SEM|D|DF|G|Brand|Brand-BrandVariants_DT|B_M_Makemytrip_Variants|Brand-Variants-Exact&gad_source=1&gad_campaignid=313149128&gbraid=0AAAAAD5Az1R_rA3OD1K05AiUYB0ihUs_W&gclid=CjwKCAiAnoXNBhAZEiwAnItcG3bDvZsjc4_7t9Fnnq4Q1nOZ8fdvfvx6TCcy1uoWw0qASRppviIotBoCZsoQAvD_BwE");
		
		Thread.sleep(6000);
		driver.findElement(By.xpath("//img[@src=\"https://jsak.mmtcdn.com/pwa/platform-myra-ui/static/sub_icons/close-icon.png\"]")).click();
		driver.findElement(By.xpath("//p[.='For Your Dream Europe Trip: Get Up to 40%OFF*']/parent::div/parent::div/parent::div/child::div[@class=\"sliderFoot\"]/child::div/child::a")).click();
		
	}

}
