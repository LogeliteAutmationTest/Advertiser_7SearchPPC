package ADV7searchTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import ADV_7Search_genericPage.CommonMethod;
import Com.ADV7Search.pages.PageFactoryReferralCommissionHistoryPage;

public class PageFactoryReferralCommissionHistoryTest extends CommonMethod {

	public PageFactoryReferralCommissionHistoryTest() throws Exception {
		super();
	}

//#*************************************Login Page**********************************

	@Test
	public void AdminTestLogin() {

		PageFactoryReferralCommissionHistoryPage CH = PageFactory.initElements(driver,
				PageFactoryReferralCommissionHistoryPage.class);

		try {

			CH.enterRefLoginEmail();
			CH.enterRefLoginPassword();
			Thread.sleep(1000);
//			LOGIN.RefLoginPasswordEye();
//			Thread.sleep(1000);
			CH.RefLoginButton();
			Thread.sleep(4000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			CH.RefCommissionHistory();
			Thread.sleep(1000);
			CH.enterRefCommissionHistorySearch();
			Thread.sleep(2000);
			driver.navigate().refresh();
			Thread.sleep(3000);
			CH.RefCommissionHistoryDate();
			CH.RefCommissionHistoryDate19Aug();
			Thread.sleep(1000);
			CH.RefCommissionHistoryDate23Aug();
			Thread.sleep(2000);
			CH.RefCommissionHistoryApplyButton();
			Thread.sleep(2000);
			CH.RefCommissionHistoryClearButton();
			Thread.sleep(4000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			CH.RefCommissionHistoryAccountType();
			CH.RefCommissionHistoryAccountTypeADV();
			Thread.sleep(2000);
			CH.RefCommissionHistoryApplyButton();
			Thread.sleep(2000);
			CH.RefCommissionHistoryClearButton();
			Thread.sleep(4000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			CH.RefCommissionHistoryAccountType();
			CH.RefCommissionHistoryAccountTypePUB();
			Thread.sleep(2000);
			CH.RefCommissionHistoryApplyButton();
			Thread.sleep(2000);
			CH.RefCommissionHistoryClearButton();
			Thread.sleep(4000);
			driver.navigate().refresh();
			Thread.sleep(4000);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
//#*************************************Commission History Page**********************************

//	@Test
//	public void AdminTestCommissionHistory() {
//
//		PageFactoryReferralCommissionHistoryPage CH = PageFactory.initElements(driver,
//				PageFactoryReferralCommissionHistoryPage.class);
//
//		try {
//
//			Thread.sleep(1000);
//			CH.enterRefCommissionHistorySearch();
//			Thread.sleep(2000);
//			driver.navigate().refresh();
//			Thread.sleep(3000);
//			CH.RefCommissionHistoryDate();
//			CH.RefCommissionHistoryDate19Aug();
//			Thread.sleep(1000);
//			CH.RefCommissionHistoryDate23Aug();
//			Thread.sleep(2000);
//			CH.RefCommissionHistoryApplyButton();
//			Thread.sleep(2000);
//			CH.RefCommissionHistoryClearButton();
//			Thread.sleep(4000);
//			driver.navigate().refresh();
//			Thread.sleep(4000);
//			CH.RefCommissionHistoryAccountType();
//			CH.RefCommissionHistoryAccountTypeADV();
//			Thread.sleep(2000);
//			CH.RefCommissionHistoryApplyButton();
//			Thread.sleep(2000);
//			CH.RefCommissionHistoryClearButton();
//			Thread.sleep(4000);
//			driver.navigate().refresh();
//			Thread.sleep(4000);
//			CH.RefCommissionHistoryAccountType();
//			CH.RefCommissionHistoryAccountTypePUB();
//			Thread.sleep(2000);
//			CH.RefCommissionHistoryApplyButton();
//			Thread.sleep(2000);
//			CH.RefCommissionHistoryClearButton();
//			Thread.sleep(4000);
//			driver.navigate().refresh();
//			Thread.sleep(4000);
//
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//
//	}

}
