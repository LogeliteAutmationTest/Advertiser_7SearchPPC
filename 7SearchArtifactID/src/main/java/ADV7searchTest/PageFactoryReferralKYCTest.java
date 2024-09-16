package ADV7searchTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import ADV_7Search_genericPage.CommonMethod;
import Com.ADV7Search.pages.PageFactoryReferralKYCPage;

public class PageFactoryReferralKYCTest extends CommonMethod {

	public PageFactoryReferralKYCTest() throws Exception {
		super();
	}

//#*************************************Login Page**********************************

	@Test
	public void AdminTestLogin() {

		PageFactoryReferralKYCPage LOGIN = PageFactory.initElements(driver, PageFactoryReferralKYCPage.class);

		try {

			LOGIN.enterRefLoginEmail();
			LOGIN.enterRefLoginPassword();
			Thread.sleep(1000);
			LOGIN.RefLoginPasswordEye();
			Thread.sleep(1000);
			LOGIN.RefLoginButton();
			Thread.sleep(4000);
//			driver.navigate().refresh();
//			Thread.sleep(4000);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
//#*************************************KYC Page**********************************

	@Test
	public void AdminTestKYC() {

		PageFactoryReferralKYCPage KYC = PageFactory.initElements(driver, PageFactoryReferralKYCPage.class);

		try {
			
			KYC.RefKYCDocuments();
			Thread.sleep(2000);
			KYC.enterRefKYCIDProof();
			Thread.sleep(2000);
			KYC.RefKYCIDProofSubmit();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			KYC.enterRefKYCPhotoProof();
			Thread.sleep(2000);
			KYC.RefKYCPhotoProofSubmit();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
