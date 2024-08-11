package Com.ADV7Search.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class PageFactoryAdminPublisherStatisticsPage {

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

// #********************************************Publisher Statistics Page**********************************

	@FindBy(xpath = "//span[@class='nk-menu-text'][normalize-space()='Statistics']")
	@CacheLookup
	WebElement AdminManageStatistics;

	@FindBy(xpath = "//span[normalize-space()='Report By Country']")
	@CacheLookup
	WebElement AdminManageStatisticsByCountry;

	@FindBy(xpath = "//span[normalize-space()='INDIA']")
	@CacheLookup
	WebElement AdminManageStatisticsByCountryINDIA;

	@FindBy(xpath = "//span[normalize-space()='INDONESIA']")
	@CacheLookup
	WebElement AdminManageStatisticsByCountryINDONESIA;

	@FindBy(xpath = "//span[normalize-space()='PAKISTAN']")
	@CacheLookup
	WebElement AdminManageStatisticsByCountryPAKISTAN;

	@FindBy(xpath = "//span[normalize-space()='SINGAPORE']")
	@CacheLookup
	WebElement AdminManageStatisticsByCountrySINGAPORE;

	@FindBy(xpath = "//span[normalize-space()='UNITED STATES']")
	@CacheLookup
	WebElement AdminManageStatisticsByCountryUS;

	@FindBy(xpath = "//span[normalize-space()='Report By Website']")
	@CacheLookup
	WebElement AdminManageStatisticsByWebsite;

	@FindBy(xpath = "//span[normalize-space()='metatag2-rajeevgp.blogspot.com']")
	@CacheLookup
	WebElement AdminManageStatisticsByWebsitemetatag2;

	@FindBy(xpath = "//span[normalize-space()='moviflux.com']")
	@CacheLookup
	WebElement AdminManageStatisticsByWebsitemoviflux;

	@FindBy(xpath = "//span[normalize-space()='Filtered By']")
	@CacheLookup
	WebElement AdminManageStatisticsFilteredBy;

	@FindBy(xpath = "//button[normalize-space()='Domain']")
	@CacheLookup
	WebElement AdminManageStatisticsDomain;

	@FindBy(xpath = "//button[normalize-space()='Placement']")
	@CacheLookup
	WebElement AdminManageStatisticsPlacement;

	@FindBy(xpath = "//button[normalize-space()='Country']")
	@CacheLookup
	WebElement AdminManageStatisticsCountry;

	@FindBy(xpath = "//button[normalize-space()='Device Format']")
	@CacheLookup
	WebElement AdminManageStatisticsDevice;

	@FindBy(xpath = "//button[normalize-space()='Operating System']")
	@CacheLookup
	WebElement AdminManageStatisticsOperating;

	@FindBy(xpath = "//input[@value='21-7-2024 - 28-7-2024']")
	@CacheLookup
	WebElement AdminManageStatisticsDate02_09;

	@FindBy(xpath = "//div[@aria-label='Choose Saturday, June 1st, 2024']")
	@CacheLookup
	WebElement AdminManageStatisticsDateJune1st;

	@FindBy(xpath = "//div[@aria-label='Choose Sunday, June 9th, 2024']")
	@CacheLookup
	WebElement AdminManageStatisticsDateJune9th;

	@FindBy(xpath = "//span[normalize-space()='Search']")
	@CacheLookup
	WebElement AdminManageStatisticsSearchButton;

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

// #*******************************************Manage Publisher Statistics Page****************************************

	public void AdminManageStatistics() {
		AdminManageStatistics.click();
	}

	public void AdminManageStatisticsByCountry() {
		AdminManageStatisticsByCountry.click();
	}

	public void AdminManageStatisticsByCountryINDIA() {
		AdminManageStatisticsByCountryINDIA.click();
	}

	public void AdminManageStatisticsByCountryINDONESIA() {
		AdminManageStatisticsByCountryINDONESIA.click();
	}

	public void AdminManageStatisticsByCountryPAKISTAN() {
		AdminManageStatisticsByCountryPAKISTAN.click();
	}

	public void AdminManageStatisticsByCountrySINGAPORE() {
		AdminManageStatisticsByCountrySINGAPORE.click();
	}

	public void AdminManageStatisticsByCountryUS() {
		AdminManageStatisticsByCountryUS.click();
	}

	public void AdminManageStatisticsByWebsite() {
		AdminManageStatisticsByWebsite.click();
	}

	public void AdminManageStatisticsByWebsitemetatag2() {
		AdminManageStatisticsByWebsitemetatag2.click();
	}

	public void AdminManageStatisticsByWebsitemoviflux() {
		AdminManageStatisticsByWebsitemoviflux.click();
	}

	public void AdminManageStatisticsFilteredBy() {
		AdminManageStatisticsFilteredBy.click();
	}

	public void AdminManageStatisticsDomain() {
		AdminManageStatisticsDomain.click();
	}

	public void AdminManageStatisticsPlacement() {
		AdminManageStatisticsPlacement.click();
	}

	public void AdminManageStatisticsCountry() {
		AdminManageStatisticsCountry.click();
	}

	public void AdminManageStatisticsDevice() {
		AdminManageStatisticsDevice.click();
	}

	public void AdminManageStatisticsOperating() {
		AdminManageStatisticsOperating.click();
	}

	public void AdminManageStatisticsDate02_09() {
		AdminManageStatisticsDate02_09.click();
	}

	public void AdminManageStatisticsDateJune1st() {
		AdminManageStatisticsDateJune1st.click();
	}

	public void AdminManageStatisticsDateJune9th() {
		AdminManageStatisticsDateJune9th.click();
	}

	public void AdminManageStatisticsSearchButton() {
		AdminManageStatisticsSearchButton.click();
	}

}
