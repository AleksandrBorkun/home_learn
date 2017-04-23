package com.home.cucumber.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.home.cucumber.driver.FactoryDriver;
import com.home.cucumber.utils.ExplicitWait;

public class BasePage {

	WebDriver driver;
	ExplicitWait wait;
	
	public BasePage(){
		driver = FactoryDriver.getInstance();
		wait = new ExplicitWait(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void openBasePage(){
		driver.navigate().to("http://gmail.com");
	}
	
}
