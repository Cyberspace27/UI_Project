package Test_Scenarios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Objects.SearchPage;

public class SearchTest {
	
	WebDriver driver;
	
	SearchPage sPage;
	
	@BeforeTest
	public void beforetest() {
//	WebDriverManager.chromedriver().setup();
	System.setProperty("webdriver.chromeDriver.driver","chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://www.google.com");
	
	}
	//enabled = false
  @Test(priority = 1)
  public void SearchTestOp() {
	  sPage = new SearchPage(driver);
	  sPage.searchGoogle("Search anything ");
  }
  
  @AfterTest
  public void afterTest() {
	  driver.close();
  }
}
