package com.framework.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import funtionalcomponents.Page;

public class BrowserFactory extends DriverAction {

	//static WebDriver driver;


	public static void initializeDriver(String browser){

		if(browser.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}

		if(browser.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "C:/WebDriverServerStart/chromedriver.exe");
		driver=new ChromeDriver();
		}
		
		

	}

}
