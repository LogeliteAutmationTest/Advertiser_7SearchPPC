package Com.ADV7Search.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class PageFactoryReferralPaymentMethodPage {

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

//#******************************************Payment Method Page***************************************

	@FindBy(xpath = "//span[normalize-space()='Payment Methods']")
	@CacheLookup
	WebElement RefPaymentMethods;

	@FindBy(xpath = "//div[@id='cell-5-1']//button[@class='btn btn-outline-primary btn-sm btn-dim'][normalize-space()='Edit Information']")
	@CacheLookup
	WebElement RefPaymentMethodsBankEdit;

	@FindBy(xpath = "//input[@id='bank-name']")
	@CacheLookup
	WebElement RefPaymentMethodsBankName;

	@FindBy(xpath = "//input[@id='acc-holder-name']")
	@CacheLookup
	WebElement RefPaymentMethodsBankHolderName;

	@FindBy(xpath = "//input[@id='acc-number']")
	@CacheLookup
	WebElement RefPaymentMethodsBankAccountNo;

	@FindBy(xpath = "//input[@id='ifsc-code']")
	@CacheLookup
	WebElement RefPaymentMethodsBankIFSCCode;

	@FindBy(xpath = "//input[@id='swift-code']")
	@CacheLookup
	WebElement RefPaymentMethodsBankSwiftCode;

	@FindBy(xpath = "//input[@id='iban-code']")
	@CacheLookup
	WebElement RefPaymentMethodsBankIbanCode;

	@FindBy(xpath = "//button[@class='btn btn-danger']")
	@CacheLookup
	WebElement RefPaymentMethodsBankSave;

	@FindBy(xpath = "//a[@class='link link-light']")
	@CacheLookup
	WebElement RefPaymentMethodsBankCancel;

	@FindBy(xpath = "//div[@id='cell-5-3']//button[@class='btn btn-outline-primary btn-sm btn-dim'][normalize-space()='Edit Information']")
	@CacheLookup
	WebElement RefPaymentMethodsBank2;

	@FindBy(xpath = "//input[@id='pay-id']")
	@CacheLookup
	WebElement RefPaymentMethodsPayID;

	@FindBy(xpath = "//button[@class='btn btn-danger']")
	@CacheLookup
	WebElement RefPaymentMethodsBank2PayIDSave;

	@FindBy(xpath = "//div[@id='cell-5-4']//button[@class='btn btn-outline-primary btn-sm btn-dim'][normalize-space()='Set Information']")
	@CacheLookup
	WebElement RefPaymentMethodsBank3;

	@FindBy(xpath = "//div[@id='cell-5-6']//button[@class='btn btn-outline-primary btn-sm btn-dim'][normalize-space()='Edit Information']")
	@CacheLookup
	WebElement RefPaymentMethodsUPI;

	@FindBy(xpath = "//input[@id='pay-id']")
	@CacheLookup
	WebElement RefPaymentMethodsUPIID;

	@FindBy(xpath = "//label[@for='customFile']")
	@CacheLookup
	WebElement RefPaymentMethodsUPIQR;

	@FindBy(xpath = "//button[@class='btn btn-danger']")
	@CacheLookup
	WebElement RefPaymentMethodsUPISave;

	@FindBy(xpath = "//input[@placeholder='Search by name']")
	@CacheLookup
	WebElement RefPaymentMethodsSearch;

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

//#*****************************************Payment Method Page***************************************

	public void RefPaymentMethods() {
		RefPaymentMethods.click();
	}

	public void enterRefPaymentMethodsSearch() {
		RefPaymentMethodsSearch.sendKeys("UPI");
	}

	public void RefPaymentMethodsBankEdit() {
		RefPaymentMethodsBankEdit.click();
	}

	public void enterRefPaymentMethodsBankName() {
		RefPaymentMethodsBankName.sendKeys("Test");
	}

	public void enterRefPaymentMethodsBankHolderName() {
		RefPaymentMethodsBankHolderName.sendKeys("Test");
	}

	public void enterRefPaymentMethodsBankAccountNo() {
		RefPaymentMethodsBankAccountNo.sendKeys("55");
	}

	public void enterRefPaymentMethodsBankIFSCCode() {
		RefPaymentMethodsBankName.sendKeys("456");
	}

	public void enterRefPaymentMethodsBankSwiftCode() {
		RefPaymentMethodsBankSwiftCode.sendKeys("236");
	}

	public void enterRefPaymentMethodsBankIbanCode() {
		RefPaymentMethodsBankIbanCode.sendKeys("23");
	}

	public void RefPaymentMethodsBankSave() {
		RefPaymentMethodsBankSave.click();
	}

	public void RefPaymentMethodsBankCancel() {
		RefPaymentMethodsBankCancel.click();
	}

	public void RefPaymentMethodsBank2() {
		RefPaymentMethodsBank2.click();
	}

	public void RefPaymentMethodsPayID() {
		RefPaymentMethodsPayID.sendKeys("64");
	}

	public void RefPaymentMethodsBank2PayIDSave() {
		RefPaymentMethodsBank2PayIDSave.click();
	}

	public void RefPaymentMethodsBank3() {
		RefPaymentMethodsBank3.click();
	}

	public void RefPaymentMethodsUPI() {
		RefPaymentMethodsUPI.click();
	}

	public void enterRefPaymentMethodsUPIID() {
		RefPaymentMethodsUPIID.sendKeys("653256@ybl");
	}

	public void enterRefPaymentMethodsUPIQR() {
		RefPaymentMethodsUPIQR.sendKeys("653256@ybl");
	}

	public void RefPaymentMethodsUPISave() {
		RefPaymentMethodsUPISave.click();
	}

}
