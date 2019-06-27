package com.project.functionalComponet;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

public class Waits extends BaseTest{
	
	
	public void waitForAlert(WebDriver driver)
	{
		WebDriverWait wait=new WebDriverWait(driver,10); 
		
		wait.until(ExpectedConditions.alertIsPresent());
	}

	public static WebElement IFluentWait(WebDriver driver, WebElement ele,By by)
	{

		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		            .withTimeout(Duration.ofSeconds(10))
		            .pollingEvery(Duration.ofMillis(1000))
		            .ignoring(WebDriverException.class);
		WebElement clicableElement = wait.until(new Function<WebDriver, WebElement>()
		{
			public WebElement apply(WebDriver driver)
			{
			return ele.findElement(by);
			}
		
	});
		return clicableElement;
	}
	public static WebElement waitForElement(WebElement ele)
	{
		//try{
		WebDriverWait wait=new WebDriverWait(driver,10); 
		System.out.println("Webdriver untill before");
		wait.until(ExpectedConditions.elementToBeClickable(ele));
	//	}catch(Exc)
		System.out.println("Webdriver Element");
		return ele;
	}
	

}
