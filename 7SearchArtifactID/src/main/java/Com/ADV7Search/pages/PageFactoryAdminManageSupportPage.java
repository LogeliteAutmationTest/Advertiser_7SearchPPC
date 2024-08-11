package Com.ADV7Search.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class PageFactoryAdminManageSupportPage {

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

// #*********************************Manage Popup Page********************************

	@FindBy(xpath = "//span[normalize-space()='Manage Support']")
	@CacheLookup
	WebElement AdminManageSupport;

	@FindBy(xpath = "//span[normalize-space()='Advertiser Support']")
	@CacheLookup
	WebElement AdminManageSupportADV;

	@FindBy(xpath = "//body/div[@id='root']/div[@class='nk-app-root']/div[@class='nk-main']/div[@class='nk-wrap']/div[@class='nk-content']/div[@class='container-fluid']/div[@class='nk-content-inner']/div[@class='nk-content-body']/div[@class='nk-ibx']/div[@class='nk-ibx-body bg-white']/div[@class='nk-ibx-list boxscroll']/div[@class='simplebar-wrapper']/div[@class='simplebar-mask']/div[@class='simplebar-offset']/div[@aria-label='scrollable content']/div[@class='simplebar-content']/div[1]/a[1]")
	@CacheLookup
	WebElement AdminManageSupportADVChatOpen;

	@FindBy(xpath = "//button[@type='submit']")
	@CacheLookup
	WebElement AdminManageSupportADVChatOpenSubmit;
	
	@FindBy(xpath = "//a[@class='btn btn-icon btn-trigger nk-ibx-hide']//em[@class='icon ni ni-arrow-left']")
	@CacheLookup
	WebElement AdminManageSupportADVChatOpenBack;

	@FindBy(xpath = "//span[normalize-space()='Publisher Support']")
	@CacheLookup
	WebElement AdminManageSupportPUB;

	@FindBy(xpath = "//body/div[@id='root']/div[@class='nk-app-root']/div[@class='nk-main']/div[@class='nk-wrap']/div[@class='nk-content']/div[@class='container-fluid']/div[@class='nk-content-inner']/div[@class='nk-content-body']/div[@class='nk-ibx']/div[@class='nk-ibx-body bg-white']/div[@class='nk-ibx-list boxscroll']/div[@class='simplebar-wrapper']/div[@class='simplebar-mask']/div[@class='simplebar-offset']/div[@aria-label='scrollable content']/div[@class='simplebar-content']/div[1]/a[1]")
	@CacheLookup
	WebElement AdminManageSupportPUBChatOpen;

	@FindBy(xpath = "//button[@type='submit']")
	@CacheLookup
	WebElement AdminManageSupportPUBChatOpenSubmit;

	@FindBy(xpath = "//a[@class='btn btn-icon btn-trigger nk-ibx-hide']//em[@class='icon ni ni-arrow-left']")
	@CacheLookup
	WebElement AdminManageSupportPUBChatOpenBack;

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

// #*******************************************Publisher Manage Support Page****************************************

	public void AdminManageSupport() {
		AdminManageSupport.click();
	}

	public void AdminManageSupportADV() {
		AdminManageSupportADV.click();
	}

	public void AdminManageSupportADVChatOpen() {
		AdminManageSupportADVChatOpen.click();
	}
	
	public void AdminManageSupportADVChatOpenSubmit() {
		AdminManageSupportPUBChatOpenSubmit.click();
	}

	public void AdminManageSupportADVChatOpenBack() {
		AdminManageSupportADVChatOpenBack.click();
	}

	public void AdminManageSupportPUB() {
		AdminManageSupportPUB.click();
	}

	public void AdminManageSupportPUBChatOpen() {
		AdminManageSupportPUBChatOpen.click();
	}

	public void AdminManageSupportPUBChatOpenSubmit() {
		AdminManageSupportPUBChatOpenSubmit.click();
	}

	public void AdminManageSupportPUBChatOpenBack() {
		AdminManageSupportPUBChatOpenBack.click();
	}

}
