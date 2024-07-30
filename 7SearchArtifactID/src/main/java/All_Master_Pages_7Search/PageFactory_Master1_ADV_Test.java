package All_Master_Pages_7Search;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import ADV_7Search_genericPage.CommonMethod;
import Com.ADV7Search.pages.PageFactoryCampaignPage;
import Com.ADV7Search.pages.PageFactoryDashboardADVPage;

public class PageFactory_Master1_ADV_Test extends CommonMethod {

	public PageFactory_Master1_ADV_Test() throws Exception {
		super();
	}

//#***************************Login Page*******************************

	@Test
	public void CampaignTest1() throws Exception {

		PageFactoryCampaignPage cp = PageFactory.initElements(driver, PageFactoryCampaignPage.class);
		cp.enterEmail();
		cp.enterPassword();
		cp.clickLoginButton();
		Thread.sleep(6000);
		driver.navigate().refresh();

	}

//#*****************************Campaign Page*****************************

	@Test
	(enabled = false)
	public void CampaignTest2() throws Exception {

		PageFactoryCampaignPage cp = PageFactory.initElements(driver, PageFactoryCampaignPage.class);

		Thread.sleep(2000);
		cp.clickCampaign();
		Thread.sleep(2000);
		cp.enterSearch();
		Thread.sleep(2000);
		cp.clickThreedot();
		Thread.sleep(2000);
		driver.navigate().refresh();
		// cp.clickCopy();
		// Thread.sleep(1000);
//			cp.clickCampaign();
//			Thread.sleep(2000);
		cp.clickFilterByAds();
		Thread.sleep(2000);
		cp.clickFilterByText();
		Thread.sleep(2000);
		cp.clickCampaign();
		Thread.sleep(1000);
		cp.clickFilterByAds();
		cp.clickFilterByBanner();
		Thread.sleep(2000);
		cp.clickCampaign();
		Thread.sleep(1000);
		cp.clickFilterByAds();
		cp.clickFilterByInPagePush();
		Thread.sleep(2000);
		cp.clickCampaign();
		Thread.sleep(1000);
		cp.clickFilterByAds();
		cp.clickFilterByNative();
		Thread.sleep(2000);
		cp.clickCampaign();
		Thread.sleep(1000);
		cp.clickFilterByAds();
		cp.clickFilterByPopunder();
		Thread.sleep(2000);
		cp.clickCampaign();
		Thread.sleep(1000);
		cp.clickByStatus();
		cp.clickByStatusActive();
		Thread.sleep(2000);
		cp.clickCampaign();
		Thread.sleep(1000);
		cp.clickByStatus();
		cp.clickByByStatusInactive();
		Thread.sleep(2000);
		cp.clickCampaign();
		Thread.sleep(1000);
		cp.clickByStatus();
		cp.clickByStatusPaused();
		Thread.sleep(2000);
		cp.clickCampaign();
		Thread.sleep(1000);
		cp.clickByStatus();
		cp.clickByStatusSuspended();
	}

//#***************************Text Ads*******************************
	@Test
	// (enabled = false)
	public void CampaignTest3() throws Exception {

		PageFactoryCampaignPage cp = PageFactory.initElements(driver, PageFactoryCampaignPage.class);

		// driver.navigate().refresh();
		Thread.sleep(4000);
		cp.clickCampaign();
		Thread.sleep(1000);
		cp.clickAddNewCampaign();
		Thread.sleep(2000);
		cp.clickSalesStart();
		Thread.sleep(1000);
//			cp.clickPreviousButton();
//			Thread.sleep(2000);
//			cp.clickSalesStart();
//			Thread.sleep(1000);
		cp.clickSelectTextAds();
		Thread.sleep(1000);
		cp.clickNextButton();
		cp.clickCampaignCategory();
		Thread.sleep(1000);
		cp.clickSelectCategory();
		Thread.sleep(1000);
		cp.enterCampaignName();
		Thread.sleep(1000);
		cp.enterAdTitle();
		Thread.sleep(1000);
		cp.enterAdDescription();
		Thread.sleep(1000);
		cp.enterDestinationURL();
		Thread.sleep(1000);
		cp.clickPricingModel();
		Thread.sleep(1000);
		cp.clickDropDownCPM();
		Thread.sleep(1000);
//			cp.clickDropDownCPC();
		cp.clearBiddingPrice();
		Thread.sleep(1000);
		cp.enterBiddingPrice();
		Thread.sleep(1000);
		cp.enterDailyBudget();
		Thread.sleep(1000);
		cp.clickSubmitButton();
		Thread.sleep(1000);
		cp.AddNewCampaignconfirmationpop();
		Thread.sleep(7000);
		driver.navigate().refresh();

	}

//#***************************Banner Ads*******************************

