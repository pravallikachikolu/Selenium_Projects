package FileUpload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/fileUpload?sublist=0");
		Thread.sleep(2000);
		
		//avoid the file upload popup
		driver.findElement(By.id("resume")).sendKeys("C:\\Users\\chiko\\AppData\\Local\\Packages\\5319275A.WhatsAppDesktop_cv1g1gvanyjgm\\LocalState\\sessions\\48A1845C5A22C3D9236C447DD58DBEB7CE821A23\\transfers\\2026-06\\GIT .pdf");
	}

}
