package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//this class to implement actions on home page 
public class AmazonHomePage {
	private WebDriver driver;
	
	public AmazonHomePage(WebDriver driver) {
		this.driver=driver;
		
	}

	
	private By searchTextField=By.id("twotabsearchtextbox");
	private By searchButton=By.id("nav-search-submit-button");
	
	//Method to enter search key
	public void enterSearchKeyWord(String searchKey) {
		driver.findElement(searchTextField).sendKeys(searchKey);
	}
	
	//Method to click on search button
	public ItemsScreen clickOnSeachButton() {
		driver.findElement(searchButton).click();
		return new ItemsScreen(driver);
	}
	
}
