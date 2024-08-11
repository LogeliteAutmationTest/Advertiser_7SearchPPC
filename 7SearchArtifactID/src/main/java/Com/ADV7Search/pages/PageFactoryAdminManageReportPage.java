package Com.ADV7Search.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class PageFactoryAdminManageReportPage {

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

//#********************************************Manager Category Page**********************************

	@FindBy(xpath = "//span[normalize-space()='Manage Report']")
	@CacheLookup
	WebElement AdminManagerReport;

	@FindBy(xpath = "//span[normalize-space()='Campaign Report']")
	@CacheLookup
	WebElement AdminManagerCampaignReport;

	@FindBy(xpath = "//input[@id='default-04']")
	@CacheLookup
	WebElement AdminManagerCampaignReportSearch;

	@FindBy(xpath = "//span[normalize-space()='By Category']")
	@CacheLookup
	WebElement AdminCampaignListCategory;

	@FindBy(xpath = "//span[normalize-space()='7Search PPC']")
	@CacheLookup
	WebElement AdminCampaignListCategory7SearchPPC;

	@FindBy(xpath = "//a[@role='menuitem']//span[contains(text(),'Adult & Dating')]")
	@CacheLookup
	WebElement AdminCampaignListCategoryAdult;

	@FindBy(xpath = "//span[normalize-space()='Crypto']")
	@CacheLookup
	WebElement AdminCampaignListCategoryCrypto;

	@FindBy(xpath = "//span[normalize-space()='Gambling']")
	@CacheLookup
	WebElement AdminCampaignListCategoryGambling;

	@FindBy(xpath = "//body/div[@id='root']/div[@class='nk-app-root']/div[@class='nk-main']/div[@class='nk-wrap']/div[@class='nk-content']/div[@class='container-fluid']/div[@class='nk-content-inner']/div[@class='nk-content-body']/div[@class='nk-block-head nk-block-head-sm']/div[contains(@class,'nk-block-between')]/div[@class='nk-block-head-content']/div[@class='toggle-wrap nk-block-tools-toggle']/div[@class='toggle-expand-content']/ul[@class='nk-block-tools g-3']/li[3]/div[1]/a[1]/span[1]")
	@CacheLookup
	WebElement AdminCampaignListByAds;

	@FindBy(xpath = "//span[normalize-space()='Text Ads']")
	@CacheLookup
	WebElement AdminCampaignListByAdsTextAds;

	@FindBy(xpath = "//span[normalize-space()='Banner Ads']")
	@CacheLookup
	WebElement AdminCampaignListByAdsBanner;

	@FindBy(xpath = "//span[normalize-space()='Video Ads']")
	@CacheLookup
	WebElement AdminCampaignListByAdsVideo;

	@FindBy(xpath = "//span[normalize-space()='In-Page Push Ads']")
	@CacheLookup
	WebElement AdminCampaignListByAdsInPage;

	@FindBy(xpath = "//span[normalize-space()='Native Ads']")
	@CacheLookup
	WebElement AdminCampaignListByAdsNative;

	@FindBy(xpath = "//span[normalize-space()='Popunder Ads']")
	@CacheLookup
	WebElement AdminCampaignListByAdsPopunder;

	@FindBy(xpath = "//span[normalize-space()='Gambling']")
	@CacheLookup
	WebElement AdminCampaignListByAdsGambling;

	@FindBy(xpath = "//body/div[@id='root']/div[@class='nk-app-root']/div[@class='nk-main']/div[@class='nk-wrap']/div[@class='nk-content']/div[@class='container-fluid']/div[@class='nk-content-inner']/div[@class='nk-content-body']/div[@class='nk-block-head nk-block-head-sm']/div[contains(@class,'nk-block-between')]/div[@class='nk-block-head-content']/div[@class='toggle-wrap nk-block-tools-toggle']/div[@class='toggle-expand-content']/ul[@class='nk-block-tools g-3']/li[4]/div[1]/a[1]/span[1]")
	@CacheLookup
	WebElement AdminCampaignListByStatus;

	@FindBy(xpath = "//span[normalize-space()='InReview']")
	@CacheLookup
	WebElement AdminCampaignListByAdsInReview;

	@FindBy(xpath = "//a[@href='#dropdownitem']//span[contains(text(),'Active')]")
	@CacheLookup
	WebElement AdminCampaignListByAdsActive;

	@FindBy(xpath = "//a[@href='#dropdownitem']//span[contains(text(),'Paused')]")
	@CacheLookup
	WebElement AdminCampaignListByAdsPaused;

	@FindBy(xpath = "//span[normalize-space()='OnHold']")
	@CacheLookup
	WebElement AdminCampaignListByAdsOnHold;

	@FindBy(xpath = "//a[@href='#dropdownitem']//span[contains(text(),'Suspend')]")
	@CacheLookup
	WebElement AdminCampaignListByAdsSuspend;

	@FindBy(xpath = "//button[@class='btn btn-primary']")
	@CacheLookup
	WebElement AdminCampaignListSearchButton1;

//#********************************************User Wallet Report Page**********************************

	@FindBy(xpath = "//span[normalize-space()='User Wallet Report']")
	@CacheLookup
	WebElement AdminUserWalletReport;

	@FindBy(xpath = "//input[@id='default-04']")
	@CacheLookup
	WebElement AdminUserWalletReportSearch;

	@FindBy(xpath = "//span[normalize-space()='By User Type']")
	@CacheLookup
	WebElement AdminUserWalletReportUserType;

	@FindBy(xpath = "//a[@role='menuitem']//span[contains(text(),'Advertiser')]")
	@CacheLookup
	WebElement AdminUserWalletReportUserTypeADV;

	@FindBy(xpath = "//a[@role='menuitem']//span[contains(text(),'Publisher')]")
	@CacheLookup
	WebElement AdminUserWalletReportUserTypePUB;

	@FindBy(xpath = "//span[normalize-space()='By Operator']")
	@CacheLookup
	WebElement AdminUserWalletReportOperator;

	@FindBy(xpath = "//a[@role='menuitem']//span[contains(text(),'Client')]")
	@CacheLookup
	WebElement AdminUserWalletReportOperatorClient;;

	@FindBy(xpath = "//a[@role='menuitem']//span[contains(text(),'Inhouse')]")
	@CacheLookup
	WebElement AdminUserWalletReportOperatorInhouse;;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[4]/div[1]/a[1]")
	@CacheLookup
	WebElement AdminUserWalletReportStatus;

	@FindBy(xpath = "//a[@role='menuitem']//span[contains(text(),'Active')]")
	@CacheLookup
	WebElement AdminUserWalletReportStatusActive;

	@FindBy(xpath = "//span[normalize-space()='Pending']")
	@CacheLookup
	WebElement AdminUserWalletReportStatusPending;

	@FindBy(xpath = "//span[normalize-space()='Hold']")
	@CacheLookup
	WebElement AdminUserWalletReportStatusHold;

	@FindBy(xpath = "//span[normalize-space()='Suspended']")
	@CacheLookup
	WebElement AdminUserWalletReportStatusSuspended;

	@FindBy(xpath = "//span[normalize-space()='Search']")
	@CacheLookup
	WebElement AdminCampaignListSearchButton2;

// #*******************************************Login Page****************************************

	public void enterEmail() {
		Email.sendKeys("admin");
	}

	public void enterPassword() {
		Password.sendKeys("7Search@pass123");
	}
	//7Search@passcom555

	public void clickLoginButton() {
		clickLoginButton.click();

	}

// #*******************************************Manager Category Page****************************************

	public void AdminManagerReport() {
		AdminManagerReport.click();

	}

	public void AdminManagerCampaignReport() {
		AdminManagerCampaignReport.click();

	}

	public void enterAdminManagerCampaignReportSearch() {
		AdminManagerCampaignReportSearch.sendKeys("CMPB6639F45C3BEB5");
	}

	public void AdminCampaignListCategory() {
		AdminCampaignListCategory.click();
	}

	public void AdminCampaignListCategory7SearchPPC() {
		AdminCampaignListCategory7SearchPPC.click();
	}

	public void AdminCampaignListCategoryCrypto() {
		AdminCampaignListCategoryCrypto.click();
	}

	public void AdminCampaignListCategoryGambling() {
		AdminCampaignListCategoryGambling.click();
	}

	public void AdminCampaignListByStatus() {
		AdminCampaignListByStatus.click();
	}

	public void AdminCampaignListByAdsInReview() {
		AdminCampaignListByAdsInReview.click();
	}

	public void AdminCampaignListByAdsActive() {
		AdminCampaignListByAdsActive.click();
	}

	public void AdminCampaignListByAdsPaused() {
		AdminCampaignListByAdsPaused.click();
	}

	public void AdminCampaignListByAdsOnHold() {
		AdminCampaignListByAdsOnHold.click();
	}

	public void AdminCampaignListByAdsSuspend() {
		AdminCampaignListByAdsSuspend.click();
	}

// #******************************************* User Wallet Report Page ****************************************

	public void AdminUserWalletReport() {
		AdminUserWalletReport.click();

	}

	public void enterAdminUserWalletReportSearch() {
		AdminUserWalletReportSearch.sendKeys("ADV663CC495D049E");

	}

	public void AdminUserWalletReportUserType() {
		AdminUserWalletReportUserType.click();

	}

	public void AdminUserWalletReportUserTypeADV() {
		AdminUserWalletReportUserTypeADV.click();

	}

	public void AdminUserWalletReportUserTypePUB() {
		AdminUserWalletReportUserTypePUB.click();

	}

	public void AdminUserWalletReportOperator() {
		AdminUserWalletReportOperator.click();

	}

	public void AdminUserWalletReportOperatorClient() {
		AdminUserWalletReportOperatorClient.click();

	}

	public void AdminUserWalletReportOperatorInhouse() {
		AdminUserWalletReportOperatorInhouse.click();

	}

	public void AdminUserWalletReportStatus() {
		AdminUserWalletReportStatus.click();

	}

	public void AdminUserWalletReportStatusActive() {
		AdminUserWalletReportStatusActive.click();

	}

	public void AdminUserWalletReportStatusPending() {
		AdminUserWalletReportStatusPending.click();

	}

	public void AdminUserWalletReportStatusSuspended() {
		AdminUserWalletReportStatusSuspended.click();

	}

	public void AdminCampaignListSearchButton2() {
		AdminCampaignListSearchButton2.click();

	}

}
