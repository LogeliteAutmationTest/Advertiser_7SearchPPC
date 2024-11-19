package Com.ADV7Search.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class PageFactoryAdminReferralAddUserPage {

//#******************************************Login Page**********************************************

	@FindBy(xpath = "//input[@id='default-01']")
	@CacheLookup
	WebElement RefAdminLoginEmail;

	@FindBy(xpath = "//input[@id='password']")
	@CacheLookup
	WebElement RefAdminLoginPassword;

	@FindBy(xpath = "//em[@class='passcode-icon icon-hide icon ni ni-eye-off']")
	@CacheLookup
	WebElement RefAdminLoginPasswordEye;

	@FindBy(xpath = "//button[@type='submit']")
	@CacheLookup
	WebElement RefAdminLoginButton;

//#******************************************View Profile Page***************************************

	@FindBy(xpath = "//span[normalize-space()='Add New User']")
	@CacheLookup
	WebElement RefAdminAddUser;

	@FindBy(xpath = "//input[@placeholder='Please Enter First Name']")
	@CacheLookup
	WebElement RefAdminAddUserFirstName;

	@FindBy(xpath = "//input[@placeholder='Please Enter Last Name']")
	@CacheLookup
	WebElement RefAdminAddUserLastName;

	@FindBy(xpath = "//input[@placeholder='Please Enter Email']")
	@CacheLookup
	WebElement RefAdminAddUserEmail;

	@FindBy(xpath = "//body/div[@id='root']/div[@class='nk-app-root']/div[@class='nk-main']/div[@class='nk-wrap']/div[@class='nk-content']/div[@class='container-fluid']/div[@class='nk-content-inner']/div[@class='nk-content-body']/div[@class='nk-block nk-block-lg']/div[@class='g-gs row']/div[@class='col-lg-12']/div[@class='card-preview h-100 card']/div[contains(@class,'card-inner')]/form[@id='create-course-form']/div[2]/div[1]/div[1]/div[1]")
	@CacheLookup
	WebElement RefAdminAddUserCountry;

	@FindBy(xpath = "//*[@id=\"create-course-form\"]/div[2]/div/div/div[1]/div/div/div/div/div/div[1]/div[1]")
	@CacheLookup
	WebElement RefAdminAddUserCountryAnguilla;

	@FindBy(xpath = "//input[@placeholder='Please Enter Phone No.']")
	@CacheLookup
	WebElement RefAdminAddUserPhoneNo;

	@FindBy(xpath = "//input[@placeholder='Please Enter state']")
	@CacheLookup
	WebElement RefAdminAddUserState;

	@FindBy(xpath = "//input[@placeholder='Please Enter address']")
	@CacheLookup
	WebElement RefAdminAddUserAddress;

	@FindBy(xpath = "//input[@placeholder='Please Enter Password']")
	@CacheLookup
	WebElement RefAdminAddUserPassword;

	@FindBy(xpath = "//input[@placeholder='Please Re-Enter Password']")
	@CacheLookup
	WebElement RefAdminAddUserConfirmPassword;

	@FindBy(xpath = "//button[@class='btn btn-primary btn-md']")
	@CacheLookup
	WebElement RefAdminAddUserSubmitButton;

//#******************************************Login Page***************************************

	public void enterRefAdminLoginEmail() {
		RefAdminLoginEmail.sendKeys("Admin");
	}

	public void enterRefAdminLoginPassword() {
		RefAdminLoginPassword.sendKeys("123456");
	}

	public void RefAdminLoginPasswordEye() {
		RefAdminLoginPasswordEye.click();
	}

	public void RefAdminLoginButton() {
		RefAdminLoginButton.click();
	}

//#*****************************************Add new user Page***************************************

	public void RefAdminAddUser() {
		RefAdminAddUser.click();
	}

	public void enterRefAdminAddUserFirstName() {
		RefAdminAddUserFirstName.sendKeys("Raf");
	}

	public void enterRefAdminAddUserLastName() {
		RefAdminAddUserLastName.sendKeys("Raf");
	}

	public void enterRefAdminAddUserEmail() {
		RefAdminAddUserEmail.sendKeys("Raf");
	}

	public void RefAdminAddUserCountry() {
		RefAdminAddUserCountry.click();
	}

	public void RefAdminAddUserCountryAnguilla() {
		RefAdminAddUserCountryAnguilla.click();
	}

	public void enterRefAdminAddUserPhoneNo() {
		RefAdminAddUserPhoneNo.sendKeys("895655");
	}

	public void enterRefAdminAddUserState() {
		RefAdminAddUserState.sendKeys("Raf");
	}

	public void enterRefAdminAddUserAddress() {
		RefAdminAddUserAddress.sendKeys("Raf");
	}

	public void enterRefAdminAddUserPassword() {
		RefAdminAddUserPassword.sendKeys("Raf");
	}

	public void enterRefAdminAddUserConfirmPassword() {
		RefAdminAddUserConfirmPassword.sendKeys("Raf");
	}

	public void RefAdminAddUserSubmitButton() {
		RefAdminAddUserSubmitButton.click();
	}

}
