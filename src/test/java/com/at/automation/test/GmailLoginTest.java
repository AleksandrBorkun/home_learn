package com.at.automation.test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.at.automation.data.DataHolder;

public class GmailLoginTest {

	
	@Test
	public void testOne(){
		
		System.setProperty(DataHolder.driverType, DataHolder.driverPath);
		WebDriver driver = new ChromeDriver();
		
		driver.get(DataHolder.url);
		
		WebElement emailField = driver.findElement(By.xpath("//input[@id = 'Email']"));
		
		emailField.click();
		emailField.clear();
		emailField.sendKeys(DataHolder.email);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement nextButton = driver.findElement(By.xpath("//input[@id = 'next']"));
		nextButton.click();
		
		WebElement passField = driver.findElement(By.xpath("//input[@id = 'Passwd']"));
		
		waitUntilVisible(passField, driver);
		passField.click();
		passField.clear();
		passField.sendKeys(DataHolder.password); //Here must be your password 
		
		WebElement signInButton = driver.findElement(By.xpath("//input[@id = 'signIn']"));
				signInButton.click();
		
		WebElement userIcon = driver.findElement(By.xpath("//a[contains(@title, 'Google Account')]"));
		waitUntilVisible(userIcon, driver);
		
		Assert.assertTrue(userIcon.isDisplayed());
		
	}
	
	
	public void waitUntilVisible(WebElement element, WebDriver driver){
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(element));
			
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

