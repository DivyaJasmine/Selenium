package com.selenium.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class sampleTest {
	@Test
	public void method() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\divyajo\\eclipse-maven-workspace\\GrpActivity\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://demo.guru99.com/V4/");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);
		
		WebElement Username= driver.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]"));
		Username.sendKeys("mngr358081");
		WebElement Password= driver.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]"));
		Password.sendKeys("zUhymab");
		WebElement Login = driver.findElement(By.name("btnLogin"));
		Login.click();
		
		WebElement Newcustomer = driver.findElement(By.xpath("//a[contains(text(),'New Customer')]"));
		Newcustomer.click();
		
		
		WebElement Dob = driver.findElement(By.id("dob"));
		Dob.click();
		Dob.sendKeys("21/09/2000");
	}

}
