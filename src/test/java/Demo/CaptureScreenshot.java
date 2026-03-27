package Demo;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import com.orangehrm.seleniumuiframework.object_repository.DashBoardPage;
import com.orangehrm.seleniumuiframework.object_repository.LoginPage;
import com.orangehrm.selniumuiframework.gernericUtility.webdriverUtility;

public class CaptureScreenshot {
	@Test
	public void scrrenshot() throws IOException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		webdriverUtility wu=new webdriverUtility(driver);
		LoginPage lp=new LoginPage(driver);
		DashBoardPage dsp=new DashBoardPage(driver);
		//creating a method for time-stamp
		String timestamp=new SimpleDateFormat("yyyy-mm-dd[hh-mm-ss]").format(new Date());
		wu.configMaximizedBrowser();
		wu.waitForElementsToLoad(20);
		wu.navigateToApplication("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		lp.login("Admin", "admin123");
		Thread.sleep(3000);
		//capture the screenshot of home page
		TakesScreenshot ts=(TakesScreenshot)driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File perm = new File("./Reports/dashboard"+timestamp+".png");
		FileHandler.copy(temp, perm);
		//capture the screenshot of the web element
		WebElement recruitmentLink=dsp.getRecruitment();
		File tempscr = recruitmentLink.getScreenshotAs(OutputType.FILE);
		File permscr = new File("./Reports/recruitmentlink"+timestamp+".png");
		FileHandler.copy(tempscr, permscr);
	}

}
