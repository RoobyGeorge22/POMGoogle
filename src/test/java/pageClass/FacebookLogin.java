package pageClass;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.GoogleBase;

public class FacebookLogin extends GoogleBase {

	public FacebookLogin(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='email']")
	private WebElement userName;

	public WebElement getuserName() {
		return userName;
	}

	@FindBy(xpath = "//input[@id='pass']")
	private WebElement password;

	public WebElement getpassword() {
		return password;
	}

	@FindBy(xpath = "//button[@name='login']")
	private WebElement logBtn;

	public WebElement getlogBtn() {
		return logBtn;
	}

	public void fbLogin() {
		pass(userName, "RoobyGeorge");
		pass(password, "ruy149622");
		clickBtn(logBtn);

	}

	public void verifyTitle() {
		String actualTitle = driver.getTitle();
		String expectedTitle = "Log in to Facebook";
		Assert.assertEquals(actualTitle, expectedTitle);
	}
}
