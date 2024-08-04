package Com.ADV7Search.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class PageFactoryPUBStatisticsPage {

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

	@FindBy(xpath = "//button[@type='submit']")
	@CacheLookup
	WebElement switchtoPublisher;

// #*************************************PUBStatistics Page***************************************

	@FindBy(xpath = "//span[normalize-space()='Statistics']")
	@CacheLookup
	WebElement PUBStatistics;

	@FindBy(xpath = "//button[normalize-space()='Domain']")
	@CacheLookup
	WebElement PUBStatisticsDomain;

	@FindBy(xpath = "//button[normalize-space()='Placement']")
	@CacheLookup
	WebElement PUBStatisticsPlacement;

	@FindBy(xpath = "//button[normalize-space()='Country']")
	@CacheLookup
	WebElement PUBStatisticsCountry;

	@FindBy(xpath = "//button[normalize-space()='Device']")
	@CacheLookup
	WebElement PUBStatisticsDevice;

	@FindBy(xpath = "//button[normalize-space()='Operating System']")
	@CacheLookup
	WebElement PUBStatisticsOperatingSystem;

	@FindBy(xpath = "//em[@class='icon ni ni-downward-ios']")
	@CacheLookup
	WebElement PUBStatisticsPaginationdropdown;

	@FindBy(xpath = "//span[normalize-space()='50']")
	@CacheLookup
	WebElement PUBStatisticsPaginationdropdown50;

	@FindBy(xpath = "//span[normalize-space()='By Country']")
	@CacheLookup
	WebElement PUBStatisticsCountrydropdown;

	@FindBy(css = "li:nth-child(97) a:nth-child(1)")
	@CacheLookup
	WebElement PUBStatisticsCountryIndia;

	@FindBy(xpath = "//span[normalize-space()='Search']")
	@CacheLookup
	WebElement PUBStatisticsSearch;

	@FindBy(xpath = "//span[normalize-space()='By INDIA']")
	@CacheLookup
	WebElement PUBStatisticsCountrydropdownIndia;

	@FindBy(css = "li:nth-child(222) a:nth-child(1) span:nth-child(1)")
	@CacheLookup
	WebElement PUBStatisticsCountryUnitedState;

	@FindBy(xpath = "//span[normalize-space()='By Website']")
	@CacheLookup
	WebElement PUBStatisticsWebsite;

	@FindBy(css = "div[class='dropdown show'] li:nth-child(14) a:nth-child(1) span:nth-child(1)")
	@CacheLookup
	WebElement PUBStatisticsWebsiteMeta2;

//	@FindBy(xpath = "//span[normalize-space()='By Country']")
//	@CacheLookup
//	WebElement PUBStatisticsCountrydropdown;
//	
//	
//	@FindBy(xpath = "//span[normalize-space()='By Country']")
//	@CacheLookup
//	WebElement PUBStatisticsCountrydropdown;

// #*******************************************Login Page****************************************

	public void enterEmail() {
		Email.sendKeys("rajeevgp1596+20@gmail.com");
	}

	public void enterPassword() {
		Password.sendKeys("1234");
	}

	public void clickLoginButton() {
		clickLoginButton.click();

	}

	public void clickswitchtoPublisher() {
		switchtoPublisher.click();

	}

// #******************************************PUBStatistics Page*************************************************

	public void clickPUBStatistics() {
		PUBStatistics.click();

	}

	public void clickPUBStatisticsDomain() {
		PUBStatisticsDomain.click();

	}

	public void clickPUBStatisticsPlacement() {
		PUBStatisticsPlacement.click();

	}

	public void clickPUBStatisticsCountry() {
		PUBStatisticsCountry.click();

	}

	public void clickPUBStatisticsDevice() {
		PUBStatisticsDevice.click();

	}

	public void clickPUBStatisticsOperatingSystem() {
		PUBStatisticsOperatingSystem.click();

	}

	public void clickPUBStatisticsPaginationdropdown() {
		PUBStatisticsPaginationdropdown.click();

	}

	public void clickPUBStatisticsPaginationdropdown50() {
		PUBStatisticsPaginationdropdown50.click();

	}

	public void clickPUBStatisticsCountrydropdown() {
		PUBStatisticsCountrydropdown.click();

	}

	public void clickPUBStatisticsCountryIndia() {
		PUBStatisticsCountryIndia.click();

	}

	public void clickPUBStatisticsSearch() {
		PUBStatisticsSearch.click();

	}

	public void clickPUBStatisticsCountrydropdownIndia() {
		PUBStatisticsCountrydropdownIndia.click();

	}

	public void clickPUBStatisticsCountryUnitedState() {
		PUBStatisticsCountryUnitedState.click();

	}

	public void clickPUBStatisticsWebsite() {
		PUBStatisticsWebsite.click();

	}

	public void clickPUBStatisticsWebsiteMeta2() {
		PUBStatisticsWebsiteMeta2.click();

	}

//		public void clickPUBStatisticsCountrydropdownIndia() {
//			PUBStatisticsCountrydropdownIndia.click();
//
//		}
//	

}
