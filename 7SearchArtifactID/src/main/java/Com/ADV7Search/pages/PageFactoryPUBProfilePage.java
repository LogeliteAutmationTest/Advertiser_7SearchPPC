package Com.ADV7Search.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class PageFactoryPUBProfilePage {

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

	// #*************************************PUBProfile Page***************************************

	@FindBy(xpath = "//span[normalize-space()='Profile']")
	@CacheLookup
	WebElement PUBProfile;

	@FindBy(xpath = "//div[@class='nk-block-head nk-block-head-lg']//span[1]")
	@CacheLookup
	WebElement PUBEditProfile;

	@FindBy(xpath = "//input[@id='full-name']")
	@CacheLookup
	WebElement PUBProfileFirstName;

	@FindBy(xpath = "//input[@id='last_name']")
	@CacheLookup
	WebElement PUBProfileLastName;

	@FindBy(xpath = "//select[@name='country']")
	@CacheLookup
	WebElement PUBProfilecountry;

	@FindBy(xpath = "//option[@phonecode='91']")
	@CacheLookup
	WebElement PUBProfileselectcountry;

	@FindBy(xpath = "//input[@id='phone-no']")
	@CacheLookup
	WebElement PUBProfilePhoneNO;

	@FindBy(xpath = "//select[@id='messenger']")
	@CacheLookup
	WebElement PUBProfileMessenger;

	@FindBy(xpath = "//option[@defaultvaluevalue='WhatsApp']")
	@CacheLookup
	WebElement PUBProfileSelectMessenger;

	@FindBy(xpath = "//input[@id='nick-name']")
	@CacheLookup
	WebElement PUBProfileNickname;

	@FindBy(xpath = "//input[@id='address1']")
	@CacheLookup
	WebElement PUBProfileAddress1;

	@FindBy(xpath = "//input[@id='address-l2']")
	@CacheLookup
	WebElement PUBProfileAddress2;

	@FindBy(xpath = "//input[@id='address-st']")
	@CacheLookup
	WebElement PUBProfileCity;

	@FindBy(xpath = "//input[@id='address-st']")
	@CacheLookup
	WebElement PUBProfileState;

	@FindBy(xpath = "//button[normalize-space()='Update Profile']")
	@CacheLookup
	WebElement PUBProfileUpdateProfile;

	// *************************************PUB Payment Method*****************************************

	@FindBy(xpath = "//span[normalize-space()='Payment Methods']")
	@CacheLookup
	WebElement PUBProfilePaymentmethod;

	@FindBy(xpath = "//label[@for='payopt0']")
	@CacheLookup
	WebElement PUBProfilPaymentmethodPaypal;

	@FindBy(xpath = "//label[@for='payopt1']")
	@CacheLookup
	WebElement PUBProfilPaymentmethodBitcoin;

	@FindBy(xpath = "//label[@for='payopt2']")
	@CacheLookup
	WebElement PUBProfilPaymentmethodBitcoinCash;

	@FindBy(xpath = "//label[@for='payopt3']")
	@CacheLookup
	WebElement PUBProfilPaymentmethodWireTransfer;

	@FindBy(xpath = "//input[@placeholder='Enter Your Bank Name']")
	@CacheLookup
	WebElement PUBWireTransferBankName;

	@FindBy(xpath = "//input[@placeholder='Enter Account Holder Name']")
	@CacheLookup
	WebElement PUBWireTransferHolderName;

	@FindBy(xpath = "//input[@placeholder='Enter Account Number']")
	@CacheLookup
	WebElement PUBWireTransferAccountNumber;

	@FindBy(xpath = "//input[@placeholder='Enter IFSC Code']")
	@CacheLookup
	WebElement PUBWireTransferIFSCCode;

	@FindBy(xpath = "//input[@placeholder='Enter SWIFT Code']")
	@CacheLookup
	WebElement PUBWireTransferSWIFTCode;

	@FindBy(xpath = "//input[@placeholder='Enter IBAN Code']")
	@CacheLookup
	WebElement PUBWireTransferIBANCode;

	@FindBy(xpath = "//input[@placeholder='Enter Your Payment ID']")
	@CacheLookup
	WebElement PUBProfilePaymentid;

	@FindBy(xpath = "//button[normalize-space()='Update Payment Method']")
	@CacheLookup
	WebElement PUBUpdatePaymentMethod;

	// *************************************PUB KYC Document*****************************************

	@FindBy(xpath = "//span[@class='nk-menu-text'][normalize-space()='KYC Document']")
	@CacheLookup
	WebElement PUBKYCDocument;

	@FindBy(xpath = "//*[@id=\"root\"]/div[1]/div/div[2]/div[2]/div/div/div/div[1]/div/div[2]/div[2]/div[1]/div/div[1]/div/div[2]/ul/li/a[2]")
	@CacheLookup
	WebElement PUBUploadPhoto;

	@FindBy(xpath = "//a[normalize-space()='Upload Photo ID']//input[@type='file']")
	@CacheLookup
	WebElement PUBUploadPhotoID;

	@FindBy(xpath = "//div[@class='card-inner-group']//div[1]//div[1]//div[2]//ul[1]//li[1]//a[1]")
	@CacheLookup
	WebElement PUBUploadPhotoPreview;

	@FindBy(xpath = "//div[@class='nk-block']//div[2]//div[1]//div[2]//ul[1]//li[1]//a[1]")
	@CacheLookup
	WebElement PUBUploadPhotoIDPreview;

	@FindBy(xpath = "//button[@class='btn btn-primary disabled']")
	@CacheLookup
	WebElement PUBUploadKYCDocument;

	// *************************************PUB Account Activity*****************************************

	@FindBy(xpath = "//span[normalize-space()='Account Activity']")
	@CacheLookup
	WebElement PUBProfileAccountActivity;

	// *************************************PUB Profile Log**********************************************

	@FindBy(xpath = "//span[normalize-space()='Profile Logs']")
	@CacheLookup
	WebElement PUBProfileLogs;

	@FindBy(xpath = "//em[@class='icon ni ni-downward-ios']")
	@CacheLookup
	WebElement PUBProfileLogspaginationDropdown;

	@FindBy(xpath = "//span[normalize-space()='50']")
	@CacheLookup
	WebElement PUBProfileLogspaginationDropdown50;

	// *************************************PUB Password Change*****************************************

	@FindBy(xpath = "//span[normalize-space()='Change Password']")
	@CacheLookup
	WebElement PUBProfileChangePassword;

	@FindBy(xpath = "//input[@id='cur_pass']")
	@CacheLookup
	WebElement PUBProfileCurrentPassword;

	@FindBy(xpath = "//input[@id='new_pass']")
	@CacheLookup
	WebElement PUBProfileNewPassword;

	@FindBy(xpath = "//input[@id='rep_pass']")
	@CacheLookup
	WebElement PUBProfileRepeatPassword;

	@FindBy(xpath = "//button[normalize-space()='Update Password']")
	@CacheLookup
	WebElement PUBProfileUpdatePasswordButton;

	// *************************************PUB Delete Account*****************************************

	@FindBy(xpath = "//button[@class='btn btn-outline-primary btn-sm deleteAccount']")
	@CacheLookup
	WebElement PUBProfileDeleteAccountButton;

	@FindBy(xpath = "//button[normalize-space()='No!']")
	@CacheLookup
	WebElement PUBProfileDeleteAccountNO;

	@FindBy(xpath = "//button[normalize-space()='Yes!']")
	@CacheLookup
	WebElement PUBProfileDeleteAccountYes;

	@FindBy(xpath = "//textarea[@id='fv-message']")
	@CacheLookup
	WebElement PUBProfileDeleteAccountMessage;

	@FindBy(xpath = "//button[@class='btn btn-primary btn-lg']")
	@CacheLookup
	WebElement PUBProfileDeleteAccountMessageSubmit;

	@FindBy(xpath = "//em[@class='icon ni ni-cross-sm']")
	@CacheLookup
	WebElement PUBProfileDeleteAccountSubmittedCancel;

	@FindBy(xpath = "//button[@class='btn btn-outline-primary btn-sm']")
	@CacheLookup
	WebElement PUBProfileCancelRequest;

	@FindBy(xpath = "//button[normalize-space()='No!']")
	@CacheLookup
	WebElement PUBProfileCancelRequestNo;

	@FindBy(xpath = "//button[normalize-space()='Yes, cancel it!']")
	@CacheLookup
	WebElement PUBProfileCancelRequestYes;
//	
//	@FindBy(xpath = "//textarea[@id='fv-message']")
//	@CacheLookup
//	WebElement PUBProfileDeleteAccountMessage;

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

	// #******************************************PUB Profile Page*************************************************

	public void clickPUBProfile() {
		PUBProfile.click();

	}

	public void clickPUBEditProfile() {
		PUBEditProfile.click();

	}

	public void enterPUBProfileFirstName() {
		PUBProfileFirstName.sendKeys("gfg");

	}

	public void enterPUBProfileLastName() {
		PUBProfileLastName.sendKeys("cfggh");
	}

	public void clickPUBProfilecountry() {
		PUBProfilecountry.click();

	}

	public void clickPUBProfileselectcountry() {
		PUBProfileselectcountry.click();

	}

	public void enterPUBProfilePhoneNO() {
		PUBProfilePhoneNO.sendKeys("787");

	}

	public void clickPUBProfileMessenger() {
		PUBProfileMessenger.click();

	}

	public void clickPUBProfileSelectMessenger() {
		PUBProfileSelectMessenger.click();

	}

	public void enterPUBProfileNickname() {
		PUBProfileNickname.sendKeys("86589689894");

	}

	public void enterPUBProfileAddress1() {
		PUBProfileAddress1.sendKeys("cfggghghh");
	}

	public void enterPUBProfileAddress2() {
		PUBProfileAddress2.sendKeys("cfggghghh");
	}

	public void enterPUBProfileCity() {
		PUBProfileCity.sendKeys("cfggghghh");
	}

	public void enterPUBProfileState() {
		PUBProfileState.sendKeys("cfggghghh");
	}

	public void clickPUBProfileUpdateProfile() {
		PUBProfileUpdateProfile.click();
	}

	// *************************************PUB Payment Method*****************************************

	public void clickPUBProfilePaymentmethod() {
		PUBProfilePaymentmethod.click();
	}

	public void clickPUBProfilPaymentmethodPaypal() {
		PUBProfilPaymentmethodPaypal.click();
	}

	public void clickPUBProfilPaymentmethodBitcoin() {
		PUBProfilPaymentmethodBitcoin.click();
	}

	public void clickPUBProfilPaymentmethodBitcoinCash() {
		PUBProfilPaymentmethodBitcoinCash.click();
	}

	public void clickPUBProfilPaymentmethodWireTransfer() {
		PUBProfilPaymentmethodWireTransfer.click();
	}

	public void enterPUBWireTransferBankName() {
		PUBWireTransferBankName.sendKeys("Testing Bank");
	}

	public void enterPUBWireTransferHolderName() {
		PUBWireTransferHolderName.sendKeys("Test Rajeev");
	}

	public void enterPUBWireTransferAccountNumber() {
		PUBWireTransferAccountNumber.sendKeys("645465746546465444");
	}

	public void enterPUBWireTransferIFSCCode() {
		PUBWireTransferIFSCCode.sendKeys("DVSDV885569");
	}

	public void enterPUBWireTransferSWIFTCode() {
		PUBWireTransferSWIFTCode.sendKeys("4656");
	}

	public void enterPUBWireTransferIBANCode() {
		PUBWireTransferIBANCode.sendKeys("65453");
	}

	public void enterPUBProfilePaymentid() {
		PUBProfilePaymentid.sendKeys("Test42434");
	}

	public void clickPUBUpdatePaymentMethod() {
		PUBUpdatePaymentMethod.click();
	}

	// *************************************PUB KYC Document*****************************************

	public void clickPUBKYCDocument() {
		PUBKYCDocument.click();
	}

	public void enterPUBUploadPhoto() {
		PUBUploadPhoto.sendKeys("Test Rajeev");
	}

	public void enterPUBUploadPhotoID() {
		PUBUploadPhotoID.sendKeys("Test Rajeev");
	}

	public void clickPUBUploadPhotoPreview() {
		PUBUploadPhotoPreview.click();
	}

	public void clickPUBUploadPhotoIDPreview() {
		PUBUploadPhotoIDPreview.click();
	}

	public void clickPUBUploadKYCDocument() {
		PUBUploadKYCDocument.click();
	}

	// *************************************PUB Account Activity*****************************************

	public void clickPUBProfileAccountActivity() {
		PUBProfileAccountActivity.click();
	}

	// *************************************PUB Profile Log**********************************************

	public void clickPUBProfileLogs() {
		PUBProfileLogs.click();
	}

	public void clickPUBProfileLogspaginationDropdown() {
		PUBProfileLogspaginationDropdown.click();
	}

	public void clickPUBProfileLogspaginationDropdown50() {
		PUBProfileLogspaginationDropdown50.click();
	}

	// *************************************PUB Password Change*****************************************

	public void clickPUBProfileChangePassword() {
		PUBProfileChangePassword.click();
	}

	public void enterPUBProfileCurrentPassword() {
		PUBProfileCurrentPassword.sendKeys("Tester@02");
	}

	public void enterPUBProfileNewPassword() {
		PUBProfileNewPassword.sendKeys("Tester@01");
	}

	public void enterPUBProfileRepeatPassword() {
		PUBProfileRepeatPassword.sendKeys("Tester@02");
	}

	public void clickPUBProfileUpdatePasswordButton() {
		PUBProfileUpdatePasswordButton.click();
	}

// *************************************PUB Delete Account*****************************************

	public void clickPUBProfileDeleteAccountButton() {
		PUBProfileDeleteAccountButton.click();
	}

	public void clickPUBProfileDeleteAccountNO() {
		PUBProfileDeleteAccountNO.click();
	}

	public void clickPUBProfileDeleteAccountYes() {
		PUBProfileDeleteAccountYes.click();
	}

	public void enterPUBProfileDeleteAccountMessage() {
		PUBProfileDeleteAccountMessage.sendKeys(
				"An Advertiser agrees that each keyword in the advertisement listing is ranked and placed according to the highest bids.We cannot guarantee that Advertisers' advertisements will appear on the first page of the Publishers. We have no control over the written text or graphics that appear in an Ad on ");
	}

	public void clickPUBProfileDeleteAccountMessageSubmit() {
		PUBProfileDeleteAccountMessageSubmit.click();
	}

	public void clickPUBProfileDeleteAccountSubmittedCancel() {
		PUBProfileDeleteAccountSubmittedCancel.click();
	}

	public void clickPUBProfileCancelRequest() {
		PUBProfileCancelRequest.click();
	}

	public void clickPUBProfileCancelRequestNo() {
		PUBProfileCancelRequestNo.click();
	}

	public void clickPUBProfileCancelRequestYes() {
		PUBProfileCancelRequestYes.click();
	}

}
