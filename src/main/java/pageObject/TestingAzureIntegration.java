package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.TestBase;

public class TestingAzureIntegration extends TestBase {

	public TestingAzureIntegration() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "email")
	private WebElement username;

	public WebElement setUsername() {
		return username;
	}

	@FindBy(id = "password")
	private WebElement pwd;

	public WebElement setPassword() {
		return pwd;
	}

	@FindBy(xpath = "//button[text()='SIGN IN']")
	private WebElement signin;

	public WebElement signInBtn() {
		return signin;
	}
}
