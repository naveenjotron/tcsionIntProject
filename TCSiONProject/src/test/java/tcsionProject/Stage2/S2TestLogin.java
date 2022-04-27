package tcsionProject.Stage2;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import net.phptravels.Constants.AutomationConstants;
import net.phptravels.Stage1.S1LoginPage;
import net.phptravels.Stage2.S2LoginPage;
import tcsionProject.Scripts.ExcelUtility;
import tcsionProject.Scripts.TestBase;

public class S2TestLogin extends TestBase {
	
S2LoginPage objlogin;
@Test(priority=0)
public void loginPage() throws InterruptedException {
	objlogin = new S2LoginPage(driver);
	objlogin.setAgentLoginBtn();
	objlogin.setSwitchTab();
	Thread.sleep(3000);
	driver.findElement(By.id("cookie_stop")).click();
}
	

	@Test(priority=1, enabled=false)
	public void invalidLoginTC001() throws IOException, InterruptedException {
		 //Create Login Page object
	    objlogin = new S2LoginPage(driver);
//	    driver.navigate().refresh();
	    //login to application
	    String usrname= ExcelUtility.getStage2CellData(1, 1);
	    String psswrd=ExcelUtility.getStage2CellData(1, 2);
	    objlogin.setUserName(usrname);
	    objlogin.setPassword(psswrd);
	    objlogin.clickLogin();
	    Thread.sleep(3000);
	    String ActualTittle = driver.getTitle();
	    System.out.println(ActualTittle);
	    String expTittle = AutomationConstants.LOGINPAGETITLE;
	    Assert.assertEquals(ActualTittle, expTittle);
	   
	}

	@Test(priority=2,enabled=false)
	public void invalidLoginTC002() throws IOException, InterruptedException {
		 //Create Login Page object
	    objlogin = new S2LoginPage(driver);
	    driver.navigate().refresh();
	    //login to application
	    String usrname= ExcelUtility.getStage2CellData(2, 1);
	    String psswrd=ExcelUtility.getStage2CellData(2, 2);
	    objlogin.setUserName(usrname);
	    objlogin.setPassword(psswrd);
	    objlogin.clickLogin();
	    Thread.sleep(3000);
	    String ActualTittle = driver.getTitle();
	    System.out.println(ActualTittle);
	    String expTittle = AutomationConstants.LOGINPAGETITLE;
	    Assert.assertEquals(ActualTittle, expTittle);
	}
	
	@Test(priority=3,enabled=false)
	public void invalidLoginTC003() throws IOException, InterruptedException {
		 //Create Login Page object
	    objlogin = new S2LoginPage(driver);
	    driver.navigate().refresh();
	    //login to application
	    String usrname= ExcelUtility.getStage2CellData(3, 1);
	    String psswrd=ExcelUtility.getStage2CellData(3, 2);
	    objlogin.setUserName(usrname);
	    objlogin.setPassword(psswrd);
	    objlogin.clickLogin();
	    Thread.sleep(3000);
	    String ActualTittle = driver.getTitle();
	    System.out.println(ActualTittle);
	    String expTittle = AutomationConstants.LOGINPAGETITLE;
	    Assert.assertEquals(ActualTittle, expTittle);
	}
	
	@Test(priority=4)
	public void validLoginTC004() throws IOException, InterruptedException {
		 //Create Login Page object
	    objlogin = new S2LoginPage(driver);
	    driver.navigate().refresh();
	    //login to application
	    String usrname= ExcelUtility.getStage2CellData(4, 1);
	    String psswrd=ExcelUtility.getStage2CellData(4, 2);
	    objlogin.setUserName(usrname);
	    objlogin.setPassword(psswrd);
	    objlogin.clickLogin();
	    Thread.sleep(3000);
	    String ActualTittle = driver.getTitle();
	    System.out.println(ActualTittle);
	    String expTittle = AutomationConstants.DASHBOARDPAGETITLE;
	    Assert.assertEquals(ActualTittle, expTittle);
	    System.out.println("***Login Successful***");
	}

}
