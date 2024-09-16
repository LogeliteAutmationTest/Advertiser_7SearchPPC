package ADV7searchTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import ADV_7Search_genericPage.CommonMethod;
import Com.ADV7Search.pages.PageFactoryReferralNotifcationPage;

public class PageFactoryReferralNotifcationTest extends CommonMethod {

	public PageFactoryReferralNotifcationTest() throws Exception { 
		super();
	}

//#*************************************Login Page**********************************

	@Test
	public void AdminTestLogin() {

		PageFactoryReferralNotifcationPage RF = PageFactory.initElements(driver,
				PageFactoryReferralNotifcationPage.class);

		try {
			
			RF.enterRefLoginEmail();
			RF.enterRefLoginPassword();
			Thread.sleep(1000);
			RF.RefLoginPasswordEye();
			Thread.sleep(1000);
			RF.RefLoginButton();
			Thread.sleep(4000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			RF.RefNotification();
			Thread.sleep(2000);
			RF.RefNotificationOpen();
			Thread.sleep(2000);
			RF.RefNotificationOpenBack();
			Thread.sleep(1000);
			RF.RefNotificationPagenationdrop();
			RF.RefNotificationPagenationdrop50();
			
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
