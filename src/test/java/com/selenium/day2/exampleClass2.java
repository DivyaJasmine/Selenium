package com.selenium.day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class exampleClass2 {

	@Test
	public void verifyValidLogin() throws InterruptedException
	{
		WebDriverManager.firefoxdriver().setup();	
	 
		WebDriver driver=new FirefoxDriver();
		 
		driver.manage().window().maximize();
		 
		driver.get("https://opensource-demo.orangehrmlive.com/");
		 
		exampleClass1 login=new exampleClass1(driver);
		login.typeUserName("Admin");
		Thread.sleep(2000);
		
		login.typePassword("admin123");
		Thread.sleep(2000);
		 
		login.clickOnLoginButton();
		 
		 
		driver.quit();
	 
	}

}
