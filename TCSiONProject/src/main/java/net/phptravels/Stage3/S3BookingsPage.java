package net.phptravels.Stage3;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class S3BookingsPage {
	WebDriver driver;
	
	public S3BookingsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css="li.nav-item:nth-child(2) > a")
	private WebElement bookingsBtn;
	public void setBookingsBtn() {
		bookingsBtn.click();
	}
	
	@FindBy(xpath="/html/body/div[2]/div[2]/main/div/div[1]/div[4]/a/div/div/div/div[1]/div[1]")
	private WebElement PaidBook;
	public String setPaidBookCount() {
		return PaidBook.getText();
	}
	public void setPaidBook() {
		PaidBook.click();
	}
	
	@FindBy(xpath="/html/body/div[2]/div[2]/main/div/div[1]/div[3]/a/div/div/div/div[1]/div[1]")
	private WebElement CancelledBook;
	public String setCancelledBookCount() {
		return CancelledBook.getText();
	}
	public void setCancelledBook() {
		CancelledBook.click();
	}
	
	@FindBy(xpath="/html/body/div[2]/div[2]/main/div/div[1]/div[2]/a/div/div/div/div[1]/div[1]")
	private WebElement pendingBookCount;
	public String setPendingBookCount() {
		return pendingBookCount.getText();
	}
	public void setPendingBook() {
		pendingBookCount.click();
	}
	
	@FindBy(xpath="/html/body/div[2]/div[2]/main/div/div[1]/div[1]/a/div/div/div/div[1]/div[1]")
	private WebElement ConfirmedBook;
	public String setConfirmBookCount() {
		return ConfirmedBook.getText();
	}
	public void setConfirmBook() {
		ConfirmedBook.sendKeys(Keys.RETURN);;
	}
	
	@FindBy(css="li.nav-item:nth-child(1) > a")
	private WebElement WebsiteLink;
	public void setWebsiteLink() {
		WebsiteLink.click();
	}
}
