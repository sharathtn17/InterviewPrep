package com.framework.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.framework.pages.HomePage;

public class DriverAction {
	
	public static WebDriver driver;

	
	protected static WebElement findElementByXpath(String xpathExpression) {
		// TODO Auto-generated method stub
		return driver.findElement(By.xpath(xpathExpression));
		
	}
	
	public static void quitDriver() {
		driver.close();
		
	}

	protected static void click(String xpath) {
		// TODO Auto-generated method stub
		waitForElement(By.xpath(xpath),20);
		driver.findElement(By.xpath(xpath)).click();
		
		
	}
	 public static void hover(String xpath)
	 {   waitForElement(By.xpath(xpath), 10);
		 Actions builder = new Actions(driver);
		 builder.moveToElement(driver.findElement(By.xpath(xpath))).build().perform();
	 }
	protected static void waitForElement(By locator,int waitTime)
	{
		WebDriverWait wait = new WebDriverWait(driver, waitTime);
		wait.until(ExpectedConditions.elementToBeClickable(locator));
	}
	

	public static String getText(String xpath)
	{
		waitForElement(By.xpath(xpath), 10);
		return driver.findElement(By.xpath(xpath)).getText();
		
	}
	
	protected static void enterText(String xpath, String text) {
		// TODO Auto-generated method stub
		waitForElement(By.xpath(xpath), 10);
		driver.findElement(By.xpath(xpath)).sendKeys(text);
		
	}
	
	public static void keyDown(String xpath){
		driver.findElement(By.xpath(xpath)).sendKeys(Keys.DOWN,Keys.DOWN,Keys.DOWN,Keys.ENTER);
	}
	
	
}
