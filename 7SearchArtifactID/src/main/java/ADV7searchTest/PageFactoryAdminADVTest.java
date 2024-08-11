package ADV7searchTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import ADV_7Search_genericPage.CommonMethod;
import Com.ADV7Search.pages.PageFactoryAdminADVPage;

public class PageFactoryAdminADVTest extends CommonMethod {

	public PageFactoryAdminADVTest() throws Exception {
		super();
	}

//#*************************************Login Page**********************************

	@Test
	public void AdminTestLogin1() {

		PageFactoryAdminADVPage AU = PageFactory.initElements(driver, PageFactoryAdminADVPage.class);

		try {

			AU.enterEmail();
			AU.enterPassword();
			AU.clickLoginButton();
			Thread.sleep(6000);
			driver.navigate().refresh();
			Thread.sleep(4000);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

//#*************************************Manager ADV Page**********************************

	@Test
	// (enabled = false)
	public void AdminTestManageADV1() {

		PageFactoryAdminADVPage IH = PageFactory.initElements(driver, PageFactoryAdminADVPage.class);

		try {

			IH.AdminManagerADV();
			IH.ManagerADVInhouse();
			Thread.sleep(2000);
			IH.enterManagerADVSearch();
			Thread.sleep(3000);
			IH.ManagerADVCategoryFilter();
			IH.ManagerADVCategory7Search();
			Thread.sleep(1000);
			IH.ManagerADVSearchButton();
			Thread.sleep(2000);
			IH.ManagerADVCategoryFilter();
			IH.ManagerADVCategoryAllCategories();
			Thread.sleep(1000);
			IH.ManagerADVSearchButton();
			Thread.sleep(2000);
			IH.ManagerADVCategoryFilter();
			IH.ManagerADVCategoryCrypto();
			Thread.sleep(1000);
			IH.ManagerADVSearchButton();
			Thread.sleep(2000);
			IH.ManagerADVCategoryFilter();
			IH.ManagerADVCategoryDating();
			Thread.sleep(1000);
			IH.ManagerADVSearchButton();
			Thread.sleep(2000);
			driver.navigate().refresh();
			Thread.sleep(5000);
//			IH.ManagerADVCategoryFilter();
//			IH.ManagerADVCategoryEcommerce();
//			Thread.sleep(1000);
//			IH.ManagerADVSearchButton();
//			Thread.sleep(2000);
//			IH.ManagerADVCategoryFilter();
//			IH.ManagerADVCategoryFinance();
//			Thread.sleep(1000);
//			IH.ManagerADVSearchButton();
//			Thread.sleep(2000);
//			IH.ManagerADVCategoryFilter();
//			IH.ManagerADVCategoryFood();
//			Thread.sleep(1000);
//			IH.ManagerADVSearchButton();
//			Thread.sleep(2000);
//			IH.ManagerADVCategoryFilter();
//			IH.ManagerADVCategoryGambling();
//			Thread.sleep(1000);
//			IH.ManagerADVSearchButton();
//			Thread.sleep(2000);
//			IH.ManagerADVCategoryFilter();
//			IH.ManagerADVCategoryHealth();
//			Thread.sleep(1000);
//			IH.ManagerADVSearchButton();
//			Thread.sleep(2000);
//			driver.navigate().refresh();
//			Thread.sleep(4000);
			IH.ManagerADVStatus();
			IH.ManagerADVStatusActive();
			Thread.sleep(1000);
			IH.ManagerADVSearchButton();
			Thread.sleep(2000);
			IH.ManagerADVStatusAct();
			IH.ManagerADVStatusSuspend();
			Thread.sleep(1000);
			IH.ManagerADVSearchButton();
			Thread.sleep(2000);
			IH.ManagerADVStatusSuS();
			IH.ManagerADVStatusHold();
			Thread.sleep(1000);
			IH.ManagerADVSearchButton();
			Thread.sleep(4000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			IH.ManagerADVSource();
			IH.ManagerADVSourceAdmin();
			Thread.sleep(1000);
			IH.ManagerADVSearchButton();
			Thread.sleep(2000);
			IH.ManagerADVSource();
			IH.ManagerADVSourceApp();
			Thread.sleep(1000);
			IH.ManagerADVSearchButton();
			Thread.sleep(2000);
			IH.ManagerADVSource();
			IH.ManagerADVSourceExternal();
			Thread.sleep(1000);
			IH.ManagerADVSearchButton();
			Thread.sleep(2000);
			IH.ManagerADVSource();
			IH.ManagerADVSourceInfoAds();
			Thread.sleep(1000);
			IH.ManagerADVSearchButton();
			Thread.sleep(2000);
			IH.ManagerADVSource();
			IH.ManagerADVSourceOrganic();
			Thread.sleep(1000);
			IH.ManagerADVSearchButton();
			Thread.sleep(2000);
			IH.ManagerADVSource();
			IH.ManagerADVSourceUsAds();
			Thread.sleep(1000);
			IH.ManagerADVSearchButton();
			Thread.sleep(4000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			IH.ManagerADVDate();
			Thread.sleep(1000);
			IH.ManagerADVDate1Ap();
			Thread.sleep(1000);
			IH.ManagerADVDate23Ap();
			Thread.sleep(2000);
			IH.ManagerADVSearchButton();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

//*****************************************open ADV Details********************************

	@Test
	// (enabled = false)
	public void AdminTestManageADV2() {

		PageFactoryAdminADVPage IH = PageFactory.initElements(driver, PageFactoryAdminADVPage.class);

		try {
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			IH.ManagerADVOpenProfileInhouse();
			Thread.sleep(1000);
			IH.ManagerADVOpenProfileCampaign();
			Thread.sleep(1000);
			IH.ManagerADVOpenProfileAddFund();
			Thread.sleep(2000);
			IH.ManagerADVOpenProfileAddFundEnter();
			Thread.sleep(1000);
			IH.ManagerADVOpenProfileAddFundGateway();
			IH.ManagerADVOpenProfileAddFundBonus();
			Thread.sleep(1000);
			IH.enterManagerADVOpenProfileAddFundRemak();
			Thread.sleep(1000);
			IH.ManagerADVOpenProfileAddFundSubmit();
			Thread.sleep(2000);
			IH.ManagerADVOpenProfileTransactions();
			Thread.sleep(1000);
			IH.ManagerADVOpenProfileBack();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

//#**************************************Manager ADV Client***********************************

	@Test
	public void AdminTestManageADV3() {

		PageFactoryAdminADVPage IH = PageFactory.initElements(driver, PageFactoryAdminADVPage.class);

		try {

			Thread.sleep(2000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			IH.AdminManagerADV();
			IH.ManagerADVClient();
			Thread.sleep(2000);
			IH.ManagerADVSearch();
			Thread.sleep(3000);
			IH.ManagerADVCategoryFilter();
			IH.ManagerADVCategory7Search();
			Thread.sleep(1000);
			IH.ManagerADVSearchButton();
			Thread.sleep(2000);
			IH.ManagerADVCategoryFilter();
			IH.ManagerADVCategoryAllCategories();
			Thread.sleep(1000);
			IH.ManagerADVSearchButton();
			Thread.sleep(2000);
			IH.ManagerADVCategoryFilter();
			IH.ManagerADVCategoryCrypto();
			Thread.sleep(1000);
			IH.ManagerADVSearchButton();
			Thread.sleep(2000);
			IH.ManagerADVCategoryFilter();
			IH.ManagerADVCategoryDating();
//			Thread.sleep(1000);
//			IH.ManagerADVSearchButton();
//			Thread.sleep(2000);
//			IH.ManagerADVCategoryFilter();
//			IH.ManagerADVCategoryEcommerce();
//			Thread.sleep(1000);
//			IH.ManagerADVSearchButton();
//			Thread.sleep(2000);
//			IH.ManagerADVCategoryFilter();
//			IH.ManagerADVCategoryFinance();
//			Thread.sleep(1000);
//			IH.ManagerADVSearchButton();
//			Thread.sleep(2000);
//			IH.ManagerADVCategoryFilter();
//			IH.ManagerADVCategoryFood();
//			Thread.sleep(1000);
//			IH.ManagerADVSearchButton();
//			Thread.sleep(2000);
//			IH.ManagerADVCategoryFilter();
//			IH.ManagerADVCategoryGambling();
//			Thread.sleep(1000);
//			IH.ManagerADVSearchButton();
//			Thread.sleep(2000);
//			IH.ManagerADVCategoryFilter();
//			IH.ManagerADVCategoryHealth();
//			Thread.sleep(1000);
//			IH.ManagerADVSearchButton();
			Thread.sleep(2000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			IH.ManagerADVStatus();
			IH.ManagerADVStatusActive();
			Thread.sleep(1000);
			IH.ManagerADVSearchButton();
			Thread.sleep(2000);
			IH.ManagerADVStatusAct();
			IH.ManagerADVStatusSuspend();
			Thread.sleep(1000);
			IH.ManagerADVSearchButton();
			Thread.sleep(2000);
			IH.ManagerADVStatusSuS();
			IH.ManagerADVStatusHold();
			Thread.sleep(1000);
			IH.ManagerADVSearchButton();
			Thread.sleep(4000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			IH.ManagerADVSource();
			IH.ManagerADVSourceAdmin();
			Thread.sleep(1000);
			IH.ManagerADVSearchButton();
			Thread.sleep(2000);
			IH.ManagerADVSource();
			IH.ManagerADVSourceApp();
			Thread.sleep(1000);
			IH.ManagerADVSearchButton();
			Thread.sleep(2000);
			IH.ManagerADVSource();
			IH.ManagerADVSourceExternal();
			Thread.sleep(1000);
			IH.ManagerADVSearchButton();
			Thread.sleep(2000);
			IH.ManagerADVSource();
			IH.ManagerADVSourceInfoAds();
			Thread.sleep(1000);
			IH.ManagerADVSearchButton();
			Thread.sleep(2000);
			IH.ManagerADVSource();
			IH.ManagerADVSourceOrganic();
			Thread.sleep(1000);
			IH.ManagerADVSearchButton();
			Thread.sleep(2000);
			IH.ManagerADVSource();
			IH.ManagerADVSourceUsAds();
			Thread.sleep(1000);
			IH.ManagerADVSearchButton();
			Thread.sleep(4000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			IH.ManagerADVDate();
			Thread.sleep(1000);
			IH.ManagerADVDate1Ap();
			Thread.sleep(1000);
			IH.ManagerADVDate23Ap();
			Thread.sleep(2000);
			IH.ManagerADVSearchButton();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

//*****************************************open ADV Details********************************

	@Test
	// (enabled = false)
	public void AdminTestManageADV5() {

		PageFactoryAdminADVPage IH = PageFactory.initElements(driver, PageFactoryAdminADVPage.class);

		try {
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			IH.ManagerADVOpenProfileClient();
			Thread.sleep(1000);
			IH.ManagerADVOpenProfileCampaign();
			Thread.sleep(1000);
			IH.ManagerADVOpenProfileAddFund();
			Thread.sleep(1000);
			IH.ManagerADVOpenProfileTransactions();
			Thread.sleep(1000);
			IH.ManagerADVOpenProfileBack();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
