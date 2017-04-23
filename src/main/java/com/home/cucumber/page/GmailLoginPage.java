package com.home.cucumber.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GmailLoginPage extends BasePage{

	@FindBy(id = "Email")
	private WebElement emailField;
	@FindBy(id = "next")
	private WebElement nextButton;

	
	
	public GmailLoginPage() throws RuntimeException{
		super();
		if(!driver.getTitle().equals("Gmail")){
			throw new RuntimeException("This not Login Page");
		}
	}
	
	public void fillEmailFieldAndClickNext(String email){
		wait.waitUntilElementIsClickable(emailField);
		emailField.clear();
		emailField.click();
		emailField.sendKeys(email);
		wait.waitUntilElementIsClickable(nextButton);
		nextButton.click();
	}

/*
	public void fillEmailFieldAndClickNext(String string) {
		wait.waitUntilElementIsClickable(emailField);
		emailField.clear();
		emailField.click();
		emailField.sendKeys(string);
		wait.waitUntilElementIsClickable(nextButton);
		nextButton.click();		
	}
	
	*/

}
