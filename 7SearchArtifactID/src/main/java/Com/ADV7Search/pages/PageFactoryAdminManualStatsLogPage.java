package Com.ADV7Search.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class PageFactoryAdminManualStatsLogPage {

	
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

//#********************************************Manual Stats Log Page**********************************

		@FindBy(xpath = "//span[normalize-space()='Manual Stats Log']")
		@CacheLookup
		WebElement AdminManualStatsLog;
		
		@FindBy(xpath = "//input[@id='default-04']")
		@CacheLookup
		WebElement AdminManualStatsLogSearch;
		
		@FindBy(xpath = "//input[@value='25-6-2024 - 25-7-2024']")
		@CacheLookup
		WebElement AdminManualStatsLogDate;
		
		@FindBy(xpath = "//div[@aria-label='Choose Friday, July 15th, 2024']")
		@CacheLookup
		WebElement AdminManualStatsLogDate6April;
		
		@FindBy(xpath = "//div[contains(@aria-label,'Choose Sunday, July 25st, 2024')]")
		@CacheLookup
		WebElement AdminManualStatsLogDate5May;
		
		@FindBy(xpath = "//button[@type='button']")
		@CacheLookup
		WebElement AdminManualStatsLogSearchButton;
		
// #*******************************************Login Page****************************************

		public void enterEmail() {
			Email.sendKeys("admin");
		}

		public void enterPassword() {
			Password.sendKeys("7Search@pass123");
		}
		//7Search@passcom555

		public void clickLoginButton() {
			clickLoginButton.click();

		}

// #*******************************************Manual Stats Log Page****************************************

		public void AdminManualStatsLog() {
			AdminManualStatsLog.click();
		}
		
		public void enterAdminManualStatsLogSearch() {
			AdminManualStatsLogSearch.sendKeys("CMPT65762442EBB8A");
		}
		
		public void AdminManualStatsLogDate() {
			AdminManualStatsLogDate.click();
		}
		
		public void AdminManualStatsLogDate6April() {
			AdminManualStatsLogDate6April.click();
		}
		
		public void AdminManualStatsLogDate5May() {
			AdminManualStatsLogDate5May.click();
		}
		
		public void AdminManualStatsLogSearchButton() {
			AdminManualStatsLogSearchButton.click();
		}
		
//		public void AdminManagerCountry() {
//			AdminManagerCountry.click();
//		}
//		
//		public void AdminManagerCountry() {
//			AdminManagerCountry.click();
//		}
}
