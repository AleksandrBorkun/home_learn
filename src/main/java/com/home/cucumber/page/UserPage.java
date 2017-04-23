package com.home.cucumber.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserPage extends BasePage{

	@FindBy(xpath = "//span[@class = 'gb_9a gbii']")
	private WebElement userIcon;
	
	public UserPage() throws RuntimeException{
		super();
		if(!driver.getTitle().contains("Gmail")){
			throw new RuntimeException("This is not User Page");
		}
	}
	
	public boolean isUserIconIsPresent(){
		wait.waitUntilElementIsClickable(userIcon);
		return userIcon.isDisplayed();
	}
	
}
