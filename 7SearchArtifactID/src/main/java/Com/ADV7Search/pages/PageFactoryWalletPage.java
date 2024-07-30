package Com.ADV7Search.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class PageFactoryWalletPage {

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

// #***************************Wallet Page*******************************

	@FindBy(xpath = "//span[normalize-space()='Wallet']")
	@CacheLookup
	WebElement Wallet;

	@FindBy(xpath = "//span[normalize-space()='Add Fund to Wallet']")
	@CacheLookup
	WebElement AddToFundWallet;

	@FindBy(xpath = "//b[@class='pl-1 pr-1'][normalize-space()='$100']")
	@CacheLookup
	WebElement Amount100;

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

// ******************stripe page**********************

	@FindBy(xpath = "//input[@id='cardNumber']")
	@CacheLookup
	WebElement CardNumber;

	@FindBy(xpath = "//input[@id='cardExpiry']")
	@CacheLookup
	WebElement CardExpiry;

	@FindBy(xpath = "//input[@id='cardCvc']")
	@CacheLookup
	WebElement CardCvc;

	@FindBy(xpath = "//input[@id='billingAddressLine1']")
	@CacheLookup
	WebElement CardHolderAddress;
	
	@FindBy(xpath = "//input[@id='billingLocality']")
	@CacheLookup
	WebElement CardHolderCity;
	
	@FindBy(xpath = "//input[@id='billingName']")
	@CacheLookup
	WebElement CardHolderState;
	
	@FindBy(xpath = "//*[@id=\"billingAdministrativeArea\"]/option[35]")
	@CacheLookup
	WebElement CardHolderStateUP;
	
	@FindBy(xpath = "//input[@id='billingPostalCode']")
	@CacheLookup
	WebElement CardHolderPinCode;
	
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

//	@FindBy(xpath = "//input[@id='card_cvv']")
//	@CacheLookup
//	WebElement RazorPayCardCVV;

// #***************************Login Page*******************************
	
	public void enterEmail() {
		Email.sendKeys("rajeevgp1596@gmail.com");
	}

	public void enterPassword() {
		Password.sendKeys("1234");
	}

	public void clickLoginButton() {
		clickLoginButton.click();

	}

// #***************************Wallet Page*******************************

	public void clickWallet() {
		Wallet.click();

	}

	public void clickAddToFundWallet() {
		AddToFundWallet.click();

	}
	public void clickAmount100() {
		Amount100.click();

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

// **********stripe page*************************

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
	
	public void enterCardHolderAddress() {
		CardHolderAddress.sendKeys("Test");

	}
	
	public void enterCardHolderCity() {
		CardHolderCity.sendKeys("Test12");

	}
	
	public void CardHolderState() {
		CardHolderState.click();

	}
	
	public void CardHolderStateUP() {
		CardHolderStateUP.click();

	}
	
	public void enterCardHolderPinCode() {
		CardHolderPinCode.sendKeys("123654");

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
//	public void clickCryptoSelectBitcoin() {
//		CryptoSelectBitcoin.click();
//
//	}

}
