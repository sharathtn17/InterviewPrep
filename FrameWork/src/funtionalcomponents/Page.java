package funtionalcomponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.framework.pages.HomePage;
import com.framework.utility.DriverAction;
import com.google.common.base.Function;



public abstract class Page extends DriverAction{

//	public static WebDriver driver;

	public static String myAccount="//div[@class='dropdown minimal']";
	public Page( WebDriver driver, String HomePageURL) {
		this.driver=driver;
		driver.get(HomePageURL);
		String pageName = pageName();

	}
	
	public Page(){
		
	}

	protected abstract String pageName();

/*	public static void initializeDriver(String browser){

		if(browser.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}

		if(browser.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "C:/WebDriverServerStart/chromedriver.exe");
		driver=new ChromeDriver();
		}
		
		

	}*/
	public HomePage loadPage(String url) {
		
		driver.get(url);
		return new HomePage();
		// TODO Auto-generated method stub
		
	}
	public HomePage logout() {
		// TODO Auto-generated method stub
		
		hover(myAccount);
		keyDown("//span");
		
		return new HomePage();
		
	}
	

	/*protected WebElement findElementByXpath(String xpathExpression) {
		// TODO Auto-generated method stub
		return driver.findElement(By.xpath(xpathExpression));
		
	}
	

	protected void click(String xpath) {
		// TODO Auto-generated method stub
		waitForElement(By.xpath(xpath),20);
		driver.findElement(By.xpath(xpath)).click();
		
		
	}
	
	protected void waitForElement(By locator,int waitTime)
	{
		WebDriverWait wait = new WebDriverWait(driver, waitTime);
		wait.until(ExpectedConditions.elementToBeClickable(locator));
	}
	

	public String getText(String xpath)
	{
		this.waitForElement(By.xpath(xpath), 10);
		return driver.findElement(By.xpath(xpath)).getText();
		
	}
	
	protected void enterText(WebElement webElement, String text) {
		// TODO Auto-generated method stub
		
		webElement.sendKeys(text);
		
	}*/
}
