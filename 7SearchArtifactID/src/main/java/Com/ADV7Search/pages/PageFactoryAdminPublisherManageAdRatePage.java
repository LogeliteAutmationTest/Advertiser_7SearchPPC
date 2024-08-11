package Com.ADV7Search.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class PageFactoryAdminPublisherManageAdRatePage {

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

// #********************************************Publisher Ads Rate Page**********************************

	@FindBy(css = "li[class='nk-menu-item active current-page'] span[class='nk-menu-text']")
	@CacheLookup
	WebElement AdminManageAdRates;

	@FindBy(xpath = "//input[@id='default-04']")
	@CacheLookup
	WebElement AdminManageAdRatesSearch;
	
	@FindBy(xpath = "//span[normalize-space()='By Country']")
	@CacheLookup
	WebElement AdminManageAdRatesByCountry;
	
	@FindBy(xpath = "//span[normalize-space()='INDIA']")
	@CacheLookup
	WebElement AdminManageAdRatesByCountryIndia;
	
	@FindBy(xpath = "//body/div[@id='root']/div[@class='nk-app-root']/div[@class='nk-main']/div[@class='nk-wrap']/div[@class='nk-content']/div[@class='container-fluid']/div[@class='nk-content-inner']/div[@class='nk-content-body']/div[@class='nk-block-head nk-block-head-sm']/div[contains(@class,'nk-block-between')]/div[@class='nk-block-head-content']/div[@class='toggle-wrap nk-block-tools-toggle']/div[@class='toggle-expand-content']/ul[@class='nk-block-tools g-3']/li[2]/div[1]/a[1]/span[1]//span[normalize-space()='By Country']")
	@CacheLookup
	WebElement AdminManageAdRatesByCountryI;
	
	@FindBy(xpath = "//span[normalize-space()='UNITED STATES']")
	@CacheLookup
	WebElement AdminManageAdRatesByCountryUS;
	
	@FindBy(xpath = "//span[normalize-space()='By Category']")
	@CacheLookup
	WebElement AdminManageAdRatesByCategory;
	
	@FindBy(xpath = "//a[@role='menuitem']//span[contains(text(),'Dating & Adult')]")
	@CacheLookup
	WebElement AdminManageAdRatesByCategoryAdult;
	
	@FindBy(xpath = "//span[normalize-space()='By Category : Dating & Adult']")
	@CacheLookup
	WebElement AdminManageAdRatesByCategoryCrypto;
	
	@FindBy(xpath = "//span[normalize-space()='All Categories']")
	@CacheLookup
	WebElement AdminManageAdRatesByCategoryAllCategories;
	
	@FindBy(xpath = "//span[normalize-space()='Add Rates']")
	@CacheLookup
	WebElement AdminManageAdRatesAddRates;


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

// #*******************************************Manage Publisher Client Page****************************************

	public void AdminManageAdRates() {
		AdminManageAdRates.click();
	}

	public void AdminManageAdRatesByCountry() {
		AdminManageAdRatesByCountry.click();
	}

	public void enterAdminManageAdRatesSearch() {
		AdminManageAdRatesSearch.sendKeys("India");
	}
	
	public void AdminManageAdRatesByCountryIndia() {
		AdminManageAdRatesByCountryIndia.click();
	}
	
	public void AdminManageAdRatesByCountryI() {
		AdminManageAdRatesByCountryI.click();
	}
	
	public void AdminManageAdRatesByCountryUS() {
		AdminManageAdRatesByCountryUS.click();
	}
	
	public void AdminManageAdRatesByCategory() {
		AdminManageAdRatesByCategory.click();
	}
	
	public void AdminManageAdRatesByCategoryAdult() {
		AdminManageAdRatesByCountry.click();
	}
	
	public void AdminManageAdRatesByCategoryCrypto() {
		AdminManageAdRatesByCategoryCrypto.click();
	}
	
	public void AdminManageAdRatesByCategoryAllCategories() {
		AdminManageAdRatesByCategoryAllCategories.click();
	}
	
	public void AdminManageAdRatesAddRates() {
		AdminManageAdRatesAddRates.click();
	}
	

}
