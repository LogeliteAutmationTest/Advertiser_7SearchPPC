package Com.ADV7Search.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class PageFactoryAdminCampaignListPage {

// #*************************************Login Page**************************************

	@FindBy(xpath = "//input[@id='default-01']")
	//@CacheLookup
	WebElement Email;

	@FindBy(xpath = "//input[@id='password']")
	//@CacheLookup
	WebElement Password;

	@FindBy(xpath = "//button[@type='submit']")
	//@CacheLookup
	WebElement clickLoginButton;

// #********************************************Manager Category Page**********************************

	@FindBy(xpath = "//*[@id=\"root\"]/div[1]/div/div[1]/div[2]/div/div[1]/div[2]/div/div/div/ul/li[9]/a/span[2]")
	//@CacheLookup
	WebElement AdminCampaignList;

	@FindBy(xpath = "//input[@id='header_contents']")
	@CacheLookup
	WebElement AdminCampaignListSearch;
	
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

	@FindBy(xpath = "//span[normalize-space()='By Category']")
	@CacheLookup
	WebElement AdminCampaignListCategory;

	@FindBy(xpath = "//span[normalize-space()='7Search PPC']")
	@CacheLookup
	WebElement AdminCampaignListCategory7SearchPPC;
	
	@FindBy(xpath = "//span[normalize-space()='Dating & Adult']")
	@CacheLookup
	WebElement AdminCampaignListCategoryAdult;

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

	@FindBy(xpath = "//span[normalize-space()='By Operator']")
	@CacheLookup
	WebElement AdminCampaignListByOperator;

	@FindBy(xpath = "//a[@role='menuitem']//span[contains(text(),'Client')]")
	@CacheLookup
	WebElement AdminCampaignListByOperatorClient;
	
	@FindBy(xpath = "//span[normalize-space()='By Operator']")
	@CacheLookup
	WebElement AdminCampaignListByOperatorC;

	@FindBy(xpath = "//a[@role='menuitem']//span[contains(text(),'Inhouse')]")
	@CacheLookup
	WebElement AdminCampaignListByOperatorInhouse;

	@FindBy(xpath = "//span[normalize-space()='Gambling']")
	@CacheLookup
	WebElement AdminCampaignListByOperato;

	@FindBy(xpath = "//span[normalize-space()='cam']")
	@CacheLookup
	WebElement AdminCampaignProfile;

	@FindBy(xpath = "//a[normalize-space()='Campaign Image']")
	@CacheLookup
	WebElement AdminCampaignProfileImage;

	@FindBy(xpath = "//span[normalize-space()='Back']")
	@CacheLookup
	WebElement AdminCampaignProfileBack;

	@FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[8]/div[13]/ul[1]/li[1]/div[1]/a[1]/em[1]")
	@CacheLookup
	WebElement AdminCampaignListThreeDot;

	@FindBy(xpath = "//div[contains(@class,'dropdown-menu dropdown-menu-right show')]//span[contains(text(),'View Logs')]")
	@CacheLookup
	WebElement AdminCampaignListViewLog;

	@FindBy(xpath = "//a[@class='text-dark']//em[@class='icon ni ni-arrow-left']")
	@CacheLookup
	WebElement AdminCampaignListViewLogBack;

//	@FindBy(xpath = "//span[normalize-space()='Gambling']")
//	@CacheLookup
//	WebElement AdminCampaignListByAds;
//	
//	@FindBy(xpath = "//span[normalize-space()='Gambling']")
//	@CacheLookup
//	WebElement AdminCampaignListByAds;
//	
//	@FindBy(xpath = "//span[normalize-space()='Gambling']")
//	@CacheLookup
//	WebElement AdminCampaignListByAds;
//	
//	@FindBy(xpath = "//span[normalize-space()='Gambling']")
//	@CacheLookup
//	WebElement AdminCampaignListByAds;

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
		AdminCampaignListSearchThreedotAddImpDate.sendKeys("22-07-2024");
	}
	
	public void AdminCampaignListSearchThreedotAddImpSave() {
		AdminCampaignListSearchThreedotAddImpSave.click();
	}
	
	public void AdminCampaignListSearchThreedotAddImpBack() {
		AdminCampaignListSearchThreedotAddImpBack.click();
	}
	
	public void AdminCampaignListCategory() {
		AdminCampaignListCategory.click();
	}

	public void AdminCampaignListCategory7SearchPPC() {
		AdminCampaignListCategory7SearchPPC.click();
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

	public void AdminCampaignListThreeDot() {
		AdminCampaignListThreeDot.click();
	}

	public void AdminCampaignListViewLog() {
		AdminCampaignListViewLog.click();
	}

	public void AdminCampaignListViewLogBack() {
		AdminCampaignListViewLogBack.click();
	}
//	public void AdminCampaignListViewLog() {
//		AdminCampaignListViewLog.click();
//	}

}
