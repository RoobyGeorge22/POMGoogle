package BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleBase {

	protected WebDriver driver;

	// Setup browser
	public WebDriver initializeDriver() {
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		return driver;
	}

	// Click the WebElement
	public void clickBtn(WebElement element) {
		element.click();
	}

	// Pass value to Web element
	public void pass(WebElement element, String value) {
		element.sendKeys(value);
	}

	// Close the browser
	public void quitBrowser() {
		driver.quit();
	}
}
