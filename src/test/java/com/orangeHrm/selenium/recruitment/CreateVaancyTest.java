package com.orangeHrm.selenium.recruitment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CreateVaancyTest {
	WebDriver driver;
	@Test
	public void addVacancy() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//login
		driver.findElement(By.name("")).sendKeys("Admin");
		driver.findElement(By.name("")).sendKeys("admin123");
		driver.findElement(By.name("")).sendKeys("Admin");
	}

}
