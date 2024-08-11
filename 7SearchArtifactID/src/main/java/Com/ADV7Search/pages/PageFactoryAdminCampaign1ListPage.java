package Com.ADV7Search.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class PageFactoryAdminCampaign1ListPage {

// #*************************************Login Page**************************************

	@FindBy(xpath = "//input[@id='default-01']")
	// @CacheLookup
	WebElement Email;

	@FindBy(xpath = "//input[@id='password']")
	// @CacheLookup
	WebElement Password;

	@FindBy(xpath = "//button[@type='submit']")
	// @CacheLookup
	WebElement clickLoginButton;

// #*******************************************Campaign List Page****************************************

	@FindBy(xpath = "//span[normalize-space()='Campaigns List']")
	// @CacheLookup
	WebElement AdminCampaignList;

	@FindBy(xpath = "//input[@id='header_contents']")
	@CacheLookup
	WebElement AdminCampaignListSearch;

	@FindBy(xpath = "//button[normalize-space()='Yes']")
	@CacheLookup
	WebElement AdminCampaignListSearchThreedotYes;

	@FindBy(xpath = "//a[@class='dropdown-toggle btn btn-icon btn-trigger']//em[@class='icon ni ni-more-h']")
	@CacheLookup
	WebElement AdminCampaignListSearchThreedot;

	@FindBy(xpath = "//ul[@class='link-list-opt no-bdr']//li//li//span[contains(text(),'Active')]")
	@CacheLookup
	WebElement AdminCampaignListSearchThreedotActive;

	@FindBy(xpath = "//a[contains(@href,'#markasdone')]//span[contains(text(),'Paused')]")
	@CacheLookup
	WebElement AdminCampaignListSearchThreedotPaused;

	@FindBy(xpath = "//span[normalize-space()='Add Impression']")
	@CacheLookup
	WebElement AdminCampaignListSearchThreedotAddImp;

	@FindBy(xpath = "//input[contains(@placeholder,'Please Enter Impressions')]")
	@CacheLookup
	WebElement AdminCampaignListSearchThreedotAddImpEnter;

	@FindBy(xpath = "//input[@id='click']")
	@CacheLookup
	WebElement AdminCampaignListSearchThreedotAddImpEnterClick;

	@FindBy(xpath = "//input[@placeholder='Please Enter Date']")
	@CacheLookup
	WebElement AdminCampaignListSearchThreedotAddImpDate;

	@FindBy(xpath = "//button[@id='savebtn']")
	@CacheLookup
	WebElement AdminCampaignListSearchThreedotAddImpSave;

	@FindBy(xpath = "//button[@class='btn']")
	@CacheLookup
	WebElement AdminCampaignListSearchThreedotAddImpBack;

// #*******************************************Category Page****************************************

	@FindBy(xpath = "//span[normalize-space()='By Category']")
	@CacheLookup
	WebElement AdminCampaignListCategory;

	@FindBy(xpath = "//span[normalize-space()='Dating & Adult']")
	@CacheLookup
	WebElement AdminCampaignListCategoryAdult;

	@FindBy(xpath = "//body/div[@id='root']/div[@class='nk-app-root']/div[@class='nk-main']/div[@class='nk-wrap']/div[@class='nk-content']/div[@class='container-fluid']/div[@class='nk-content-inner']/div[@class='nk-content-body']/div[@class='nk-block-head nk-block-head-sm']/div[contains(@class,'nk-block-between')]/div[@class='nk-block-head-content']/div[@class='toggle-wrap nk-block-tools-toggle']/div[@class='toggle-expand-content']/ul[@class='nk-block-tools g-3']/li/div[@class='dropdown']/a[contains(@class,'dropdown-toggle btn btn-white btn-dim btn-outline-light m-0')]/span[1]")
	@CacheLookup
	WebElement AdminCampaignListCategoryA;

	@FindBy(xpath = "//span[normalize-space()='Gambling']")
	@CacheLookup
	WebElement AdminCampaignListCategoryGambling;

	@FindBy(xpath = "//span[normalize-space()='Search']")
	@CacheLookup
	WebElement AdminCampaignListSearchButton;

	@FindBy(xpath = "//body/div[@id='root']/div[@class='nk-app-root']/div[@class='nk-main']/div[@class='nk-wrap']/div[@class='nk-content']/div[@class='container-fluid']/div[@class='nk-content-inner']/div[@class='nk-content-body']/div[@class='nk-block-head nk-block-head-sm']/div[contains(@class,'nk-block-between')]/div[@class='nk-block-head-content']/div[@class='toggle-wrap nk-block-tools-toggle']/div[@class='toggle-expand-content']/ul[@class='nk-block-tools g-3']/li[3]/div[1]/a[1]/span[1]")
	@CacheLookup
	WebElement AdminCampaignListByAds;

	@FindBy(xpath = "//span[normalize-space()='Text Ads']")
	@CacheLookup
	WebElement AdminCampaignListByAdsTextAds;

	@FindBy(xpath = "//div[@class='nk-block-head nk-block-head-sm']//span//span[1]")
	@CacheLookup
	WebElement AdminCampaignListByAdsT;

	@FindBy(xpath = "//span[normalize-space()='Banner Ads']")
	@CacheLookup
	WebElement AdminCampaignListByAdsBanner;

	@FindBy(xpath = "//span[normalize-space()='In-Page Push Ads']")
	@CacheLookup
	WebElement AdminCampaignListByAdsInPage;

	@FindBy(xpath = "//span[normalize-space()='Native Ads']")
	@CacheLookup
	WebElement AdminCampaignListByAdsNative;

	@FindBy(xpath = "//span[normalize-space()='Popunder Ads']")
	@CacheLookup
	WebElement AdminCampaignListByAdsPopunder;

	@FindBy(xpath = "//span[@class='m-0']")
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

	@FindBy(xpath = "//span[normalize-space()='By User : All']")
	@CacheLookup
	WebElement AdminCampaignListByOperator;

	@FindBy(xpath = "//a[@role='menuitem']//span[contains(text(),'Client')]")
	@CacheLookup
	WebElement AdminCampaignListByOperatorClient;

	@FindBy(xpath = "//span[normalize-space()='By User : Client']")
	@CacheLookup
	WebElement AdminCampaignListByOperatorC;

	@FindBy(xpath = "//a[@role='menuitem']//span[contains(text(),'Inhouse')]")
	@CacheLookup
	WebElement AdminCampaignListByOperatorInhouse;

	@FindBy(xpath = "//span[normalize-space()='cam']")
	@CacheLookup
	WebElement AdminCampaignProfile;

	@FindBy(xpath = "//a[normalize-space()='Campaign Image']")
	@CacheLookup
	WebElement AdminCampaignProfileImage;

	@FindBy(xpath = "//span[normalize-space()='Back']")
	@CacheLookup
	WebElement AdminCampaignProfileBack;

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

// #*******************************************Campaign List Page****************************************

	public void AdminCampaignList() {
		AdminCampaignList.click();

	}

	public void enterAdminCampaignListSearch() {
		AdminCampaignListSearch.sendKeys("CMPN669F87D37320C");
	}

	public void AdminCampaignListSearchThreedot() {
		AdminCampaignListSearchThreedot.click();
	}

	public void AdminCampaignListSearchThreedotYes() {
		AdminCampaignListSearchThreedotYes.click();
	}

	public void AdminCampaignListSearchThreedotActive() {
		AdminCampaignListSearchThreedotActive.click();
	}

	public void AdminCampaignListSearchThreedotPaused() {
		AdminCampaignListSearchThreedotPaused.click();
	}

	public void AdminCampaignListSearchThreedotAddImp() {
		AdminCampaignListSearchThreedotAddImp.click();
	}

	public void enterAdminCampaignListSearchThreedotAddImpEnter() {
		AdminCampaignListSearchThreedotAddImpEnter.sendKeys("1000");
	}

	public void enterAdminCampaignListSearchThreedotAddImpEnterClick() {
		AdminCampaignListSearchThreedotAddImpEnterClick.sendKeys("10");
	}

	public void enterAdminCampaignListSearchThreedotAddImpDate() {
		AdminCampaignListSearchThreedotAddImpDate.sendKeys("23-07-2024");
	}

	public void AdminCampaignListSearchThreedotAddImpSave() {
		AdminCampaignListSearchThreedotAddImpSave.click();
	}

	public void AdminCampaignListSearchThreedotAddImpBack() {
		AdminCampaignListSearchThreedotAddImpBack.click();
	}

// #*******************************************Category Page****************************************

	public void AdminCampaignListCategory() {
		AdminCampaignListCategory.click();
	}

	public void AdminCampaignListCategoryAdult() {
		AdminCampaignListCategoryAdult.click();
	}

	public void AdminCampaignListCategoryA() {
		AdminCampaignListCategoryA.click();
	}

	public void AdminCampaignListCategoryGambling() {
		AdminCampaignListCategoryGambling.click();
	}

	public void AdminCampaignListSearchButton() {
		AdminCampaignListSearchButton.click();
	}

	public void AdminCampaignListByAds() {
		AdminCampaignListByAds.click();
	}

	public void AdminCampaignListByAdsTextAds() {
		AdminCampaignListByAdsTextAds.click();
	}

	public void AdminCampaignListByAdsT() {
		AdminCampaignListByAdsT.click();
	}

	public void AdminCampaignListByAdsBanner() {
		AdminCampaignListByAdsBanner.click();
	}

	public void AdminCampaignListByAdsInPage() {
		AdminCampaignListByAdsInPage.click();
	}

	public void AdminCampaignListByAdsNative() {
		AdminCampaignListByAdsNative.click();
	}

	public void AdminCampaignListByAdsPopunder() {
		AdminCampaignListByAdsPopunder.click();
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

	public void AdminCampaignListByOperator() {
		AdminCampaignListByOperator.click();
	}

	public void AdminCampaignListByOperatorClient() {
		AdminCampaignListByOperatorClient.click();
	}

	public void AdminCampaignListByOperatorC() {
		AdminCampaignListByOperatorC.click();
	}

	public void AdminCampaignListByOperatorInhouse() {
		AdminCampaignListByOperatorInhouse.click();
	}

	public void AdminCampaignProfile() {
		AdminCampaignProfile.click();
	}

	public void AdminCampaignProfileImage() {
		AdminCampaignProfileImage.click();
	}

	public void AdminCampaignProfileBack() {
		AdminCampaignProfileBack.click();
	}
}
