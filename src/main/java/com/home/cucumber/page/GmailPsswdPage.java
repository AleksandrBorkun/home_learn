package com.home.cucumber.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GmailPsswdPage extends BasePage{

	@FindBy(name = "signIn")
	private WebElement signInButton;
	@FindBy(id = "Passwd")
	private WebElement psswdField;
	
	public void fillPsswdFieldAndClickNext(String email){
		wait.waitUntilElementIsClickable(psswdField);
		psswdField.clear();
		psswdField.click();
		psswdField.sendKeys(email);
		WebElement signInButton = driver.findElement(By.id("signIn"));
		wait.waitUntilElementIsClickable(signInButton);
		signInButton.click();
	}
	
}
