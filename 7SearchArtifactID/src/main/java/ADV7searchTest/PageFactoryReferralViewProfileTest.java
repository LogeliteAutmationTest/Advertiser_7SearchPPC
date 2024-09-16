package ADV7searchTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import ADV_7Search_genericPage.CommonMethod;
import Com.ADV7Search.pages.PageFactoryReferralViewProfilePage;

public class PageFactoryReferralViewProfileTest extends CommonMethod {

	public PageFactoryReferralViewProfileTest() throws Exception {
		super();
	}

//#*************************************Login Page**********************************

	@Test
	public void AdminTestLogin() {

		PageFactoryReferralViewProfilePage VP = PageFactory.initElements(driver,
				PageFactoryReferralViewProfilePage.class);

		try {

			VP.enterRefLoginEmail();
			VP.enterRefLoginPassword();
			Thread.sleep(1000);
			VP.RefLoginPasswordEye();
			Thread.sleep(1000);
			VP.RefLoginButton();
			Thread.sleep(4000);
			driver.navigate().refresh();
			Thread.sleep(4000);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

//#*************************************View Profile Page**********************************

	@Test
	public void AdminTestViewProfile() {

		PageFactoryReferralViewProfilePage VP = PageFactory.initElements(driver,
				PageFactoryReferralViewProfilePage.class);

		try {

			VP.RefViewProfile();
			Thread.sleep(2000);
			VP.RefViewProfileEdit();
			Thread.sleep(2000);
			VP.enterRefViewProfileEditfirst();
			VP.enterRefViewProfileEditLast();
			Thread.sleep(1000);
			VP.enterRefViewProfileEditPhone();
			Thread.sleep(2000);
			VP.RefViewProfileEditCountry();
			VP.RefViewProfileEditCountryIndia();
			Thread.sleep(1000);
			VP.enterRefViewProfileEditState();
			VP.enterRefViewProfileEditAddress();
			Thread.sleep(1000);
			//VP.RefViewProfileEditSave();
			VP.RefViewProfileEditCancel();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			VP.RefViewProfileChangePassword();
			Thread.sleep(2000);
			VP.enterRefViewProfileChangePasswordOld();
			Thread.sleep(1000);
			VP.RefViewProfileChangePasswordOldEye();
			Thread.sleep(1000);
			VP.enterRefViewProfileChangePasswordNew();
			Thread.sleep(1000);
			VP.RefViewProfileChangePasswordNewEye();
			Thread.sleep(1000);
			VP.enterRefViewProfileChangePasswordConfirm();
			Thread.sleep(1000);
			VP.RefViewProfileChangePasswordConfirmEye();
			Thread.sleep(2000);
			VP.RefViewProfileChangePasswordUpdate();
			Thread.sleep(2000);
			VP.RefViewProfilePersonalInformation();

			Thread.sleep(4000);
			driver.navigate().refresh();
			Thread.sleep(4000);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
