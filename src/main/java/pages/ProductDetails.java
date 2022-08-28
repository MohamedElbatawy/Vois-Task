package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class ProductDetails{
	private WebDriver driver;
	JavascriptExecutor js=(JavascriptExecutor) driver;
	
	public ProductDetails(WebDriver driver) {
		this.driver=driver;
	}
	
	

	By addToCartButton=By.id("add-to-cart-button");
	
	
	public CardDetails ClickOnAddToCard() {
		driver.findElement(addToCartButton).click();
		return new CardDetails(driver);
	}
	

}
