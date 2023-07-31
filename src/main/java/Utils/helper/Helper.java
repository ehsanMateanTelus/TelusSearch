package main.java.Utils.helper;

import org.openqa.selenium.By;

public class Helper {

	
	public static void getUrl(String url) {
		PageHelper.getUrl(url);
	}

		
	public static void setField(String value, By byValue) {
		PageHelper.setField(value, byValue);
	}

	public static void clickElement(By byValue) {
		PageHelper.clickElement(byValue);
	}

	public static void selectDropDownContains(String value, By byValue) {
		PageHelper.selectDropDownContains(value, byValue);
	}
	
	public static void verifyElementlistCount(By byValue, int count) {
		PageHelper.verifyElementlistCount(byValue, count);
	}
	
	public static void verifyLinkByPartialText(By byValue, int count) {
		PageHelper.verifyLinkByPartialText(byValue, count);
	}

	
	public static boolean waitForElementToLoad(final By target, int time, int count) {
		return WaitHelper.waitForElementToLoad(target, time, count);
	}

	public static void log(String value) {
		PageHelper.log(value);
	}



}
