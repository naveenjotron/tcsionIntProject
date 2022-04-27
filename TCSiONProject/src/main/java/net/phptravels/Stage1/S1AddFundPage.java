package net.phptravels.Stage1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class S1AddFundPage {
	
	WebDriver driver;
	
	@FindBy(css="li.user_wallet > a")
	private WebElement AddFund;
	@FindBy(css="div.col-md-4:nth-child(4) > div:nth-child(1) > label")
	private WebElement PaypalRdBtn;
	@FindBy(css="input.form-control:nth-child(2)")
	private WebElement Amount;
	@FindBy(css="button.btn:nth-child(3)")
	private WebElement PayNowBtn;
	
	
	
public S1AddFundPage(WebDriver driver){
	this.driver = driver;
		//This initElements method will create all WebElements
	PageFactory.initElements(driver, this);
		    }

	public void setAddFund() {
		AddFund.click();
	}
	public void setPaypalRdBtn() {
		PaypalRdBtn.click();
	}
	public void setAmount() {
		Amount.clear();
		Amount.sendKeys("50");
	}
	public void setPayNowBtn() {
		PayNowBtn.click();
	}
	public void setCancelPay() throws InterruptedException {
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().back();
//		return new S1MyProfilePage(driver);
	}
}
