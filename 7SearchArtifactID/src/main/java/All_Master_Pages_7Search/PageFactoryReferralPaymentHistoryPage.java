package All_Master_Pages_7Search;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class PageFactoryReferralPaymentHistoryPage {

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

//#******************************************Joined User Page***************************************

	@FindBy(xpath = "//span[normalize-space()='Payment History']")
	@CacheLookup
	WebElement RefPaymentHistory;

	@FindBy(xpath = "//input[@placeholder='Start Date - End Date']")
	@CacheLookup
	WebElement RefPaymentHistoryDate;

	@FindBy(xpath = "//div[@aria-label='Choose Tuesday, August 20th, 2024']")
	@CacheLookup
	WebElement RefPaymentHistoryDate20Aug;

	@FindBy(xpath = "//div[@aria-label='Choose Friday, August 30th, 2024']")
	@CacheLookup
	WebElement RefPaymentHistoryDate30Aug;

	@FindBy(xpath = "//button[normalize-space()='Apply Filter']")
	@CacheLookup
	WebElement RefPaymentHistoryApplyFilter;

	@FindBy(xpath = "//button[contains(@type,'button')]")
	@CacheLookup
	WebElement RefPaymentHistoryClearFilter;

	@FindBy(xpath = "//input[@placeholder='Search by Pay Method']")
	@CacheLookup
	WebElement RefPaymentHistorySearch;

//#******************************************Login Page***************************************

	public void enterRefLoginEmail() {
		RefLoginEmail.sendKeys("rajeevgp1596+13@gmail.com");
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

//#******************************************Joined User Page***************************************

	public void RefPaymentHistory() {
		RefPaymentHistory.click();
	}

	public void RefPaymentHistoryDate() {
		RefPaymentHistoryDate.click();
	}

	public void RefPaymentHistoryDate20Aug() {
		RefPaymentHistoryDate20Aug.click();
	}

	public void RefPaymentHistoryDate30Aug() {
		RefPaymentHistoryDate30Aug.click();
	}

	public void RefPaymentHistoryApplyFilter() {
		RefPaymentHistoryApplyFilter.click();
	}

	public void RefPaymentHistoryClearFilter() {
		RefPaymentHistoryClearFilter.click();
	}

	public void enterRefPaymentHistorySearch() {
		RefPaymentHistorySearch.sendKeys("srfsdfd");
	}

}
