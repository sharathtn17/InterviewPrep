package com.framework.pages;

import org.openqa.selenium.WebElement;

import funtionalcomponents.Page;

public class LoginPage extends Page{
	
	String username_xpath = "";

	public LoginPage enterUserName() {
		// TODO Auto-generated method stub
		WebElement usernameTextBox = findElementByXpath(username_xpath);
		
		enterText(username_xpath, "kjkjk@gmail.com");
		
		return this;
	}

	@Override
	protected String pageName() {
		// TODO Auto-generated method stub
		return null;
	}

	public LoginPage enterPassword() {
		// TODO Auto-generated method stub
		return this;
	}

	public DashboardPage clickSignInButton() {
		// TODO Auto-generated method stub
		
		return new DashboardPage();
	}

	



}
