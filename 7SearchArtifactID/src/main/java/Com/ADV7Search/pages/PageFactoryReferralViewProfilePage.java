package Com.ADV7Search.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class PageFactoryReferralViewProfilePage {

//#******************************************Login Page**********************************************

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

//#******************************************View Profile Page***************************************

	@FindBy(xpath = "//span[@class='nk-menu-text'][normalize-space()='View Profile']")
	@CacheLookup
	WebElement RefViewProfile;

	@FindBy(xpath = "//span[normalize-space()='Edit Profile']")
	@CacheLookup
	WebElement RefViewProfileEdit;

	@FindBy(xpath = "//input[@id='first-name']")
	@CacheLookup
	WebElement RefViewProfileEditfirst;

	@FindBy(xpath = "//input[@id='last-name']")
	@CacheLookup
	WebElement RefViewProfileEditLast;

	@FindBy(xpath = "//input[@id='phone']")
	@CacheLookup
	WebElement RefViewProfileEditPhone;

	@FindBy(xpath = "//div[@class='react-select__value-container react-select__value-container--has-value css-1hwfws3']")
	@CacheLookup
	WebElement RefViewProfileEditCountry;

	@FindBy(xpath = "//*[@id=\"country\"]/div/div[1]/div[1]")
	@CacheLookup
	WebElement RefViewProfileEditCountryIndia;

	@FindBy(xpath = "//input[@id='state']")
	@CacheLookup
	WebElement RefViewProfileEditState;

	@FindBy(xpath = "//textarea[@id='address']")
	@CacheLookup
	WebElement RefViewProfileEditAddress;

	@FindBy(xpath = "//button[@class='btn btn-danger']")
	@CacheLookup
	WebElement RefViewProfileEditSave;

	@FindBy(xpath = "//a[@class='link link-light']")
	@CacheLookup
	WebElement RefViewProfileEditCancel;

	@FindBy(xpath = "//div[@class='nk-content']//li[2]//a[1]")
	@CacheLookup
	WebElement RefViewProfileChangePassword;

	@FindBy(xpath = "//input[@id='oldpassword']")
	@CacheLookup
	WebElement RefViewProfileChangePasswordOld;

	@FindBy(xpath = "//div[@class='col-md-6']//em[@class='passcode-icon icon-hide pb-1 icon ni ni-eye-off']")
	@CacheLookup
	WebElement RefViewProfileChangePasswordOldEye;

	@FindBy(xpath = "//input[@id='newpassword']")
	@CacheLookup
	WebElement RefViewProfileChangePasswordNew;

	@FindBy(xpath = "//div[1]//form[1]//div[2]//div[1]//div[1]//div[2]//a[1]//em[2]")
	@CacheLookup
	WebElement RefViewProfileChangePasswordNewEye;

	@FindBy(xpath = "//input[@id='cpassword']")
	@CacheLookup
	WebElement RefViewProfileChangePasswordConfirm;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/div[1]/div[1]/div[2]/a[1]/em[2]")
	@CacheLookup
	WebElement RefViewProfileChangePasswordConfirmEye;

	@FindBy(xpath = "//button[contains(@class,'btn btn-danger mt-2')]")
	@CacheLookup
	WebElement RefViewProfileChangePasswordUpdate;

	@FindBy(xpath = "//span[normalize-space()='Personal Information']")
	@CacheLookup
	WebElement RefViewProfilePersonalInformation;

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

//#*****************************************Payment Method Page***************************************

	public void RefViewProfile() {
		RefViewProfile.click();
	}

	public void RefViewProfileEdit() {
		RefViewProfileEdit.click();
	}

	public void enterRefViewProfileEditfirst() {
		RefViewProfileEditfirst.sendKeys("test");
	}

	public void enterRefViewProfileEditLast() {
		RefViewProfileEditLast.sendKeys("test");
	}

	public void enterRefViewProfileEditPhone() {
		RefViewProfileEditPhone.sendKeys("2354");
	}

	public void RefViewProfileEditCountry() {
		RefViewProfileEditCountry.click();
	}

	public void RefViewProfileEditCountryIndia() {
		RefViewProfileEditCountryIndia.click();
	}

	public void enterRefViewProfileEditState() {
		RefViewProfileEditState.sendKeys("test");
	}

	public void enterRefViewProfileEditAddress() {
		RefViewProfileEditAddress.sendKeys("test");
	}

	public void RefViewProfileEditSave() {
		RefViewProfileEditSave.click();
	}

	public void RefViewProfileChangePassword() {
		RefViewProfileChangePassword.click();
	}

	public void RefViewProfileEditCancel() {
		RefViewProfileEditCancel.click();
	}

	public void enterRefViewProfileChangePasswordOld() {
		RefViewProfileChangePasswordOld.sendKeys("123456");
	}

	public void RefViewProfileChangePasswordOldEye() {
		RefViewProfileChangePasswordOldEye.click();
	}

	public void enterRefViewProfileChangePasswordNew() {
		RefViewProfileChangePasswordNew.sendKeys("1234567");
	}

	public void RefViewProfileChangePasswordNewEye() {
		RefViewProfileChangePasswordNewEye.click();
	}

	public void enterRefViewProfileChangePasswordConfirm() {
		RefViewProfileChangePasswordConfirm.sendKeys("1234567");
	}

	public void RefViewProfileChangePasswordConfirmEye() {
		RefViewProfileChangePasswordConfirmEye.click();
	}

	public void RefViewProfileChangePasswordUpdate() {
		RefViewProfileChangePasswordUpdate.click();
	}

	public void RefViewProfilePersonalInformation() {
		RefViewProfilePersonalInformation.click();
	}

}
