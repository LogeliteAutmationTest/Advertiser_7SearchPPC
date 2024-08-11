package Com.ADV7Search.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class PageFactoryAdminDashboardPage {

// #*************************************Login Page**************************************

	@FindBy(xpath = "//input[@id='default-01']")
	@CacheLookup
	WebElement Email;

	@FindBy(xpath = "//input[@id='password']")
	@CacheLookup
	WebElement Password;

	@FindBy(xpath = "//button[@type='submit']")
	@CacheLookup
	WebElement clickLoginButton;

//#********************************************PUB DashBoard Page**********************************

	@FindBy(xpath = "//span[normalize-space()='Publisher Dashboard']")
	@CacheLookup
	WebElement PUBDashboard;

	@FindBy(xpath = "//a[@class='dropdown-toggle btn btn-white btn-dim btn-outline-light']//span[contains(text(),'Today')]")
	@CacheLookup
	WebElement PUBToday;

	@FindBy(xpath = "//span[normalize-space()='7 Days']")
	@CacheLookup
	WebElement PUBSelect7Day;

	@FindBy(xpath = "//a[@class='dropdown-toggle btn btn-white btn-dim btn-outline-light']//span[contains(text(),'7 Days')]")
	@CacheLookup
	WebElement PUB7Day;

	@FindBy(xpath = "//a[@class='dropdown-toggle btn btn-white btn-dim btn-outline-light']//span[contains(text(),'15 Days')]")
	@CacheLookup
	WebElement PUB15Day;

	@FindBy(xpath = "//span[normalize-space()='15 Days']")
	@CacheLookup
	WebElement PUBSelect15Day;

	@FindBy(xpath = "//span[normalize-space()='30 Days']")
	@CacheLookup
	WebElement PUB30Day;

//#********************************************Notification Page**********************************	

	@FindBy(xpath = "//span[normalize-space()='Notifications']")
	@CacheLookup
	WebElement AdminNotification;

	@FindBy(xpath = "//input[@id='default-04']")
	@CacheLookup
	WebElement AdminNotificationSearch;

	@FindBy(xpath = "//input[@value='19-7-2024 - 24-7-2024']")
	@CacheLookup
	WebElement AdminNotificationDate;

	@FindBy(xpath = "//div[@aria-label='Choose Monday, July 1st, 2024']")
	@CacheLookup
	WebElement AdminNotificationDate7th;

	@FindBy(xpath = "//div[@aria-label='Choose Sunday, July 21st, 2024']")
	@CacheLookup
	WebElement AdminNotificationDate19th;

	@FindBy(xpath = "//span[normalize-space()='Search']")
	@CacheLookup
	WebElement AdminNotificationSearchButton;

// #*******************************************Login Page****************************************

	public void enterEmail() {
		Email.sendKeys("admin");
	}

	public void enterPassword() {
		Password.sendKeys("7Search@pass123");
	}
	// 7Search@passcom555

	public void clickLoginButton() {
		clickLoginButton.click();

	}

// #*******************************************PUB Dashboard Page****************************************

	public void PUBDashboard() {
		PUBDashboard.click();
	}

	public void PUBToday() {
		PUBToday.click();
	}

	public void PUB7Day() {
		PUB7Day.click();
	}

	public void PUBSelect7Day() {
		PUBSelect7Day.click();
	}

	public void PUB15Day() {
		PUB15Day.click();
	}

	public void PUBSelect15Day() {
		PUBSelect15Day.click();
	}

	public void PUB30Day() {
		PUB30Day.click();
	}

//#********************************************Notification Page**********************************	

	public void AdminNotification() {
		AdminNotification.click();
	}

	public void enterAdminNotificationSearch() {
		AdminNotificationSearch.sendKeys("ADV652E5165508A0");
	}

	public void AdminNotificationDate() {
		AdminNotificationDate.click();
	}

	public void AdminNotificationDate7th() {
		AdminNotificationDate7th.click();
	}

	public void AdminNotificationDate19th() {
		AdminNotificationDate19th.click();
	}

	public void AdminNotificationSearchButton() {
		AdminNotificationSearchButton.click();
	}

}
