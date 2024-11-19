package Com.ADV7Search.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class PageFactoryAdminReferralManageKYCPage {

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

	@FindBy(xpath = "//span[normalize-space()='Manage KYC']")
	@CacheLookup
	WebElement RefAdminManageKYC;

	@FindBy(xpath = "//input[@id='default-04']")
	@CacheLookup
	WebElement RefAdminManageKYCSearch;

	@FindBy(xpath = "//span[normalize-space()='By Country:All']")
	@CacheLookup
	WebElement RefAdminManageKYCByCountry;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div[2]/div/div/div/div[2]/div/div[2]/div/div/ul/li[2]/div/div/ul/li[96]/a/span")
	@CacheLookup
	WebElement RefAdminManageKYCByCountryIndia;

	@FindBy(xpath = "//span[normalize-space()='By Status: All']")
	@CacheLookup
	WebElement RefAdminManageKYCByStatus;

	@FindBy(xpath = "//a[@role='menuitem']//span[contains(text(),'Pending')]")
	@CacheLookup
	WebElement RefAdminManageKYCByStatusPending;

	@FindBy(xpath = "//span[normalize-space()='Rejected']")
	@CacheLookup
	WebElement RefAdminManageKYCByStatusRejected;

	@FindBy(xpath = "//span[normalize-space()='Approved']")
	@CacheLookup
	WebElement RefAdminManageKYCByStatusApproved;

	@FindBy(xpath = "//span[normalize-space()='By Status: Pending']")
	@CacheLookup
	WebElement RefAdminManageKYCByStatusPend;

	@FindBy(xpath = "//span[normalize-space()='By Status: Rejected']")
	@CacheLookup
	WebElement RefAdminManageKYCByStatusReject;

	@FindBy(xpath = "//span[normalize-space()='By User : All']")
	@CacheLookup
	WebElement RefAdminManageKYCByUser;

	@FindBy(xpath = "//a[@role='menuitem']//span[contains(text(),'Inhouse')]")
	@CacheLookup
	WebElement RefAdminManageKYCByUserInhouse;

	@FindBy(xpath = "//a[@role='menuitem']//span[contains(text(),'Partner')]")
	@CacheLookup
	WebElement RefAdminManageKYCByUserPartner;

	@FindBy(xpath = "//span[normalize-space()='By User : Inhouse']")
	@CacheLookup
	WebElement RefAdminManageKYCByUserInHou;

	@FindBy(xpath = "//input[@placeholder='Please Select Date']")
	@CacheLookup
	WebElement RefAdminManageKYCDate;

	@FindBy(xpath = "//div[@aria-label='Choose Sunday, September 1st, 2024']")
	@CacheLookup
	WebElement RefAdminManageKYCDate1September;

	@FindBy(xpath = "//div[@aria-label='Choose Monday, September 30th, 2024']")
	@CacheLookup
	WebElement RefAdminManageKYCDate30September;

	@FindBy(xpath = "//span[normalize-space()='Search']")
	@CacheLookup
	WebElement RefAdminManageKYCSearchButton;

//#******************************************Manage KYC Details Page***************************************

	@FindBy(xpath = "//div[contains(@class,'nk-content')]//div[2]//div[7]//a[1]")
	@CacheLookup
	WebElement RefAdminManageKYCViewLog;

	@FindBy(xpath = "//span[normalize-space()='Back']")
	@CacheLookup
	WebElement RefAdminManageKYCViewLogBack;

	@FindBy(xpath = "//div[contains(@class,'nk-block')]//div[3]//div[7]//a[1]")
	@CacheLookup
	WebElement RefAdminManageKYCViewLog1;

	@FindBy(xpath = "//span[normalize-space()='Back']")
	@CacheLookup
	WebElement RefAdminManageKYCViewLogBack1;

	@FindBy(xpath = "//div[contains(@class,'nk-content')]//div[2]//div[5]//div[1]//button[1]")
	@CacheLookup
	WebElement RefAdminManageKYCSelfieUpdate;

	@FindBy(xpath = "//div[@class='nk-block']//div[3]//div[5]//div[1]//button[1]")
	@CacheLookup
	WebElement RefAdminManageKYCIDUpdate;

	@FindBy(xpath = "//div[contains(@class,'react-select__single-value css-1uccc91-singleValue')]")
	@CacheLookup
	WebElement RefAdminManageKYCSelfieUpdateStatus;

	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div/div/div/form/div[2]/div[1]/div/div/div/div/div[1]/div[1]")
	@CacheLookup
	WebElement RefAdminManageKYCSelfieUpdateStatusAccept;

	@FindBy(xpath = "//textarea[@id='remark']")
	@CacheLookup
	WebElement RefAdminManageKYCSelfieUpdateRemark;

	@FindBy(xpath = "//button[@type='submit']")
	@CacheLookup
	WebElement RefAdminManageKYCIDUpdateSubmitButton;

	@FindBy(xpath = "//div[contains(@class,'react-select__single-value css-1uccc91-singleValue')]")
	@CacheLookup
	WebElement RefAdminManageKYCIDUpdateStatus;

	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div/div/div/form/div[2]/div[1]/div/div/div/div/div[1]/div[1]")
	@CacheLookup
	WebElement RefAdminManageKYCIDUpdateStatusAccept;

	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div/div/div/form/div[2]/div[1]/div/div/div/div/div[1]/div[1]")
	@CacheLookup
	WebElement RefAdminManageKYCIDUpdateStatusReject;

	@FindBy(xpath = "//textarea[@id='remark']")
	@CacheLookup
	WebElement RefAdminManageKYCIDUpdateRemark;

	@FindBy(xpath = "//button[@type='submit']")
	@CacheLookup
	WebElement RefAdminManageKYCIDUpdateSubmit;

	@FindBy(xpath = "//div[@class='nk-content']//div[2]//div[4]//div[1]//span[1]//div[1]//div[1]//span[2]//a[1]//button[1]")
	@CacheLookup
	WebElement RefAdminManageKYCSelfieView;

	@FindBy(xpath = "//div[contains(@class,'nk-block')]//div[3]//div[4]//div[1]//span[1]//div[1]//div[1]//span[2]//a[1]//button[1]")
	@CacheLookup
	WebElement RefAdminManageKYCIDView;

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

	public void RefAdminManageKYC() {
		RefAdminManageKYC.click();
	}

	public void enterRefAdminManageKYCSearch() {
		RefAdminManageKYCSearch.sendKeys("REF66E94FB16F03E");
	}

	public void RefAdminManageKYCByCountry() {
		RefAdminManageKYCByCountry.click();
	}

	public void RefAdminManageKYCByCountryIndia() {
		RefAdminManageKYCByCountryIndia.click();
	}

	public void RefAdminManageKYCByStatus() {
		RefAdminManageKYCByStatus.click();
	}

	public void RefAdminManageKYCByStatusPending() {
		RefAdminManageKYCByStatusPending.click();
	}

	public void RefAdminManageKYCByStatusPend() {
		RefAdminManageKYCByStatusPend.click();
	}

	public void RefAdminManageKYCByStatusRejected() {
		RefAdminManageKYCByStatusRejected.click();
	}

	public void RefAdminManageKYCByStatusReject() {
		RefAdminManageKYCByStatusReject.click();
	}

	public void RefAdminManageKYCByStatusApproved() {
		RefAdminManageKYCByStatusApproved.click();
	}

	public void RefAdminManageKYCByUser() {
		RefAdminManageKYCByUser.click();
	}

	public void RefAdminManageKYCByUserInhouse() {
		RefAdminManageKYCByUserInhouse.click();
	}

	public void RefAdminManageKYCByUserInHou() {
		RefAdminManageKYCByUserInHou.click();
	}

	public void RefAdminManageKYCByUserPartner() {
		RefAdminManageKYCByUserPartner.click();
	}

	public void RefAdminManageKYCDate() {
		RefAdminManageKYCDate.click();
	}

	public void RefAdminManageKYCDate1September() {
		RefAdminManageKYCDate1September.click();
	}

	public void RefAdminManageKYCDate30September() {
		RefAdminManageKYCDate30September.click();
	}

	public void RefAdminManageKYCSearchButton() {
		RefAdminManageKYCSearchButton.click();
	}

// #*****************************************Manage KYC Page***************************************

	public void RefAdminManageKYCViewLog() {
		RefAdminManageKYCViewLog.click();
	}

	public void RefAdminManageKYCViewLogBack() {
		RefAdminManageKYCViewLogBack.click();
	}

	public void RefAdminManageKYCViewLog1() {
		RefAdminManageKYCViewLog1.click();
	}

	public void RefAdminManageKYCViewLogBack1() {
		RefAdminManageKYCViewLogBack1.click();
	}

	public void RefAdminManageKYCSelfieUpdate() {
		RefAdminManageKYCSelfieUpdate.click();
	}

	public void RefAdminManageKYCIDUpdate() {
		RefAdminManageKYCIDUpdate.click();
	}

	public void RefAdminManageKYCSelfieUpdateStatus() {
		RefAdminManageKYCSelfieUpdateStatus.click();
	}

	public void RefAdminManageKYCSelfieUpdateStatusAccept() {
		RefAdminManageKYCSelfieUpdateStatusAccept.click();
	}

	public void enterRefAdminManageKYCSelfieUpdateRemark() {
		RefAdminManageKYCSelfieUpdateRemark.sendKeys("Test Rajeev");
	}

	public void RefAdminManageKYCIDUpdateSubmitButton() {
		RefAdminManageKYCIDUpdateSubmitButton.click();
	}

	public void RefAdminManageKYCIDUpdateStatus() {
		RefAdminManageKYCIDUpdateStatus.click();
	}

	public void RefAdminManageKYCIDUpdateStatusAccept() {
		RefAdminManageKYCIDUpdateStatusAccept.click();
	}

	public void RefAdminManageKYCIDUpdateStatusReject() {
		RefAdminManageKYCIDUpdateStatusReject.click();
		;
	}

	public void enterRefAdminManageKYCIDUpdateRemark() {
		RefAdminManageKYCIDUpdateRemark.sendKeys("Test Rajeev");
	}

	public void RefAdminManageKYCIDUpdateSubmit() {
		RefAdminManageKYCIDUpdateSubmit.click();
	}

	public void RefAdminManageKYCSelfieView() {
		RefAdminManageKYCSelfieView.click();
	}

	public void RefAdminManageKYCIDView() {
		RefAdminManageKYCIDView.click();
	}

}
