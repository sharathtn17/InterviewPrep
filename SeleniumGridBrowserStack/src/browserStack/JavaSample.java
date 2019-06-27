package browserStack;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class JavaSample {

  public static final String USERNAME = "sharath50";
  public static final String AUTOMATE_KEY = "MpBG7WDPxn57P7tfwRuX";
  public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
  WebDriver driver;
  @BeforeTest
  public void setUp() throws MalformedURLException
  {
	      DesiredCapabilities caps = new DesiredCapabilities();
	  //  DesiredCapabilities caps = new DesiredCapabilities();
	      caps.setCapability("browser", "Chrome");
	      caps.setCapability("os", "Windows");
	      caps.setCapability("os_version", "xp");
	      caps.setCapability("name", "Running for Multiple Browser/os");
	      caps.setCapability("browserstack.debug", "true");
	      caps.setCapability("browserstack.networkLogs", "true");
	      driver = new RemoteWebDriver(new URL(URL), caps);
	  
  }
  //public static void main(String[] args) throws Exception {

    @Test
    public void BrowserGriDTest(){
    driver.get("http://www.sears.com");
    WebElement element = driver.findElement(By.name("q"));

    element.sendKeys("BrowserStack");
    element.submit();

    System.out.println(driver.getTitle());
    }

    @Test
    public void BrowserGriDTestPass(){
    driver.get("http://www.sears.com");
  //   WebElement element = driver.findElement(By.name("q"));

  //  element.sendKeys("BrowserStack");
  //  element.submit();

   // System.out.println(driver.getTitle());
    }
    
    
@AfterTest
public void tearDown()
{
	driver.quit();
}
  
    
}
