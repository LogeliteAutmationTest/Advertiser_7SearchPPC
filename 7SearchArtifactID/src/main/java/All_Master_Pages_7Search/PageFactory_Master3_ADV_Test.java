package All_Master_Pages_7Search;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import ADV_7Search_genericPage.CommonMethod;
import Com.ADV7Search.pages.PageFactoryWalletPage;

public class PageFactory_Master3_ADV_Test extends CommonMethod {

	public PageFactory_Master3_ADV_Test() throws Exception {
		super();
	}

//#***************************Login Page*******************************

	@Test
	public void LoginTest() throws Exception {

		PageFactoryWalletPage wt = PageFactory.initElements(driver, PageFactoryWalletPage.class);
		wt.enterEmail();
		wt.enterPassword();
		wt.clickLoginButton();
		Thread.sleep(5000);
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
//		wt.enterAmount();
		wt.clickAmount100();
//		wt.clickAmount500();
//		wt.clickAmount1000();
//		wt.clickAmount1500();
		wt.clickProceedToPayment1();
//		wt.enterCoupon();
//		wt.clickApplyButton();
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
//			wt.enterAmount();
						wt.clickAmount100();
//						ADV.clickAmount500();
//						ADV.clickAmount1000();
//						ADV.clickAmount1500();
			wt.clickProceedToPayment1();
//						wt.enterCoupon();
//						wt.clickApplyButton();
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
//			wt.clickTazaPayBackToMarchent();
//			Thread.sleep(5000);
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
//		wt.enterAmount();
		wt.clickAmount100();
//		wt.clickAmount500();
//		wt.clickAmount1000();
//		wt.clickAmount1500();
		wt.clickProceedToPayment1();
//		wt.enterCoupon();
//		wt.clickApplyButton();
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
//		wt.enterAmount();
		wt.clickAmount100();
//		wt.clickAmount500();
//		wt.clickAmount1000();
//		wt.clickAmount1500();
		wt.clickProceedToPayment1();
//		wt.enterCoupon();
//		wt.clickApplyButton();
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
//		wt.enterAmount();
			wt.clickAmount100();
//			wt.clickAmount500();
//			wt.clickAmount1000();
//			wt.clickAmount1500();
		wt.clickProceedToPayment1();
//			wt.enterCoupon();
//			wt.clickApplyButton();
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
//		wt.enterAmount();
				wt.clickAmount100();
//				wt.clickAmount500();
//				wt.clickAmount1000();
//				wt.clickAmount1500();
		wt.clickProceedToPayment1();
//				wt.enterCoupon();
//				wt.clickApplyButton();
		wt.clickPaymentCheckBox();
//		wt.clickProceedToPayment2();
//		Thread.sleep(3000);
//		wt.enterBitcoinScreenshot();
//		Thread.sleep(2000);
//		wt.clickBitcoinContinueButton();
//		Thread.sleep(6000);

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
//		wt.enterAmount();
				wt.clickAmount100();
//				wt.clickAmount500();
//				wt.clickAmount1000();
//				wt.clickAmount1500();
		wt.clickProceedToPayment1();
//				wt.enterCoupon();
//				wt.clickApplyButton();
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

//// *****************************RazorPay Payment Gateway page********************************
//
//	@Test(enabled = false)
//	public void WalletRazorPayTest7() throws Exception {
//
//		PageFactoryWalletPage wt = PageFactory.initElements(driver, PageFactoryWalletPage.class);
//
//		Thread.sleep(3000);
//		wt.clickWallet();
//		wt.clickAddToFundWallet();
//		wt.clickRazorPayCheckbox();
//		wt.enterAmount();
////				wt.clickAmount100();
////				wt.clickAmount500();
////				wt.clickAmount1000();
////				wt.clickAmount1500();
//		wt.clickProceedToPayment1();
////				wt.enterCoupon();
////				wt.clickApplyButton();
//		wt.clickPaymentCheckBox();
////		wt.clickProceedToPayment2();
////		Thread.sleep(8000);
////		wt.clickRazorPayCard();
////		Thread.sleep(2000);
////		wt.enterRazorPayCardNumber();
////		wt.enterRazorPayCardExpiry();
////		wt.enterRazorPayCardCVV();
////		Thread.sleep(2000);
////		wt.clickRazorPayClickPay();
////		Thread.sleep(5000);
//
//	}
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
//		wt.enterAmount();
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

	}

}
