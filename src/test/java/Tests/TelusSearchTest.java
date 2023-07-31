package test.java.Tests;


import org.testng.annotations.Test;

import main.java.Page.SearchPage;
import main.java.Utils.helper.Helper;


public class TelusSearchTest extends TestBase{
	
	@Test()
	public void searchTelusTest() throws Exception {
		SearchPage page = new SearchPage();
	
		
		Helper.log("I search for Internet");
		page.searchField("internet","Internet Troubleshooting");
		
		Helper.log("I verify more than 6 results");
		page.verifyResultCount(6);
		
		Helper.log("I verify links");
		page.verifyLinks(6);
		
		Helper.log("I select appropriate link");
		page.selectResult("Boost Wifi issues");
		
	}

}
