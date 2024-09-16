package Com.ADV7Search.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class PageFactoryReferralCommissionHistoryPage {

	
//#******************************************Login Page***************************************

		@FindBy(xpath = "//input[@id='email']")
		@CacheLookup
		WebElement RefLoginEmail;

		@FindBy(xpath = "//input[@id='password']")
		@CacheLookup
		WebElement RefLoginPassword;

		@FindBy(xpath = "//em[@class='passcode-icon icon-hide icon ni ni-eye-off']")
		@CacheLookup
		WebElement RefLoginPasswordEye;

		@FindBy(xpath = "//button[@type='submit']")
		@CacheLookup
		WebElement RefLoginButton;

//#******************************************Commission History Page***************************************

		@FindBy(xpath = "//span[normalize-space()='Commission History']")
		@CacheLookup
		WebElement RefCommissionHistory;

		@FindBy(xpath = "//input[@id='default-04']")
		@CacheLookup
		WebElement RefCommissionHistorySearch;
		
		@FindBy(xpath = "//input[@placeholder='Start Date - End Date']")
		@CacheLookup
		WebElement RefCommissionHistoryDate;
		
		@FindBy(xpath = "//div[@aria-label='Choose Monday, August 19th, 2024']")
		@CacheLookup
		WebElement RefCommissionHistoryDate19Aug;
		
		@FindBy(xpath = "//div[@aria-label='Choose Friday, August 23rd, 2024']")
		@CacheLookup
		WebElement RefCommissionHistoryDate23Aug;
		
		@FindBy(xpath = "//select[@id='type']")
		@CacheLookup
		WebElement RefCommissionHistoryAccountType;
		
		@FindBy(xpath = "//*[@id=\"type\"]/option[2]")
		@CacheLookup
		WebElement RefCommissionHistoryAccountTypeADV;
		
		@FindBy(xpath = "//*[@id=\"type\"]/option[3]")
		@CacheLookup
		WebElement RefCommissionHistoryAccountTypePUB;
		
		@FindBy(xpath = "//button[normalize-space()='Apply Filters']")
		@CacheLookup
		WebElement RefCommissionHistoryApplyButton;
		
		@FindBy(xpath = "//button[contains(@type,'button')]")
		@CacheLookup
		WebElement RefCommissionHistoryClearButton;
		

//#******************************************Login Page***************************************

			public void enterRefLoginEmail() {
				RefLoginEmail.sendKeys("rajeevgp1596+15@gmail.com");
			}

			public void enterRefLoginPassword() {
				RefLoginPassword.sendKeys("123456");
			}

			public void RefLoginPasswordEye() {
				RefLoginPasswordEye.click();
			}

			public void RefLoginButton() {
				RefLoginButton.click();
			}

//#******************************************Commission History Page***************************************

			public void RefCommissionHistory() {
				RefCommissionHistory.click();
			}
			
			public void enterRefCommissionHistorySearch() {
				RefCommissionHistorySearch.sendKeys("ADV652E5165508A0");
			}
			
			public void RefCommissionHistoryDate() {
				RefCommissionHistoryDate.click();
			}
			
			public void RefCommissionHistoryDate19Aug() {
				RefCommissionHistoryDate19Aug.click();
			}
			
			public void RefCommissionHistoryDate23Aug() {
				RefCommissionHistoryDate23Aug.click();
			}
			
			public void RefCommissionHistoryAccountType() {
				RefCommissionHistoryAccountType.click();
			}
			
			public void RefCommissionHistoryAccountTypeADV() {
				RefCommissionHistoryAccountTypeADV.click();
			}
			
			public void RefCommissionHistoryAccountTypePUB() {
				RefCommissionHistoryAccountTypePUB.click();
			}
			
			public void RefCommissionHistoryApplyButton() {
				RefCommissionHistoryApplyButton.click();
			}
			
			public void RefCommissionHistoryClearButton() {
				RefCommissionHistoryClearButton.click();
			}
			
			
}
