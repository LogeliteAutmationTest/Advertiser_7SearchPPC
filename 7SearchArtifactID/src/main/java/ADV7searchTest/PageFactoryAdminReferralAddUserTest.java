package ADV7searchTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import ADV_7Search_genericPage.CommonMethod;
import Com.ADV7Search.pages.PageFactoryAdminReferralAddUserPage;

public class PageFactoryAdminReferralAddUserTest extends CommonMethod {

	public PageFactoryAdminReferralAddUserTest() throws Exception {
		super();
	}
	
//#*************************************Login Page**********************************

		@Test
		public void AdminTestLogin() {

			PageFactoryAdminReferralAddUserPage AU = PageFactory.initElements(driver,
					PageFactoryAdminReferralAddUserPage.class);

			try {

				AU.enterRefAdminLoginEmail();
				AU.enterRefAdminLoginPassword();
				Thread.sleep(1000);
				AU.RefAdminLoginPasswordEye();
				Thread.sleep(1000);
				AU.RefAdminLoginButton();
				Thread.sleep(4000);
				driver.navigate().refresh();
				Thread.sleep(4000);
				AU.RefAdminAddUser();
				Thread.sleep(1000);
				AU.enterRefAdminAddUserFirstName();
				Thread.sleep(1000);
				AU.enterRefAdminAddUserLastName();
				Thread.sleep(1000);
				AU.enterRefAdminAddUserEmail();
				Thread.sleep(1000);
//				AU.RefAdminAddUserCountry();
				AU.RefAdminAddUserCountryAnguilla();
				Thread.sleep(1000);
				AU.enterRefAdminAddUserPhoneNo();
				Thread.sleep(1000);
				AU.enterRefAdminAddUserState();
				Thread.sleep(1000);
				AU.enterRefAdminAddUserAddress();
				Thread.sleep(1000);
				AU.enterRefAdminAddUserPassword();
				Thread.sleep(1000);
				AU.enterRefAdminAddUserConfirmPassword();
				Thread.sleep(2000);
				AU.RefAdminAddUserSubmitButton();
				
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}


}
