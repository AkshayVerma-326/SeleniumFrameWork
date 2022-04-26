package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utility.Utility;

public class LoginPage 
{
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By username=By.id("txtUsername");
	
	By password=By.name("txtPassword");
	
	By loginButton=By.xpath("//input[@id='btnLogin']");
	
	
	public Dashboard loginValidUser(String uname,String pass)
	{
		Utility.type(driver,username,uname);
		Utility.type(driver,password,pass);
		Utility.click(driver, loginButton);
//		driver.findElement(username).sendKeys(uname);
//		driver.findElement(password).sendKeys(pass);
//		driver.findElement(loginButton).click();
		
		return new Dashboard(driver);
	}
	
	
	
	public String getURLAfterLogin()
	{
		return driver.getCurrentUrl();
	}
	

}
