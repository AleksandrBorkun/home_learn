package com.home.cucumber.steps;


import org.junit.Assert;

import com.home.cucumber.page.BasePage;
import com.home.cucumber.page.GmailLoginPage;
import com.home.cucumber.page.GmailPsswdPage;
import com.home.cucumber.page.UserPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GmailLoginStep {

	private BasePage basePage;
	private GmailLoginPage loginPage;
	private GmailPsswdPage psswdPage;
	private UserPage userPage;
	

	
	@Given("^that gmail\\.com is open$")
	public void that_gmail_com_is_open() {
		basePage = new BasePage();
		basePage.openBasePage();
		loginPage = new GmailLoginPage();
	   // throw new PendingException();
	}

	@When("^I log in to mail system$")
	public void i_log_in_to_mail_system() throws Throwable {
	   loginPage.fillEmailFieldAndClickNext("Alexandr.Borkun1992@gmail.com");
	   psswdPage = new GmailPsswdPage();
	   psswdPage.fillPsswdFieldAndClickNext("whereismymind17");
	   // throw new PendingException();
	}

	@Then("^I should see the \"([^\"]*)\"$")
	public void i_should_see_the(String arg1) throws Throwable {
		userPage = new UserPage();
		Assert.assertTrue(userPage.isUserIconIsPresent());
	  //  throw new PendingException();
	}
	
}
