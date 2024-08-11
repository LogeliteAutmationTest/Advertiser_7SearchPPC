package Com.ADV7Search.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class PageFactoryAdminTransactionHistoryPage {

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

// #********************************************Manager Transaction History Page**********************************

	@FindBy(xpath = "//span[normalize-space()='Transaction History']")
	@CacheLookup
	WebElement AdminManagerTransactionHistory;
	
	@FindBy(css = "button[class='btn btn-primary'] span")
	@CacheLookup
	WebElement AdminManagerTransactionHistorySearchButton;

	@FindBy(xpath = "//input[@id='default-04']")
	@CacheLookup
	WebElement AdminManagerTransactionHistorySearch;

	@FindBy(xpath = "//span[normalize-space()='By Source :']")
	@CacheLookup
	WebElement AdminManagerTransactionHistoryBySource;

	@FindBy(xpath = "//a[@role='menuitem']//span[contains(text(),'Admin')]")
	@CacheLookup
	WebElement AdminManagerTransactionHistoryBySourceAdmin;

	@FindBy(xpath = "//span[normalize-space()='By Source : Admin']")
	@CacheLookup
	WebElement AdminManagerTransactionHistoryBySourceA;
	
	@FindBy(xpath = "//span[normalize-space()='App']")
	@CacheLookup
	WebElement AdminManagerTransactionHistoryBySourceApp;
	
	@FindBy(xpath = "//span[normalize-space()='By Source : App']")
	@CacheLookup
	WebElement AdminManagerTransactionHistoryBySourceA2;

	@FindBy(xpath = "//a[@role='menuitem']//span[contains(text(),'Organic')]")
	@CacheLookup
	WebElement AdminManagerTransactionHistoryBySourceOrganic;
	
	@FindBy(xpath = "//span[normalize-space()='By Source : Organic']")
	@CacheLookup
	WebElement AdminManagerTransactionHistoryBySourceO;

	@FindBy(xpath = "//span[normalize-space()='Info Ads']")
	@CacheLookup
	WebElement AdminManagerTransactionHistoryBySourceInfoAds;
	
	@FindBy(xpath = "//span[normalize-space()='By Source : Info Ads']")
	@CacheLookup
	WebElement AdminManagerTransactionHistoryBySourceI;

	@FindBy(xpath = "//span[normalize-space()='US Ads']")
	@CacheLookup
	WebElement AdminManagerTransactionHistoryBySourceUSAds;
	
	@FindBy(xpath = "//span[normalize-space()='By Source : US Ads']")
	@CacheLookup
	WebElement AdminManagerTransactionHistoryBySourceU;

	@FindBy(xpath = "//span[normalize-space()='External']")
	@CacheLookup
	WebElement AdminManagerTransactionHistoryBySourceExternal;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[3]/div[1]/a[1]/span[1]")
	@CacheLookup
	WebElement AdminManagerTransactionHistoryByCountry;

	@FindBy(xpath = "//*[@id=\"root\"]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div/div[2]/div/div[2]/ul/li[3]/div/div/ul/li[97]/a/span")
	@CacheLookup
	WebElement AdminManagerTransactionHistoryByCountryIndia;

	@FindBy(xpath = "//*[@id=\"root\"]/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div/div[2]/div/div[2]/ul/li[3]/div/div/ul/li[222]/a/span")
	@CacheLookup
	WebElement AdminManagerTransactionHistoryByCountryUS;

	@FindBy(xpath = "//span[normalize-space()='By Payment Method :']")
	@CacheLookup
	WebElement AdminManagerTransactionHistoryByPaymentMethod;

	@FindBy(xpath = "//span[normalize-space()='Stripe']")
	@CacheLookup
	WebElement AdminManagerTransactionHistoryByPaymentMethodStripe;

	@FindBy(xpath = "//span[normalize-space()='Tazapay']")
	@CacheLookup
	WebElement AdminManagerTransactionHistoryByPaymentMethodTazapay;

	@FindBy(xpath = "//span[normalize-space()='Payu']")
	@CacheLookup
	WebElement AdminManagerTransactionHistoryByPaymentMethodPayu;

	@FindBy(xpath = "//span[normalize-space()='Razorpay']")
	@CacheLookup
	WebElement AdminManagerTransactionHistoryByPaymentMethodRazorpay;

	@FindBy(xpath = "//span[normalize-space()='Phonepe']")
	@CacheLookup
	WebElement AdminManagerTransactionHistoryByPaymentMethodPhonepe;

	@FindBy(xpath = "//span[normalize-space()='Airpay']")
	@CacheLookup
	WebElement AdminManagerTransactionHistoryByPaymentMethodAirpay;

	@FindBy(xpath = "//span[normalize-space()='Coinpay']")
	@CacheLookup
	WebElement AdminManagerTransactionHistoryByPaymentMethodCoinpay;

	@FindBy(xpath = "//span[normalize-space()='Now Payments']")
	@CacheLookup
	WebElement AdminManagerTransactionHistoryByPaymentMethodNowPayments;

	@FindBy(xpath = "//span[normalize-space()='Bitcoin']")
	@CacheLookup
	WebElement AdminManagerTransactionHistoryByPaymentMethodBitcoin;

	@FindBy(xpath = "//input[@value='18-3-2024 - 17-5-2024']")
	@CacheLookup
	WebElement AdminManagerTransactionHistoryDate;

	@FindBy(xpath = "//div[@aria-label='Choose Wednesday, May 1st, 2024']")
	@CacheLookup
	WebElement AdminManagerTransactionHistoryDateselect1May;

	@FindBy(xpath = "//div[@aria-label='Choose Saturday, May 18th, 2024']")
	@CacheLookup
	WebElement AdminManagerTransactionHistoryDateselect18May;

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

// #*******************************************Manager Transaction History Page****************************************

	public void AdminManagerTransactionHistory() {
		AdminManagerTransactionHistory.click();

	}

	public void enterAdminManagerTransactionHistorySearch() {
		AdminManagerTransactionHistorySearch.sendKeys("ADV652E5165508A0");
	}

	public void AdminManagerTransactionHistoryBySource() {
		AdminManagerTransactionHistoryBySource.click();

	}

	public void AdminManagerTransactionHistoryBySourceAdmin() {
		AdminManagerTransactionHistoryBySource.click();

	}
	
	public void AdminManagerTransactionHistoryBySourceA() {
		AdminManagerTransactionHistoryBySourceA.click();

	}

	public void AdminManagerTransactionHistoryBySourceApp() {
		AdminManagerTransactionHistoryBySourceApp.click();

	}
	
	public void AdminManagerTransactionHistoryBySourceA2() {
		AdminManagerTransactionHistoryBySourceA2.click();

	}

	public void AdminManagerTransactionHistoryBySourceOrganic() {
		AdminManagerTransactionHistoryBySourceOrganic.click();

	}
	
	public void AdminManagerTransactionHistoryBySourceO() {
		AdminManagerTransactionHistoryBySourceO.click();

	}

	public void AdminManagerTransactionHistoryBySourceInfoAds() {
		AdminManagerTransactionHistoryBySourceInfoAds.click();

	}
	
	public void AdminManagerTransactionHistoryBySourceI() {
		AdminManagerTransactionHistoryBySourceI.click();

	}

	public void AdminManagerTransactionHistoryBySourceUSAds() {
		AdminManagerTransactionHistoryBySourceUSAds.click();

	}
	
	public void AdminManagerTransactionHistoryBySourceU() {
		AdminManagerTransactionHistoryBySourceU.click();

	}

	public void AdminManagerTransactionHistoryBySourceExternal() {
		AdminManagerTransactionHistoryBySourceExternal.click();

	}

	public void AdminManagerTransactionHistorySearchButton() {
		AdminManagerTransactionHistorySearchButton.click();

	}

	public void AdminManagerTransactionHistoryByCountry() {
		AdminManagerTransactionHistoryByCountry.click();

	}

	public void AdminManagerTransactionHistoryByCountryIndia() {
		AdminManagerTransactionHistoryByCountryIndia.click();

	}

	public void AdminManagerTransactionHistoryByCountryUS() {
		AdminManagerTransactionHistoryByCountryUS.click();

	}
	public void AdminManagerTransactionHistoryByPaymentMethod() {
		AdminManagerTransactionHistoryByPaymentMethod.click();

	}

	public void AdminManagerTransactionHistoryByPaymentMethodStripe() {
		AdminManagerTransactionHistoryByPaymentMethodStripe.click();

	}

	public void AdminManagerTransactionHistoryByPaymentMethodTazapay() {
		AdminManagerTransactionHistoryByPaymentMethodTazapay.click();

	}

	public void AdminManagerTransactionHistoryByPaymentMethodPayu() {
		AdminManagerTransactionHistoryByPaymentMethodPayu.click();

	}

	public void AdminManagerTransactionHistoryByPaymentMethodRazorpay() {
		AdminManagerTransactionHistoryByPaymentMethodRazorpay.click();

	}

	public void AdminManagerTransactionHistoryByPaymentMethodPhonepe() {
		AdminManagerTransactionHistoryByPaymentMethodPhonepe.click();

	}

	public void AdminManagerTransactionHistoryByPaymentMethodAirpay() {
		AdminManagerTransactionHistoryByPaymentMethodAirpay.click();

	}

	public void AdminManagerTransactionHistoryByPaymentMethodCoinpay() {
		AdminManagerTransactionHistoryByPaymentMethodCoinpay.click();

	}

	public void AdminManagerTransactionHistoryByPaymentMethodNowPayments() {
		AdminManagerTransactionHistoryByPaymentMethodNowPayments.click();

	}

	public void AdminManagerTransactionHistoryByPaymentMethodBitcoin() {
		AdminManagerTransactionHistoryByPaymentMethodBitcoin.click();

	}

	public void AdminManagerTransactionHistoryDate() {
		AdminManagerTransactionHistoryDate.click();

	}

	public void AdminManagerTransactionHistoryDateselect1May() {
		AdminManagerTransactionHistoryDateselect1May.click();

	}

	public void AdminManagerTransactionHistoryDateselect18May() {
		AdminManagerTransactionHistoryDateselect18May.click();

	}

}
