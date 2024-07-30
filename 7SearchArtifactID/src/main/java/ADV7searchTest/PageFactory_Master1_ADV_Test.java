package ADV7searchTest;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import ADV_7Search_genericPage.CommonMethod;
import Com.ADV7Search.pages.PageFactoryCampaignPage;
import Com.ADV7Search.pages.PageFactoryDashboardADVPage;
import Com.ADV7Search.pages.PageFactoryIndexPage;
import Com.ADV7Search.pages.PageFactoryProfilePage;
import Com.ADV7Search.pages.PageFactoryStatisticsPage;
import Com.ADV7Search.pages.PageFactorySupportPage;
import Com.ADV7Search.pages.PageFactoryWalletPage;

public class PageFactory_Master1_ADV_Test extends CommonMethod {

	public PageFactory_Master1_ADV_Test() throws Exception {
	super();
	}

//********************************************ADV LOgin Page******************************

	@Test
	// (enabled = false)
	public void DashBoardTest() throws InterruptedException {
		PageFactoryDashboardADVPage DB = PageFactory.initElements(driver, PageFactoryDashboardADVPage.class);
		
		Thread.sleep(8000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		DB.enterEmail();
		DB.enterPassword();
		DB.clickLoginButton();
		Thread.sleep(8000);
		driver.navigate().refresh();
		Thread.sleep(6000);
	}

//********************************************ADV DashBoard Page******************************

	@Test
	// (dependsOnMethods = {"MasterLoginPage"})
	//(enabled = false)
	public void MasterDashBoardPage() throws InterruptedException {
		PageFactoryDashboardADVPage DB = PageFactory.initElements(driver, PageFactoryDashboardADVPage.class);

		DB.ADVAddFund();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		DB.ADVFeedback();
		Thread.sleep(1000);
		DB.enterADVFeedbackMessgage();
		Thread.sleep(1000);
		DB.enterADVFeedbackSubject();
		Thread.sleep(2000);
//			DB.enterADVFeedbackAttachment();
//			Thread.sleep(2000);
//DB.ADVFeedbackSubmitButton();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		DB.ADVNotification();
		Thread.sleep(2000);
		DB.ADVNotificationViewAll();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		DB.ADVProfile();
		Thread.sleep(1000);
		DB.ADVProfileView();
		Thread.sleep(2000);
		DB.ADVProfile();
		Thread.sleep(1000);
		DB.ADVProfileAccountSetting();
		Thread.sleep(2000);
		DB.ADVProfile();
		Thread.sleep(1000);
		DB.ADVProfileLoginActivity();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		DB.ADVDashboard();
		Thread.sleep(2000);
		DB.clickF1();
		DB.clickFilter2();
		Thread.sleep(2000);
		DB.clickF2();
		DB.clickFilter3();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);

	}

//#*************************************Campaign Page***********************************

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
//				cp.clickCampaign();
//				Thread.sleep(2000);
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

//#*********************************************Text Ads****************************************
	@Test
	// (enabled = false)
	public void CampaignTest3() throws Exception {

		PageFactoryCampaignPage cp = PageFactory.initElements(driver, PageFactoryCampaignPage.class);
		driver.navigate().refresh();
		Thread.sleep(2000);
		cp.clickCampaign();
		Thread.sleep(1000);
		cp.clickAddNewCampaign();
		Thread.sleep(2000);
		cp.clickSalesStart();
		Thread.sleep(1000);
//				cp.clickPreviousButton();
//				Thread.sleep(2000);
//				cp.clickSalesStart();
//				Thread.sleep(1000);
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
//				cp.clickDropDownCPC();
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

//#************************************************Banner Ads************************************

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
//				cp.clickPreviousButton();
//				Thread.sleep(2000);
//				cp.clickSalesStart();
//				Thread.sleep(1000);
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
//				cp.clickDropDownCPC();
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

//#**********************************In-Page Push Ads***********************************

	@Test
	// (enabled = false)
	public void CampaignTest5() throws Exception {

		PageFactoryCampaignPage cp = PageFactory.initElements(driver, PageFactoryCampaignPage.class);

//				Thread.sleep(2000);
//				driver.navigate().refresh();
		Thread.sleep(2000);
		cp.clickCampaign();
		Thread.sleep(1000);
		cp.clickAddNewCampaign();
		Thread.sleep(2000);
		cp.clickSalesStart();
		Thread.sleep(1000);
//				cp.clickPreviousButton();
//				Thread.sleep(2000);
//				cp.clickSalesStart();
//				Thread.sleep(1000);
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
//				cp.clickSocialOption();
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
//				cp.clickDropDownCPC();
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

//#*********************************Native Ads***********************************

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
//				cp.clickPreviousButton();
//				Thread.sleep(2000);
//				cp.clickSalesStart();
//				Thread.sleep(1000);
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
//				cp.clickDropDownCPC();
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
//				cp.clickPreviousButton();
//				Thread.sleep(2000);
//				cp.clickSalesStart();
//				Thread.sleep(1000);
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
//				cp.clearBiddingPrice();
//				Thread.sleep(1000);
//				cp.enterBiddingPrice();
//				Thread.sleep(1000);
		cp.enterDailyBudget();
		Thread.sleep(1000);
		cp.clickSubmitButton();
		Thread.sleep(1000);
		cp.AddNewCampaignconfirmationpop();
		Thread.sleep(7000);
		driver.navigate().refresh();

	}

//#***************************Wallet Page*******************************

	@Test
	// (enabled = false)
	public void WalletStripeTest1() throws Exception {

		PageFactoryWalletPage wt = PageFactory.initElements(driver, PageFactoryWalletPage.class);

		Thread.sleep(5000);
		wt.clickWallet();
		Thread.sleep(1000);
		wt.clickAddToFundWallet();
		Thread.sleep(2000);
//				wt.enterAmount();
		wt.clickAmount100();
//				wt.clickAmount500();
//				wt.clickAmount1000();
//				wt.clickAmount1500();
		wt.clickProceedToPayment1();
//				wt.enterCoupon();
//				wt.clickApplyButton();
		wt.clickPaymentCheckBox();
		wt.clickProceedToPayment2();
		Thread.sleep(4000);

// **********stripe Payment Gateway page*************************

		wt.enterCardNumber();
		wt.enterCardExpiry();
		wt.enterCardCvc();
		wt.enterCardHolderName();
		wt.enterCardHolderAddress();
		wt.enterCardHolderCity();
		Thread.sleep(2000);
		wt.CardHolderState();
		wt.CardHolderStateUP();
		Thread.sleep(1000);
		wt.enterCardHolderPinCode();
		Thread.sleep(2000);
		wt.clickProceedSubmit();
		wt.clickProceedToBack();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().to("https://advertiser.7searchppc.com/");

	}

// *****************************Taza Pay Payment Gateway page********************************

	@Test
	// (enabled = false)
	public void WalletTazaPayTest8() throws Exception {

		PageFactoryWalletPage wt = PageFactory.initElements(driver, PageFactoryWalletPage.class);

		Thread.sleep(5000);
		wt.clickWallet();
		wt.clickAddToFundWallet();
		wt.clickTazaPaycheckBox();
//					wt.enterAmount();
		wt.clickAmount100();
//								ADV.clickAmount500();
//								ADV.clickAmount1000();
//								ADV.clickAmount1500();
		wt.clickProceedToPayment1();
//								wt.enterCoupon();
//								wt.clickApplyButton();
		wt.clickPaymentCheckBox();
		wt.clickProceedToPayment2();
		Thread.sleep(2000);
		wt.enterTazaPayCardNumber();
		Thread.sleep(1000);
		wt.enterTazaPayExpDate();
		Thread.sleep(1000);
		wt.enterTazaPayCVV();
		Thread.sleep(1000);
		wt.enterTazaPayCardName();
		Thread.sleep(1000);
		wt.enterTazaPayAddress1();
		Thread.sleep(1000);
		wt.enterTazaPayCity();
		Thread.sleep(1000);
		wt.clickTazaPayStateDropdown();
		Thread.sleep(1000);
		wt.clickTazaPayStateDropdown1();
		Thread.sleep(1000);
		wt.enterTazaPayPostalCode();
		Thread.sleep(1000);

		wt.clickTazaPayPayNow();
		Thread.sleep(7000);
//					wt.clickTazaPayBackToMarchent();
//					Thread.sleep(5000);
		driver.navigate().refresh();
		Thread.sleep(4000);

	}

// ***********************************PayU Payment Gateway page****************************************************

	@Test
	// (enabled = false)
	public void WalletPayUTest2() throws Exception {

		PageFactoryWalletPage wt = PageFactory.initElements(driver, PageFactoryWalletPage.class);

		Thread.sleep(3000);
		wt.clickWallet();
		wt.clickAddToFundWallet();
		wt.clickPayUCheckbox();
//				wt.enterAmount();
		wt.clickAmount100();
//				wt.clickAmount500();
//				wt.clickAmount1000();
//				wt.clickAmount1500();
		wt.clickProceedToPayment1();
//				wt.enterCoupon();
//				wt.clickApplyButton();
		wt.clickPaymentCheckBox();
		wt.clickProceedToPayment2();
		Thread.sleep(6000);
		wt.clickSelectCard();
		wt.enterPayucardnumber();
		wt.enterPayUcardExpiry();
		wt.enterPayUcardCvv();
		wt.enterPayUcardOwnerName();
		wt.clickGoToBack();
		Thread.sleep(2000);
		wt.clickPayUdropdown();
		wt.clickPayUPhonepay();
		wt.enterPayUPhonepayID();
		// wt.clickPayUVerify();
		wt.clickGoToBack();
		Thread.sleep(2000);
		wt.clickGoToBack();
		Thread.sleep(2000);
		wt.clickPayUCancel();

	}

// *****************************AirPay Payment Gateway page*****************************

	@Test
	// (enabled = false)
	public void WalletAirPayTest3() throws Exception {

		PageFactoryWalletPage wt = PageFactory.initElements(driver, PageFactoryWalletPage.class);

		Thread.sleep(3000);
		wt.clickWallet();
		wt.clickAddToFundWallet();
		wt.clickAirpayCheckBox();
//				wt.enterAmount();
		wt.clickAmount100();
//				wt.clickAmount500();
//				wt.clickAmount1000();
//				wt.clickAmount1500();
		wt.clickProceedToPayment1();
//				wt.enterCoupon();
//				wt.clickApplyButton();
		wt.clickPaymentCheckBox();
		wt.clickProceedToPayment2();
		Thread.sleep(6000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().to("https://advertiser.7searchppc.com/");

	}

// *****************************PhonePay Payment Gateway page*****************************

	@Test
	// (enabled = false)
	public void WalletPhonePayTest4() throws Exception {

		PageFactoryWalletPage wt = PageFactory.initElements(driver, PageFactoryWalletPage.class);

		Thread.sleep(3000);
		wt.clickWallet();
		wt.clickAddToFundWallet();
		wt.clickPhonepayCheckBox();
//				wt.enterAmount();
		wt.clickAmount100();
//					wt.clickAmount500();
//					wt.clickAmount1000();
//					wt.clickAmount1500();
		wt.clickProceedToPayment1();
//					wt.enterCoupon();
//					wt.clickApplyButton();
		wt.clickPaymentCheckBox();
		wt.clickProceedToPayment2();
		Thread.sleep(6000);
		wt.clickPhonrpayCard();
		wt.enterPhonepayCardNumber();
		wt.enterPhonepayCardHolderNumber();
		wt.enterPhoneExpMonth();
		wt.enterPhoneExpYear();
		wt.enterPhoneCVV();
		wt.clickPhonrpaySubmit();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().to("https://advertiser.7searchppc.com/");

	}

// *****************************Bit coin Payment Gateway page*****************************

	@Test
	// (enabled = false)
	public void WalletBitCoinTest5() throws Exception {

		PageFactoryWalletPage wt = PageFactory.initElements(driver, PageFactoryWalletPage.class);

		Thread.sleep(3000);
		wt.clickWallet();
		wt.clickAddToFundWallet();
		wt.clickBitcoincheckbox();
//				wt.enterAmount();
		wt.clickAmount100();
//						wt.clickAmount500();
//						wt.clickAmount1000();
//						wt.clickAmount1500();
		wt.clickProceedToPayment1();
//						wt.enterCoupon();
//						wt.clickApplyButton();
		wt.clickPaymentCheckBox();
//				wt.clickProceedToPayment2();
//				Thread.sleep(3000);
//				wt.enterBitcoinScreenshot();
//				Thread.sleep(2000);
//				wt.clickBitcoinContinueButton();
//				Thread.sleep(6000);

	}

// *****************************Crypto Payment Gateway page********************************

	@Test
	// (enabled = false)
	public void WalletCryptoTest6() throws Exception {

		PageFactoryWalletPage wt = PageFactory.initElements(driver, PageFactoryWalletPage.class);

		Thread.sleep(3000);
		wt.clickWallet();
		wt.clickAddToFundWallet();
		wt.clickCryptoCheckbox();
//				wt.enterAmount();
		wt.clickAmount100();
//						wt.clickAmount500();
//						wt.clickAmount1000();
//						wt.clickAmount1500();
		wt.clickProceedToPayment1();
//						wt.enterCoupon();
//						wt.clickApplyButton();
		wt.clickPaymentCheckBox();
		wt.clickProceedToPayment2();
		Thread.sleep(5000);
		wt.enterCryptoFirstName();
		wt.enterCryptoLastName();
		wt.enterCryptoEmailId();
		Thread.sleep(2000);
		wt.clickCryptoSelectBitcoin();
		wt.clickCryptoSubmit();
		Thread.sleep(7000);
		driver.navigate().back();
		Thread.sleep(4000);
		driver.navigate().to("https://advertiser.7searchppc.com/");

	}

// *****************************RazorPay Payment Gateway page********************************
	//
//			@Test(enabled = false)
//			public void WalletRazorPayTest7() throws Exception {
	//
//				PageFactoryWalletPage wt = PageFactory.initElements(driver, PageFactoryWalletPage.class);
	//
//				Thread.sleep(3000);
//				wt.clickWallet();
//				wt.clickAddToFundWallet();
//				wt.clickRazorPayCheckbox();
//				wt.enterAmount();
////						wt.clickAmount100();
////						wt.clickAmount500();
////						wt.clickAmount1000();
////						wt.clickAmount1500();
//				wt.clickProceedToPayment1();
////						wt.enterCoupon();
////						wt.clickApplyButton();
//				wt.clickPaymentCheckBox();
////				wt.clickProceedToPayment2();
////				Thread.sleep(8000);
////				wt.clickRazorPayCard();
////				Thread.sleep(2000);
////				wt.enterRazorPayCardNumber();
////				wt.enterRazorPayCardExpiry();
////				wt.enterRazorPayCardCVV();
////				Thread.sleep(2000);
////				wt.clickRazorPayClickPay();
////				Thread.sleep(5000);
	//
//			}
	//

// *****************************NowPayment Payment Gateway page********************************

	@Test
	// (enabled = false)
	public void WalletNowPaymentTest9() throws Exception {

		PageFactoryWalletPage wt = PageFactory.initElements(driver, PageFactoryWalletPage.class);

		Thread.sleep(3000);
		wt.clickWallet();
		wt.clickAddToFundWallet();
		wt.clickNowPaymentCheckbox();
//				wt.enterAmount();
		wt.clickAmount100();
//						wt.clickAmount500();
//						wt.clickAmount1000();
//						wt.clickAmount1500();
		wt.clickProceedToPayment1();
//						wt.enterCoupon();
//						wt.clickApplyButton();
		wt.clickPaymentCheckBox();
		wt.clickProceedToPayment2();
		Thread.sleep(6000);

	}

//#************************************Inbox Page************************************	

	@Test
	public void InboxTest1() throws Exception {

		PageFactoryIndexPage it = PageFactory.initElements(driver, PageFactoryIndexPage.class);
		Thread.sleep(3000);
		it.clickInbox();
		it.clickOpenMessage();
		Thread.sleep(2000);
		it.clickBackMessage();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0, 500)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0, 1000)");
		Thread.sleep(2000);

	}

//#***************************Profile Page*******************************

