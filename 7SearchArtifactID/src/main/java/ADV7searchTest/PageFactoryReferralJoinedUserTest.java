package ADV7searchTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import ADV_7Search_genericPage.CommonMethod;
import Com.ADV7Search.pages.PageFactoryReferralJoinedUserPage;

public class PageFactoryReferralJoinedUserTest extends CommonMethod {

	public PageFactoryReferralJoinedUserTest() throws Exception {
		super();
	}

//#*************************************Login Page**********************************

	@Test
	public void AdminTestLogin() {

		PageFactoryReferralJoinedUserPage JU = PageFactory.initElements(driver,
				PageFactoryReferralJoinedUserPage.class);

		try {

			JU.enterRefLoginEmail();
			JU.enterRefLoginPassword();
			Thread.sleep(1000);
//				LOGIN.RefLoginPasswordEye();
//				Thread.sleep(1000);
			JU.RefLoginButton();
			Thread.sleep(4000);
//			driver.navigate().refresh();
//			Thread.sleep(4000);

//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//	}
//	
//	
////#*************************************Joined User Page**********************************
//
//	@Test
//	public void AdminTestJoinedUser2() {
//
//		PageFactoryReferralJoinedUserPage JU = PageFactory.initElements(driver,
//				PageFactoryReferralJoinedUserPage.class);
//
//		try {

			JU.RefJoinedUser();
			Thread.sleep(2000);
			JU.RefJoinedUserDate();
			Thread.sleep(1000);
			JU.RefJoinedUserDate15Aug();
			JU.RefJoinedUserDate25Aug();
			Thread.sleep(1000);
			JU.RefJoinedUserApply();
			Thread.sleep(3000);
			JU.RefJoinedUserClearFilter();
			Thread.sleep(4000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			JU.RefJoinedUserAccountType();
			Thread.sleep(1000);
			JU.RefJoinedUserAccountTypeADV();
			Thread.sleep(1000);
			JU.RefJoinedUserApply();
			Thread.sleep(3000);
			JU.RefJoinedUserClearFilter();
			Thread.sleep(1000);
			JU.RefJoinedUserAccountType();
			JU.RefJoinedUserAccountTypePUB();
			Thread.sleep(1000);
			JU.RefJoinedUserApply();
			Thread.sleep(3000);
			JU.RefJoinedUserClearFilter();
			Thread.sleep(4000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			JU.RefJoinedUserPaymentStatus();
			JU.RefJoinedUserPaymentStatusEarned();
			Thread.sleep(1000);
			JU.RefJoinedUserApply();
			Thread.sleep(3000);
			JU.RefJoinedUserClearFilter();
			Thread.sleep(1000);
			JU.RefJoinedUserPaymentStatus();
			JU.RefJoinedUserPaymentStatusPending();
			Thread.sleep(1000);
			JU.RefJoinedUserApply();
			Thread.sleep(3000);
			JU.RefJoinedUserClearFilter();
			Thread.sleep(4000);
			driver.navigate().refresh();
			Thread.sleep(4000);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
