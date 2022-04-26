package utility;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility {
	
	
	/*
	 * JSExecutor
	 * Select
	 * Alert
	 * Scrolling
	 * handle windows
	 * getText
	 * Frame
	 * 
	 */
	
	public static String getText(WebDriver driver,By locator)
	{
	return waitForWebElement(driver,locator).getText();
	
	}
	
	public static void sleep(int seconds)
	{
		try {
			Thread.sleep(seconds*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static String getScreenshotInBase64(WebDriver driver) {
		TakesScreenshot ts = (TakesScreenshot) driver;
		return ts.getScreenshotAs(OutputType.BASE64);

	}

	public static WebElement waitForWebElement(WebDriver driver, By locator) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		return wait.until(ExpectedConditions.elementToBeClickable(locator));

	}
	
	public static void click(WebDriver driver, By locator)
	{
		waitForWebElement(driver,locator).click();
	}
	
	public static void type(WebDriver driver, By locator,String textToType)
	{
		waitForWebElement(driver,locator).sendKeys(textToType);
	}
	
	public static void switchToFrame(WebDriver driver,String nameOrId)
	{
		new WebDriverWait(driver,Duration.ofSeconds(30)).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(nameOrId));
	}
	
	public static void switchToFrame(WebDriver driver,String nameOrId,int time)
	{
		new WebDriverWait(driver,Duration.ofSeconds(time)).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(nameOrId));
	}
	
	public static void switchToFrame(WebDriver driver,int index)
	{
		new WebDriverWait(driver,Duration.ofSeconds(30)).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(index));
	}

	public static void switchToFrame(WebDriver driver,WebElement element)
	{
		new WebDriverWait(driver,Duration.ofSeconds(30)).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(element));
	}
	
	public static void switchToFrame(WebDriver driver,By locator)
	{
		new WebDriverWait(driver,Duration.ofSeconds(30)).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(locator));
	}
	
	public static void acceptAlert(WebDriver driver)
	{
		new WebDriverWait(driver,Duration.ofSeconds(30)).until(ExpectedConditions.alertIsPresent()).accept();
	}
	
	public static void dismissAlert(WebDriver driver)
	{
		new WebDriverWait(driver,Duration.ofSeconds(30)).until(ExpectedConditions.alertIsPresent()).dismiss();
	}
	
	public static void getAlertText(WebDriver driver)
	{
		new WebDriverWait(driver,Duration.ofSeconds(30)).until(ExpectedConditions.alertIsPresent()).getText();
	}
	
	public static void getAlertText(WebDriver driver,int time)
	{
		new WebDriverWait(driver,Duration.ofSeconds(time)).until(ExpectedConditions.alertIsPresent()).getText();
	}
}
