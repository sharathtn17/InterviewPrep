package com.project.tests;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.openqa.selenium.support.pagefactory.DefaultElementLocatorFactory;

import com.project.functionalComponet.BaseTest;
import com.project.functionalComponet.Users;
import com.project.pages.LoginPage;

import PageAction.LoginPageAction;

public class TC_LoginTC extends BaseTest{
	
	

	@Test
	public void loginTest() throws IOException 
	{
			
		/*//logger.info("URL is opened");
		
		//LoginPageAction.signIN_Action("selenium", "selenium").VerifyLogin("");
		LoginPage lp=new LoginPage(driver);
		lp.typetext("isdisplayed in selenium")
		.submitb()
		
		.VerifyLogin();*/
		
		Users.guestUser
		//._homePage()
		.Loginpage()
		.setUserName("wqqwqwq")
		//.setPassword("qwqwqwq")
		.clickSubmit()
		.VerifyLogin()
		._loginPage()
		.setPassword("dsdsdd");
		
		
		

}
	
	@DataProvider(name="login")
	public Object[][] dataProvider()
	{
		return new Object[][]{
			{"test"},{"test2"}
		
		                     
	};
	}
	

}