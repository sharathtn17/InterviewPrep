

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class HandlingFrames {

	static String parentWindow;
	static  String newWindow = null;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System. setProperty("webdriver.chrome.driver", "C://WebDriverServerStart//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();;
		driver.navigate().to("http://toolsqa.com/iframe-practice-page//");
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Link Test"));
	//	driver.quit();
		driver.navigate().to("https://www.mailinator.com/inbox2.jsp?to=testname123#/#public_maildirdiv");
		driver.findElement(By.xpath("//div[@class='innermail ng-binding' and contains(text(),'Please confirm')]")).click();
		
		
		/*Actions builder = new Actions(driver);
        Action mouseOverHome = builder
                .moveToElement()
                .build();*/
        
        
	}
}
