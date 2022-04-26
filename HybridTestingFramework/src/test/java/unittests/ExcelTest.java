package unittests;

import org.testng.Assert;
import org.testng.annotations.Test;

import dataProviders.ExcelUtility;

public class ExcelTest {
	
	@Test
	public void testExcel()
	{
		
		Assert.assertNotNull(ExcelUtility.getDataFromExcel("Login"));
	}

}
