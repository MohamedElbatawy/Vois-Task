package TestBase;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import data.Loadproperties;
import pages.AmazonHomePage;
import pages.CardDetails;
import pages.ItemsScreen;
import pages.ProductDetails;

public class TestBase {
	
	public  WebDriver driver;
    protected AmazonHomePage homePageObject;
	protected ItemsScreen itemScreenObject;
	protected ProductDetails productDetailsObject;
	protected CardDetails cardDetailsObject;
	private String amazonURL=Loadproperties.userData.getProperty("amazonURL");
	private String ksrtcURL=Loadproperties.userData.getProperty("ksrtcURL");
	static String url;
	
	 /*@DataProvider(name = "url")
	    public Object[][] dataProviderMethod() {
	        return new Object[][] { { amazonURL }, { ksrtcURL } };
	    }*/
	
	@BeforeTest
	//@Parameters({"url"})
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		driver=new ChromeDriver();
		
	
		driver.get(amazonURL);
	
		driver.manage().window().setSize(new Dimension(1024, 768));
		
		//homePageObject=new AmazonHomePage(driver);
		//itemScreenObject=new ItemsScreen(driver);
		//productDetailsObject=new ProductDetails(driver);
		//cardDetailsObject=new CardDetails(driver);
		
	}
	
	@BeforeTest
	public void intalizeClassesObject() {
		homePageObject=new AmazonHomePage(driver);
		itemScreenObject=new ItemsScreen(driver);
		productDetailsObject=new ProductDetails(driver);
		cardDetailsObject=new CardDetails(driver);
	}
	
	/*@AfterTest
	public void closeBrowser() {
		driver.quit();
	}*/
	
	
	/*public static void main(String arg[]) {
		TestBase testBase=new TestBase();
		testBase.launchBrowser();
		//testBase.closeBrowser();
		
	}*/

}
