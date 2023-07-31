package test.java.Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import main.java.Utils.helper.Helper;

public class TestBase {
	public static WebDriver Driver;

	@BeforeMethod(alwaysRun = true)
	public void beforeMethod() {

        WebDriverManager.firefoxdriver().proxy("http://198.161.14.25:8080").setup();

		WebDriverManager.firefoxdriver().setup();
		Driver = new FirefoxDriver();

		Helper.log("I navigate to telus.com");
		Helper.getUrl("https://www.telus.com");
	}

	@AfterMethod(alwaysRun = true)
	public void afterMethod() {

		Driver.quit();
	}

	@BeforeClass(alwaysRun = true)
	public void beforeClass() {
	}

	@AfterClass(alwaysRun = true)
	public void afterClass() {
	}

	@BeforeSuite(alwaysRun = true)
	public void beforeSuite() {

	}

	@AfterSuite(alwaysRun = true)
	public void afterSuite() {
	}
}