	@Test
	public void ProfileTest2() throws Exception {

		PageFactoryProfilePage pt = PageFactory.initElements(driver, PageFactoryProfilePage.class);

		Thread.sleep(3000);
		pt.clickProfile();
		pt.clickProfileThreeDot();
		pt.clickUpdateProfile();
		pt.enterProfileAddress1();
		pt.enterProfileCity();
		Thread.sleep(2000);
		pt.clickProfileUpdate();
		Thread.sleep(1000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		pt.clickEditProfile();
		pt.clickUpdateProfile();
		pt.enterProfileAddress1();
		pt.enterProfileCity();
		Thread.sleep(2000);
		pt.clickProfileUpdate();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		pt.clickAccountActivity();

	}

//#***************************ChangePassword Page*******************************

	@Test
	public void ProfileTest3() throws Exception {

		PageFactoryProfilePage pt = PageFactory.initElements(driver, PageFactoryProfilePage.class);

		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		pt.clickProfile();
		pt.clickChangePassword();
		pt.enterCurrenPassword();
		pt.clickPasswordEyeicon();
		Thread.sleep(2000);
		pt.enterNewPassword();
		pt.clickPasswordEyeicon();
		Thread.sleep(2000);
		pt.enterRepeatPassword();
		pt.clickPasswordEyeicon();
		Thread.sleep(2000);
		pt.clickUpdatePassword();

	}

//#***************************Statistics Page*******************************

	@Test
	public void StatisticsTest1() throws Exception {

		PageFactoryStatisticsPage st = PageFactory.initElements(driver, PageFactoryStatisticsPage.class);

		Thread.sleep(5000);
		st.clickStatistics();
		st.clickByCampaign();
		st.clickByCampaignAccount();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		st.clickByAds();
		st.clickByAdsText();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		st.clickByAds();
		st.clickByAdsBanner();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		st.clickByAds();
		st.clickByAdsInPagePush();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		st.clickByAds();
		st.clickByAdsNative();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		st.clickByAds();
		st.clickByAdsPopunder();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		st.clickCalender();
		st.clickCalender28Feb();
		st.clickCalender4March();
		st.clickSearch();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		st.clickDownload();

	}

// #***************************Support Page*******************************

	@Test
	public void SupportTest1() throws Exception {

		PageFactorySupportPage ss = PageFactory.initElements(driver, PageFactorySupportPage.class);

		Thread.sleep(5000);
		ss.clickSupport();
		Thread.sleep(2000);
		ss.clickNewRequest();
		ss.clickSupportCancel();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		ss.clickNewRequest();
		ss.clickSelectoption();
		ss.clickSelection3();
		ss.enterSubject();
		ss.enterMessage();
		ss.enterAttachment();
		Thread.sleep(3000);
		ss.clickSend();

	}

}
