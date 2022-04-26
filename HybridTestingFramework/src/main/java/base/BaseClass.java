package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import dataProviders.ConfigUtility;
import factory.BrowserFactory;

public class BaseClass {
	
	public WebDriver driver;
	
	public WebDriver getDriver()
	{
		return driver;
	}
	
	
	//use with passing parameters in cmd
	//example command: mvn test -DXMLFIle=testng.xml -DBrowser=chrome -DURL=http://opensource-demo.orangehrmlive.com/
	@Parameters({"Browser","URL"})
	@BeforeClass
	public void setup(String BrowserName,String appUrl)
	{
		System.out.println("LOG: INFO- Starting Browser");
		driver=BrowserFactory.startBrowser(BrowserName,appUrl);
		System.out.println("LOG: INFO- Browser Started");
	}
	
	
	
//	@BeforeClass
//	public void setup()
//	{
//		System.out.println("LOG: INFO- Starting Browser");
//		String Browser=ConfigUtility.getproperty("browser");
//		String Url=ConfigUtility.getproperty("appUrl");
//		driver=BrowserFactory.startBrowser(Browser,Url);
//		System.out.println("LOG: INFO- Browser Started");
//	}
	
	@AfterClass
	public void tearDown()
	{
		System.out.println("LOG:INFO- Closing Browser");
		driver.quit();
		System.out.println("LOG:INFO- Session Closed");
	}
	
	

}
