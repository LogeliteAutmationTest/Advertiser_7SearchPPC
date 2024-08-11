package Com.ADV7Search.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class PageFactoryAdminPublisherInhouseListPage {

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

// #********************************************Publisher Inhouse User's List Page**********************************

	@FindBy(xpath = "//span[normalize-space()='Manage Publisher']")
	@CacheLookup
	WebElement AdminManagePublisher;

	@FindBy(xpath = "//a[@href='/inhouse-publisher-list']//span[@class='nk-menu-text'][normalize-space()='Inhouse']")
	@CacheLookup
	WebElement AdminManagePublisherInHouse;

	@FindBy(xpath = "//input[@id='default-04']")
	@CacheLookup
	WebElement AdminManagePublisherInHouseSearch;

	@FindBy(xpath = "//span[normalize-space()='By Category :']")
	@CacheLookup
	WebElement AdminManagePublisherInHouseByCategory;

	@FindBy(xpath = "//a[@role='menuitem']//span[contains(text(),'Adult & Dating')]")
	@CacheLookup
	WebElement AdminManagePublisherInHouseByCategoryAdult;

	@FindBy(xpath = "//a[@role='menuitem']//span[contains(text(),'All Categories')]")
	@CacheLookup
	WebElement AdminManagePublisherInHouseByCategoryAllCategories;

	@FindBy(xpath = "//span[normalize-space()='Crypto']")
	@CacheLookup
	WebElement AdminManagePublisherInHouseByCategoryCrypto;

	@FindBy(xpath = "//span[normalize-space()='Gambling']")
	@CacheLookup
	WebElement AdminManagePublisherInHouseByCategoryGambling;

	@FindBy(xpath = "//span[normalize-space()='Tech Support']")
	@CacheLookup
	WebElement AdminManagePublisherInHouseByCategoryTechSupport;

	@FindBy(xpath = "//span[normalize-space()='By Status :']")
	@CacheLookup
	WebElement AdminManagePublisherInHouseByStatus;

	@FindBy(xpath = "//a[@href='#dropdownitem']//span[contains(text(),'Active')]")
	@CacheLookup
	WebElement AdminManagePublisherInHouseByStatusActive;
	
	@FindBy(xpath = "//span[normalize-space()='By Status : Active']")
	@CacheLookup
	WebElement AdminManagePublisherInHouseByStatusA;

	@FindBy(xpath = "//a[@href='#dropdownitem']//span[contains(text(),'Suspend')]")
	@CacheLookup
	WebElement AdminManagePublisherInHouseByStatusSuspend;
	
	@FindBy(xpath = "//span[normalize-space()='By Status : Suspended']")
	@CacheLookup
	WebElement AdminManagePublisherInHouseByStatusS;

	@FindBy(xpath = "//a[@href='#dropdownitem']//span[contains(text(),'Hold')]")
	@CacheLookup
	WebElement AdminManagePublisherInHouseByStatusHold;

	@FindBy(xpath = "//span[normalize-space()='By Source :']")
	@CacheLookup
	WebElement AdminManagePublisherInHouseBySource;

	@FindBy(xpath = "//a[@role='menuitem']//span[contains(text(),'Admin')]")
	@CacheLookup
	WebElement AdminManagePublisherInHouseBySourceAdmin;
	
	@FindBy(xpath = "//span[normalize-space()='By Source : Admin']")
	@CacheLookup
	WebElement AdminManagePublisherInHouseBySourceA;

	@FindBy(xpath = "//a[@role='menuitem']//span[contains(text(),'App')]")
	@CacheLookup
	WebElement AdminManagePublisherInHouseBySourceApp;
	
	@FindBy(xpath = "//span[normalize-space()='By Source : App']")
	@CacheLookup
	WebElement AdminManagePublisherInHouseBySourceA1;

	@FindBy(xpath = "//span[normalize-space()='CA Ads']")
	@CacheLookup
	WebElement AdminManagePublisherInHouseBySourceCA;
	
	@FindBy(xpath = "//span[normalize-space()='By Source : CA Ads']")
	@CacheLookup
	WebElement AdminManagePublisherInHouseBySourceC;

	@FindBy(xpath = "//span[normalize-space()='Info Ads']")
	@CacheLookup
	WebElement AdminManagePublisherInHouseBySourceInfoADS;
	
	@FindBy(xpath = "//span[normalize-space()='By Source : Info Ads']")
	@CacheLookup
	WebElement AdminManagePublisherInHouseBySourceIN;

	@FindBy(xpath = "//span[normalize-space()='US Ads']")
	@CacheLookup
	WebElement AdminManagePublisherInHouseBySourceUSAds;
	
	@FindBy(xpath = "//span[normalize-space()='By Source : US Ads']")
	@CacheLookup
	WebElement AdminManagePublisherInHouseBySourceU;

	@FindBy(xpath = "//span[normalize-space()='External']")
	@CacheLookup
	WebElement AdminManagePublisherInHouseBySourceExternal;

	@FindBy(xpath = "//input[@value='21-5-2023 - 26-7-2024']")
	@CacheLookup
	WebElement AdminManagePublisherInHouseDate;

	@FindBy(xpath = "//div[@aria-label='Choose Wednesday, May 1st, 2024']")
	@CacheLookup
	WebElement AdminManagePublisherInHouseDate1stMay;

	@FindBy(xpath = "//div[@aria-label='Choose Tuesday, May 21st, 2024']")
	@CacheLookup
	WebElement AdminManagePublisherInHouseDate21May;

	@FindBy(xpath = "//span[normalize-space()='Search']")
	@CacheLookup
	WebElement AdminManagePublisherInHouseDateSearchButton;

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

// #*******************************************Manage Publisher InHouse Page****************************************

	public void AdminManagePublisher() {
		AdminManagePublisher.click();
	}

	public void AdminManagePublisherInHouse() {
		AdminManagePublisherInHouse.click();
	}

	public void enterAdminManagePublisherInHouseSearch() {
		AdminManagePublisherInHouseSearch.sendKeys("ADV663B1F21A704E");
	}

	public void AdminManagePublisherInHouseByCategory() {
		AdminManagePublisherInHouseByCategory.click();
	}

	public void AdminManagePublisherInHouseByCategoryAllCategories() {
		AdminManagePublisherInHouseByCategoryAllCategories.click();
	}

	public void AdminManagePublisherInHouseByCategoryCrypto() {
		AdminManagePublisherInHouseByCategoryCrypto.click();
	}

	public void AdminManagePublisherInHouseByCategoryGambling() {
		AdminManagePublisherInHouseByCategoryGambling.click();
	}

	public void AdminManagePublisherInHouseByCategoryTechSupport() {
		AdminManagePublisherInHouseByCategoryTechSupport.click();
	}

	public void AdminManagePublisherInHouseByStatus() {
		AdminManagePublisherInHouseByStatus.click();
	}

	public void AdminManagePublisherInHouseByStatusActive() {
		AdminManagePublisherInHouseByStatusActive.click();
	}
	
	public void AdminManagePublisherInHouseByStatusA() {
		AdminManagePublisherInHouseByStatusA.click();
	}

	public void AdminManagePublisherInHouseByStatusHold() {
		AdminManagePublisherInHouseByStatusHold.click();
	}
	
	public void AdminManagePublisherInHouseByStatusH() {
		AdminManagePublisherInHouseByStatus.click();
	}

	public void AdminManagePublisherInHouseByStatusSuspend() {
		AdminManagePublisherInHouseByStatusSuspend.click();
	}

	public void AdminManagePublisherInHouseBySource() {
		AdminManagePublisherInHouseBySource.click();
	}

	public void AdminManagePublisherInHouseBySourceAdmin() {
		AdminManagePublisherInHouseBySourceAdmin.click();
	}
	
	public void AdminManagePublisherInHouseBySourceA() {
		AdminManagePublisherInHouseBySourceA.click();
	}

	public void AdminManagePublisherInHouseBySourceApp() {
		AdminManagePublisherInHouseBySourceApp.click();
	}
	
	public void AdminManagePublisherInHouseBySourceA1() {
		AdminManagePublisherInHouseBySourceA1.click();
	}

	public void AdminManagePublisherInHouseBySourceCA() {
		AdminManagePublisherInHouseBySourceCA.click();
	}
	
	public void AdminManagePublisherInHouseBySourceC() {
		AdminManagePublisherInHouseBySourceC.click();
	}

	public void AdminManagePublisherInHouseBySourceInfoADS() {
		AdminManagePublisherInHouseBySourceInfoADS.click();
	}
	
	public void AdminManagePublisherInHouseBySourceIN() {
		AdminManagePublisherInHouseBySourceIN.click();
	}

	public void AdminManagePublisherInHouseBySourceUSAds() {
		AdminManagePublisherInHouseBySourceUSAds.click();
	}
	
	public void AdminManagePublisherInHouseBySourceU() {
		AdminManagePublisherInHouseBySourceU.click();
	}

	public void AdminManagePublisherInHouseBySourceExternal() {
		AdminManagePublisherInHouseBySourceExternal.click();
	}

	public void AdminManagePublisherInHouseDate() {
		AdminManagePublisherInHouseDate.click();
	}

	public void AdminManagePublisherInHouseDate1stMay() {
		AdminManagePublisherInHouseDate1stMay.click();
	}

	public void AdminManagePublisherInHouseDate21May() {
		AdminManagePublisherInHouseDate21May.click();
	}

	public void AdminManagePublisherInHouseDateSearchButton() {
		AdminManagePublisherInHouseDateSearchButton.click();
	}

}
