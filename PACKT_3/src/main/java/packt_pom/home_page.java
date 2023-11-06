package packt_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class home_page {

	public WebDriver driver;

	@FindBy(xpath = "//a[@class='navbar-brand']")
	public WebElement homebutton;

	@FindBy(xpath = "//a[(@data-rb-event-key='https://subscription.packtpub.com/search') and (@class='nav-link')]")
	public WebElement browserlibrary;

	@FindBy(xpath = "//button[@class='button--more-info btn btn-primary advanced-search-button']")
	public WebElement advancesearch;

	@FindBy(xpath = "//input[@class='mr-sm-2 form-control']")
	public WebElement searchfield;

	@FindBy(xpath = "//a[@id='library-dropdown']")
	public WebElement librarydropdown;

	@FindBy(xpath = "//a[@id='recent-dropdown']")
	public WebElement resentdropdown;

	@FindBy(xpath = "//div[@class='btn-content']")
	public WebElement cartbutton;

	@FindBy(xpath = "style-1 d-none d-lg-inline nav-link")
	public WebElement signoutbutton;

	@FindBy(xpath = "//a[@class='button']")
	public WebElement startfreetrail;

	@FindBy(xpath = "//a[@class='readNowButton btn-lg btn-block']")
	public WebElement readnowbutton;

	@FindBy(xpath = "//button[@type='button']")
	public WebElement fullnavbar;

// method creation 

	public void clkonhomebutton() {
		homebutton.click();
	}

	public void clkonbrowserlibrary() {
		browserlibrary.click();
	}

	public void clkonadvancesearch() {
		advancesearch.click();
	}

	public void clkonsearchfield() {
		searchfield.click();
	}

	public void clkonlibrarydropdown() {
		librarydropdown.click();
	}

	public void clkonresentdropdown() {
		resentdropdown.click();
	}

	public void clkoncartbutton() {
		cartbutton.click();
	}

	public void clkonsignoutbutton() {
		signoutbutton.click();
	}

	public void clkonstartfreetrail() {
		startfreetrail.click();
	}

	public void clkonreadnowbutton() {
		readnowbutton.click();
	}

}