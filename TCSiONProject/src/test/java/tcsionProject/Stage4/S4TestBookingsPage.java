package tcsionProject.Stage4;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import net.phptravels.Constants.AutomationConstants;
import net.phptravels.Stage4.S4BookingsPage;
import tcsionProject.Scripts.TestBase;

public class S4TestBookingsPage extends TestBase {
	
S4BookingsPage objBook;

@Test(priority=5)
public void dashboardTS002() {
	objBook= new S4BookingsPage(driver);
	objBook.setdashboardBtn();
	String overview=objBook.setsalesOverviewText();
	System.out.println(overview);
	
	boolean chart=objBook.setRevenueBreakChart();
	System.out.println(chart);
	Assert.assertEquals(chart, true);
}
@Test(priority = 6)
public void FliVisaTourTS005() {
	objBook= new S4BookingsPage(driver);
	objBook.setToursManin();
	objBook.setToursSub();
	objBook.setManageTours();
	WebElement heading= driver.findElement(By.cssSelector(".lead > small"));
	String headingText=heading.getText();
	String expHeading=AutomationConstants.supplierManageTourHeading;
	Assert.assertEquals(headingText, expHeading);
    System.out.println("***Tours Page is visible***");
    
    
}
}
