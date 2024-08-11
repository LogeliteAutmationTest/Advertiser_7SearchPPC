package Com.ADV7Search.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class PageFactoryAdminManageMessengerPage {

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

// #*********************************Manage Messenger Page********************************

	@FindBy(xpath = "//span[normalize-space()='Manage Messengers']")
	@CacheLookup
	WebElement AdminManageMessenger;

	@FindBy(xpath = "//input[@id='default-04']")
	@CacheLookup
	WebElement AdminManageMessengerSearch;

	@FindBy(xpath = "//a[contains(@class,'dropdown-toggle btn btn-white btn-dim btn-outline-light')]")
	@CacheLookup
	WebElement AdminManageMessengerStatus;

	@FindBy(xpath = "//a[@role='menuitem']//span[contains(text(),'Active')]")
	@CacheLookup
	WebElement AdminManageMessengerStatusActive;

	@FindBy(xpath = "//a[contains(@href,'#dropdownitem')]//span[contains(text(),'Inactive')]")
	@CacheLookup
	WebElement AdminManageMessengerStatusInActive;

	@FindBy(xpath = "//span[normalize-space()='Add Messenger']")
	@CacheLookup
	WebElement AdminManageMessengerAdd;

	@FindBy(xpath = "//input[@placeholder='Enter Messenger']")
	@CacheLookup
	WebElement AdminManageMessengerEnterName;

	@FindBy(xpath = "//button[@type='submit']")
	@CacheLookup
	WebElement AdminManageMessengerSubmitButton;

	@FindBy(xpath = "//em[@class='icon ni ni-cross-sm']")
	@CacheLookup
	WebElement AdminManageMessengerAddCross;

	@FindBy(xpath = "//body/div[@id='root']/div[contains(@class,'nk-app-root')]/div[contains(@class,'nk-main')]/div[contains(@class,'nk-wrap')]/div[contains(@class,'nk-content')]/div[contains(@class,'container-fluid')]/div[contains(@class,'nk-content-inner')]/div[contains(@class,'nk-content-body')]/div[contains(@class,'nk-block')]/div[contains(@class,'card-bordered card-stretch boxscroll card')]/div[contains(@class,'card-inner-group')]/div[contains(@class,'card-inner p-0')]/div[contains(@class,'')]/div[5]/div[3]/ul[1]/li[1]/div[1]/a[1]/em[1]")
	@CacheLookup
	WebElement AdminManageMessengerThreeDotNone;

	@FindBy(xpath = "//div[contains(@class,'dropdown-menu dropdown-menu-right show')]//span[contains(text(),'Inactive')]")
	@CacheLookup
	WebElement AdminManageMessengerThreeDotNoneInActive;

	@FindBy(xpath = "//div[contains(@class,'dropdown-menu dropdown-menu-right show')]//span[contains(text(),'Edit')]")
	@CacheLookup
	WebElement AdminManageMessengerThreeDotNoneEdit;

	@FindBy(xpath = "//button[contains(@type,'submit')]")
	@CacheLookup
	WebElement AdminManageMessengerThreeDotNoneUpdateButton;

	@FindBy(xpath = "//em[@class='icon ni ni-cross-sm']")
	@CacheLookup
	WebElement AdminManageMessengerThreeDotNoneCross;

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

// #*******************************************Publisher Manage Messenger Page****************************************

	public void AdminManageMessenger() {
		AdminManageMessenger.click();
	}

	public void enterAdminManageMessengerSearch() {
		AdminManageMessengerSearch.sendKeys("None");
	}

	public void AdminManageMessengerStatus() {
		AdminManageMessengerStatus.click();
	}

	public void AdminManageMessengerStatusActive() {
		AdminManageMessengerStatusActive.click();
	}

	public void AdminManageMessengerStatusInActive() {
		AdminManageMessengerStatusInActive.click();
	}

	public void AdminManageMessengerAdd() {
		AdminManageMessengerAdd.click();
	}

	public void enterAdminManageMessengerEnterName() {
		AdminManageMessengerEnterName.sendKeys("Test");
	}

	public void AdminManageMessengerSubmitButton() {
		AdminManageMessengerSubmitButton.click();
	}

	public void AdminManageMessengerAddCross() {
		AdminManageMessengerAddCross.click();
	}

	public void AdminManageMessengerThreeDotNone() {
		AdminManageMessengerThreeDotNone.click();
	}

	public void AdminManageMessengerThreeDotNoneInActive() {
		AdminManageMessengerThreeDotNoneInActive.click();
	}

	public void AdminManageMessengerThreeDotNoneEdit() {
		AdminManageMessengerThreeDotNoneEdit.click();
	}

	public void AdminManageMessengerThreeDotNoneUpdateButton() {
		AdminManageMessengerThreeDotNoneUpdateButton.click();
	}

	public void AdminManageMessengerThreeDotNoneCross() {
		AdminManageMessengerThreeDotNoneCross.click();
	}

}
