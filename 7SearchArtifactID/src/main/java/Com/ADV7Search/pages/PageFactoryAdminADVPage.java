package Com.ADV7Search.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class PageFactoryAdminADVPage {

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

//#********************************************Manager ADV Page**********************************

	@FindBy(xpath = "//span[normalize-space()='Manage Advertiser']")
	@CacheLookup
	WebElement AdminManagerADV;

	@FindBy(xpath = "//a[contains(@href,'/inhouse-advertiser-list')]//span[contains(@class,'nk-menu-text')][normalize-space()='Inhouse']")
	@CacheLookup
	WebElement ManagerADVInhouse;

	@FindBy(xpath = "//input[@id='default-04']")
	@CacheLookup
	WebElement ManagerADVSearch;

	@FindBy(xpath = "//span[normalize-space()='By Category :']")
	@CacheLookup
	WebElement ManagerADVCategoryFilter;

	@FindBy(xpath = "//span[normalize-space()='7Search PPC']")
	@CacheLookup
	WebElement ManagerADVCategory7Search;

	@FindBy(xpath = "//a[@role='menuitem']//span[contains(text(),'Adult & Dating')]")
	@CacheLookup
	WebElement ManagerADVCategoryAdult;

	@FindBy(xpath = "//a[@role='menuitem']//span[contains(text(),'All Categories')]")
	@CacheLookup
	WebElement ManagerADVCategoryAllCategories;

	@FindBy(xpath = "//span[normalize-space()='IT Services']")
	@CacheLookup
	WebElement ManagerADVCategoryCrypto;

	@FindBy(xpath = "//span[normalize-space()='Retail']")
	@CacheLookup
	WebElement ManagerADVCategoryDating;

	@FindBy(xpath = "//span[normalize-space()='Media Entertainment']")
	@CacheLookup
	WebElement ManagerADVCategoryEcommerce;

	@FindBy(xpath = "//a[@role='menuitem']//span[contains(text(),'Education')]")
	@CacheLookup
	WebElement ManagerADVCategoryEducation;

	@FindBy(xpath = "//span[normalize-space()='Finance & Crypto']")
	@CacheLookup
	WebElement ManagerADVCategoryFinance;

	@FindBy(xpath = "//span[normalize-space()='Food & Beverage']")
	@CacheLookup
	WebElement ManagerADVCategoryFood;

	@FindBy(xpath = "//span[normalize-space()='Gambling']")
	@CacheLookup
	WebElement ManagerADVCategoryGambling;

	@FindBy(xpath = "//a[@role='menuitem']//span[contains(text(),'Travel & Hospitality')]")
	@CacheLookup
	WebElement ManagerADVCategoryHealth;

	@FindBy(xpath = "//span[normalize-space()='By Status :']")
	@CacheLookup
	WebElement ManagerADVStatus;

	@FindBy(xpath = "//a[@href='#dropdownitem']//span[contains(text(),'Active')]")
	@CacheLookup
	WebElement ManagerADVStatusActive;

	@FindBy(xpath = "//span[normalize-space()='By Status : Active']")
	@CacheLookup
	WebElement ManagerADVStatusAct;

	@FindBy(xpath = "//a[@href='#dropdownitem']//span[contains(text(),'Suspend')]")
	@CacheLookup
	WebElement ManagerADVStatusSuspend;

	@FindBy(xpath = "//span[normalize-space()='By Status : Suspended']")
	@CacheLookup
	WebElement ManagerADVStatusSuS;

	@FindBy(xpath = "//a[@href='#dropdownitem']//span[contains(text(),'Hold')]")
	@CacheLookup
	WebElement ManagerADVStatusHold;

	@FindBy(xpath = "//span[normalize-space()='By Source :']")
	@CacheLookup
	WebElement ManagerADVSource;

	@FindBy(xpath = "//a[@role='menuitem']//span[contains(text(),'Admin')]")
	@CacheLookup
	WebElement ManagerADVSourceAdmin;

	@FindBy(xpath = "//a[@role='menuitem']//span[contains(text(),'App')]")
	@CacheLookup
	WebElement ManagerADVSourceApp;

	@FindBy(xpath = "//a[@role='menuitem']//span[contains(text(),'Organic')]")
	@CacheLookup
	WebElement ManagerADVSourceOrganic;

	@FindBy(xpath = "//a[@role='menuitem']//span[contains(text(),'Info Ads')]")
	@CacheLookup
	WebElement ManagerADVSourceInfoAds;

	@FindBy(xpath = "//a[@role='menuitem']//span[contains(text(),'US Ads')]")
	@CacheLookup
	WebElement ManagerADVSourceUsAds;

	@FindBy(xpath = "//span[normalize-space()='External']")
	@CacheLookup
	WebElement ManagerADVSourceExternal;

	@FindBy(xpath = "//input[@value='22-2-2023 - 29-4-2024']")
	@CacheLookup
	WebElement ManagerADVDate;

	@FindBy(xpath = "//div[@aria-label='Choose Monday, April 13st, 2024']")
	@CacheLookup
	WebElement ManagerADVDate1Ap;

	@FindBy(xpath = "//div[@aria-label='Choose Tuesday, April 23rd, 2024']")
	@CacheLookup
	WebElement ManagerADVDate23Ap;

	@FindBy(xpath = "//span[normalize-space()='Search']")
	@CacheLookup
	WebElement ManagerADVSearchButton;

//*****************************************open ADV Details********************************

	@FindBy(xpath = "//span[normalize-space()='ADV669211AEC7E68']")
	@CacheLookup
	WebElement ManagerADVOpenProfileInhouse;

	@FindBy(xpath = "//span[normalize-space()='Campaigns']")
	@CacheLookup
	WebElement ManagerADVOpenProfileCampaign;

	@FindBy(xpath = "//span[normalize-space()='Add Fund']")
	@CacheLookup
	WebElement ManagerADVOpenProfileAddFund;

	@FindBy(xpath = "//input[@id='amount']")
	@CacheLookup
	WebElement ManagerADVOpenProfileAddFundEnter;

	@FindBy(xpath = "//div[@class='react-select__value-container css-1hwfws3']")
	@CacheLookup
	WebElement ManagerADVOpenProfileAddFundGateway;

	@FindBy(xpath = "//*[@id=\"payment_method\"]/div/div[1]/div[1]")
	@CacheLookup
	WebElement ManagerADVOpenProfileAddFundBonus;

	@FindBy(xpath = "//textarea[@id='remark']")
	@CacheLookup
	WebElement ManagerADVOpenProfileAddFundRemark;

	@FindBy(xpath = "//button[@type='submit']")
	@CacheLookup
	WebElement ManagerADVOpenProfileAddFundSubmit;

	@FindBy(xpath = "//span[normalize-space()='Transactions']")
	@CacheLookup
	WebElement ManagerADVOpenProfileTransactions;

	@FindBy(xpath = "//span[normalize-space()='Back']")
	@CacheLookup
	WebElement ManagerADVOpenProfileBack;

//#**************************************Manager ADV Client***********************************

	@FindBy(xpath = "//a[contains(@href,'/clients-advertiser-list')]")
	@CacheLookup
	WebElement ManagerADVClient;

			@FindBy(xpath = "//span[normalize-space()='ADV669211AEC7E68']")
	@CacheLookup
	WebElement ManagerADVOpenProfileClient;
//			
//			@FindBy(xpath = "//span[normalize-space()='Back']")
//			@CacheLookup
//			WebElement ManagerADVOpenProfileBack;
//			
//			@FindBy(xpath = "//span[normalize-space()='Back']")
//			@CacheLookup
//			WebElement ManagerADVOpenProfileBack;
//			
//			

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

// #*******************************************Manager ADV Page****************************************

	public void AdminManagerADV() {
		AdminManagerADV.click();
	}

	public void ManagerADVInhouse() {
		ManagerADVInhouse.click();
	}

	public void enterManagerADVSearch() {
		ManagerADVSearch.sendKeys("AD6627542716DF8");
	}

	public void ManagerADVCategoryFilter() {
		ManagerADVCategoryFilter.click();
	}

	public void ManagerADVCategory7Search() {
		ManagerADVCategory7Search.click();
	}

	public void ManagerADVCategoryAllCategories() {
		ManagerADVCategoryAllCategories.click();
	}

	public void ManagerADVCategoryCrypto() {
		ManagerADVCategoryCrypto.click();
	}

	public void ManagerADVCategoryDating() {
		ManagerADVCategoryDating.click();
	}

	public void ManagerADVCategoryEcommerce() {
		ManagerADVCategoryEcommerce.click();
	}

	public void ManagerADVCategoryFinance() {
		ManagerADVCategoryFinance.click();
	}

	public void ManagerADVCategoryFood() {
		ManagerADVCategoryFood.click();
	}

	public void ManagerADVCategoryGambling() {
		ManagerADVCategoryGambling.click();
	}

	public void ManagerADVCategoryHealth() {
		ManagerADVCategoryHealth.click();
	}

	public void ManagerADVStatus() {
		ManagerADVStatus.click();
	}

	public void ManagerADVStatusActive() {
		ManagerADVStatusActive.click();
	}

	public void ManagerADVStatusSuspend() {
		ManagerADVStatusSuspend.click();
	}

	public void ManagerADVStatusHold() {
		ManagerADVStatusHold.click();
	}

	public void ManagerADVSource() {
		ManagerADVSource.click();
	}

	public void ManagerADVSourceAdmin() {
		ManagerADVSourceAdmin.click();
	}

	public void ManagerADVSourceApp() {
		ManagerADVSourceApp.click();
	}

	public void ManagerADVSourceOrganic() {
		ManagerADVSourceOrganic.click();
	}

	public void ManagerADVSourceInfoAds() {
		ManagerADVSourceInfoAds.click();
	}

	public void ManagerADVSourceUsAds() {
		ManagerADVSourceUsAds.click();
	}

	public void ManagerADVSourceExternal() {
		ManagerADVSourceExternal.click();
	}

	public void ManagerADVDate() {
		ManagerADVDate.click();
	}

	public void ManagerADVDate1Ap() {
		ManagerADVDate1Ap.click();
	}

	public void ManagerADVDate23Ap() {
		ManagerADVDate23Ap.click();
	}

	public void ManagerADVSearchButton() {
		ManagerADVSearchButton.click();
	}

	public void ManagerADVStatusAct() {
		ManagerADVStatusAct.click();
	}

	public void ManagerADVStatusSuS() {
		ManagerADVStatusSuS.click();
	}

//*****************************************open ADV Details********************************

	public void ManagerADVOpenProfileInhouse() {
		ManagerADVOpenProfileInhouse.click();
	}

	public void ManagerADVOpenProfileCampaign() {
		ManagerADVOpenProfileCampaign.click();
	}

	public void ManagerADVOpenProfileAddFund() {
		ManagerADVOpenProfileAddFund.click();
	}

	public void ManagerADVOpenProfileAddFundEnter() {
		ManagerADVOpenProfileAddFundEnter.sendKeys("25");
	}

	public void ManagerADVOpenProfileAddFundGateway() {
		ManagerADVOpenProfileAddFundGateway.click();
	}

	public void ManagerADVOpenProfileAddFundBonus() {
		ManagerADVOpenProfileAddFundBonus.click();
	}

	public void enterManagerADVOpenProfileAddFundRemak() {
		ManagerADVOpenProfileAddFundRemark.sendKeys("for automation testing");
	}

	public void ManagerADVOpenProfileAddFundSubmit() {
		ManagerADVOpenProfileAddFundSubmit.click();
	}

	public void ManagerADVOpenProfileTransactions() {
		ManagerADVOpenProfileTransactions.click();
	}

	public void ManagerADVOpenProfileBack() {
		ManagerADVOpenProfileBack.click();
	}

//#**************************************Manager ADV Client***********************************

	public void ManagerADVClient() {
		ManagerADVClient.click();
	}
	
	public void ManagerADVOpenProfileClient() {
		ManagerADVOpenProfileClient.click();
	}

	public void ManagerADVSearch() {
		ManagerADVSearch.sendKeys("ADV662BB80161299");
	}

}
