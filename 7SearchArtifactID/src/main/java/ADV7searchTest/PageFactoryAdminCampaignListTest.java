package ADV7searchTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import ADV_7Search_genericPage.CommonMethod;
import Com.ADV7Search.pages.PageFactoryAdminCampaignListPage;

public class PageFactoryAdminCampaignListTest extends CommonMethod {

	public PageFactoryAdminCampaignListTest() throws Exception {
		super();
	}

//#*************************************Login Page**********************************

	@Test
	public void AdminTestLogin1() {

		PageFactoryAdminCampaignListPage CL = PageFactory.initElements(driver, PageFactoryAdminCampaignListPage.class);

		try {

			CL.enterEmail();
			CL.enterPassword();
			CL.clickLoginButton();
			Thread.sleep(4000);
			driver.navigate().refresh();
			Thread.sleep(4000);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

//#*************************************Campaign List Page**********************************

	@Test
	public void AdminCampaignList2() {

		PageFactoryAdminCampaignListPage CL = PageFactory.initElements(driver, PageFactoryAdminCampaignListPage.class);

		try {

			CL.AdminCampaignList();
			Thread.sleep(2000);
			CL.enterAdminCampaignListSearch();
			Thread.sleep(3000);
			CL.AdminCampaignListSearchThreedot();
			Thread.sleep(1000);
			CL.AdminCampaignListSearchThreedotActive();
			Thread.sleep(2000);
			CL.enterAdminCampaignListSearch();
			Thread.sleep(3000);
			CL.AdminCampaignListSearchThreedot();
			Thread.sleep(1000);
			// CL.AdminCampaignListSearchThreedotPaused();
			CL.AdminCampaignListSearchThreedotAddImp();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			CL.enterAdminCampaignListSearchThreedotAddImpEnter();
			Thread.sleep(1000);
			CL.enterAdminCampaignListSearchThreedotAddImpEnterClick();
			Thread.sleep(1000);
			CL.enterAdminCampaignListSearchThreedotAddImpDate();
			Thread.sleep(2000);
			CL.AdminCampaignListSearchThreedotAddImpSave();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			CL.AdminCampaignListSearchThreedotAddImpBack();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(4000);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

////#*************************************Campaign List Page**********************************
//
//	@Test
//	public void AdminCampaignList3() {
//
//		PageFactoryAdminCampaignListPage CL = PageFactory.initElements(driver, PageFactoryAdminCampaignListPage.class);
//
//		try {
//
//			CL.AdminCampaignListCategory();
//			CL.AdminCampaignListCategoryGambling();
//			Thread.sleep(3000);
//			driver.navigate().refresh();
//			Thread.sleep(4000);
//			CL.AdminCampaignListByStatus();
//			CL.AdminCampaignListByAdsInReview();
//			Thread.sleep(2000);
//			CL.AdminCampaignListByStatus();
//			CL.AdminCampaignListByAdsActive();
//			Thread.sleep(2000);
//			CL.AdminCampaignListByStatus();
//			CL.AdminCampaignListByAdsPaused();
//			Thread.sleep(2000);
//			CL.AdminCampaignListByStatus();
//			CL.AdminCampaignListByAdsOnHold();
//			Thread.sleep(2000);
//			CL.AdminCampaignListByStatus();
//			CL.AdminCampaignListByAdsSuspend();
//			Thread.sleep(3000);
//			driver.navigate().refresh();
//			Thread.sleep(4000);
//			CL.AdminCampaignListByOperator();
//			CL.AdminCampaignListByOperatorClient();
//			Thread.sleep(4000);
//			CL.AdminCampaignListByOperatorC();
//			CL.AdminCampaignListByOperatorInhouse();
//			Thread.sleep(3000);
//			driver.navigate().refresh();
//			Thread.sleep(4000);
//			CL.AdminCampaignProfile();
//			Thread.sleep(2000);
//			CL.AdminCampaignProfileImage();
//			Thread.sleep(3000);
//			CL.AdminCampaignProfileBack();
//			Thread.sleep(3000);
//			driver.navigate().refresh();
//			Thread.sleep(4000);
//			CL.AdminCampaignListThreeDot();
//			Thread.sleep(2000);
//			CL.AdminCampaignListViewLog();
//			Thread.sleep(3000);
//			CL.AdminCampaignListViewLogBack();

//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//
//	}
}