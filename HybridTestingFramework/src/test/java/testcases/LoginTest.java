package testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseClass;
import dataProviders.CustomDataProvider;
import pages.Dashboard;
import pages.LoginPage;

public class LoginTest extends BaseClass {
	public WebDriver driver;

	@BeforeMethod
	public void setupDriver() {
		driver=getDriver();
	}

	@Test(dataProvider = "Login", dataProviderClass=CustomDataProvider.class,priority=1)
	public void loginTest(String username, String password) {
		LoginPage login = new LoginPage(driver);
		login.loginValidUser(username, password);
		Assert.assertTrue(login.getURLAfterLogin().contains("dashboard"));
		
	}
	
	@Test(dataProvider="AccountUser",dataProviderClass=CustomDataProvider.class,priority=2)
	public void createAccount(String empName,String uname,String password)
	{
		Dashboard dashboard=new Dashboard(driver);
		String textToValidate=dashboard.createAccount(empName, uname, password);
		Assert.assertTrue(textToValidate.contains("Successfully"));
		
	}

}
