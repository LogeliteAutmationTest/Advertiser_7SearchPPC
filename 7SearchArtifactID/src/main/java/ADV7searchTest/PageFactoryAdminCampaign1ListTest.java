package ADV7searchTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import ADV_7Search_genericPage.CommonMethod;
import Com.ADV7Search.pages.PageFactoryAdminCampaign1ListPage;

public class PageFactoryAdminCampaign1ListTest extends CommonMethod {

	public PageFactoryAdminCampaign1ListTest() throws Exception {
		super();
	}

//#*************************************Login Page**********************************

	@Test
	public void AdminTestLogin1() {

		PageFactoryAdminCampaign1ListPage AU = PageFactory.initElements(driver,
				PageFactoryAdminCampaign1ListPage.class);

		try {

			AU.enterEmail();
			AU.enterPassword();
			AU.clickLoginButton();
			Thread.sleep(6000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			AU.AdminCampaignList();

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

// #*******************************************Campaign List Page****************************************

	@Test
	(enabled = false)
	public void AdminTestLogin2() {

		PageFactoryAdminCampaign1ListPage AU = PageFactory.initElements(driver,
				PageFactoryAdminCampaign1ListPage.class);

		try {

			AU.AdminCampaignList();
			Thread.sleep(2000);
			AU.enterAdminCampaignListSearch();
			Thread.sleep(5000);
			AU.AdminCampaignListSearchThreedot();
			Thread.sleep(1000);
//			AU.AdminCampaignListSearchThreedotActive();
			//AU.AdminCampaignListSearchThreedotPaused();
//			Thread.sleep(1000);
//			AU.AdminCampaignListSearchThreedotYes();
//			Thread.sleep(2000);
//			driver.navigate().refresh();
//			Thread.sleep(5000);
//			AU.enterAdminCampaignListSearch();
//			Thread.sleep(5000);
//			AU.AdminCampaignListSearchThreedot();
//			Thread.sleep(1000);
			//AU.AdminCampaignListSearchThreedotYes();
			// AU.AdminCampaignListSearchThreedotPaused();
			AU.AdminCampaignListSearchThreedotAddImp();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			AU.enterAdminCampaignListSearchThreedotAddImpEnter();
			Thread.sleep(1000);
			AU.enterAdminCampaignListSearchThreedotAddImpEnterClick();
			Thread.sleep(1000);
			AU.enterAdminCampaignListSearchThreedotAddImpDate();
			Thread.sleep(2000);
			AU.AdminCampaignListSearchThreedotAddImpSave();
			Thread.sleep(5000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			AU.AdminCampaignListSearchThreedotAddImpBack();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
// #*******************************************Category Page****************************************
	@Test
	//(enabled = false)
	public void AdminTestLogin3() {

		PageFactoryAdminCampaign1ListPage AU = PageFactory.initElements(driver,
				PageFactoryAdminCampaign1ListPage.class);

		try {
			
			AU.AdminCampaignList();
			Thread.sleep(2000);
			AU.AdminCampaignListCategory();
			Thread.sleep(1000);
			AU.AdminCampaignListCategoryAdult();
			AU.AdminCampaignListSearchButton();
			Thread.sleep(3000);
			AU.AdminCampaignListCategoryA();
			Thread.sleep(1000);
			AU.AdminCampaignListCategoryGambling();
			AU.AdminCampaignListSearchButton();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(4000);
//			AU.AdminCampaignListByAds();
//			AU.AdminCampaignListByAdsTextAds();
//			AU.AdminCampaignListSearchButton();
//			Thread.sleep(2000);
//			AU.AdminCampaignListByAdsT();
//			AU.AdminCampaignListByAdsBanner();
//			Thread.sleep(1000);
//			AU.AdminCampaignListSearchButton();
//			Thread.sleep(2000);
//			AU.AdminCampaignListByAdsT();
//			AU.AdminCampaignListByAdsInPage();
//			AU.AdminCampaignListSearchButton();
//			Thread.sleep(2000);
//			AU.AdminCampaignListByAdsT();
//			AU.AdminCampaignListByAdsNative();
//			Thread.sleep(1000);
//			AU.AdminCampaignListSearchButton();
//			Thread.sleep(2000);
//			AU.AdminCampaignListByAdsT();
//			AU.AdminCampaignListByAdsPopunder();
//			AU.AdminCampaignListSearchButton();
//			Thread.sleep(3000);
//			driver.navigate().refresh();
//			Thread.sleep(4000);
			AU.AdminCampaignListByStatus();
			AU.AdminCampaignListByAdsInReview();
			Thread.sleep(2000);
			AU.AdminCampaignListByStatus();
			AU.AdminCampaignListByAdsActive();
			Thread.sleep(2000);
			AU.AdminCampaignListByStatus();
			AU.AdminCampaignListByAdsPaused();
			Thread.sleep(2000);
			AU.AdminCampaignListByStatus();
			AU.AdminCampaignListByAdsOnHold();
			Thread.sleep(2000);
			AU.AdminCampaignListByStatus();
			AU.AdminCampaignListByAdsSuspend();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			AU.AdminCampaignListByOperator();
			AU.AdminCampaignListByOperatorClient();
			Thread.sleep(4000);
			AU.AdminCampaignListByOperatorC();
			AU.AdminCampaignListByOperatorInhouse();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			AU.AdminCampaignProfile();
			Thread.sleep(2000);
			AU.AdminCampaignProfileImage();
			Thread.sleep(3000);
			AU.AdminCampaignProfileBack();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
}
}
