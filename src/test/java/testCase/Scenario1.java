package testCase;

import org.testng.annotations.Test;

import TestBase.TestBase;
import data.Loadproperties;
import pages.AmazonHomePage;
import pages.CardDetails;
import pages.ItemsScreen;
import pages.ProductDetails;

public class Scenario1 extends TestBase{
	
	//AmazonHomePage homePageObject;
	//ItemsScreen itemScreenObject=new ItemsScreen(driver);
	 AmazonHomePage homePageObject;
	 ItemsScreen itemScreenObject;
	 ProductDetails productDetailsObject;
	 CardDetails cardDetailsObject;
	
	String searchKeyWord=Loadproperties.userData.getProperty("searchKeyWord");
	
	@Test(priority = 1, alwaysRun = true)
	public void SearchByKey() {
		homePageObject=new AmazonHomePage(driver);
		homePageObject.enterSearchKeyWord(searchKeyWord);
		homePageObject.clickOnSeachButton();
	}
	
	/*@Test(priority = 2)
	public void clickOnSearchButton() {
		
	}*/

	
	@Test(priority = 2, alwaysRun = true)
	public void firstElementsSelection() {
		itemScreenObject=new ItemsScreen(driver);
		itemScreenObject.selectFirstElement();
	}
	
	/*@Test(priority = 4)
	public void scrollToAddCardButton() {
		productDetailsObject.scrollToCartButton();
	}*/
	
	@Test(priority = 3, alwaysRun = true)
	public void ClicOnAddToCrdButton() {
		productDetailsObject=new ProductDetails(driver);
		productDetailsObject.ClickOnAddToCard();
	}
	
	@Test(priority = 4, alwaysRun = true)
	public void assertAddedProdctMessage() {
		cardDetailsObject=new CardDetails(driver);
		cardDetailsObject.assertion();
	}
	
	
}
