package main.java.Page;

import org.openqa.selenium.By;

import main.java.Utils.helper.Helper;
import main.java.Utils.helper.PageHelper;

public class SearchPage {
    
	/**
	 * Elements
	 */
	
    By searchButton = By.id("search-button");
    By searchField = By.cssSelector("[placeholder*='Search']");
    By searchOptions = By.cssSelector("[data-test='searchResultItem'] [display='inline-block']");
    By searchResults = By.cssSelector("[class*='ListItem'] [class*='Heading']");

    
    /**
     * Actions
     */
    public void searchField(String value, String searchOption) {
    	PageHelper.JsClick(searchButton);
    	Helper.setField(value, searchField);
    	Helper.selectDropDownContains(searchOption, searchOptions);	
    }
    
    public void verifyResultCount(int count) {
    	Helper.verifyElementlistCount(searchResults, count);
    }
    
    public void verifyLinks(int count) {
    	Helper.verifyLinkByPartialText(searchResults, count);
    }
    
    public void selectResult(String value) {
    	Helper.selectDropDownContains(value, searchResults);
    }
    
 

}
