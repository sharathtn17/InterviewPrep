package com.project.pages;

import java.util.Vector;

import com.project.functionalComponet.Actions;
import com.project.functionalComponet.BaseTest;

public  class Page extends BaseTest{

	Page p;
	LoginPage lp;

	public static String getTitle()
	{   //Thread
		//Alert
		
		String title=Actions.getTitle();
		return title;
	}
	
	public HomePage homePage() {
		return new HomePage(driver);
	}

	public LoginPage Loginpage() {
	 
		 return new LoginPage(driver);
	}
	


	
	public HomePage _homePage() {
		return (HomePage)this;
	}
	
	public LoginPage _loginPage() {
		return new LoginPage(driver);

	}
	
	
	
	/*protected abstract String pageName();
	verifyPageUrl()
	confirmSecurityAlert()
	switchToWindow()
	navigateTo()
	verifyPageTitle()
	captureScreenShot()
	isVerticalPage();
	switchToFrame();
	SwitchBack()
	waitForPageAngToLoad()*/

}
