package pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CardDetails {
	private WebDriver driver;
	public CardDetails(WebDriver driver) {
		this.driver=driver;
	}
	 //By addToCardMessage =By.cssSelector("span.class.a-size-medium-plus.a-color-base.sw-atc-text.a-text-bold");
	By addToCardMessage =By.xpath("//span[@class='a-size-medium-plus a-color-base sw-atc-text a-text-bold']");
	 
	 public void assertion() {
		 
		String message=driver.findElement(addToCardMessage).getText();
		System.out.println(message);
		 assertEquals(message, "Added to Cart"," Not Added");
	 }

}
