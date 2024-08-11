package Com.ADV7Search.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class PageFactoryAdminPaymentReportPage {

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

//#********************************************Manager Payment Report Page**********************************

	@FindBy(xpath = "//span[normalize-space()='Payment Report']")
	@CacheLookup
	WebElement AdminManagerPaymentReport;

	@FindBy(xpath = "//input[@id='default-04']")
	@CacheLookup
	WebElement AdminManagerPaymentReportSearch;

	@FindBy(xpath = "//span[normalize-space()='By Source :']")
	@CacheLookup
	WebElement AdminManagerPaymentReportBySource;

	@FindBy(xpath = "//a[@role='menuitem']//span[contains(text(),'Admin')]")
	@CacheLookup
	WebElement AdminManagerPaymentReportBySourceAdmin;

	@FindBy(xpath = "//span[normalize-space()='By Source : Admin']")
	@CacheLookup
	WebElement AdminManagerPaymentReportBySourceA;
	
	@FindBy(xpath = "//span[normalize-space()='App']")
	@CacheLookup
	WebElement AdminManagerPaymentReportBySourceApp;
	
	@FindBy(xpath = "//span[normalize-space()='By Source : App']")
	@CacheLookup
	WebElement AdminManagerPaymentReportBySourceA2;

	@FindBy(xpath = "//a[@role='menuitem']//span[contains(text(),'Organic')]")
	@CacheLookup
	WebElement AdminManagerPaymentReportBySourceOrganic;
	
	@FindBy(xpath = "//span[normalize-space()='By Source : Organic']")
	@CacheLookup
	WebElement AdminManagerPaymentReportBySourceO;

	@FindBy(xpath = "//span[normalize-space()='Info Ads']")
	@CacheLookup
	WebElement AdminManagerPaymentReportBySourceInfoAds;
	
	@FindBy(xpath = "//span[normalize-space()='By Source : Info Ads']")
	@CacheLookup
	WebElement AdminManagerPaymentReportBySourceI;

	@FindBy(xpath = "//span[normalize-space()='US Ads']")
	@CacheLookup
	WebElement AdminManagerPaymentReportBySourceUSAds;
	
	@FindBy(xpath = "//span[normalize-space()='By Source : US Ads']")
	@CacheLookup
	WebElement AdminManagerPaymentReportBySourceU;

	@FindBy(xpath = "//span[normalize-space()='External']")
	@CacheLookup
	WebElement AdminManagerPaymentReportBySourceExternal;

	@FindBy(xpath = "//body/div[@id='root']/div[@class='nk-app-root']/div[@class='nk-main']/div[@class='nk-wrap']/div[@class='nk-content']/div[@class='container-fluid']/div[@class='nk-content-inner']/div[@class='nk-content-body']/div[@class='nk-block-head nk-block-head-sm']/div[contains(@class,'nk-block-between')]/div[@class='nk-block-head-content']/div[@class='toggle-wrap nk-block-tools-toggle']/div[@class='toggle-expand-content']/ul[@class='nk-block-tools g-3']/li[3]/div[1]/a[1]/span[1]")
	@CacheLookup
	WebElement AdminManagerPaymentReportByCountry;

	@FindBy(xpath = "//li[97]//a[1]//span[1]")
	@CacheLookup
	WebElement AdminManagerPaymentReportByCountryIndia;

	@FindBy(xpath = "//span[normalize-space()='UNITED STATES']")
	@CacheLookup
	WebElement AdminManagerPaymentReportByCountryUS;

	@FindBy(xpath = "//body/div[@id='root']/div[@class='nk-app-root']/div[@class='nk-main']/div[@class='nk-wrap']/div[@class='nk-content']/div[@class='container-fluid']/div[@class='nk-content-inner']/div[@class='nk-content-body']/div[@class='nk-block-head nk-block-head-sm']/div[contains(@class,'nk-block-between')]/div[@class='nk-block-head-content']/div[@class='toggle-wrap nk-block-tools-toggle']/div[@class='toggle-expand-content']/ul[@class='nk-block-tools g-3']/li[4]/div[1]/a[1]/span[1]")
	@CacheLookup
	WebElement AdminManagerPaymentReportByCategory;

	@FindBy(xpath = "//a[@role='menuitem']//span[contains(text(),'Dating & Adult')]")
	@CacheLookup
	WebElement AdminManagerPaymentReportByCategoryAdultDating;

	@FindBy(xpath = "//a[@role='menuitem']//span[contains(text(),'All Categories')]")
	@CacheLookup
	WebElement AdminManagerPaymentReportByCategoryAllCategories;

	@FindBy(xpath = "//a[@role='menuitem']//span[contains(text(),'Gambling')]")
	@CacheLookup
	WebElement AdminManagerPaymentReportByCategoryGambling;

	@FindBy(xpath = "//a[@role='menuitem']//span[contains(text(),'Travel & Hospitality')]")
	@CacheLookup
	WebElement AdminManagerPaymentReportByCategoryTravel;

	@FindBy(xpath = "//span[normalize-space()='By Payment Method :']")
	@CacheLookup
	WebElement AdminManagerPaymentReportByPaymentMethod;
	
	@FindBy(xpath = "//span[normalize-space()='Stripe']")
	@CacheLookup
	WebElement AdminManagerPaymentReportByPaymentMethodStripe;

	@FindBy(xpath = "//span[normalize-space()='Tazapay']")
	@CacheLookup
	WebElement AdminManagerPaymentReportByPaymentMethodTazapay;

	@FindBy(xpath = "//span[normalize-space()='Payu']")
	@CacheLookup
	WebElement AdminManagerPaymentReportByPaymentMethodPayu;

	@FindBy(xpath = "//span[normalize-space()='Phonepe']")
	@CacheLookup
	WebElement AdminManagerPaymentReportByPaymentMethodPhonepe;

	@FindBy(xpath = "//span[normalize-space()='Airpay']")
	@CacheLookup
	WebElement AdminManagerPaymentReportByPaymentMethodAirpay;

	@FindBy(xpath = "//span[normalize-space()='Coinpay']")
	@CacheLookup
	WebElement AdminManagerPaymentReportByPaymentMethodCoinpay;

	@FindBy(xpath = "//span[normalize-space()='Now Payments']")
	@CacheLookup
	WebElement AdminManagerPaymentReportByPaymentMethodNowPayments;

	@FindBy(xpath = "//span[normalize-space()='Bitcoin']")
	@CacheLookup
	WebElement AdminManagerPaymentReportByPaymentMethodBitcoin;
	
	@FindBy(xpath = "//span[normalize-space()='Search']")
	@CacheLookup
	WebElement AdminManagerPaymentReportSearchButton;
	
	@FindBy(xpath = "//input[@value='22-5-2024 - 21-7-2024']")
	@CacheLookup
	WebElement AdminManagerPaymentReportDate;
	
	@FindBy(xpath = "//div[@aria-label='Choose Monday, July 1st, 2024']")
	@CacheLookup
	WebElement AdminManagerPaymentReportDateselect1July;
	
	@FindBy(xpath = "//div[contains(@aria-label,'Choose Wednesday, July 31st, 2024')]")
	@CacheLookup
	WebElement AdminManagerPaymentReportDateselect31July;

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

// #*******************************************Manager Coupon List Page****************************************

	public void AdminManagerPaymentReport() {
		AdminManagerPaymentReport.click();

	}

	public void enterAdminManagerPaymentReportSearch() {
		AdminManagerPaymentReportSearch.sendKeys("ADV66681954C370F");
	}
	
	public void AdminManagerPaymentReportBySource() {
		AdminManagerPaymentReportBySource.click();

	}

	public void AdminManagerPaymentReportBySourceAdmin() {
		AdminManagerPaymentReportBySource.click();

	}
	
	public void AdminManagerPaymentReportBySourceA() {
		AdminManagerPaymentReportBySourceA.click();

	}

	public void AdminManagerPaymentReportBySourceApp() {
		AdminManagerPaymentReportBySourceApp.click();

	}
	
	public void AdminManagerPaymentReportBySourceA2() {
		AdminManagerPaymentReportBySourceA2.click();

	}

	public void AdminManagerPaymentReportBySourceOrganic() {
		AdminManagerPaymentReportBySourceOrganic.click();

	}
	
	public void AdminManagerPaymentReportBySourceO() {
		AdminManagerPaymentReportBySourceO.click();

	}

	public void AdminManagerPaymentReportBySourceInfoAds() {
		AdminManagerPaymentReportBySourceInfoAds.click();

	}
	
	public void AdminManagerPaymentReportBySourceI() {
		AdminManagerPaymentReportBySourceI.click();

	}

	public void AdminManagerPaymentReportBySourceUSAds() {
		AdminManagerPaymentReportBySourceUSAds.click();

	}
	
	public void AdminManagerPaymentReportBySourceU() {
		AdminManagerPaymentReportBySourceU.click();

	}

	public void AdminManagerPaymentReportBySourceExternal() {
		AdminManagerPaymentReportBySourceExternal.click();

	}

	public void AdminManagerPaymentReportByCountry() {
		AdminManagerPaymentReportByCountry.click();

	}

	public void AdminManagerPaymentReportByCountryIndia() {
		AdminManagerPaymentReportByCountryIndia.click();

	}

	public void AdminManagerPaymentReportByCountryUS() {
		AdminManagerPaymentReportByCountryUS.click();

	}

	public void AdminManagerPaymentReportByCategory() {
		AdminManagerPaymentReportByCategory.click();

	}

	public void AdminManagerPaymentReportByCategoryAdultDating() {
		AdminManagerPaymentReportByCategoryAdultDating.click();

	}

	public void AdminManagerPaymentReportByCategoryAllCategories() {
		AdminManagerPaymentReportByCategoryAllCategories.click();

	}

	public void AdminManagerPaymentReportByCategoryGambling() {
		AdminManagerPaymentReportByCategoryGambling.click();

	}

	public void AdminManagerPaymentReportByCategoryTravel() {
		AdminManagerPaymentReportByCategoryTravel.click();

	}

	public void AdminManagerPaymentReportByPaymentMethod() {
		AdminManagerPaymentReportByPaymentMethod.click();

	}

	public void AdminManagerPaymentReportByPaymentMethodStripe() {
		AdminManagerPaymentReportByPaymentMethodStripe.click();

	}

	public void AdminManagerPaymentReportByPaymentMethodTazapay() {
		AdminManagerPaymentReportByPaymentMethodTazapay.click();

	}

	public void AdminManagerPaymentReportByPaymentMethodPayu() {
		AdminManagerPaymentReportByPaymentMethodPayu.click();

	}
	
	public void AdminManagerPaymentReportByPaymentMethodPhonepe() {
		AdminManagerPaymentReportByPaymentMethodPhonepe.click();

	}

	public void AdminManagerPaymentReportByPaymentMethodAirpay() {
		AdminManagerPaymentReportByPaymentMethodAirpay.click();

	}

	public void AdminManagerPaymentReportByPaymentMethodCoinpay() {
		AdminManagerPaymentReportByPaymentMethodCoinpay.click();

	}

	public void AdminManagerPaymentReportByPaymentMethodNowPayments() {
		AdminManagerPaymentReportByPaymentMethodNowPayments.click();

	}

	public void AdminManagerPaymentReportByPaymentMethodBitcoin() {
		AdminManagerPaymentReportByPaymentMethodBitcoin.click();

	}
	
	public void AdminManagerPaymentReportSearchButton() {
		AdminManagerPaymentReportSearchButton.click();

	}
	
	public void AdminManagerPaymentReportDate() {
		AdminManagerPaymentReportDate.click();

	}
	
	public void AdminManagerPaymentReportDateselect1July() {
		AdminManagerPaymentReportDateselect1July.click();

	}
	public void AdminManagerPaymentReportDateselect31July() {
		AdminManagerPaymentReportDateselect31July.click();

	}
	

}
