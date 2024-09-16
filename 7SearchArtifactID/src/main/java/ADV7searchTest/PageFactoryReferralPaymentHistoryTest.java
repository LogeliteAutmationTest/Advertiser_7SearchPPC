package ADV7searchTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import ADV_7Search_genericPage.CommonMethod;
import All_Master_Pages_7Search.PageFactoryReferralPaymentHistoryPage;

public class PageFactoryReferralPaymentHistoryTest extends CommonMethod {

	public PageFactoryReferralPaymentHistoryTest() throws Exception {
		super();
	}

//#*************************************Login Page**********************************

	@Test
	public void AdminTestLogin() {

		PageFactoryReferralPaymentHistoryPage PH = PageFactory.initElements(driver,
				PageFactoryReferralPaymentHistoryPage.class);

		try {

			PH.enterRefLoginEmail();
			PH.enterRefLoginPassword();
			Thread.sleep(1000);
			PH.RefLoginPasswordEye();
			Thread.sleep(1000);
			PH.RefLoginButton();
			Thread.sleep(4000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			PH.RefPaymentHistory();
			Thread.sleep(2000);
			PH.RefPaymentHistoryDate();
			Thread.sleep(1000);
			PH.RefPaymentHistoryDate20Aug();
			PH.RefPaymentHistoryDate30Aug();
			Thread.sleep(2000);
			PH.RefPaymentHistoryApplyFilter();
			Thread.sleep(3000);
			PH.RefPaymentHistoryClearFilter();
			Thread.sleep(2000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			PH.enterRefPaymentHistorySearch();

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
