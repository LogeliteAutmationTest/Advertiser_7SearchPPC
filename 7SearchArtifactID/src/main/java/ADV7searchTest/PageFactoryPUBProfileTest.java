package ADV7searchTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import ADV_7Search_genericPage.CommonMethod;
import Com.ADV7Search.pages.PageFactoryPUBProfilePage;

public class PageFactoryPUBProfileTest extends CommonMethod {

	public PageFactoryPUBProfileTest() throws Exception {
		super();
	}

//**************************************Login Page**************************************

	@Test
	public void PUBProfileTest() {

		PageFactoryPUBProfilePage PP = PageFactory.initElements(driver, PageFactoryPUBProfilePage.class);

		try {
			
			PP.enterEmail();
			PP.enterPassword();
			PP.clickLoginButton();
			Thread.sleep(5000);
			driver.navigate().refresh();
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

//*************************************PUB Profile*****************************************

	@Test
	//(enabled = false)
	public void PUBProfileTest1() {

		PageFactoryPUBProfilePage PP = PageFactory.initElements(driver, PageFactoryPUBProfilePage.class);

		try {
			
//			PS.clickswitchtoPublisher();
//			Thread.sleep(5000);
			PP.clickPUBProfile();
			Thread.sleep(2000);
			PP.clickPUBEditProfile();
			Thread.sleep(2000);
			PP.enterPUBProfileFirstName();
			PP.enterPUBProfileLastName();
			PP.clickPUBProfilecountry();
			PP.clickPUBProfileselectcountry();
			Thread.sleep(1000);
			PP.enterPUBProfilePhoneNO();
			PP.clickPUBProfileMessenger();
			PP.clickPUBProfileSelectMessenger();
			PP.enterPUBProfileNickname();
			Thread.sleep(1000);
			PP.enterPUBProfileAddress1();
			PP.enterPUBProfileAddress2();
			PP.enterPUBProfileCity();
			PP.enterPUBProfileState();
			Thread.sleep(2000);
			PP.clickPUBProfileUpdateProfile();

		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

//*************************************PUB Payment Method*****************************************

	@Test
	//(enabled = false)
	public void PUBProfileTest2() {

		PageFactoryPUBProfilePage PP = PageFactory.initElements(driver, PageFactoryPUBProfilePage.class);

		try {
			
			Thread.sleep(4000);
			driver.navigate().refresh();
			Thread.sleep(6000);
			PP.clickPUBProfile();
			Thread.sleep(3000);
			PP.clickPUBProfilePaymentmethod();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(3000);
			PP.clickPUBProfilPaymentmethodPaypal();
			Thread.sleep(1000);
			PP.clickPUBProfilPaymentmethodBitcoin();
			Thread.sleep(1000);
			PP.clickPUBProfilPaymentmethodBitcoinCash();
			Thread.sleep(1000);
			PP.clickPUBProfilPaymentmethodWireTransfer();
			Thread.sleep(2000);
			PP.enterPUBWireTransferBankName();
			PP.enterPUBWireTransferHolderName();
			PP.enterPUBWireTransferAccountNumber();
			PP.enterPUBWireTransferIFSCCode();
			PP.enterPUBWireTransferSWIFTCode();
			PP.enterPUBWireTransferIBANCode();
			Thread.sleep(2000);
			PP.enterPUBProfilePaymentid();
			Thread.sleep(2000);
			PP.clickPUBUpdatePaymentMethod();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(6000);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

// *************************************PUB KYC Document*****************************************

	@Test
	//(enabled = false)
	public void PUBProfileTest3() {

		PageFactoryPUBProfilePage PP = PageFactory.initElements(driver, PageFactoryPUBProfilePage.class);

		try {
			
			PP.clickPUBProfile();
			Thread.sleep(3000);
			PP.clickPUBKYCDocument();
			// PP.clickPUBUploadPhotoPreview();
			// PP.clickPUBUploadPhotoIDPreview();
			Thread.sleep(3000);
			PP.enterPUBUploadPhoto();
			PP.enterPUBUploadPhotoID();
			Thread.sleep(2000);
			PP.clickPUBUploadKYCDocument();

		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

// *************************************PUB Account Activity*****************************************

	@Test
	//(enabled = false)
	public void PUBProfileTest4() {

		PageFactoryPUBProfilePage PP = PageFactory.initElements(driver, PageFactoryPUBProfilePage.class);

		try {
			Thread.sleep(5000);
			PP.clickPUBProfile();
			Thread.sleep(3000);
			PP.clickPUBProfileAccountActivity();
			Thread.sleep(3000);
			PP.clickPUBProfileLogspaginationDropdown();
			PP.clickPUBProfileLogspaginationDropdown50();

		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

// *************************************PUB Profile Log*****************************************

	@Test
	//(enabled = false)
	public void PUBProfileTest5() {

		PageFactoryPUBProfilePage PP = PageFactory.initElements(driver, PageFactoryPUBProfilePage.class);

		try {
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(6000);
			PP.clickPUBProfile();
			Thread.sleep(3000);
			PP.clickPUBProfileLogs();
			Thread.sleep(2000);
			PP.clickPUBProfileLogspaginationDropdown();
			PP.clickPUBProfileLogspaginationDropdown50();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

// *************************************PUB Password Change*****************************************

	@Test
	//(enabled = false)
	public void PUBProfileTest7() {

		PageFactoryPUBProfilePage PP = PageFactory.initElements(driver, PageFactoryPUBProfilePage.class);

		try {
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(6000);
			PP.clickPUBProfile();
			Thread.sleep(3000);
			PP.clickPUBProfileChangePassword();
			Thread.sleep(2000);
			PP.enterPUBProfileCurrentPassword();
			Thread.sleep(1000);
			PP.enterPUBProfileNewPassword();
			Thread.sleep(1000);
			PP.enterPUBProfileRepeatPassword();
			Thread.sleep(1000);
			PP.clickPUBProfileUpdatePasswordButton();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

// *************************************PUB Delete Account*****************************************

	@Test
	public void PUBProfileTest8() {

		PageFactoryPUBProfilePage PP = PageFactory.initElements(driver, PageFactoryPUBProfilePage.class);

		try {
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(6000);
			PP.clickPUBProfile();
			Thread.sleep(3000);
//			PP.clickPUBProfileDeleteAccountButton();
//			Thread.sleep(1000);
//			PP.clickPUBProfileDeleteAccountNO();
//			Thread.sleep(1000);
//			PP.clickPUBProfileDeleteAccountButton();
//			Thread.sleep(1000);
//			PP.clickPUBProfileDeleteAccountYes();
//			Thread.sleep(2000);
//			PP.enterPUBProfileDeleteAccountMessage();
//			Thread.sleep(3000);
//			PP.clickPUBProfileDeleteAccountMessageSubmit();
//			Thread.sleep(2000);
//			PP.clickPUBProfileDeleteAccountSubmittedCancel();
//			Thread.sleep(2000);
			PP.clickPUBProfileCancelRequest();
			Thread.sleep(1000);
			PP.clickPUBProfileCancelRequestNo();
			Thread.sleep(1000);
			PP.clickPUBProfileCancelRequestYes();
			

		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}