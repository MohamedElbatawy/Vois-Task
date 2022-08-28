package testCase;

import org.testng.annotations.Test;

import TestBase.TestBase;
import data.Loadproperties;
import pages.AmazonHomePage;
import pages.CardDetails;
import pages.ItemsScreen;
import pages.ProductDetails;

public class Scenario1 extends TestBase{
	
	 AmazonHomePage homePageObject;
	 ItemsScreen itemScreenObject;
	 ProductDetails productDetailsObject;
	 CardDetails cardDetailsObject;
	
	String searchKeyWord=Loadproperties.userData.getProperty("searchKeyWord");
	
	//This Class is related to TC execution 
	//This method to invoke the method of execution on home page 
	@Test(priority = 1, alwaysRun = true)
	public void SearchByKey() {
		homePageObject=new AmazonHomePage(driver);
		homePageObject.enterSearchKeyWord(searchKeyWord);
		homePageObject.clickOnSeachButton();
	}
	

	//Method to execute the selection f the first item
	@Test(priority = 2, alwaysRun = true)
	public void firstElementsSelection() {
		itemScreenObject=new ItemsScreen(driver);
		itemScreenObject.selectFirstElement();
	}
	
	
	//Method to add the product to card
	@Test(priority = 3, alwaysRun = true)
	public void ClicOnAddToCrdButton() {
		productDetailsObject=new ProductDetails(driver);
		productDetailsObject.ClickOnAddToCard();
	}
	
	//This method to assert and confirm the success process
	@Test(priority = 4, alwaysRun = true)
	public void assertAddedProdctMessage() {
		cardDetailsObject=new CardDetails(driver);
		cardDetailsObject.assertion();
	}
	
	
}
