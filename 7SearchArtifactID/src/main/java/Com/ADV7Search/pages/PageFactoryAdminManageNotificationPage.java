package Com.ADV7Search.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class PageFactoryAdminManageNotificationPage {

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

// #*********************************Manage Notifications Page********************************

	@FindBy(xpath = "//span[normalize-space()='User Notifications']")
	@CacheLookup
	WebElement AdminManageNotifications;

	@FindBy(xpath = "//input[@id='default-04']")
	@CacheLookup
	WebElement AdminManageNotificationsSearch;

	@FindBy(xpath = "//span[normalize-space()='By Notification Type']")
	@CacheLookup
	WebElement AdminManageNotificationsType;

	@FindBy(xpath = "//a[contains(@role,'menuitem')]//span[contains(text(),'Notifications')]")
	@CacheLookup
	WebElement AdminManageNotificationsTypeNotifications;

	@FindBy(xpath = "//span[normalize-space()='Offers']")
	@CacheLookup
	WebElement AdminManageNotificationsTypeOffers;

	@FindBy(xpath = "//span[normalize-space()='By User Type']")
	@CacheLookup
	WebElement AdminManageNotificationsByUser;

	@FindBy(xpath = "//a[contains(@role,'menuitem')]//span[contains(text(),'Advertiser')]")
	@CacheLookup
	WebElement AdminManageNotificationsByUserADV;

	@FindBy(xpath = "//a[contains(@role,'menuitem')]//span[contains(text(),'Publisher')]")
	@CacheLookup
	WebElement AdminManageNotificationsTypePUB;

	@FindBy(xpath = "//span[normalize-space()='Add Notification']")
	@CacheLookup
	WebElement AdminManageNotificationsAdd;

	@FindBy(xpath = "//button[contains(@type,'submit')]")
	@CacheLookup
	WebElement AdminManageNotificationsSubmitButton;

// #*************************************Login Page************************************

	public void enterEmail() {
		Email.sendKeys("admin");
	}

	public void enterPassword() {
		Password.sendKeys("7Search@pass123");
	}

	public void clickLoginButton() {
		clickLoginButton.click();

	}

// #*******************************************Publisher Manage Notifications Page****************************************

	public void AdminManageNotifications() {
		AdminManageNotifications.click();
	}

	public void enterAdminManageNotificationsSearch() {
		AdminManageNotificationsSearch.sendKeys("Wallet Balance is low !");
	}

	public void AdminManageNotificationsType() {
		AdminManageNotificationsType.click();
	}

	public void AdminManageNotificationsTypeNotifications() {
		AdminManageNotificationsTypeNotifications.click();
	}
	
	public void AdminManageNotificationsTypeOffers() {
		AdminManageNotificationsTypeOffers.click();
	}

	public void AdminManageNotificationsByUser() {
		AdminManageNotificationsByUser.click();
	}

	public void AdminManageNotificationsByUserADV() {
		AdminManageNotificationsByUserADV.click();
	}

	public void AdminManageNotificationsTypePUB() {
		AdminManageNotificationsTypePUB.click();
	}

	public void AdminManageNotificationsAdd() {
		AdminManageNotificationsAdd.click();
	}

	public void AdminManageNotificationsSubmitButton() {
		AdminManageNotificationsSubmitButton.click();
	}

}
