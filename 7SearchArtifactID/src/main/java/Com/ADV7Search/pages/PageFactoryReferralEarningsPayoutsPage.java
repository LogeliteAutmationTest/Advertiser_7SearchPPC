package Com.ADV7Search.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class PageFactoryReferralEarningsPayoutsPage {

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

		@FindBy(xpath = "//span[normalize-space()='Earnings & Payouts']")
		@CacheLookup
		WebElement RefEarningsPayouts;

		@FindBy(xpath = "//input[contains(@placeholder,'Search by status')]")
		@CacheLookup
		WebElement RefEarningsPayoutsSearch;

		@FindBy(xpath = "//a[@class='btn btn-danger']")
		@CacheLookup
		WebElement RefEarningsPayoutsPolicy;
		
		
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

//#******************************************Joined User Page***************************************

		public void RefEarningsPayouts() {
			RefEarningsPayouts.click();
		}

		public void enterRefEarningsPayoutsSearch() {
			RefEarningsPayoutsSearch.sendKeys("123456");
		}

		public void RefEarningsPayoutsPolicy() {
			RefEarningsPayoutsPolicy.click();
		}
}
