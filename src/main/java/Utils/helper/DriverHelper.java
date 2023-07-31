package main.java.Utils.helper;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import test.java.Tests.TestBase;

public class DriverHelper {

	public static void setupChromeDriverHeadless() {
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--no-sandbox");
		options.addArguments("--disable-dev-shm-usage");
		options.addArguments("--headless");
	    options.addArguments("--start-fullscreen");

	    TestBase.Driver = new ChromeDriver(options);
	}
	
	public static void setupFirefoxHeadless() {
		WebDriverManager.firefoxdriver().setup();
		
		FirefoxOptions options = new FirefoxOptions();
		options.addArguments("--no-sandbox");
		options.addArguments("--disable-dev-shm-usage");
		options.addArguments("--headless");
	    options.addArguments("--start-fullscreen");

	    TestBase.Driver = new FirefoxDriver(options);
	}
	
	public static void setupFirefox() {
		WebDriverManager.firefoxdriver().setup();
		
		FirefoxOptions options = new FirefoxOptions();
	    options.addArguments("--start-fullscreen");

	    TestBase.Driver = new FirefoxDriver(options);
	}
}
