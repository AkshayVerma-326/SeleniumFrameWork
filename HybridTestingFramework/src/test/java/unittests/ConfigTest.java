package unittests;

import org.testng.Assert;
import org.testng.annotations.Test;
import dataProviders.ConfigUtility;

public class ConfigTest {
	
	@Test
	public void getValue()
	{
		Assert.assertNotNull(ConfigUtility.getproperty("browser"));
	}

}
