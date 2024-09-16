package ADV7searchTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import ADV_7Search_genericPage.CommonMethod;
import Com.ADV7Search.pages.PageFactoryReferralEarningsPayoutsPage;



public class PageFactoryReferralEarningsPayoutsTest extends CommonMethod {

	public PageFactoryReferralEarningsPayoutsTest() throws Exception {
		super();
	}

//#*************************************Login Page**********************************

	@Test
	public void AdminTestLogin() {

		PageFactoryReferralEarningsPayoutsPage EP = PageFactory.initElements(driver,
				PageFactoryReferralEarningsPayoutsPage.class);

		try {

			EP.enterRefLoginEmail();
			EP.enterRefLoginPassword();
			Thread.sleep(1000);
			EP.RefLoginPasswordEye();
				Thread.sleep(1000);
			EP.RefLoginButton();
			Thread.sleep(4000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			EP.RefEarningsPayouts();
			Thread.sleep(2000);
			EP.enterRefEarningsPayoutsSearch();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			EP.RefEarningsPayoutsPolicy();

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	

}
