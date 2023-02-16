package testcases;

import org.testng.annotations.Test;

import baseclass.TestBase;
import pageObject.TestingAzureIntegration;

public class IntegrationTC extends TestBase {

	@Test
	public void login() {
		TestingAzureIntegration tc = new TestingAzureIntegration();
		tc.setUsername().sendKeys("SayaliV");
		tc.setPassword().sendKeys("abcd123");
		tc.signInBtn().click();
	}
}
