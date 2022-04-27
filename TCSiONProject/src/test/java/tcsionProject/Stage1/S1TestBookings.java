package tcsionProject.Stage1;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import net.phptravels.Stage1.S1BookingsPage;
import net.phptravels.Stage1.S1LoginPage;
import tcsionProject.Scripts.TestBase;

public class S1TestBookings extends TestBase {
	
	S1BookingsPage objbookings;
	S1TestLogin login;
	
	@Test(priority=5)
	public void bookingsPage() {
		objbookings = new S1BookingsPage(driver);
		objbookings.setBookinsBtn();
		objbookings.setVewVouchrBtn();
		objbookings.setVouchrConfirm();
		
	}

}
