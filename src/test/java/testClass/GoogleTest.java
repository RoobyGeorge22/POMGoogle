package testClass;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import BaseClass.GoogleBase;
import pageClass.FacebookLogin;
import pageClass.GoogleSearch;

public class GoogleTest extends GoogleBase {


	GoogleSearch gsearch;
	FacebookLogin fbLog;

	@BeforeTest
	public void homepage() {
		initializeDriver();
		gsearch = new GoogleSearch(driver);
		fbLog = new FacebookLogin(driver);
	}

	@Test
	public void googlesearch() {
		gsearch.search();
//		fbLog.fbLogin();
//		fbLog.verifyTitle();
	}
}
