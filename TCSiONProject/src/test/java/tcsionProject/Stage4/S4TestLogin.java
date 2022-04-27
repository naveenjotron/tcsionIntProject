package tcsionProject.Stage4;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import net.phptravels.Constants.AutomationConstants;
import net.phptravels.Stage4.S4LoginPage;
import tcsionProject.Scripts.ExcelUtility;
import tcsionProject.Scripts.TestBase;

public class S4TestLogin extends TestBase {
	
S4LoginPage objlogin;

@Test(priority=0)
public void loginPage() throws InterruptedException {
	objlogin = new S4LoginPage(driver);
	objlogin.setAdminLoginBtn();
	objlogin.setSwitchTab();
}
	

	@Test(priority=1, enabled=false)
	public void invalidLoginTC001() throws IOException, InterruptedException {
		 //Create Login Page object
	    objlogin = new S4LoginPage(driver);
//	    driver.navigate().refresh();
	    //login to application
	    String usrname= ExcelUtility.getStage4CellData(1, 1);
	    String psswrd=ExcelUtility.getStage4CellData(1, 2);
	    objlogin.setUserName(usrname);
	    objlogin.setPassword(psswrd);
	    objlogin.clickLogin();
	    Thread.sleep(3000);
	    String ActualTittle = driver.getTitle();
	    System.out.println(ActualTittle);
	    String expTittle = AutomationConstants.adminLOGINPAGETITLE;
	    Assert.assertEquals(ActualTittle, expTittle);
	   
	}

	@Test(priority=2,enabled=false)
	public void invalidLoginTC002() throws IOException, InterruptedException {
		 //Create Login Page object
	    objlogin = new S4LoginPage(driver);
	    driver.navigate().refresh();
	    //login to application
	    String usrname= ExcelUtility.getStage4CellData(2, 1);
	    String psswrd=ExcelUtility.getStage4CellData(2, 2);
	    objlogin.setUserName(usrname);
	    objlogin.setPassword(psswrd);
	    objlogin.clickLogin();
	    Thread.sleep(3000);
	    String ActualTittle = driver.getTitle();
	    System.out.println(ActualTittle);
	    String expTittle = AutomationConstants.adminLOGINPAGETITLE;
	    Assert.assertEquals(ActualTittle, expTittle);
	}
	
	@Test(priority=3,enabled=false)
	public void invalidLoginTC003() throws IOException, InterruptedException {
		 //Create Login Page object
	    objlogin = new S4LoginPage(driver);
	    driver.navigate().refresh();
	    //login to application
	    String usrname= ExcelUtility.getStage4CellData(3, 1);
	    String psswrd=ExcelUtility.getStage4CellData(3, 2);
	    objlogin.setUserName(usrname);
	    objlogin.setPassword(psswrd);
	    objlogin.clickLogin();
	    Thread.sleep(3000);
	    String ActualTittle = driver.getTitle();
	    System.out.println(ActualTittle);
	    String expTittle = AutomationConstants.adminLOGINPAGETITLE;
	    Assert.assertEquals(ActualTittle, expTittle);
	}
	
	@Test(priority=4)
	public void validLoginTC004() throws IOException, InterruptedException {
		 //Create Login Page object
	    objlogin = new S4LoginPage(driver);
	    driver.navigate().refresh();
	    //login to application
	    String usrname= ExcelUtility.getStage4CellData(4, 1);
	    String psswrd=ExcelUtility.getStage4CellData(4, 2);
	    objlogin.setUserName(usrname);
	    objlogin.setPassword(psswrd);
	    objlogin.clickLogin();
	    Thread.sleep(5000);
	    String ActualTittle = driver.getTitle();
	    System.out.println(ActualTittle);
	    String expTittle = AutomationConstants.adminDASHBOARDPAGETITLE;
	    Assert.assertEquals(ActualTittle, expTittle);
	    System.out.println("***Login Successful***");
	}

}
