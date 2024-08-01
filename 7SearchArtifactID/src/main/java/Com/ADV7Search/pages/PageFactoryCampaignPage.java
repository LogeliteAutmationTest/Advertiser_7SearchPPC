package Com.ADV7Search.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class PageFactoryCampaignPage {

//#***************************Login Page*******************************

	@FindBy(xpath = "//input[@id='default-01']")
	@CacheLookup
	WebElement Email;

	@FindBy(xpath = "//input[@id='password']")
	@CacheLookup
	WebElement Password;

	@FindBy(xpath = "//button[@type='submit']")
	@CacheLookup
	WebElement clickLoginButton;

//#***************************Campaign Page*******************************

	@FindBy(xpath = "//span[@class='nk-menu-text'][normalize-space()='Campaigns']")
	@CacheLookup
	WebElement Campaign;

	@FindBy(xpath = "//input[@id='default-04']")
	@CacheLookup
	WebElement Search;

	@FindBy(xpath = "//a[@class='text-soft dropdown-toggle btn btn-icon btn-trigger']//em[@class='icon ni ni-more-h']")
	@CacheLookup
	WebElement Threedot;

	@FindBy(xpath = "//span[normalize-space()='Copy']")
	@CacheLookup
	WebElement Copy;

	@FindBy(xpath = "//span[normalize-space()='By Ads']")
	@CacheLookup
	WebElement FilterByAds;

	@FindBy(xpath = "//span[normalize-space()='Text Ads']")
	@CacheLookup
	WebElement FilterByText;

	@FindBy(xpath = "//span[normalize-space()='Banner Ads']")
	@CacheLookup
	WebElement FilterByBanner;

	@FindBy(xpath = "//span[normalize-space()='In-Page Push Ads']")
	@CacheLookup
	WebElement FilterByInPagePush;

	@FindBy(xpath = "//span[normalize-space()='Native Ads']")
	@CacheLookup
	WebElement FilterByNative;

	@FindBy(xpath = "//span[normalize-space()='Popunder Ads']")
	@CacheLookup
	WebElement FilterByPopunder;

	@FindBy(xpath = "//span[normalize-space()='By Status']")
	@CacheLookup
	WebElement ByStatus;

	@FindBy(xpath = "//a[@role='menuitem']//span[contains(text(),'In Review')]")
	@CacheLookup
	WebElement ByStatusInReview;

	@FindBy(xpath = "//a[contains(@href,'#dropdownitem')]//span[contains(text(),'Active')]")
	@CacheLookup
	WebElement ByStatusActive;

	@FindBy(xpath = "//span[normalize-space()='Inactive']")
	@CacheLookup
	WebElement ByStatusInactive;

	@FindBy(xpath = "//span[normalize-space()='Paused']")
	@CacheLookup
	WebElement ByStatusPaused;

	@FindBy(xpath = "//span[normalize-space()='Suspended']")
	@CacheLookup
	WebElement ByStatusSuspended;

//#***************************Text Ads*******************************

	@FindBy(xpath = "//span[normalize-space()='Create Campaign']")
	@CacheLookup
	WebElement AddNewCampaign;

	@FindBy(xpath = "//button[normalize-space()='Yes, create it!']")
	@CacheLookup
	WebElement AddNewCampaignconfirmationpop;
	
	@FindBy(xpath = "//div[contains(@class,'card-inner justify-content-center text-center card-body')]//button[contains(@type,'button')][normalize-space()='Start']")
	@CacheLookup
	WebElement SalesStart;

	@FindBy(xpath = "//button[@type='button']")
	@CacheLookup
	WebElement PreviousButton;

	@FindBy(xpath = "//label[@for='text']")
	@CacheLookup
	WebElement SelectTextAds;

	@FindBy(xpath = "//button[normalize-space()='Next']")
	@CacheLookup
	WebElement NextButton;

	@FindBy(xpath = "//select[contains(@name,'website_category')]")
	@CacheLookup
	WebElement CampaignCategory;

	@FindBy(css = "option[value='25']")
	@CacheLookup
	WebElement SelectCategory;

	@FindBy(xpath = "//input[contains(@name,'campaign_name')]")
	@CacheLookup
	WebElement CampaignName;

	@FindBy(xpath = "//input[@name='ad_title']")
	@CacheLookup
	WebElement AdTitle;

	@FindBy(xpath = "//input[@name='ad_description']")
	@CacheLookup
	WebElement AdDescription;

	@FindBy(xpath = "//input[@placeholder='e.g. - https://example.com']")
	@CacheLookup
	WebElement DestinationURL;

	@FindBy(xpath = "//select[@name='pricing_model']")
	@CacheLookup
	WebElement PricingModel;

	@FindBy(xpath = "//option[normalize-space()='CPM']")
	@CacheLookup
	WebElement DropDownCPM;

	@FindBy(xpath = "//option[normalize-space()='CPC']")
	@CacheLookup
	WebElement DropDownCPC;

	@FindBy(xpath = "//input[@id='Popover1']")
	@CacheLookup
	WebElement BiddingPrice;

	@FindBy(xpath = "//input[@name='daily_budget']")
	@CacheLookup
	WebElement DailyBudget;

	@FindBy(xpath = "//button[@type='subit']")
	@CacheLookup
	WebElement SubmitButton;

//#***************************Banner Ads*******************************

	@FindBy(xpath = "//label[@for='banner']")
	@CacheLookup
	WebElement SelectBannerAds;

	@FindBy(xpath = "//div[@id='root']//div[@class='row']//div[1]//div[1]//a[1][1]//input[1]")
	@CacheLookup
	WebElement Image250;

	@FindBy(xpath = "//a[normalize-space()='CROP IMAGE']")
	@CacheLookup
	WebElement CropImage;

	@FindBy(xpath = "//a[normalize-space()='CROP IMAGE']")
	@CacheLookup
	WebElement CropImage1;
	@FindBy(xpath = "//a[normalize-space()='CROP IMAGE']")
	@CacheLookup
	WebElement CropImage2;
	@FindBy(xpath = "//a[normalize-space()='CROP IMAGE']")
	@CacheLookup
	WebElement CropImage3;
	@FindBy(xpath = "//a[normalize-space()='CROP IMAGE']")
	@CacheLookup
	WebElement CropImage4;
	@FindBy(xpath = "//a[normalize-space()='CROP IMAGE']")
	@CacheLookup
	WebElement CropImage5;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/form/div[1]/div[3]/div/div[2]/div/a/input")
	@CacheLookup
	WebElement Image300;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/form/div[1]/div[3]/div/div[3]/div/a/input")
	@CacheLookup
	WebElement Image468;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/form/div[1]/div[3]/div/div[4]/div/a/input")
	@CacheLookup
	WebElement Image728;

	@FindBy(xpath = "//div[@id='root']//div[5]//div[1]//a[1][1]//input[1]")
	@CacheLookup
	WebElement Image160;

	@FindBy(xpath = "//div[@id='root']//div[6]//div[1]//a[1][1]//input[1]")
	@CacheLookup
	WebElement Image600;

//#***************************In-Page Push Ads*******************************

	@FindBy(xpath = "//h5[normalize-space()='In-Page Push Ads']")
	@CacheLookup
	WebElement SelectInPagePushAds;

	@FindBy(xpath = "//select[@name='social_ad_type']")
	@CacheLookup
	WebElement InPagePushAdType;

	@FindBy(xpath = "//div[@class='form-control-wrap']//input[@id='fw-token-address']")
	@CacheLookup
	WebElement AdTitle1;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/form/div[2]/div[1]/div/div[3]/select/option[2]")
	@CacheLookup
	WebElement ClassicOption;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/form/div[2]/div[1]/div/div[3]/select/option[3]")
	@CacheLookup
	WebElement SocialOption;

	@FindBy(xpath = "//input[@name='file1']")
	@CacheLookup
	WebElement UploadImage;

//#***************************Native Ads*******************************

	@FindBy(xpath = "//label[@for='native']")
	@CacheLookup
	WebElement SelectNativeAds;

	@FindBy(xpath = "//input[contains(@name,'file1')]")
	@CacheLookup
	WebElement UploadImageNative;

//#***************************Pop-under Ads*******************************

	@FindBy(xpath = "//label[@for='tablet']")
	@CacheLookup
	WebElement SelectPopunderAds;

//#***************************Login Page*******************************
	public void enterEmail() {
		Email.sendKeys("rajeevgp1596@gmail.com");
	}

	public void enterPassword() {
		Password.sendKeys("1234");
	}

	public void clickLoginButton() {
		clickLoginButton.click();

	}

//#***************************Campaign Page*******************************

	public void clickCampaign() {
		Campaign.click();
	}
	
	public void AddNewCampaignconfirmationpop() {
		AddNewCampaignconfirmationpop.click();
	}

	public void enterSearch() {
		Search.sendKeys("CMPB65A7B47B7A872");

	}

	public void clickThreedot() {
		Threedot.click();

	}

	public void clickCopy() {
		Copy.click();
	}

	public void clickFilterByAds() {
		FilterByAds.click();

	}

	public void clickFilterByText() {
		FilterByText.click();

	}

	public void clickFilterByBanner() {
		FilterByBanner.click();

	}

	public void clickFilterByInPagePush() {
		FilterByInPagePush.click();

	}

	public void clickFilterByNative() {
		FilterByNative.click();

	}

	public void clickFilterByPopunder() {
		FilterByPopunder.click();

	}

	public void clickByStatus() {
		ByStatus.click();
	}

	public void clickByStatusInReview() {
		ByStatusInReview.click();
	}

	public void clickByStatusActive() {
		ByStatusActive.click();
	}

	public void clickByByStatusInactive() {
		ByStatusInactive.click();
	}

	public void clickByStatusPaused() {
		ByStatusPaused.click();
	}

	public void clickByStatusSuspended() {
		ByStatusSuspended.click();
	}

//#***************************Text Ads*******************************

	public void clickAddNewCampaign() {
		AddNewCampaign.click();
	}

	public void clickSalesStart() {
		SalesStart.click();
	}

	public void clickPreviousButton() {
		PreviousButton.click();
	}

	public void clickSelectTextAds() {
		SelectTextAds.click();
	}

	public void clickNextButton() {
		NextButton.click();
	}

	public void clickCampaignCategory() {
		CampaignCategory.click();
	}

	public void clickSelectCategory() {
		SelectCategory.click();
	}

	public void enterCampaignName() {
		CampaignName.sendKeys("Test Rajeev Automation");
		;
	}

	public void enterAdTitle() {
		AdTitle.sendKeys("Text ads Test Rajeev Automation");
	}

	public void enterAdDescription() {
		AdDescription.sendKeys("Text ads Test Rajeev Automation");
	}

	public void enterDestinationURL() {
		DestinationURL.sendKeys("https://advertiser.7searchppc.com/create-campaign");
	}

	public void clickPricingModel() {
		PricingModel.click();
	}

	public void clickDropDownCPM() {
		DropDownCPM.click();
	}

	public void clickDropDownCPC() {
		DropDownCPC.click();
	}

	public void clearBiddingPrice() {
		BiddingPrice.clear();
		;
	}

	public void enterBiddingPrice() {
		BiddingPrice.sendKeys("1");
	}

	public void enterDailyBudget() {
		DailyBudget.sendKeys("15");
	}

	public void clickSubmitButton() {
		SubmitButton.click();
	}

//#***************************Banner Ads*******************************

	public void clickSelectBannerAds() {
		SelectBannerAds.click();
	}

	public void enterImage250() {
		Image250.sendKeys("C:\\Users\\DELL\\Downloads\\th (1).jpg");
	}

	public void clickCropImage() {
		CropImage.click();
	}

	public void enterImage300() {
		Image300.sendKeys("C:\\Users\\DELL\\Downloads\\desktop img.jpg");

	}

	public void clickCropImage1() {
		CropImage1.click();
	}

	public void clickCropImage2() {
		CropImage2.click();
	}

	public void clickCropImage3() {
		CropImage3.click();
	}

	public void clickCropImage4() {
		CropImage4.click();
	}

	public void clickCropImage5() {
		CropImage5.click();
	}

	public void enterImage468() {
		Image468.sendKeys("C:\\Users\\DELL\\Downloads\\pexels-photo-1525041.jpeg");
	}

	public void enterImage728() {
		Image728.sendKeys("C:\\Users\\DELL\\Downloads\\download (8).jpg");
	}

	public void enterImage160() {
		Image160.sendKeys("C:\\Users\\DELL\\Downloads\\th.jpg");
	}

	public void enterImage600() {
		Image600.sendKeys("C:\\Users\\DELL\\Downloads\\pexels-photo-943907.jpeg");
	}

//#***************************In-Page Push Ads*******************************

	public void clickSelectInPagePushAds() {
		SelectInPagePushAds.click();
	}

	public void clickInPagePushAdType() {
		InPagePushAdType.click();
	}

	public void enterAdTitle1() {
		AdTitle1.sendKeys("Text ads Test Rajeev Automation");
	}

	public void clickClassicOption() {
		ClassicOption.click();
	}

	public void clickSocialOption() {
		SocialOption.click();
	}

	public void enterUploadImage() {
		UploadImage.sendKeys("C:\\Users\\DELL\\Downloads\\th (1).jpg");

	}

//#***************************Native Ads*******************************

	public void clickSelectNativeAds() {
		SelectNativeAds.click();
	}

	public void enterUploadImageNative() {
		UploadImageNative.sendKeys("C:\\Users\\DELL\\Downloads\\th (1).jpg");

	}

//#***************************Pop-under Ads*******************************

	public void clickSelectPopunderAds() {
		SelectPopunderAds.click();
	}

//	public void clickSocialOption() {
//		SocialOption.click();
//	}
//	public void clickSocialOption() {
//		SocialOption.click();
//	}
//	public void clickSocialOption() {
//		SocialOption.click();
//	}
//	public void clickSocialOption() {
//		SocialOption.click();
//	}

}
