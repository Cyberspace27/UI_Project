package Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
	WebDriver driver;
	public SearchPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//input[@name='q']")
	private WebElement searchBox;
	
	@FindBy(xpath = "(//input[@name='btnk'])[1]")
	private WebElement search_btn;
	
	
	public void searchGoogle(String searchInput){
		try {
			searchBox.sendKeys(searchInput);
			search_btn.click();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
