package com.selenium.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WaitTest {
	private WebDriver driver;
	private String baseUrl;
	private WebElement element;

	@BeforeMethod
	public void setUp() throws Exception {
	driver = new FirefoxDriver();
	baseUrl = "http://www.google.com";
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void testUntitled() throws Exception {
	driver.get(baseUrl);
	element = driver.findElement(By.id("lst-ib"));
	element.sendKeys("Selenium WebDriver Interview questions");
	element.sendKeys(Keys.RETURN);
	List<WebElement> list = driver.findElements(By.className("_Rm"));
	System.out.println(list.size());

	}

	@AfterMethod
	public void tearDown() throws Exception {
	driver.quit();
	}

}
