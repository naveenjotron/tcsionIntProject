package net.phptravels.Stage2;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class S2LoginPage {
	
	/**
     * All WebElements are identified by @FindBy annotation
     */
    WebDriver driver;
    
    @FindBy(css="input[placeholder='Email']")
    private WebElement username;
    @FindBy(css="input[placeholder='Password']")
    private WebElement password;    
    @FindBy(css=".btn-lg")
    private WebElement login;
    
    //@FindBy(css=".error-message-container > h3:nth-child(1)")
   // private WebElement errorBanner;


 public S2LoginPage(WebDriver driver){
        this.driver = driver;
        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
    }
 
 @FindBy(xpath="/html/body/div[2]/main/section[1]/div/div/div[3]/div/div/div[2]/div/div/div[1]/div/a")
 private WebElement AgentLoginBtn;
 public void setAgentLoginBtn() {
	 AgentLoginBtn.click();
 }
 public void setSwitchTab() {
	 ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
	 driver.close();
	 driver.switchTo().window(tabs.get(1));
 }
//Set user name in textbox
 public void setUserName(String strUserName){
 	username.sendKeys(strUserName);     
 }

//Set password in password textbox
 public void setPassword(String strPassword){
    password.sendKeys(strPassword);
 }

public S2BookingsPage clickLogin() {
	login.click();
	return new S2BookingsPage(driver);
}

}
