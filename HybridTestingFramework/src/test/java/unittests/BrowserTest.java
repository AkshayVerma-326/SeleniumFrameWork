package unittests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import factory.BrowserFactory;

public class BrowserTest {
	@Test
	public void testBrowser()
	{
		WebDriver driver=BrowserFactory.startBrowser("chrome","http://www.google.com");
		Assert.assertNotNull(driver);
		driver.quit();
	}

}
