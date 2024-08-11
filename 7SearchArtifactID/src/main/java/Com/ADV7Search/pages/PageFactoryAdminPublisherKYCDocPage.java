package Com.ADV7Search.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class PageFactoryAdminPublisherKYCDocPage {

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

// #********************************************Publisher KYC Document Page**********************************

	@FindBy(xpath = "//span[normalize-space()='Manage KYC Document']")
	@CacheLookup
	WebElement AdminManageKYCDoc;

	@FindBy(xpath = "//input[@id='default-04']")
	@CacheLookup
	WebElement AdminManageKYCDocSearch;

	@FindBy(xpath = "//div[contains(@class,'nk-content')]//div[2]//div[4]//div[1]//span[1]//a[1]//button[1]")
	@CacheLookup
	WebElement AdminManagePublisherKYCIDView;

	@FindBy(xpath = "//div[contains(@class,'nk-content')]//div[2]//div[6]//div[1]//span[1]//a[1]//button[1]")
	@CacheLookup
	WebElement AdminManagePublisherKYCSelfieView;

	@FindBy(xpath = "//div[contains(@class,'nk-content')]//div[2]//div[5]//div[1]//button[1]")
	@CacheLookup
	WebElement AdminManagePublisherKYCIDUpdate;

	@FindBy(xpath = "//div[contains(@class,'react-select__value-container react-select__value-container--has-value css-1hwfws3')]")
	@CacheLookup
	WebElement AdminManagePublisherKYCIDUpdateStatus;

	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div/div/div/form/div[2]/div[1]/div/div/div/div/div[1]/div[1]")
	@CacheLookup
	WebElement AdminManagePublisherKYCIDUpdateStatusReject;

	@FindBy(xpath = "//textarea[@placeholder='Enter description']")
	@CacheLookup
	WebElement AdminManagePublisherKYCIDUpdateDescription;

	@FindBy(xpath = "//button[@type='submit']")
	@CacheLookup
	WebElement AdminManagePublisherKYCIDUpdateSubmit;

	@FindBy(xpath = "//div[contains(@class,'nk-content')]//div[2]//div[7]//div[1]//button[1]")
	@CacheLookup
	WebElement AdminManagePublisherKYCSelfieUpdate;

	@FindBy(xpath = "//div[@class='react-select__value-container react-select__value-container--has-value css-1hwfws3']")
	@CacheLookup
	WebElement AdminManagePublisherKYCSelfieUpdateStatus;

	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div/div/div/form/div[2]/div[1]/div/div/div/div/div[1]/div[1]")
	@CacheLookup
	WebElement AdminManagePublisherKYCSelfieUpdateStatusReject;

	@FindBy(xpath = "//textarea[@placeholder='Enter description']")
	@CacheLookup
	WebElement AdminManagePublisherKYCSelfieUpdateDescription;

	@FindBy(xpath = "//button[@type='submit']")
	@CacheLookup
	WebElement AdminManagePublisherKYCSelfieUpdateSubmit;

// #*******************************************Login Page****************************************

	public void enterEmail() {
		Email.sendKeys("admin");
	}

	public void enterPassword() {
		Password.sendKeys("7Search@pass123");
	}

	public void clickLoginButton() {
		clickLoginButton.click();

	}

// #*******************************************Manage Publisher KYC Document Page****************************************

	public void AdminManageKYCDoc() {
		AdminManageKYCDoc.click();
	}

	public void AdminManagePublisherKYCIDView() {
		AdminManagePublisherKYCIDView.click();
	}

	public void enterAdminManageKYCDocSearch() {
		AdminManageKYCDocSearch.sendKeys("PUB664331264902A");
	}

	public void AdminManagePublisherKYCSelfieView() {
		AdminManagePublisherKYCSelfieView.click();
	}

	public void AdminManagePublisherKYCIDUpdate() {
		AdminManagePublisherKYCIDUpdate.click();
	}

	public void AdminManagePublisherKYCIDUpdateStatus() {
		AdminManagePublisherKYCIDUpdateStatus.click();
	}

	public void AdminManagePublisherKYCIDUpdateStatusReject() {
		AdminManagePublisherKYCIDUpdateStatusReject.click();
	}

	public void enterAdminManagePublisherKYCIDUpdateDescription() {
		AdminManagePublisherKYCIDUpdateDescription.sendKeys("Test");
	}

	public void AdminManagePublisherKYCIDUpdateSubmit() {
		AdminManagePublisherKYCIDUpdateSubmit.click();
	}

	public void AdminManagePublisherKYCSelfieUpdate() {
		AdminManagePublisherKYCSelfieUpdate.click();
	}

	public void AdminManagePublisherKYCSelfieUpdateStatus() {
		AdminManagePublisherKYCSelfieUpdateStatus.click();
	}

	public void AdminManagePublisherKYCSelfieUpdateStatusReject() {
		AdminManagePublisherKYCSelfieUpdateStatusReject.click();
	}

	public void enterAdminManagePublisherKYCSelfieUpdateDescription() {
		AdminManagePublisherKYCSelfieUpdateDescription.sendKeys("Test");
	}

	public void AdminManagePublisherKYCSelfieUpdateSubmit() {
		AdminManagePublisherKYCSelfieUpdateSubmit.click();
	}

}
