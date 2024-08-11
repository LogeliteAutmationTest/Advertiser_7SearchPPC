package Com.ADV7Search.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class PageFactoryAdminPublisherAdUnitListPage {

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

// #********************************************Publisher Ads Unit List Page**********************************

	@FindBy(xpath = "//span[normalize-space()='AdUnit List']")
	@CacheLookup
	WebElement AdminManageAdUnitList;

	@FindBy(xpath = "//input[@id='default-04']")
	@CacheLookup
	WebElement AdminManageAdUnitListSearch;

	@FindBy(xpath = "//body/div[@id='root']/div[@class='nk-app-root']/div[@class='nk-main']/div[@class='nk-wrap']/div[@class='nk-content']/div[@class='container-fluid']/div[@class='nk-content-inner']/div[@class='nk-content-body']/div[@class='nk-block-head nk-block-head-sm']/div[contains(@class,'nk-block-between')]/div[@class='nk-block-head-content']/div[@class='toggle-wrap nk-block-tools-toggle']/div[@class='toggle-expand-content']/ul[@class='nk-block-tools g-3']/li[2]/div[1]/a[1]/span[1]")
	@CacheLookup
	WebElement AdminManageAdUnitListByCategory;

	@FindBy(xpath = "//span[normalize-space()='Dating & Adult']")
	@CacheLookup
	WebElement AdminManageAdUnitListByCategoryAdultDating;

	@FindBy(xpath = "//a[@role='menuitem']//span[contains(text(),'All Categories')]")
	@CacheLookup
	WebElement AdminManageAdUnitListByCategoryAllCategories;

	@FindBy(xpath = "//span[normalize-space()='Finance & Crypto']")
	@CacheLookup
	WebElement AdminManageAdUnitListByCategoryCrypto;

	@FindBy(xpath = "//span[normalize-space()='Gambling']")
	@CacheLookup
	WebElement AdminManageAdUnitListByCategoryGambling;

	@FindBy(xpath = "//span[normalize-space()='By Ads: All']")
	@CacheLookup
	WebElement AdminManageAdUnitListByAds;

	@FindBy(xpath = "//span[normalize-space()='Text Ads']")
	@CacheLookup
	WebElement AdminManageAdUnitListByAdsText;

	@FindBy(xpath = "//span[normalize-space()='Banner Ads']")
	@CacheLookup
	WebElement AdminManageAdUnitListByAdsBanner;

	@FindBy(xpath = "//span[normalize-space()='Video Ads']")
	@CacheLookup
	WebElement AdminManageAdUnitListByAdsVideo;

	@FindBy(xpath = "//span[normalize-space()='In-Page Push Ads']")
	@CacheLookup
	WebElement AdminManageAdUnitListByAdsInPagePush;

	@FindBy(xpath = "//span[normalize-space()='Native Ads']")
	@CacheLookup
	WebElement AdminManageAdUnitListByAdsNative;

	@FindBy(xpath = "//span[normalize-space()='Popunder Ads']")
	@CacheLookup
	WebElement AdminManageAdUnitListByAdsPopunder;

	@FindBy(xpath = "//body/div[@id='root']/div[@class='nk-app-root']/div[@class='nk-main']/div[@class='nk-wrap']/div[@class='nk-content']/div[@class='container-fluid']/div[@class='nk-content-inner']/div[@class='nk-content-body']/div[@class='nk-block-head nk-block-head-sm']/div[@class='nk-block-between ']/div[@class='nk-block-head-content']/div[@class='toggle-wrap nk-block-tools-toggle']/div[@class='toggle-expand-content']/ul[@class='nk-block-tools g-3']/li[4]/div[1]/a[1]/span[1]")
	@CacheLookup
	WebElement AdminManageAdUnitListByStatus;

	@FindBy(xpath = "//a[contains(@href,'#dropdownitem')]//span[contains(text(),'Inactive')]")
	@CacheLookup
	WebElement AdminManageAdUnitListByStatusInactive;
	
	@FindBy(xpath = "//a[contains(@href,'#dropdownitem')]//span[contains(text(),'Active')]")
	@CacheLookup
	WebElement AdminManageAdUnitListByStatusActive;

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

// #*******************************************Manage Publisher AdUnit List Page****************************************

	public void AdminManageAdUnitList() {
		AdminManageAdUnitList.click();
	}

	public void AdminManageAdUnitListByCategory() {
		AdminManageAdUnitListByCategory.click();
	}

	public void enterAdminManageAdUnitListSearch() {
		AdminManageAdUnitListSearch.sendKeys("PUB660AAF4537B64");
	}

	public void AdminManageAdUnitListByCategoryAdultDating() {
		AdminManageAdUnitListByCategoryAdultDating.click();
	}

	public void AdminManageAdUnitListByCategoryAllCategories() {
		AdminManageAdUnitListByCategoryAllCategories.click();
	}

	public void AdminManageAdUnitListByCategoryCrypto() {
		AdminManageAdUnitListByCategoryCrypto.click();
	}

	public void AdminManageAdUnitListByCategoryGambling() {
		AdminManageAdUnitListByCategoryGambling.click();
	}

	public void AdminManageAdUnitListByAds() {
		AdminManageAdUnitListByAds.click();
	}

	public void AdminManageAdUnitListByAdsText() {
		AdminManageAdUnitListByAdsText.click();
	}

	public void AdminManageAdUnitListByAdsBanner() {
		AdminManageAdUnitListByAdsBanner.click();
	}

	public void AdminManageAdUnitListByAdsVideo() {
		AdminManageAdUnitListByAdsVideo.click();
	}

	public void AdminManageAdUnitListByAdsInPagePush() {
		AdminManageAdUnitListByAdsInPagePush.click();
	}

	public void AdminManageAdUnitListByAdsNative() {
		AdminManageAdUnitListByAdsNative.click();
	}

	public void AdminManageAdUnitListByAdsPopunder() {
		AdminManageAdUnitListByAdsPopunder.click();
	}

	public void AdminManageAdUnitListByStatus() {
		AdminManageAdUnitListByStatus.click();
	}

	public void AdminManageAdUnitListByStatusInactive() {
		AdminManageAdUnitListByStatusInactive.click();
	}
	
	public void AdminManageAdUnitListByStatusActive() {
		AdminManageAdUnitListByStatusActive.click();
	}

}