	@Test
	// (enabled = false)
	public void CampaignTest4() throws Exception {

		PageFactoryCampaignPage cp = PageFactory.initElements(driver, PageFactoryCampaignPage.class);

		// driver.navigate().refresh();
		Thread.sleep(2000);
		cp.clickCampaign();
		Thread.sleep(1000);
		cp.clickAddNewCampaign();
		Thread.sleep(2000);
		cp.clickSalesStart();
		Thread.sleep(1000);
//			cp.clickPreviousButton();
//			Thread.sleep(2000);
//			cp.clickSalesStart();
//			Thread.sleep(1000);
		cp.clickSelectBannerAds();
		Thread.sleep(1000);
		cp.clickNextButton();
		cp.clickCampaignCategory();
		Thread.sleep(1000);
		cp.clickSelectCategory();
		Thread.sleep(1000);
		cp.enterCampaignName();
		Thread.sleep(1000);
		cp.enterDestinationURL();
		Thread.sleep(1000);
		cp.clickPricingModel();
		Thread.sleep(1000);
		cp.clickDropDownCPM();
		Thread.sleep(1000);
//			cp.clickDropDownCPC();
		cp.clearBiddingPrice();
		Thread.sleep(1000);
		cp.enterBiddingPrice();
		Thread.sleep(1000);
		cp.enterDailyBudget();
		Thread.sleep(1000);
		cp.enterImage250();
		Thread.sleep(1000);
		cp.clickCropImage();
		Thread.sleep(1000);
		cp.enterImage300();
		Thread.sleep(1000);
		cp.clickCropImage1();
		Thread.sleep(2000);
		cp.enterImage468();
		Thread.sleep(1000);
		cp.clickCropImage2();
		Thread.sleep(2000);
		cp.enterImage728();
		Thread.sleep(1000);
		cp.clickCropImage3();
		Thread.sleep(2000);
		cp.enterImage160();
		Thread.sleep(1000);
		cp.clickCropImage4();
		Thread.sleep(2000);
		cp.enterImage600();
		Thread.sleep(1000);
		cp.clickCropImage5();
		Thread.sleep(2000);
		cp.clickSubmitButton();
		Thread.sleep(2000);
		cp.AddNewCampaignconfirmationpop();
		Thread.sleep(7000);

	}

//#***************************In-Page Push Ads*******************************

	@Test
	// (enabled = false)
	public void CampaignTest5() throws Exception {

		PageFactoryCampaignPage cp = PageFactory.initElements(driver, PageFactoryCampaignPage.class);

//			Thread.sleep(2000);
//			driver.navigate().refresh();
		Thread.sleep(2000);
		cp.clickCampaign();
		Thread.sleep(1000);
		cp.clickAddNewCampaign();
		Thread.sleep(2000);
		cp.clickSalesStart();
		Thread.sleep(1000);
//			cp.clickPreviousButton();
//			Thread.sleep(2000);
//			cp.clickSalesStart();
//			Thread.sleep(1000);
		cp.clickSelectInPagePushAds();
		Thread.sleep(1000);
		cp.clickNextButton();
		cp.clickCampaignCategory();
		Thread.sleep(1000);
		cp.clickSelectCategory();
		Thread.sleep(1000);
		cp.enterCampaignName();
		Thread.sleep(1000);
		cp.clickInPagePushAdType();
		Thread.sleep(1000);
		cp.clickClassicOption();
//			cp.clickSocialOption();
		Thread.sleep(1000);
		cp.enterUploadImage();
		Thread.sleep(1000);
		cp.clickCropImage();
		Thread.sleep(1000);
		cp.enterAdTitle1();
		Thread.sleep(1000);
		cp.enterAdDescription();
		Thread.sleep(1000);
		cp.enterDestinationURL();
		Thread.sleep(1000);
		cp.clickPricingModel();
		Thread.sleep(1000);
		cp.clickDropDownCPM();
		Thread.sleep(1000);
//			cp.clickDropDownCPC();
		cp.clearBiddingPrice();
		Thread.sleep(1000);
		cp.enterBiddingPrice();
		Thread.sleep(1000);
		cp.enterDailyBudget();
		Thread.sleep(1000);
		cp.clickSubmitButton();
		Thread.sleep(1000);
		cp.AddNewCampaignconfirmationpop();
		Thread.sleep(7000);
		driver.navigate().refresh();

	}

//#***************************Native Ads*******************************

