package com.home.cucumber.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	WebDriverWait wait;
	WebDriver driver;
	
	public ExplicitWait(WebDriver driver){
		this.driver = driver;		
		wait = new WebDriverWait(driver, 25);
	}
	
	public void waitUntilElementIsClickable(WebElement element){
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public boolean waitUntilElementIsSelected(WebElement element){
		return wait.until(ExpectedConditions.elementToBeSelected(element));
	}
		
}
