package pages;

import javax.management.loading.PrivateClassLoader;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ItemsScreen {
	private WebDriver driver;
	
	public ItemsScreen(WebDriver driver) {
		this.driver=driver;
	}

	
	private By firstElement=By.className("s-image");
	
	public ProductDetails selectFirstElement() {
		driver.findElements(firstElement).get(1).click();
		return new ProductDetails(driver);
	}

}
