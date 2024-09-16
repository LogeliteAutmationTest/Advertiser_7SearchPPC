package Com.ADV7Search.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class PageFactoryReferralKYCPage {

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

//#******************************************KYC Page***************************************

	@FindBy(xpath = "//div[@class='nk-content']//div[2]//div[1]//div[2]//div[1]//section[1]//div[1]//div[1]//span[2]")
	@CacheLookup
	WebElement RefKYCIDProof;

	@FindBy(xpath = "//div[@class='nk-content']//div[2]//div[1]//div[2]//div[1]//div[1]//button[1]")
	@CacheLookup
	WebElement RefKYCIDProofSubmit;

	@FindBy(xpath = "//div[3]//div[1]//div[2]//div[1]//section[1]//div[1]//div[1]//span[2]")
	@CacheLookup
	WebElement RefKYCPhotoProof;

	@FindBy(xpath = "//div[3]//div[1]//div[2]//div[1]//div[1]//button[1]")
	@CacheLookup
	WebElement RefKYCPhotoProofSubmit;

	@FindBy(xpath = "//span[normalize-space()='KYC Documents']")
	@CacheLookup
	WebElement RefKYCDocuments;

//#******************************************Login Page***************************************

	public void enterRefLoginEmail() {
		RefLoginEmail.sendKeys("rajeevgp1596+78@gmail.com");
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

//#******************************************Login Page***************************************

	public void enterRefKYCIDProof() {
		RefKYCIDProof.sendKeys("C:\\\\Users\\\\DELL\\\\Downloads\\\\desktop img.jpg");
	}

	public void RefKYCIDProofSubmit() {
		RefLoginButton.click();
	}

	public void enterRefKYCPhotoProof() {
		RefKYCPhotoProof.sendKeys("C:\\\\Users\\\\DELL\\\\Downloads\\\\desktop img.jpg");
	}

	public void RefKYCPhotoProofSubmit() {
		RefKYCPhotoProofSubmit.click();
	}

	public void RefKYCDocuments() {
		RefKYCDocuments.click();
	}

}
