package tcsionProject.Stage1;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import net.phptravels.Constants.AutomationConstants;
import net.phptravels.Stage1.S1BookingsPage;
import net.phptravels.Stage1.S1LoginPage;
import tcsionProject.Scripts.TestBase;

public class S1TestBookings extends TestBase {
	
	S1BookingsPage objbookings;
	S1TestLogin login;
	
	@Test(priority=5)
	public void bookingsPage() throws InterruptedException {
		objbookings = new S1BookingsPage(driver);
		objbookings.setBookinsBtn();
		objbookings.setVewVouchrBtn();
		
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		 driver.switchTo().window(tabs.get(1));
		 Thread.sleep(3000);
		 String Customer=objbookings.setVouchrConfirm();
		 System.out.println(Customer);
		 boolean c=Customer.contains("user@phptravels.com");
		 System.out.println("***Is customer data contains email id :"+ c);
		 driver.switchTo().window(tabs.get(0));
//		objbookings.setVouchrConfirm();
		 	
		    
		    Assert.assertEquals(c, true);
		
	}

}
