package Com.ADV7Search.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class PageFactoryReferralJoinedUserPage {

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

	@FindBy(xpath = "//span[normalize-space()='Joined Users']")
	@CacheLookup
	WebElement RefJoinedUser;

	@FindBy(xpath = "//input[@placeholder='Start Date - End Date']")
	@CacheLookup
	WebElement RefJoinedUserDate;

	@FindBy(xpath = "//div[@aria-label='Choose Thursday, August 15th, 2024']")
	@CacheLookup
	WebElement RefJoinedUserDate15Aug;

	@FindBy(xpath = "//div[@aria-label='Choose Tuesday, August 27th, 2024']")
	@CacheLookup
	WebElement RefJoinedUserDate25Aug;

	@FindBy(xpath = "//button[normalize-space()='Apply Filters']")
	@CacheLookup
	WebElement RefJoinedUserApply;

	@FindBy(xpath = "//button[contains(@type,'button')]")
	@CacheLookup
	WebElement RefJoinedUserClearFilter;

	@FindBy(xpath = "//select[@id='type']")
	@CacheLookup
	WebElement RefJoinedUserAccountType;

	@FindBy(xpath = "//*[@id=\"type\"]/option[2]")
	@CacheLookup
	WebElement RefJoinedUserAccountTypeADV;

	@FindBy(xpath = "//*[@id=\"type\"]/option[3]")
	@CacheLookup
	WebElement RefJoinedUserAccountTypePUB;

	@FindBy(xpath = "//select[@id='status']")
	@CacheLookup
	WebElement RefJoinedUserPaymentStatus;

	@FindBy(xpath = "//*[@id=\"status\"]/option[2]")
	@CacheLookup
	WebElement RefJoinedUserPaymentStatusEarned;

	@FindBy(xpath = "//*[@id=\"status\"]/option[3]")
	@CacheLookup
	WebElement RefJoinedUserPaymentStatusPending;

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

	public void RefJoinedUser() {
		RefJoinedUser.click();
	}

	public void RefJoinedUserDate() {
		RefJoinedUserDate.click();
	}

	public void RefJoinedUserDate15Aug() {
		RefJoinedUserDate15Aug.click();
	}

	public void RefJoinedUserDate25Aug() {
		RefJoinedUserDate25Aug.click();
	}

	public void RefJoinedUserApply() {
		RefJoinedUserApply.click();
	}

	public void RefJoinedUserClearFilter() {
		RefJoinedUserClearFilter.click();
	}

	public void RefJoinedUserAccountType() {
		RefJoinedUserAccountType.click();
	}

	public void RefJoinedUserAccountTypeADV() {
		RefJoinedUserAccountTypeADV.click();
	}

	public void RefJoinedUserAccountTypePUB() {
		RefJoinedUserAccountTypePUB.click();
	}

	public void RefJoinedUserPaymentStatus() {
		RefJoinedUserPaymentStatus.click();
	}

	public void RefJoinedUserPaymentStatusEarned() {
		RefJoinedUserPaymentStatusEarned.click();
	}

	public void RefJoinedUserPaymentStatusPending() {
		RefJoinedUserPaymentStatusPending.click();
	}

}
