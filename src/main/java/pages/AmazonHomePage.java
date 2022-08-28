package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AmazonHomePage {
	private WebDriver driver;
	
	public AmazonHomePage(WebDriver driver) {
		//super();
		this.driver=driver;
		
	}

	private By searchTextField=By.id("twotabsearchtextbox");
	private By searchButton=By.id("nav-search-submit-button");
	
	public void enterSearchKeyWord(String searchKey) {
		driver.findElement(searchTextField).sendKeys(searchKey);
	}
	
	public ItemsScreen clickOnSeachButton() {
		driver.findElement(searchButton).click();
		return new ItemsScreen(driver);
	}
	
}
