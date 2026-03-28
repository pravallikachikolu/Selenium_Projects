package Element_methods;



import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSize {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		WebElement searchbtn=driver.findElement(By.id("twotabsearchtextbox"));
		Dimension dims=searchbtn.getSize();
		System.out.println(dims);
		
		//fetch the height
		System.out.println(dims.getHeight());//method in getter
//		System.out.println(dims.height);//final variable
		
		//fetch the width
		System.out.println(dims.getWidth());
//		System.out.println(dims.width);
		
	}

}
