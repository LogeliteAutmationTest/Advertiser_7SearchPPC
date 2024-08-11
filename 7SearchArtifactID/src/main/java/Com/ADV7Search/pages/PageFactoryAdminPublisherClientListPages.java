package Com.ADV7Search.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class PageFactoryAdminPublisherClientListPages {

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

// #********************************************Publisher Client User's List Page**********************************

	@FindBy(xpath = "//span[normalize-space()='Manage Publisher']")
	@CacheLookup
	WebElement AdminManagePublisher;

	@FindBy(xpath = "//a[@href='/clients-publisher-list']//span[@class='nk-menu-text'][normalize-space()='Clients']")
	@CacheLookup
	WebElement AdminManagePublisherClient;

	@FindBy(xpath = "//input[@id='default-04']")
	@CacheLookup
	WebElement AdminManagePublisherClientSearch;

	@FindBy(xpath = "//span[normalize-space()='By Category :']")
	@CacheLookup
	WebElement AdminManagePublisherClientByCategory;

	@FindBy(xpath = "//a[@role='menuitem']//span[contains(text(),'Dating & Adult')]")
	@CacheLookup
	WebElement AdminManagePublisherClientByCategoryAdult;
	
	@FindBy(xpath = "//span[normalize-space()='By Category : Dating & Adult']")
	@CacheLookup
	WebElement AdminManagePublisherClientByCategoryA;

	@FindBy(xpath = "//a[@role='menuitem']//span[contains(text(),'All Categories')]")
	@CacheLookup
	WebElement AdminManagePublisherClientByCategoryAllCategories;
	
	@FindBy(xpath = "//span[normalize-space()='By Category : All Categories']")
	@CacheLookup
	WebElement AdminManagePublisherClientByCategoryAll;

	@FindBy(xpath = "//span[normalize-space()='Gambling']")
	@CacheLookup
	WebElement AdminManagePublisherClientByCategoryGambling;
	
	@FindBy(xpath = "//span[normalize-space()='By Category : Gambling']")
	@CacheLookup
	WebElement AdminManagePublisherClientByCategoryG;

	@FindBy(xpath = "//a[@role='menuitem']//span[contains(text(),'Travel & Hospitality')]")
	@CacheLookup
	WebElement AdminManagePublisherClientByCategoryTechSupport;

	@FindBy(xpath = "//span[normalize-space()='By Status :']")
	@CacheLookup
	WebElement AdminManagePublisherClientByStatus;

	@FindBy(xpath = "//a[@href='#dropdownitem']//span[contains(text(),'Active')]")
	@CacheLookup
	WebElement AdminManagePublisherClientByStatusActive;

	@FindBy(xpath = "//span[normalize-space()='By Status : Active']")
	@CacheLookup
	WebElement AdminManagePublisherClientByStatusActive1;

	@FindBy(xpath = "//a[@href='#dropdownitem']//span[contains(text(),'Pending')]")
	@CacheLookup
	WebElement AdminManagePublisherClientByStatusPending;

	@FindBy(xpath = "//span[normalize-space()='By Status : Pending']")
	@CacheLookup
	WebElement AdminManagePublisherClientByStatusPending1;

	@FindBy(xpath = "//a[@href='#dropdownitem']//span[contains(text(),'Suspend')]")
	@CacheLookup
	WebElement AdminManagePublisherClientByStatusSuspend;

	@FindBy(xpath = "//span[normalize-space()='By Status : Suspended']")
	@CacheLookup
	WebElement AdminManagePublisherClientByStatusSuspend1;

	@FindBy(xpath = "//a[@href='#dropdownitem']//span[contains(text(),'Hold')]")
	@CacheLookup
	WebElement AdminManagePublisherClientByStatusHold;

	@FindBy(xpath = "//*[@id=\"root\"]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div/div[2]/div/div/ul/li[6]/button/span")
	@CacheLookup
	WebElement AdminManagePublisherClientSearchButton;

	@FindBy(xpath = "//span[normalize-space()='By Source :']")
	@CacheLookup
	WebElement AdminManagePublisherClientBySource;

	@FindBy(xpath = "//a[@role='menuitem']//span[contains(text(),'Admin')]")
	@CacheLookup
	WebElement AdminManagePublisherClientBySourceAdmin;

	@FindBy(xpath = "//span[normalize-space()='By Source : Admin']")
	@CacheLookup
	WebElement AdminManagePublisherClientBySourceAdmin1;

	@FindBy(xpath = "//a[@role='menuitem']//span[contains(text(),'App')]")
	@CacheLookup
	WebElement AdminManagePublisherClientBySourceApp;

	@FindBy(xpath = "//span[normalize-space()='By Source : App']")
	@CacheLookup
	WebElement AdminManagePublisherClientBySourceApp1;

	@FindBy(xpath = "//a[@role='menuitem']//span[contains(text(),'Organic')]")
	@CacheLookup
	WebElement AdminManagePublisherClientBySourceOrganic;

	@FindBy(xpath = "//span[normalize-space()='By Source : Organic']")
	@CacheLookup
	WebElement AdminManagePublisherClientBySourceOrganic1;

	@FindBy(xpath = "//span[normalize-space()='Info Ads']")
	@CacheLookup
	WebElement AdminManagePublisherClientBySourceInfoAds;

	@FindBy(xpath = "//span[normalize-space()='By Source : Info Ads']")
	@CacheLookup
	WebElement AdminManagePublisherClientBySourceInfoAds1;

	@FindBy(xpath = "//span[normalize-space()='US Ads']")
	@CacheLookup
	WebElement AdminManagePublisherClientBySourceUsAds;

	@FindBy(xpath = "//span[normalize-space()='By Source : US Ads']")
	@CacheLookup
	WebElement AdminManagePublisherClientBySourceUsAds1;

	@FindBy(xpath = "//span[normalize-space()='External']")
	@CacheLookup
	WebElement AdminManagePublisherClientBySourceExternal;

	@FindBy(xpath = "//input[@value='17-3-2023 - 22-5-2024']")
	@CacheLookup
	WebElement AdminManagePublisherClientDate;

	@FindBy(xpath = "//div[@aria-label='Choose Wednesday, May 1st, 2024']")
	@CacheLookup
	WebElement AdminManagePublisherClientDateMay1st;

	@FindBy(xpath = "//div[@aria-label='Choose Wednesday, May 22nd, 2024']")
	@CacheLookup
	WebElement AdminManagePublisherClientDateMay22nd;

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

// #*******************************************Manage Publisher Client Page****************************************

	public void AdminManagePublisher() {
		AdminManagePublisher.click();
	}

	public void AdminManagePublisherClient() {
		AdminManagePublisherClient.click();
	}

	public void enterAdminManagePublisherClientSearch() {
		AdminManagePublisherClientSearch.sendKeys("ADV663B1F21A704E");
	}

	public void AdminManagePublisherClientByCategory() {
		AdminManagePublisherClientByCategory.click();
	}

	public void AdminManagePublisherClientByCategoryAllCategories() {
		AdminManagePublisherClientByCategoryAllCategories.click();
	}
	
	public void AdminManagePublisherClientByCategoryAll() {
		AdminManagePublisherClientByCategoryAll.click();
	}

	public void AdminManagePublisherClientByCategoryAdult() {
		AdminManagePublisherClientByCategoryAdult.click();
	}

	public void AdminManagePublisherClientByCategoryA() {
		AdminManagePublisherClientByCategoryA.click();
	}
	
	public void AdminManagePublisherClientByCategoryGambling() {
		AdminManagePublisherClientByCategoryGambling.click();
	}
	
	public void AdminManagePublisherClientByCategoryG() {
		AdminManagePublisherClientByCategoryG.click();
	}

	public void AdminManagePublisherClientByCategoryTechSupport() {
		AdminManagePublisherClientByCategoryTechSupport.click();

	}

	public void AdminManagePublisherClientSearchButton() {
		AdminManagePublisherClientSearchButton.click();
	}

	public void AdminManagePublisherClientByStatus() {
		AdminManagePublisherClientByStatus.click();
	}

	public void AdminManagePublisherClientByStatusActive() {
		AdminManagePublisherClientByStatusActive.click();
	}

	public void AdminManagePublisherClientByStatusActive1() {
		AdminManagePublisherClientByStatusActive1.click();
	}

	public void AdminManagePublisherClientByStatusHold() {
		AdminManagePublisherClientByStatusHold.click();
	}

	public void AdminManagePublisherClientByStatusPending() {
		AdminManagePublisherClientByStatusPending.click();
	}

	public void AdminManagePublisherClientByStatusPending1() {
		AdminManagePublisherClientByStatusPending1.click();
	}

	public void AdminManagePublisherClientByStatusSuspend() {
		AdminManagePublisherClientByStatusSuspend.click();
	}

	public void AdminManagePublisherClientByStatusSuspend1() {
		AdminManagePublisherClientByStatusSuspend1.click();
	}

	public void AdminManagePublisherClientBySource() {
		AdminManagePublisherClientBySource.click();
	}

	public void AdminManagePublisherClientBySourceAdmin() {
		AdminManagePublisherClientBySourceAdmin.click();
	}

	public void AdminManagePublisherClientBySourceAdmin1() {
		AdminManagePublisherClientBySourceAdmin1.click();
	}

	public void AdminManagePublisherClientBySourceApp() {
		AdminManagePublisherClientBySourceApp.click();
	}

	public void AdminManagePublisherClientBySourceApp1() {
		AdminManagePublisherClientBySourceApp1.click();
	}

	public void AdminManagePublisherClientBySourceOrganic() {
		AdminManagePublisherClientBySourceOrganic.click();
	}

	public void AdminManagePublisherClientBySourceOrganic1() {
		AdminManagePublisherClientBySourceOrganic1.click();
	}

	public void AdminManagePublisherClientBySourceInfoAds() {
		AdminManagePublisherClientBySourceInfoAds.click();
	}

	public void AdminManagePublisherClientBySourceInfoAds1() {
		AdminManagePublisherClientBySourceInfoAds1.click();
	}

	public void AdminManagePublisherClientBySourceUSAds() {
		AdminManagePublisherClientBySourceUsAds.click();
	}

	public void AdminManagePublisherClientBySourceUSAds1() {
		AdminManagePublisherClientBySourceUsAds1.click();
	}

	public void AdminManagePublisherClientBySourceExternal() {
		AdminManagePublisherClientBySourceExternal.click();
	}

	public void AdminManagePublisherClientDate() {
		AdminManagePublisherClientDate.click();
	}

	public void AdminManagePublisherClientDateMay1st() {
		AdminManagePublisherClientDateMay1st.click();
	}

	public void AdminManagePublisherClientDateMay22nd() {
		AdminManagePublisherClientDateMay22nd.click();
	}

}
