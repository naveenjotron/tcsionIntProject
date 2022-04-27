package net.phptravels.Stage2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class S2LandingPage {
	
	WebDriver driver;

	@FindBy(css=".main-menu-content > nav:nth-child(1) > ul:nth-child(1) > li:nth-child(1) > a:nth-child(1)")
	private WebElement home;
	@FindBy(css=".main-menu-content > nav:nth-child(1) > ul:nth-child(1) > li:nth-child(2) > a:nth-child(1)")
	private WebElement hotels;
	@FindBy(css=".main-menu-content > nav:nth-child(1) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)")
	private WebElement flights;
	@FindBy(css=".main-menu-content > nav:nth-child(1) > ul:nth-child(1) > li:nth-child(4) > a:nth-child(1)")
	private WebElement tours;
	@FindBy(css=".main-menu-content > nav:nth-child(1) > ul:nth-child(1) > li:nth-child(5) > a:nth-child(1)")
	private WebElement visa;
	@FindBy(css=".main-menu-content > nav:nth-child(1) > ul:nth-child(1) > li:nth-child(6) > a:nth-child(1)")
	private WebElement blog;
	@FindBy(css=".main-menu-content > nav:nth-child(1) > ul:nth-child(1) > li:nth-child(7) > a:nth-child(1)")
	private WebElement offers;
	@FindBy(css="li.footm:nth-child(8) > a:nth-child(1)")
	private WebElement company;
	@FindBy(id="currency")
	private WebElement usd;
	@FindBy(css="ul.show > li:nth-child(7) > a")
	private WebElement Inr;
	
	  public S2LandingPage(WebDriver driver){
	        this.driver = driver;
	        //This initElements method will create all WebElements
	        PageFactory.initElements(driver, this);
	    }
	  
	  public void clickHome() {
		  home.click();
	  }
	  public void clickHotels() {
		  hotels.click();
	  }
	  public void clickFlights() {
		  flights.click();
	  }
	  public void clickTours() {
		  tours.click();
	  }
	  public void clickVisa() {
		  visa.click();
	  }
	  public void clickBlog() {
		  blog.click();
	  }
	  public void clickOffers() {
		  offers.click();
	  }
	  public void clickCompany() {
		  company.click();
	  }
	  public void clickUsd() {
		  usd.click();
	  }
	  public void clickInr() {
		  Inr.click();
	  }
}
