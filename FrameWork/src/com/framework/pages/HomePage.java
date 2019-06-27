package com.framework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import funtionalcomponents.Page;





public class HomePage extends Page{
	
private static final String HomePageURL = "http://www.redmart.com";
public static String loginLink="//a[@id='NAVBAR_SIGNIN_BTN']";
public static final String cartLink = "//div[@class='NavbarCartTotal__container___15sws']";

By by=By.xpath("");
//WebElement AddToCardButton = findElementByXpath("(//a[@class='AtcButton__container___1RZ9c AtcButton__with_text___4C5OY AtcButton__small___1a1kH'])[#$]");

	public HomePage(WebDriver driver, String HomePageURL) {
	
		super(driver, HomePageURL);
		
		
	}
	
	public HomePage(){
		
		
	}
	
	public final String username="//input[@type='email']";
	public final String password="//input[@type='password']";;
	public final String loginButton="//div[@class='Button__button___1-iVe Button__primary___1R0WH']";;
	
	public HomePage login() {
		System.out.println("Home Page");
	    click(loginLink);
	    enterText(username, "july42.m2@gmail.com");
	    enterText(password,"sears123");
	    click(loginButton);
		return new HomePage();
		//BufferedReader br = new BufferedReader(new FileReader(file));
	}
	
	public HomePage addToCart(int noOfItem) {
		System.out.println("Home Page");
		String addToCart="(//a[@class='AtcButton__container___1RZ9c AtcButton__with_text___4C5OY AtcButton__small___1a1kH'])[#]";
		
		
		for(int i=1;i<=noOfItem;i++)
		{   
			addToCart=addToCart.replaceFirst("#",Integer.toString(i));
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@2"+addToCart);
			click(addToCart);
			
		}
		return new HomePage();
		//BufferedReader br = new BufferedReader(new FileReader(file));
	}
	public LoginPage clickSignInLink(){
		
		String loginLink_xpath ="";
		
		WebElement loginLink = findElementByXpath(loginLink_xpath);
	//	click(loginLink);
		
		return new LoginPage();
	}
	



	protected String getPageName() {
		return "Home Page";
	}
	 

	protected String pageName() {
		return "Home Page";
	}

	public CartPage clickonCart() {
		// TODO Auto-generated method stub
		
		click(cartLink);
		return new CartPage();
	}

	
}
