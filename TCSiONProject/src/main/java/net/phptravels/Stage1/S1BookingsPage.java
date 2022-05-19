package net.phptravels.Stage1;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class S1BookingsPage {
	
	WebDriver driver;
	 
	@FindBy(xpath="/html/body/div[1]/div/div[3]/ul/li[2]/a")
	private WebElement bookingsBtn;
	@FindBy(css=".table > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(5) > div:nth-child(1) > a")
	private WebElement VewVouchrBtn;
	@FindBy(css="div.col-md-6:nth-child(1) > ul")
	private WebElement VouchrConfirm;
	
	
 public S1BookingsPage(WebDriver driver){
	 this.driver = driver;
	  //This initElements method will create all WebElements
	 PageFactory.initElements(driver, this);
	    }
 public void setBookinsBtn() {
	 bookingsBtn.click();
 }
 public void setVewVouchrBtn() {
	 VewVouchrBtn.click();
 }
 public String setVouchrConfirm() {
	 
	 return VouchrConfirm.getText();

 }

}
