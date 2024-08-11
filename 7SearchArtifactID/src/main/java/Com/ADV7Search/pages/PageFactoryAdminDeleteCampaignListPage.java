package Com.ADV7Search.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class PageFactoryAdminDeleteCampaignListPage {

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

// #********************************************Deleted Campaigns List Page**********************************

	@FindBy(xpath = "//span[normalize-space()='Deleted Campaigns List']")
	@CacheLookup
	WebElement AdminDeletedCampaignsList;

	@FindBy(xpath = "//input[@id='default-04']")
	@CacheLookup
	WebElement AdminDeletedCampaignsListSearch;

	@FindBy(xpath = "//span[contains(text(),'By')]")
	@CacheLookup
	WebElement AdminDeletedCampaignsListByAds;

	@FindBy(xpath = "//span[normalize-space()='Text Ads']")
	@CacheLookup
	WebElement AdminDeletedCampaignsListByAdsText;

	@FindBy(xpath = "//span[normalize-space()='Banner Ads']")
	@CacheLookup
	WebElement AdminDeletedCampaignsListByAdsBanner;

	@FindBy(xpath = "//span[normalize-space()='Video Ads']")
	@CacheLookup
	WebElement AdminDeletedCampaignsListByAdsVideo;

	@FindBy(xpath = "//span[normalize-space()='In-Page Push Ads']")
	@CacheLookup
	WebElement AdminDeletedCampaignsListByAdsInPagePush;

	@FindBy(xpath = "//span[normalize-space()='Native Ads']")
	@CacheLookup
	WebElement AdminDeletedCampaignsListByAdsNative;

	@FindBy(xpath = "//span[normalize-space()='Popunder Ads']")
	@CacheLookup
	WebElement AdminDeletedCampaignsListByAdsPopunder;

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

// #*******************************************Deleted Campaigns List Page****************************************

	public void AdminDeletedCampaignsList() {
		AdminDeletedCampaignsList.click();
	}

	public void enterAdminDeletedCampaignsListSearch() {
		AdminDeletedCampaignsListSearch.sendKeys("CMPN6645A01637C03");
	}

	public void AdminDeletedCampaignsListByAds() {
		AdminDeletedCampaignsListByAds.click();
	}

	public void AdminDeletedCampaignsListByAdsText() {
		AdminDeletedCampaignsListByAdsText.click();
	}

	public void AdminDeletedCampaignsListByAdsBanner() {
		AdminDeletedCampaignsListByAdsBanner.click();
	}

	public void AdminDeletedCampaignsListByAdsVideo() {
		AdminDeletedCampaignsListByAdsVideo.click();
	}

	public void AdminDeletedCampaignsListByAdsInPagePush() {
		AdminDeletedCampaignsListByAdsInPagePush.click();
	}

	public void AdminDeletedCampaignsListByAdsNative() {
		AdminDeletedCampaignsListByAdsNative.click();
	}

	public void AdminDeletedCampaignsListByAdsPopunder() {
		AdminDeletedCampaignsListByAdsPopunder.click();
	}

}
