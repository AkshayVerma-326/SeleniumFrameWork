package dataProviders;

import org.testng.annotations.DataProvider;

public class CustomDataProvider {

	@DataProvider(name = "Login")
	public static Object[][] getData() {
		System.out.println("LOG:INFO- Loading test Data from data Provider");
		return ExcelUtility.getDataFromExcel("Login");
	}
	
	@DataProvider(name = "AccountUser")
	public static Object[][] getDataFromAccount() {
		System.out.println("LOG:INFO- Loading test Data from data Provider");
		return ExcelUtility.getDataFromExcel("account");
	}

}
