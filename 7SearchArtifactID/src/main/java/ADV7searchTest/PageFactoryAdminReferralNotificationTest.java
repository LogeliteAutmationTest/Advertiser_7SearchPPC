package ADV7searchTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import ADV_7Search_genericPage.CommonMethod;
import Com.ADV7Search.pages.PageFactoryAdminReferralNotificationPage;

public class PageFactoryAdminReferralNotificationTest extends CommonMethod {

	public PageFactoryAdminReferralNotificationTest() throws Exception {
		super();
	}

//#*************************************Login Page**********************************

	@Test
	public void AdminTestLogin() {

		PageFactoryAdminReferralNotificationPage MP = PageFactory.initElements(driver,
				PageFactoryAdminReferralNotificationPage.class);

		try {

			MP.enterRefAdminLoginEmail();
			MP.enterRefAdminLoginPassword();
			Thread.sleep(1000);
			MP.RefAdminLoginPasswordEye();
			Thread.sleep(1000);
			MP.RefAdminLoginButton();
			Thread.sleep(4000);
			driver.navigate().refresh();
			Thread.sleep(4000);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

//#*************************************Notification Page**********************************

	@Test
	public void AdminTestLoginNotification() {

		PageFactoryAdminReferralNotificationPage RN = PageFactory.initElements(driver,
				PageFactoryAdminReferralNotificationPage.class);

		try {

			RN.RefAdminNotification();
			Thread.sleep(2000);
			RN.RefAdminNotificationOpen();
			Thread.sleep(2000);
			RN.RefAdminNotificationBack();
			Thread.sleep(2000);
			RN.RefAdminNotificationPaginationNext();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			RN.RefAdminNotificationPaginationDropdown();
			Thread.sleep(1000);
			RN.RefAdminNotificationPaginationDropdown500();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(4000);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
