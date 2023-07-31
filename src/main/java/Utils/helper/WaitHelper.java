package main.java.Utils.helper;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import test.java.Tests.TestBase;


public class WaitHelper {
	



	public static boolean waitForElementToLoad(final By target, int time, int count) {
		if(TestBase.Driver == null) return false;
		
		ExpectedCondition<Boolean> condition = new ExpectedCondition<Boolean>() {
			@Override
			public Boolean apply(WebDriver driver) {
				
				return TestBase.Driver.findElements(target).size() >= count;
			}
		};

		return waitForCondition(condition, target, time);
	}
	
	public static boolean waitForCondition(ExpectedCondition<Boolean> condition, By target, int time) {
		if(TestBase.Driver == null) return false;
		
		Wait<WebDriver> wait = new WebDriverWait(TestBase.Driver, Duration.ofSeconds(time)).pollingEvery(Duration.ofMillis(5))
				.withTimeout(Duration.ofSeconds(time)).ignoring(Exception.class);

		try {
			wait.until(condition);
		} catch (Exception e) {
			if (time == 60 && target != null) {
				Assert.assertTrue(false, "element did not meet condition in allowed time (s)");
				e.printStackTrace();
			}
			return false;
		}
		return true;
	}
}
