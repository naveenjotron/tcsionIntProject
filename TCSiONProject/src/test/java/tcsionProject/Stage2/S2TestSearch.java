package tcsionProject.Stage2;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import net.phptravels.Constants.AutomationConstants;
import net.phptravels.Stage2.S2Search;
import tcsionProject.Scripts.TestBase;

public class S2TestSearch extends TestBase {
	S2Search objSearch;
	
	@Test(priority = 14)
	public void search() throws InterruptedException {
		objSearch= new S2Search(driver);
		objSearch.setSearchField();
		objSearch.setSearchText("Dubai");
		Thread.sleep(2000);
		objSearch.setSearchSel();
		objSearch.setSearchBtn();
		String actTitle= driver.getTitle();
		String expTitle= AutomationConstants.HomeSearchPageTitle;
		Assert.assertEquals(actTitle, expTitle);
		
	}
//	@Test(priority = 15)
//	public void endTest() throws InterruptedException {
//		Thread.sleep(3000);
//		driver.close();
//	}
}
