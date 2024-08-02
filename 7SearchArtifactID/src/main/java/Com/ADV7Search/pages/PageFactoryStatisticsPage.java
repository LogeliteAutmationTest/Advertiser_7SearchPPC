package Com.ADV7Search.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class PageFactoryStatisticsPage {

// #***************************Login Page*******************************

	@FindBy(xpath = "//input[@id='default-01']")
	@CacheLookup
	WebElement Email;

	@FindBy(xpath = "//input[@id='password']")
	@CacheLookup
	WebElement Password;

	@FindBy(xpath = "//button[@type='submit']")
	@CacheLookup
	WebElement clickLoginButton;

// #***************************Statistics Page*******************************

	@FindBy(xpath = "//span[normalize-space()='Statistics']")
	@CacheLookup
	WebElement Statistics;

	@FindBy(xpath = "//span[normalize-space()='By Campaign']")
	@CacheLookup
	WebElement ByCampaign;

	@FindBy(xpath = "//span[normalize-space()='Account']")
	@CacheLookup
	WebElement ByCampaignAccount;

	@FindBy(xpath = "//span[normalize-space()='By Ads']")
	@CacheLookup
	WebElement ByAds;

	@FindBy(xpath = "//span[normalize-space()='Text Ads']")
	@CacheLookup
	WebElement ByAdsText;

	@FindBy(xpath = "//span[normalize-space()='Banner Ads']")
	@CacheLookup
	WebElement ByAdsBanner;

	@FindBy(xpath = "//span[normalize-space()='In-Page Push Ads']")
	@CacheLookup
	WebElement ByAdsInPagePush;

	@FindBy(xpath = "//span[normalize-space()='Native Ads']")
	@CacheLookup
	WebElement ByAdsNative;

	@FindBy(xpath = "//span[normalize-space()='Popunder Ads']")
	@CacheLookup
	WebElement ByAdsPopunder;

	@FindBy(xpath = "//input[@value='27-2-2024 - 05-3-2024']")
	@CacheLookup
	WebElement Calender;

	@FindBy(xpath = "//div[@aria-label='Choose Wednesday, February 28th, 2024']")
	@CacheLookup
	WebElement Calender28Feb;

	@FindBy(xpath = "//div[@aria-label='Choose Monday, March 4th, 2024']")
	@CacheLookup
	WebElement Calender4March;

	@FindBy(xpath = "//span[normalize-space()='Search']")
	@CacheLookup
	WebElement Search;

	@FindBy(xpath = "//em[@class='icon ni ni-download']")
	@CacheLookup
	WebElement Download;

// #***************************Login Page*******************************

	public void enterEmail() {
		Email.sendKeys("rajeevgp1596+20@gmail.com");
	}

	public void enterPassword() {
		Password.sendKeys("1234");
	}

	public void clickLoginButton() {
		clickLoginButton.click();

	}

// #***************************Statistics Page*******************************

	public void clickStatistics() {
		Statistics.click();
	}

	public void clickByCampaign() {
		ByCampaign.click();
	}

	public void clickByCampaignAccount() {
		ByCampaignAccount.click();
	}

	public void clickByAds() {
		ByAds.click();
	}

	public void clickByAdsText() {
		ByAdsText.click();
	}

	public void clickByAdsBanner() {
		ByAdsBanner.click();
	}

	public void clickByAdsInPagePush() {
		ByAdsInPagePush.click();
	}

	public void clickByAdsNative() {
		ByAdsNative.click();
	}

	public void clickByAdsPopunder() {
		ByAdsPopunder.click();
	}

	public void clickCalender() {
		Calender.click();
	}

	public void clickCalender28Feb() {
		Calender28Feb.click();
	}

	public void clickCalender4March() {
		Calender4March.click();
	}

	public void clickSearch() {
		Search.click();
	}

	public void clickDownload() {
		Download.click();
	}

}
