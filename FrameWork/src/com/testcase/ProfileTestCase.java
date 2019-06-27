package com.testcase;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.framework.pages.HomePage;
import com.framework.utility.PropertiesReader;

import funtionalcomponents.BaseTest;
import funtionalcomponents.Page;


public class ProfileTestCase extends BaseTest {
	
	PropertiesReader configreader;
	

	@Test	
	//@Parameters({ "Username", "password" })
	public void testcase1() {
		
		/*HomePage homePage=PageFactory.initElements(driver,HomePage.class);
		homePage.login();*/
		
		HomePage homePage = new HomePage();
		homePage.loadPage(PropertiesReader.getConfProperty("URL"))
		.addToCart(Integer.parseInt(PropertiesReader.gettestDataProperty("noOfItemToCart").trim()))
		.clickonCart()
		.removeItemFromCart(2);
		
		
		
	}
	@Test
     public void testcase2() {
		
		/*HomePage homePage=PageFactory.initElements(driver,HomePage.class);
		homePage.login();*/
		
		HomePage homePage = new HomePage();
		homePage.loadPage(PropertiesReader.getConfProperty("URL"))
		.addToCart(Integer.parseInt(PropertiesReader.gettestDataProperty("noOfItemToCart").trim()))
		.clickonCart()
		.removeItemFromCart(1);
		
		
		
	}
	
	
	@Test
    public void testcase3() {
		
		/*HomePage homePage=PageFactory.initElements(driver,HomePage.class);
		homePage.login();*/
		
		HomePage homePage = new HomePage();
		homePage.loadPage(PropertiesReader.getConfProperty("URL"))
		.login()
		.logout();
		
		
		
	}

}