	@Test
	// (enabled = false)
	public void CampaignTest6() throws Exception {

		PageFactoryCampaignPage cp = PageFactory.initElements(driver, PageFactoryCampaignPage.class);

		// driver.navigate().refresh();
		Thread.sleep(2000);
		cp.clickCampaign();
		Thread.sleep(1000);
		cp.clickAddNewCampaign();
		Thread.sleep(2000);
		cp.clickSalesStart();
		Thread.sleep(1000);
//			cp.clickPreviousButton();
//			Thread.sleep(2000);
//			cp.clickSalesStart();
//			Thread.sleep(1000);
		cp.clickSelectNativeAds();
		Thread.sleep(1000);
		cp.clickNextButton();
		cp.clickCampaignCategory();
		Thread.sleep(1000);
		cp.clickSelectCategory();
		Thread.sleep(1000);
		cp.enterCampaignName();
		Thread.sleep(1000);
		cp.enterAdTitle();
		Thread.sleep(1000);
		cp.enterDestinationURL();
		Thread.sleep(1000);
		cp.clickPricingModel();
		Thread.sleep(1000);
		cp.clickDropDownCPM();
		Thread.sleep(1000);
//			cp.clickDropDownCPC();
		cp.clearBiddingPrice();
		Thread.sleep(1000);
		cp.enterBiddingPrice();
		Thread.sleep(1000);
		cp.enterDailyBudget();
		Thread.sleep(1000);
		cp.enterUploadImageNative();
		Thread.sleep(1000);
		cp.clickCropImage();
		Thread.sleep(1000);
		cp.clickSubmitButton();
		Thread.sleep(1000);
		cp.AddNewCampaignconfirmationpop();
		Thread.sleep(7000);
		driver.navigate().refresh();

	}

//#***************************Pop-under Ads*******************************

	@Test
	// (enabled = false)
	public void CampaignTest7() throws Exception {

		PageFactoryCampaignPage cp = PageFactory.initElements(driver, PageFactoryCampaignPage.class);

		// driver.navigate().refresh();
		Thread.sleep(2000);
		cp.clickCampaign();
		Thread.sleep(1000);
		cp.clickAddNewCampaign();
		Thread.sleep(2000);
		cp.clickSalesStart();
		Thread.sleep(1000);
//			cp.clickPreviousButton();
//			Thread.sleep(2000);
//			cp.clickSalesStart();
//			Thread.sleep(1000);
		cp.clickSelectPopunderAds();
		Thread.sleep(1000);
		cp.clickNextButton();
		cp.clickCampaignCategory();
		Thread.sleep(1000);
		cp.clickSelectCategory();
		Thread.sleep(1000);
		cp.enterCampaignName();
		Thread.sleep(1000);
		cp.enterDestinationURL();
		Thread.sleep(1000);
//			cp.clearBiddingPrice();
//			Thread.sleep(1000);
//			cp.enterBiddingPrice();
//			Thread.sleep(1000);
		cp.enterDailyBudget();
		Thread.sleep(1000);
		cp.clickSubmitButton();
		Thread.sleep(1000);
		cp.AddNewCampaignconfirmationpop();
		Thread.sleep(7000);
		driver.navigate().refresh();

	}

}
