package gridDemo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class SeleniumGridWithBrowserStack 
{
	@Test
	public void testOnAndroid() throws MalformedURLException
	{
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("device","Samsung Galaxy S21 Ultra");
		cap.setCapability("os_version","11.0");
		cap.setCapability("browserName","android");
		cap.setCapability("realMobile","true");
		
		//you will get the username, access key and the url from browserstack when we take subscription.
		URL url=new URL("https://\"+USERNAME+\":\"+AUTOMATE_KEY+\"@hub- cloud.browserstack.com/wd/hub");
		RemoteWebDriver driver=new RemoteWebDriver(url,cap);
		driver.get("http://google.com");
		driver.findElement(By.name("q")).sendKeys("Selenium grid browserstack");
		System.out.println("Titile is"+driver.getTitle());
		driver.quit();
	}
	

}
