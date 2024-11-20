package Com.ADV7Search.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class PageFactoryAdminReferralViewReportPage {

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

//#******************************************Manage KYC Page***************************************

	@FindBy(xpath = "//span[normalize-space()='View Report']")
	@CacheLookup
	WebElement RefAdminViewReport;

	@FindBy(xpath = "//input[@id='default-04']")
	@CacheLookup
	WebElement RefAdminViewReportSearch;

	@FindBy(xpath = "//span[normalize-space()='By Account Type : All']")
	@CacheLookup
	WebElement RefAdminViewReportByAccount;

	@FindBy(xpath = "//a[@role='menuitem']//span[contains(text(),'Advertiser')]")
	@CacheLookup
	WebElement RefAdminViewReportByAccountAdvertiser;

	@FindBy(xpath = "//span[normalize-space()='By Account Type : Advertiser']")
	@CacheLookup
	WebElement RefAdminViewReportByAccountADV;

	@FindBy(xpath = "//span[normalize-space()='Publisher']")
	@CacheLookup
	WebElement RefAdminViewReportByAccountPublisher;

	@FindBy(xpath = "//span[normalize-space()='By User : All']")
	@CacheLookup
	WebElement RefAdminViewReportByUser;

	@FindBy(xpath = "//a[@role='menuitem']//span[contains(text(),'Inhouse')]")
	@CacheLookup
	WebElement RefAdminViewReportByUserInhouse;

	@FindBy(xpath = "//span[normalize-space()='By User : Inhouse']")
	@CacheLookup
	WebElement RefAdminViewReportByUserINh;

	@FindBy(xpath = "//a[@role='menuitem']//span[contains(text(),'Partner')]")
	@CacheLookup
	WebElement RefAdminViewReportByUserPartner;

	@FindBy(xpath = "//input[@placeholder='Please Select Date']")
	@CacheLookup
	WebElement RefAdminViewReportByUserDate;

	@FindBy(xpath = "//div[@aria-label='Choose Sunday, September 1st, 2024']")
	@CacheLookup
	WebElement RefAdminViewReportByUserDate1Sept;

	@FindBy(xpath = "//div[@aria-label='Choose Wednesday, September 25th, 2024']")
	@CacheLookup
	WebElement RefAdminViewReportByUserDate25Sept;

	@FindBy(xpath = "//span[normalize-space()='Search']")
	@CacheLookup
	WebElement RefAdminViewReportByUserSearchButton;

	@FindBy(xpath = "//a[@class='dropdown-toggle bg-white btn btn-sm btn-outline-light btn-icon']")
	@CacheLookup
	WebElement RefAdminViewReportByAccountPagenation;

	@FindBy(xpath = "//span[normalize-space()='500']")
	@CacheLookup
	WebElement RefAdminViewReportByAccountPagenation500;

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

//#*****************************************Manage KYC Page***************************************

	public void RefAdminViewReport() {
		RefAdminViewReport.click();
	}

	public void enterRefAdminViewReportSearch() {
		RefAdminViewReportSearch.sendKeys("REF66E94FB16F03E");
	}

	public void RefAdminViewReportByAccount() {
		RefAdminViewReportByAccount.click();
	}

	public void RefAdminViewReportByAccountAdvertiser() {
		RefAdminViewReportByAccountAdvertiser.click();
	}

	public void RefAdminViewReportByAccountADV() {
		RefAdminViewReportByAccountADV.click();
	}

	public void RefAdminViewReportByAccountPublisher() {
		RefAdminViewReportByAccountPublisher.click();
	}

	public void RefAdminViewReportByUser() {
		RefAdminViewReportByUser.click();
	}

	public void RefAdminViewReportByUserInhouse() {
		RefAdminViewReportByUserInhouse.click();
	}

	public void RefAdminViewReportByUserINh() {
		RefAdminViewReportByUserINh.click();
	}

	public void RefAdminViewReportByUserPartner() {
		RefAdminViewReportByUserPartner.click();
	}

	public void RefAdminViewReportByUserDate() {
		RefAdminViewReportByUserDate.click();
	}

	public void RefAdminViewReportByUserDate1Sept() {
		RefAdminViewReportByUserDate1Sept.click();
	}

	public void RefAdminViewReportByUserDate25Sept() {
		RefAdminViewReportByUserDate25Sept.click();
	}

	public void RefAdminViewReportByUserSearchButton() {
		RefAdminViewReportByUserSearchButton.click();
	}

	public void RefAdminViewReportByAccountPagenation() {
		RefAdminViewReportByAccountPagenation.click();
	}

	public void RefAdminViewReportByAccountPagenation500() {
		RefAdminViewReportByAccountPagenation500.click();
	}

}