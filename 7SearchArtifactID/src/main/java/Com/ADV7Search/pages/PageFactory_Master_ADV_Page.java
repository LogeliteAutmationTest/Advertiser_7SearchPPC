package Com.ADV7Search.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class PageFactory_Master_ADV_Page {

//********************************************ADV LOgin Page******************************

	@FindBy(xpath = "//input[@id='default-01']")
	@CacheLookup
	WebElement Email;

	@FindBy(xpath = "//input[@id='password']")
	@CacheLookup
	WebElement Password;

	@FindBy(xpath = "//button[@type='submit']")
	@CacheLookup
	WebElement clickLoginButton;

//********************************************ADV DashBoard Page******************************

	@FindBy(xpath = "//a[@class='btn btn-primary btn-sm']")
	@CacheLookup
	WebElement ADVAddFund;

	@FindBy(xpath = "//span[normalize-space()='Feedback']")
	@CacheLookup
	WebElement ADVFeedback;

	@FindBy(xpath = "//textarea[@placeholder='Write your feedback about our services.']")
	@CacheLookup
	WebElement ADVFeedbackMessgage;

	@FindBy(xpath = "//a[@id='ibx-msg-attachment']")
	@CacheLookup
	WebElement ADVFeedbackAttachment;

	@FindBy(xpath = "//input[@placeholder='Subject']")
	@CacheLookup
	WebElement ADVFeedbackSubject;

	@FindBy(xpath = "//span[normalize-space()='Submit Feedback']")
	@CacheLookup
	WebElement ADVFeedbackSubmitButton;

	@FindBy(xpath = "//a[@class='dropdown-toggle nk-quick-nav-icon']")
	@CacheLookup
	WebElement ADVNotification;

	@FindBy(xpath = "//a[normalize-space()='View All']")
	@CacheLookup
	WebElement ADVNotificationViewAll;

	@FindBy(xpath = "//div[@class='user-toggle']")
	@CacheLookup
	WebElement ADVProfile;

	@FindBy(xpath = "//span[normalize-space()='View Profile']")
	@CacheLookup
	WebElement ADVProfileView;

	@FindBy(xpath = "//span[normalize-space()='Account Setting']")
	@CacheLookup
	WebElement ADVProfileAccountSetting;

	@FindBy(xpath = "//span[normalize-space()='Login Activity']")
	@CacheLookup
	WebElement ADVProfileLoginActivity;

	@FindBy(xpath = "//span[normalize-space()='Log Out']")
	@CacheLookup
	WebElement ADVProfileLogOut;

	@FindBy(xpath = "//a[@class='dropdown-toggle btn btn-white btn-dim btn-outline-light']")
	@CacheLookup
	WebElement Filter;

	@FindBy(xpath = "//span[normalize-space()='7 Days']")
	@CacheLookup
	WebElement Filter1;

	@FindBy(xpath = "//a[@class='dropdown-toggle btn btn-white btn-dim btn-outline-light']//span[contains(text(),'7 Days')]")
	@CacheLookup
	WebElement F1;

	@FindBy(xpath = "//span[normalize-space()='15 Days']")
	@CacheLookup
	WebElement Filter2;

	@FindBy(xpath = "//a[@class='dropdown-toggle btn btn-white btn-dim btn-outline-light']//span[contains(text(),'15 Days')]")
	@CacheLookup
	WebElement F2;

	@FindBy(xpath = "//span[normalize-space()='30 Days']")
	@CacheLookup
	WebElement Filter3;

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

// #***************************Wallet Page*******************************

	@FindBy(xpath = "//span[normalize-space()='Wallet']")
	@CacheLookup
	WebElement Wallet;

	@FindBy(xpath = "//span[normalize-space()='Add Fund to Wallet']")
	@CacheLookup
	WebElement AddToFundWallet;

	@FindBy(xpath = "//input[@placeholder='Min. $25']")
	@CacheLookup
	WebElement Amount;

	@FindBy(xpath = "//b[normalize-space()='$100']")
	@CacheLookup
	WebElement Amount100;

	@FindBy(xpath = "//b[normalize-space()='$500']")
	@CacheLookup
	WebElement Amount500;

	@FindBy(xpath = "//b[normalize-space()='$1000']")
	@CacheLookup
	WebElement Amount1000;

	@FindBy(xpath = "//b[normalize-space()='$1500']")
	@CacheLookup
	WebElement Amount1500;

	@FindBy(xpath = "//span[normalize-space()='PROCEED TO PAYMENT']")
	@CacheLookup
	WebElement ProceedToPayment1;

	@FindBy(xpath = "//input[@type='text']")
	@CacheLookup
	WebElement Coupon;

	@FindBy(xpath = "//button[@placeholder='Recipients username']")
	@CacheLookup
	WebElement ApplyButton;

	@FindBy(xpath = "//span[contains(text(),'I agree to all the')]")
	@CacheLookup
	WebElement PaymentCheckBox;

	@FindBy(xpath = "//span[normalize-space()='PROCEED TO PAYMENT']")
	@CacheLookup
	WebElement ProceedToPayment2;

// ********************************stripe page*********************************

	@FindBy(xpath = "//input[@id='cardNumber']")
	@CacheLookup
	WebElement CardNumber;

	@FindBy(xpath = "//input[@id='cardExpiry']")
	@CacheLookup
	WebElement CardExpiry;

	@FindBy(xpath = "//input[@id='cardCvc']")
	@CacheLookup
	WebElement CardCvc;

	@FindBy(xpath = "//input[@id='billingName']")
	@CacheLookup
	WebElement CardHolderName;

	@FindBy(xpath = "//div[@class='SubmitButton-IconContainer']")
	@CacheLookup
	WebElement ProceedSubmit;

	@FindBy(xpath = "//img[@alt='Logelite Private Limited logo']")
	@CacheLookup
	WebElement ProceedToBack;

// ****************************PayU Payment Gateway page**************************************

	@FindBy(xpath = "//label[@for='paymentCheck2']")
	@CacheLookup
	WebElement PayUCheckbox;

	@FindBy(xpath = "//span[normalize-space()='Cards (Credit/Debit)']")
	@CacheLookup
	WebElement SelectCard;

	@FindBy(xpath = "//input[@id='cardNumber']")
	@CacheLookup
	WebElement Payucardnumber;

	@FindBy(xpath = "//input[@id='cardExpiry']")
	@CacheLookup
	WebElement PayUcardExpiry;

	@FindBy(xpath = "//input[@id='cardCvv']")
	@CacheLookup
	WebElement PayUcardCvv;

	@FindBy(xpath = "//input[@id='cardOwnerName']")
	@CacheLookup
	WebElement PayUcardOwnerName;

	@FindBy(xpath = "//small[@class='left']")
	@CacheLookup
	WebElement GoToBack;

	@FindBy(xpath = "//div[@id='paymentRightBar']//li[3]")
	@CacheLookup
	WebElement PayUdropdown;

	@FindBy(xpath = "//div[contains(text(),'PhonePe')]")
	@CacheLookup
	WebElement PayUPhonepay;

	@FindBy(xpath = "//input[@id='upi2Id']")
	@CacheLookup
	WebElement PayUPhonepayID;

	@FindBy(xpath = "//button[@id='upi-verify-disabled']")
	@CacheLookup
	WebElement PayUVerify;

	@FindBy(xpath = "//button[@class='common-btn txt-btn']")
	@CacheLookup
	WebElement PayUCancel;

// *****************************AirPay Payment Gateway page*****************************

	@FindBy(xpath = "//label[@for='paymentCheck6']")
	@CacheLookup
	WebElement AirpayCheckBox;

// *****************************PhonePay Payment Gateway page*****************************

	@FindBy(xpath = "//label[@for='paymentCheck5']")
	@CacheLookup
	WebElement PhonepayCheckBox;

	@FindBy(xpath = "//input[@id='new-card']")
	@CacheLookup
	WebElement PhonrpayCard;

	@FindBy(xpath = "//input[@id='cardNumber']")
	@CacheLookup
	WebElement PhonepayCardNumber;

	@FindBy(xpath = "//input[@id='cardHolderName']")
	@CacheLookup
	WebElement PhonepayCardHolderNumber;

	@FindBy(xpath = "//input[@id='selMonth']")
	@CacheLookup
	WebElement PhoneExpMonth;

	@FindBy(xpath = "//input[@id='selYear']")
	@CacheLookup
	WebElement PhoneExpYear;

	@FindBy(xpath = "//input[@id='cvvNumber']")
	@CacheLookup
	WebElement PhoneCVV;

	@FindBy(xpath = "//div[1]//form[1]//div[2]//button[1]//currency[1]")
	@CacheLookup
	WebElement PhonrpaySubmit;

// *****************************Bit coin Payment Gateway page*****************************

	@FindBy(xpath = "//label[@for='paymentCheck3']")
	@CacheLookup
	WebElement Bitcoincheckbox;

	@FindBy(xpath = "//input[@id='customFile']")
	@CacheLookup
	WebElement BitcoinScreenshot;

	@FindBy(xpath = "//span[normalize-space()='Continue']")
	@CacheLookup
	WebElement BitcoinContinueButton;

// *****************************Crypto Payment Gateway page********************************

	@FindBy(xpath = "//label[@for='paymentCheck4']")
	@CacheLookup
	WebElement CryptoCheckbox;

	@FindBy(xpath = "//input[@id='first_name']")
	@CacheLookup
	WebElement CryptoFirstName;

	@FindBy(xpath = "//input[@id='last_name']")
	@CacheLookup
	WebElement CryptoLastName;

	@FindBy(xpath = "//input[@id='email']")
	@CacheLookup
	WebElement CryptoEmailId;

	@FindBy(xpath = "//button[@id='btn_BTC']")
	@CacheLookup
	WebElement CryptoSelectBitcoin;

	@FindBy(xpath = "//button[@id='btnCheckout']")
	@CacheLookup
	WebElement CryptoSubmit;

// *****************************RazorPay Payment Gateway page********************************

	@FindBy(xpath = "//label[@for='paymentCheck7']")
	@CacheLookup
	WebElement RazorPayCheckbox;

	@FindBy(xpath = "//div[normalize-space()='Card']")
	@CacheLookup
	WebElement RazorPayCard;

	@FindBy(xpath = "//input[@id='card_number']")
	@CacheLookup
	WebElement RazorPayCardNumber;

	@FindBy(xpath = "//input[@id='card_expiry']")
	@CacheLookup
	WebElement RazorPayCardExpiry;

	@FindBy(xpath = "//input[@id='card_cvv']")
	@CacheLookup
	WebElement RazorPayCardCVV;

	@FindBy(xpath = "//button[@id='redesign-v15-cta']")
	@CacheLookup
	WebElement RazorPayClickPay;

// *****************************TazaPay Payment Gateway page********************************

	@FindBy(xpath = "//label[@for='paymentCheck11']")
	@CacheLookup
	WebElement TazaPaycheckBox;

	@FindBy(xpath = "//input[@id='cardNumber']")
	@CacheLookup
	WebElement TazaPayCardNumber;

	@FindBy(xpath = "//input[@id='expDate']")
	@CacheLookup
	WebElement TazaPayExpDate;

	@FindBy(xpath = "//input[@id='cvv']")
	@CacheLookup
	WebElement TazaPayCVV;

	@FindBy(xpath = "//input[@id='name']")
	@CacheLookup
	WebElement TazaPayCardName;

	@FindBy(xpath = "//input[@placeholder='Contact Number *']")
	@CacheLookup
	WebElement TazaPayContactNumber;

	@FindBy(xpath = "//input[@placeholder='Address Line 1 *']")
	@CacheLookup
	WebElement TazaPayAddress1;

	@FindBy(xpath = "//input[@placeholder='City *']")
	@CacheLookup
	WebElement TazaPayCity;

	@FindBy(xpath = "//input[@placeholder='State/Province *']")
	@CacheLookup
	WebElement TazaPayStateDropdown;

	@FindBy(xpath = "//li[@id='vs2__option-0']")
	@CacheLookup
	WebElement TazaPayStateDropdown1;

	@FindBy(xpath = "//input[@placeholder='Postal Code *']")
	@CacheLookup
	WebElement TazaPayPostalCode;

	@FindBy(xpath = "//button[normalize-space()='Pay Now']")
	@CacheLookup
	WebElement TazaPayPayNow;

	@FindBy(xpath = "//button[@class='tw-text-center native-cta button-back tw-cursor-pointer']")
	@CacheLookup
	WebElement TazaPayBackToMarchent;

// *****************************NowPayment Payment Gateway page********************************

	@FindBy(xpath = "//label[@for='paymentCheck10']")
	@CacheLookup
	WebElement NowPaymentCheckbox;

//		@FindBy(xpath = "//input[@id='card_cvv']")
//		@CacheLookup
//		WebElement RazorPayCardCVV;

//#***************************Pop-under Ads*******************************

	@FindBy(xpath = "//label[@for='tablet']")
	@CacheLookup
	WebElement SelectPopunderAds;

//********************************************ADV LOgin Page******************************

	public void enterEmail() {
		Email.sendKeys("rajeevgp1596@gmail.com");
	}

	public void enterPassword() {
		Password.sendKeys("1234");
	}

	public void clickLoginButton() {
		clickLoginButton.click();

	}

//********************************************ADV LOgin Page******************************

	public void ADVAddFund() {
		ADVAddFund.click();

	}

	public void ADVFeedback() {
		ADVFeedback.click();
	}

	public void enterADVFeedbackMessgage() {
		ADVFeedbackMessgage.sendKeys("Test Rajeev");

	}

	public void enterADVFeedbackSubject() {
		ADVFeedbackSubject.sendKeys("Test");

	}
	
	public void ADVFeedbackAttachment() {
		ADVFeedbackAttachment.click();
		
	}

	public void enterADVFeedbackAttachment() {
		ADVFeedbackAttachment.sendKeys("C:\\Users\\DELL\\Downloads\\th (1).jpg");

	}

	public void ADVFeedbackSubmitButton() {
		ADVFeedbackSubmitButton.click();
	}

	public void ADVNotification() {
		ADVNotification.click();
	}

	public void ADVNotificationViewAll() {
		ADVNotificationViewAll.click();
	}

	public void ADVProfile() {
		ADVProfile.click();
	}

	public void ADVProfileView() {
		ADVProfileView.click();
	}

	public void ADVProfileAccountSetting() {
		ADVProfileAccountSetting.click();
	}

	public void ADVProfileLoginActivity() {
		ADVProfileLoginActivity.click();
	}

	public void ADVProfileLogOut() {
		ADVProfileLogOut.click();
	}

	public void clickFilter() {
		Filter.click();

	}

	public void clickFilter1() {
		Filter1.click();

	}

	public void clickF1() {
		F1.click();

	}

	public void clickFilter2() {
		Filter2.click();

	}

	public void clickF2() {
		F2.click();

	}

	public void clickFilter3() {
		Filter3.click();

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

// #*********************************Wallet Page*******************************

	public void clickWallet() {
		Wallet.click();

	}

	public void clickAddToFundWallet() {
		AddToFundWallet.click();

	}

	public void enterAmount() {
		Amount.sendKeys("25");

	}

	public void clickAmount100() {
		Amount100.click();

	}

	public void clickAmount500() {
		Amount500.click();

	}

	public void clickAmount1000() {
		Amount1000.click();

	}

	public void clickAmount1500() {
		Amount1500.click();

	}

	public void clickProceedToPayment1() {
		ProceedToPayment1.click();

	}

	public void enterCoupon() {
		Coupon.sendKeys("HOLI10");

	}

	public void clickApplyButton() {
		ApplyButton.click();

	}

	public void clickPaymentCheckBox() {
		PaymentCheckBox.click();

	}

	public void clickProceedToPayment2() {
		ProceedToPayment2.click();

	}

// *********************************stripe page*********************************

	public void enterCardNumber() {
		CardNumber.sendKeys("4242424242424242");

	}

	public void enterCardExpiry() {
		CardExpiry.sendKeys("11/28");

	}

	public void enterCardCvc() {
		CardCvc.sendKeys("234");

	}

	public void enterCardHolderName() {
		CardHolderName.sendKeys("Test");

	}

	public void clickProceedSubmit() {
		ProceedSubmit.click();

	}

	public void clickProceedToBack() {
		ProceedToBack.click();

	}

// *****************************PayU Payment Gateway page*****************************

	public void clickPayUCheckbox() {
		PayUCheckbox.click();

	}

	public void clickSelectCard() {
		SelectCard.click();

	}

	public void enterPayucardnumber() {
		Payucardnumber.sendKeys("4242424242424242");

	}

	public void enterPayUcardExpiry() {
		PayUcardExpiry.sendKeys("11/28");

	}

	public void enterPayUcardCvv() {
		PayUcardCvv.sendKeys("878");

	}

	public void enterPayUcardOwnerName() {
		PayUcardOwnerName.sendKeys("test");

	}

	public void clickGoToBack() {
		GoToBack.click();

	}

	public void clickPayUdropdown() {
		PayUdropdown.click();

	}

	public void clickPayUPhonepay() {
		PayUPhonepay.click();

	}

	public void enterPayUPhonepayID() {
		PayUPhonepayID.sendKeys("9936876019@ybl");

	}

	public void clickPayUVerify() {
		PayUVerify.click();

	}

	public void clickPayUCancel() {
		PayUCancel.click();
	}

// *****************************AirPay Payment Gateway page*****************************

	public void clickAirpayCheckBox() {
		AirpayCheckBox.click();

	}

// *****************************PhonePay Payment Gateway page*****************************

	public void clickPhonepayCheckBox() {
		PhonepayCheckBox.click();

	}

	public void clickPhonrpayCard() {
		PhonrpayCard.click();

	}

	public void enterPhonepayCardNumber() {
		PhonepayCardNumber.sendKeys("4242424242424242");

	}

	public void enterPhoneExpMonth() {
		PhoneExpMonth.sendKeys("11");

	}

	public void enterPhoneExpYear() {
		PhoneExpYear.sendKeys("28");

	}

	public void enterPhoneCVV() {
		PhoneCVV.sendKeys("234");

	}

	public void enterPhonepayCardHolderNumber() {
		PhonepayCardHolderNumber.sendKeys("Test");

	}

	public void clickPhonrpaySubmit() {
		PhonrpaySubmit.click();

	}

// *****************************Bit coin Payment Gateway page*****************************

	public void clickBitcoincheckbox() {
		Bitcoincheckbox.click();

	}

	public void enterBitcoinScreenshot() {
		BitcoinScreenshot.sendKeys("C:\\Users\\DELL\\Downloads\\th.jpg");

	}

	public void clickBitcoinContinueButton() {
		BitcoinContinueButton.click();

	}

// *****************************Crypto Payment Gateway page********************************

	public void clickCryptoCheckbox() {
		CryptoCheckbox.click();

	}

	public void enterCryptoFirstName() {
		CryptoFirstName.sendKeys("Test");

	}

	public void enterCryptoLastName() {
		CryptoLastName.sendKeys("Rajeev");

	}

	public void enterCryptoEmailId() {
		CryptoEmailId.sendKeys("rajeevgp1596@gmail.com");

	}

	public void clickCryptoSelectBitcoin() {
		CryptoSelectBitcoin.click();

	}

	public void clickCryptoSubmit() {
		CryptoSubmit.click();

	}

// *****************************RazorPay Payment Gateway page********************************

	public void clickRazorPayCheckbox() {
		RazorPayCheckbox.click();

	}

	public void clickRazorPayCard() {
		RazorPayCard.click();

	}

	public void enterRazorPayCardNumber() {
		RazorPayCardNumber.sendKeys("4242424242424242");

	}

	public void enterRazorPayCardExpiry() {
		RazorPayCardExpiry.sendKeys("11/28");

	}

	public void enterRazorPayCardCVV() {
		RazorPayCardCVV.sendKeys("234");

	}

	public void clickRazorPayClickPay() {
		RazorPayClickPay.click();

	}

// *****************************TazaPay Payment Gateway page********************************

	public void clickTazaPaycheckBox() {
		TazaPaycheckBox.click();

	}

	public void enterTazaPayCardNumber() {
		TazaPayCardNumber.sendKeys("5123 4567 8901 2346");

	}

	public void enterTazaPayExpDate() {
		RazorPayCardCVV.sendKeys("12/29");

	}

	public void enterTazaPayCVV() {
		TazaPayCVV.sendKeys("453");

	}

	public void enterTazaPayCardName() {
		TazaPayCardName.sendKeys("Test");

	}

	public void enterTazaPayContactNumber() {
		TazaPayContactNumber.sendKeys("9546848554");

	}

	public void enterTazaPayAddress1() {
		TazaPayAddress1.sendKeys("Test Rajeev Automation");

	}

	public void enterTazaPayCity() {
		TazaPayCity.sendKeys("Test");

	}

	public void enterTazaPayPostalCode() {
		TazaPayPostalCode.sendKeys("234");

	}

	public void clickTazaPayStateDropdown() {
		TazaPayStateDropdown.click();

	}

	public void clickTazaPayStateDropdown1() {
		TazaPayStateDropdown1.click();

	}

	public void clickTazaPayPayNow() {
		TazaPayPayNow.click();

	}

	public void clickTazaPayBackToMarchent() {
		TazaPayBackToMarchent.click();

	}

// *****************************NowPayment Payment Gateway page********************************

	public void clickNowPaymentCheckbox() {
		NowPaymentCheckbox.click();

	}

}
