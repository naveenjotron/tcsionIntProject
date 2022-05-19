package tcsionProject.Stage1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import net.phptravels.Constants.AutomationConstants;
import net.phptravels.Stage1.S1LoginPage;
import tcsionProject.Scripts.ExcelUtility;
import tcsionProject.Scripts.TestBase;

public class S1TestLogin extends TestBase {
	
	S1LoginPage objlogin;
	@Test(priority=0)
	public void loginPage() throws InterruptedException {
		objlogin = new S1LoginPage(driver);
		objlogin.setCusFrntEndBtn();
		objlogin.setSwitchTab();
		Thread.sleep(3000);
		driver.findElement(By.id("cookie_stop")).click();
	}

	@Test(priority=1, enabled=true)
	public void invalidLoginTC001() throws IOException, InterruptedException {
		 //Create Login Page object
	    objlogin = new S1LoginPage(driver);
//	    driver.navigate().refresh();
	    //login to application
	    String usrname= ExcelUtility.getStage1CellData(1, 1);
	    String psswrd=ExcelUtility.getStage1CellData(1, 2);
	    objlogin.setUserName(usrname);
	    objlogin.setPassword(psswrd);
	    objlogin.clickLogin();
	    Thread.sleep(3000);
	    String ActualTittle = driver.getTitle();
	    System.out.println(ActualTittle);
	    String expTittle = AutomationConstants.LOGINPAGETITLE;
	    Assert.assertEquals(ActualTittle, expTittle);
	   
	}

	@Test(priority=2,enabled=true)
	public void invalidLoginTC002() throws IOException, InterruptedException {
		 //Create Login Page object
	    objlogin = new S1LoginPage(driver);
	    driver.navigate().refresh();
	    //login to application
	    String usrname= ExcelUtility.getStage1CellData(2, 1);
	    String psswrd=ExcelUtility.getStage1CellData(2, 2);
	    objlogin.setUserName(usrname);
	    objlogin.setPassword(psswrd);
	    objlogin.clickLogin();
	    Thread.sleep(3000);
	    String ActualTittle = driver.getTitle();
	    System.out.println(ActualTittle);
	    String expTittle = AutomationConstants.LOGINPAGETITLE;
	    Assert.assertEquals(ActualTittle, expTittle);
	}
	
	@Test(priority=3,enabled=true)
	public void invalidLoginTC003() throws IOException, InterruptedException {
		 //Create Login Page object
	    objlogin = new S1LoginPage(driver);
	    driver.navigate().refresh();
	    //login to application
	    String usrname= ExcelUtility.getStage1CellData(3, 1);
	    String psswrd=ExcelUtility.getStage1CellData(3, 2);
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
	    objlogin = new S1LoginPage(driver);
	    driver.navigate().refresh();
	    //login to application
	    String usrname= ExcelUtility.getStage1CellData(4, 1);
	    String psswrd=ExcelUtility.getStage1CellData(4, 2);
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
