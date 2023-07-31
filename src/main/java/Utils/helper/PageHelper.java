package main.java.Utils.helper;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import test.java.Tests.TestBase;

public class PageHelper {
	
	public static void getUrl(String url) {
		
		TestBase.Driver.get(url);
	}
	
	public static void setField(String value, By byValue) {
		WaitHelper.waitForElementToLoad(byValue, 60, 1);
	    WebElement element = TestBase.Driver.findElement(byValue);
        element.sendKeys(value);
	}
	
	public static void clickElement(By byValue) {
		 WaitHelper.waitForElementToLoad(byValue, 60, 1);
		 WebElement element = TestBase.Driver.findElement(byValue);
	     element.click();
	}
	

	
	public static void selectDropDownContains(String value, By byValue) {
		WaitHelper.waitForElementToLoad(byValue, 60, 1);
		List<WebElement> options = TestBase.Driver.findElements(byValue);
		for (WebElement option : options) {
		    if (option.getText().contains(value)) {
		        option.click();
		        break;
		    }
		}
	}
	
	
	public static void verifyElementlistCount(By byValue, int count) {
		WaitHelper.waitForElementToLoad(byValue, 60, count);
		List<WebElement> elements = TestBase.Driver.findElements(byValue);
		Assert.assertTrue(elements.size()>count, "element count less than specified");
		
	}
	
	public static void verifyLinkByPartialText(By byValue, int count) {
		WaitHelper.waitForElementToLoad(byValue, 60, count);
		List<WebElement> elements = TestBase.Driver.findElements(byValue);
		
		for (WebElement element : elements) {
			String text = element.getText();
			Helper.log("I verify link text: " + text);
			Boolean isLinkDisplayed = TestBase.Driver.findElement(By.partialLinkText(text)).isDisplayed();

			Assert.assertTrue(isLinkDisplayed, "link is not displayed");

			
		}
	}
	
	public static void log(String value) {
		System.out.println(value);
	}
}
