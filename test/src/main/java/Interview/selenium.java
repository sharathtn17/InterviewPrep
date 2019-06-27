package Interview;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class selenium {
	WebDriver driver;
	 @FindBy(how = How.XPATH, using = "//a[contains(text(),'Hotels')]")
	 WebElement hotelLink;
  	
	 @FindBy(id = "Tags")
	    private static WebElement localityTextBox;

	    @FindBy(id = "SearchHotelsButton")
	    private static WebElement searchButton;

	    @FindBy(id = "travellersOnhome")
	    private static WebElement travellerSelection;
@Test
	public  void maintest() {
		// TODO Auto-generated method stub
	
     	
		
		   

		   
		   
		    	
		    	System.setProperty("webdriver.chrome.driver", "C:/WebDriverServerStart/chromedriver.exe");
		    	driver=new ChromeDriver();
		        driver.get("https://www.cleartrip.com");
		       // WebElement hotelLink=driver.findElement(By.xpath("//a[contains(text(),'Hotels')]"));
		        System.out.println("------------------------------------------"+hotelLink.isDisplayed());
		        if(hotelLink.isDisplayed()){
		        	hotelLink.click();
		        }

		        localityTextBox.sendKeys("Indiranagar, Bangalore");

		        new Select(travellerSelection).selectByVisibleText("1 room, 2 adults");
		        searchButton.click();

		        driver.quit();

			
	}

}
