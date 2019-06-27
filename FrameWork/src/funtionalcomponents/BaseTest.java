package funtionalcomponents;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.framework.utility.BrowserFactory;
import com.framework.utility.PropertiesReader;

public class BaseTest  {
	BrowserFactory bw=new BrowserFactory();
	public static WebDriver driver=null;
	private Properties properties;
	
	private final String propertyFilePath= "C:/Users/sn0000/workspace/FrameWork/src/com/framework/utility/config.properties";
	
	public BaseTest() {}
	
	@BeforeMethod( alwaysRun = true )
	public void setUp() throws InterruptedException {
       BrowserFactory.initializeDriver(PropertiesReader.getConfProperty("Browser"));
       System.out.println(PropertiesReader.getConfProperty("Browser"));
	}
	
	@AfterMethod( alwaysRun = true )
	public void tear() throws InterruptedException {
    //  Page.quitDriver();
	}
	
}
