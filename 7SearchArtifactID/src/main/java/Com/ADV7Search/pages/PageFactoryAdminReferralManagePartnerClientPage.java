package Com.ADV7Search.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class PageFactoryAdminReferralManagePartnerClientPage {

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

//#******************************************View Profile Page***************************************

	@FindBy(xpath = "//span[normalize-space()='Manage Partners']")
	@CacheLookup
	WebElement RefAdminManagePartners;

	@FindBy(xpath = "//span[@class='nk-menu-text'][normalize-space()='Partner']")
	@CacheLookup
	WebElement RefAdminManagePartnersClient;

	@FindBy(xpath = "//input[@id='default-04']")
	@CacheLookup
	WebElement RefAdminManagePartnersClientSearch;

	@FindBy(xpath = "//a[@class='dropdown-toggle btn btn-white btn-dim btn-outline-light']")
	@CacheLookup
	WebElement RefAdminManagePartnersClientByCountry;

	@FindBy(xpath = "//button[normalize-space()='India']")
	@CacheLookup
	WebElement RefAdminManagePartnersClientByCountryIndia;

	@FindBy(xpath = "//span[normalize-space()='By Status : All']")
	@CacheLookup
	WebElement RefAdminManagePartnersClientByStatus;

	@FindBy(xpath = "//a[@role='menuitem']//span[contains(text(),'Unverified')]")
	@CacheLookup
	WebElement RefAdminManagePartnersClientByStatusUnverified;

	@FindBy(xpath = "//a[@href='#dropdownitem']//span[contains(text(),'Active')]")
	@CacheLookup
	WebElement RefAdminManagePartnersClientByStatusActive;

	@FindBy(xpath = "//span[normalize-space()='By Status : Unverified']")
	@CacheLookup
	WebElement RefAdminManagePartnersClientByStatusUnver;

	@FindBy(xpath = "//input[contains(@value,'12-07-2023 - 16-09-2024')]")
	@CacheLookup
	WebElement RefAdminManagePartnersClientDate;

	@FindBy(xpath = "//div[@aria-label='Choose Monday, September 2nd, 2024']")
	@CacheLookup
	WebElement RefAdminManagePartnersClient2Sept;

	@FindBy(xpath = "//div[@aria-label='Choose Tuesday, September 10th, 2024']")
	@CacheLookup
	WebElement RefAdminManagePartnersClient10Sept;

	@FindBy(xpath = "//span[normalize-space()='Search']")
	@CacheLookup
	WebElement RefAdminManagePartnersClientSearchButton;

	@FindBy(xpath = "//span[normalize-space()='Search']")
	@CacheLookup
	WebElement RefAdminManagePartnersClientSearchButton1;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[10]/ul[1]/li[1]/div[1]/a[1]/em[1]")
	@CacheLookup
	WebElement RefAdminManagePartnersClientThreedot;

	@FindBy(xpath = "//div[contains(@class,'dropdown-menu dropdown-menu-right show')]//span[contains(text(),'Log In As User')]")
	@CacheLookup
	WebElement RefAdminManagePartnersClientThreedotLoginAsUser;

	@FindBy(xpath = "//div[contains(@class,'dropdown-menu dropdown-menu-right show')]//span[contains(text(),'Suspend')]")
	@CacheLookup
	WebElement RefAdminManagePartnersClientThreedotSuspend;

	@FindBy(xpath = "//div[contains(@class,'dropdown-menu dropdown-menu-right show')]//span[contains(text(),'Hold')]")
	@CacheLookup
	WebElement RefAdminManagePartnersClientThreedotHold;

	@FindBy(xpath = "//div[contains(@class,'dropdown-menu dropdown-menu-right show')]//span[contains(text(),'Make Partner')]")
	@CacheLookup
	WebElement RefAdminManagePartnersClientThreedotMakePartner;

	@FindBy(xpath = "//div[5]//div[5]//a[1]//button[1]")
	@CacheLookup
	WebElement RefAdminManagePartnersClientAdvAdd;

	@FindBy(xpath = "//div[5]//div[6]//a[1]//button[1]")
	@CacheLookup
	WebElement RefAdminManagePartnersClientPubAdd;

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

//#*****************************************Manage Partners Client Page***************************************

	public void RefAdminManagePartners() {
		RefAdminManagePartners.click();
	}

	public void RefAdminManagePartnersClient() {
		RefAdminManagePartnersClient.click();
	}

	public void RefAdminManagePartnersClientByCountry() {
		RefAdminManagePartnersClientByCountry.click();
	}

	public void enterRefAdminManagePartnersClientSearch() {
		RefAdminManagePartnersClientSearch.sendKeys("Raf");
	}

	public void RefAdminManagePartnersClientByCountryIndia() {
		RefAdminManagePartnersClientByCountryIndia.click();
	}

	public void RefAdminManagePartnersClientByStatus() {
		RefAdminManagePartnersClientByStatus.click();
	}

	public void RefAdminManagePartnersClientByStatusUnverified() {
		RefAdminManagePartnersClientByStatusUnverified.click();
	}

	public void RefAdminManagePartnersClientByStatusActive() {
		RefAdminManagePartnersClientByStatusActive.click();
	}

	public void RefAdminManagePartnersClientByStatusUnver() {
		RefAdminManagePartnersClientByStatusUnver.click();
	}

	public void RefAdminManagePartnersClientDate() {
		RefAdminManagePartnersClientDate.click();
	}

	public void RefAdminManagePartnersClient2Sept() {
		RefAdminManagePartnersClient2Sept.click();
	}

	public void RefAdminManagePartnersClient10Sept() {
		RefAdminManagePartnersClient10Sept.click();
	}

	public void RefAdminManagePartnersClientSearchButton() {
		RefAdminManagePartnersClientSearchButton.click();
	}

	public void RefAdminManagePartnersClientSearchButton1() {
		RefAdminManagePartnersClientSearchButton1.click();
	}

	public void RefAdminManagePartnersClientThreedot() {
		RefAdminManagePartnersClientThreedot.click();
	}

	public void RefAdminManagePartnersClientThreedotLoginAsUser() {
		RefAdminManagePartnersClientThreedotLoginAsUser.click();
	}

	public void RefAdminManagePartnersClientThreedotSuspend() {
		RefAdminManagePartnersClientThreedotSuspend.click();
	}

	public void RefAdminManagePartnersClientThreedotHold() {
		RefAdminManagePartnersClientThreedotHold.click();
	}

	public void RefAdminManagePartnersClientThreedotMakePartner() {
		RefAdminManagePartnersClientThreedotMakePartner.click();
	}

	public void RefAdminManagePartnersClientAdvAdd() {
		RefAdminManagePartnersClientAdvAdd.click();
	}

	public void RefAdminManagePartnersClientPubAdd() {
		RefAdminManagePartnersClientPubAdd.click();
	}

}
