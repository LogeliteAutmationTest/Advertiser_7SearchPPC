package Com.ADV7Search.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class PageFactoryAdminReferralNotificationPage {

//#******************************************Login Page**********************************************

	@FindBy(xpath = "//input[@id='default-01']")
	@CacheLookup
	WebElement RefAdminLoginEmail;

	@FindBy(xpath = "//input[@id='password']")
	@CacheLookup
	WebElement RefAdminLoginPassword;

	@FindBy(xpath = "//em[@class='passcode-icon icon-hide icon ni ni-eye-off']")
	@CacheLookup
	WebElement RefAdminLoginPasswordEye;

	@FindBy(xpath = "//button[@type='submit']")
	@CacheLookup
	WebElement RefAdminLoginButton;

//#******************************************Notification Page***************************************

	@FindBy(xpath = "//span[normalize-space()='Notification']")
	@CacheLookup
	WebElement RefAdminNotification;

	@FindBy(xpath = "//body/div[@id='root']/div[@class='nk-app-root']/div[@class='nk-main']/div[@class='nk-wrap']/div[@class='nk-content']/div[@class='container-fluid']/div[@class='nk-content-inner']/div[@class='nk-content-body']/div[@class='nk-block']/div[@class='row g-gs']/div[@class='col-md-12 col-xxl-9']/div[@class='card-bordered card-full card']/ul[@class='nk-activity']/a[1]/li[1]/div[1]")
	@CacheLookup
	WebElement RefAdminNotificationOpen;

	@FindBy(xpath = "//a[@class='btn btn-icon btn-trigger nk-ibx-hide']//em[@class='icon ni ni-arrow-left']")
	@CacheLookup
	WebElement RefAdminNotificationBack;

	@FindBy(xpath = "//span[normalize-space()='Next']")
	@CacheLookup
	WebElement RefAdminNotificationPaginationNext;

	@FindBy(xpath = "//em[@class='icon ni ni-downward-ios']")
	@CacheLookup
	WebElement RefAdminNotificationPaginationDropdown;

	@FindBy(xpath = "//span[normalize-space()='500']")
	@CacheLookup
	WebElement RefAdminNotificationPaginationDropdown500;

//#******************************************Login Page***************************************

	public void enterRefAdminLoginEmail() {
		RefAdminLoginEmail.sendKeys("Admin");
	}

	public void enterRefAdminLoginPassword() {
		RefAdminLoginPassword.sendKeys("123456");
	}

	public void RefAdminLoginPasswordEye() {
		RefAdminLoginPasswordEye.click();
	}

	public void RefAdminLoginButton() {
		RefAdminLoginButton.click();
	}

// #******************************************Notification Page***************************************

	public void RefAdminNotification() {
		RefAdminNotification.click();
	}

	public void RefAdminNotificationOpen() {
		RefAdminNotificationOpen.click();
	}

	public void RefAdminNotificationBack() {
		RefAdminNotificationBack.click();
	}

	public void RefAdminNotificationPaginationNext() {
		RefAdminNotificationPaginationNext.click();
	}

	public void RefAdminNotificationPaginationDropdown() {
		RefAdminNotificationPaginationDropdown.click();
	}

	public void RefAdminNotificationPaginationDropdown500() {
		RefAdminNotificationPaginationDropdown500.click();
	}

}
