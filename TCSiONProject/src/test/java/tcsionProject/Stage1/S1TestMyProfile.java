package tcsionProject.Stage1;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import net.phptravels.Constants.AutomationConstants;
import net.phptravels.Stage1.S1MyProfilePage;
import tcsionProject.Scripts.ExcelUtility;
import tcsionProject.Scripts.TestBase;

public class S1TestMyProfile extends TestBase {
	S1MyProfilePage objprof;
	
	@Test(priority=7)
	public void Myprofile() throws IOException, InterruptedException {
		objprof= new S1MyProfilePage(driver);
		objprof.setMyProfileBtn();
		Thread.sleep(3000);
		
		String address1= ExcelUtility.getStage1CellData(8, 0);
		String address2= ExcelUtility.getStage1CellData(8, 1);
		String zip= ExcelUtility.getStage1CellData(8, 2);
		String city= ExcelUtility.getStage1CellData(8, 3);
		String state= ExcelUtility.getStage1CellData(8, 4);
		
//		objprof.setMyProfileBtn();
		
		objprof.setState(state);
		objprof.setCity(city);
		Thread.sleep(1000);
		objprof.setZip(zip);
		Thread.sleep(1000);
		objprof.setAdres1(address1);
		objprof.setAdres2(address2);
		objprof.setUpdProf();
		
	}
	
	@Test(priority=8)
	public void Logout() throws InterruptedException {
		objprof= new S1MyProfilePage(driver);
		objprof.setLogoutBtn();
		Thread.sleep(3000);
	    String ActualTittle = driver.getTitle();
	    System.out.println(ActualTittle);
	    String expTittle = AutomationConstants.LOGINPAGETITLE;
	    Assert.assertEquals(ActualTittle, expTittle);
	}
	
//	@AfterClass
//	public void endTest() throws InterruptedException {
//		Thread.sleep(3000);
//		driver.close();
//	}

}
