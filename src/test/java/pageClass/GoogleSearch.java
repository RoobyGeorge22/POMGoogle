package pageClass;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import BaseClass.GoogleBase;

public class GoogleSearch extends GoogleBase {

	public GoogleSearch(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//textarea[@name='q']")
	private WebElement searchBtn;

	public WebElement getsearchBtn() {
		return searchBtn;
	}

	@FindBy(xpath = "//input[@name='btnK']")
	private WebElement clickBtn;

	public WebElement getclickBtn() {
		return clickBtn;
	}

	@FindBy(xpath = "//h3[contains(text(),'Facebook - log in or sign up')]")
	private WebElement fbLink;

	public WebElement getfbLink() {
		return fbLink;
	}

	public void search() {
		pass(searchBtn, "facebook");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Actions action = new Actions(driver);
		action.keyDown(Keys.DOWN);
		action.click();
	}
}
