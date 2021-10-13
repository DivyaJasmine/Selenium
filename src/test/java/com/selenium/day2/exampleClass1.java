package com.selenium.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class exampleClass1 {
	WebDriver driver;
	 
	 
	 
	By username=By.id("txtUsername");
	By password=By.id("txtPassword");
	By loginButton=By.id("btnLogin");
	 
	 
	public exampleClass1(WebDriver driver)
	{
	this.driver=driver;
	}
	 
	 
	public void loginToWordpress(String userid,String pass)
	{
	 
	driver.findElement(username).sendKeys(userid);
	driver.findElement(password).sendKeys(pass);
	driver.findElement(loginButton).click();
	 
	}
	 
	 
	public void typeUserName(String uid)
	{
	 
	driver.findElement(username).sendKeys(uid);
	}
	 
	public void typePassword(String pass)
	{
	 
	driver.findElement(password).sendKeys(pass);
	}
	 
	public void clickOnLoginButton()
	{
	driver.findElement(loginButton).click();
	}

}
