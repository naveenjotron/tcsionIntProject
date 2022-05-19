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
	System.out.println("Chart Visible: "+ chart);
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
@Test(priority = 7)
public void BookingsTS004() throws InterruptedException {
	objBook= new S4BookingsPage(driver);
	objBook.setBookingsBtn();
	Thread.sleep(2000);
	String actTitle = driver.getTitle();
	System.out.println(actTitle);
	String expTitle = AutomationConstants.SupplierBookingsTitle;
	Assert.assertEquals(actTitle, expTitle);
}
}
