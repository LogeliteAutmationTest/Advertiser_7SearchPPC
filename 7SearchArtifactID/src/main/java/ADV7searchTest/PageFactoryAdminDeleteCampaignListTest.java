package ADV7searchTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import ADV_7Search_genericPage.CommonMethod;
import Com.ADV7Search.pages.PageFactoryAdminDeleteCampaignListPage;
import Com.ADV7Search.pages.PageFactoryAdminTransactionHistoryPage;

public class PageFactoryAdminDeleteCampaignListTest extends CommonMethod {

	public PageFactoryAdminDeleteCampaignListTest() throws Exception {
		super();
	}

// #*************************************Login Page**********************************

	@Test
	public void AdminTestLogin1() {

		PageFactoryAdminDeleteCampaignListPage DCL = PageFactory.initElements(driver,
				PageFactoryAdminDeleteCampaignListPage.class);

		try {

			DCL.enterEmail();
			DCL.enterPassword();
			DCL.clickLoginButton();
			Thread.sleep(6000);
			driver.navigate().refresh();
			Thread.sleep(4000);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

// #*************************************Deleted Campaigns List Page**********************************

	@Test
	public void DeletedCampaignsList() {

		PageFactoryAdminDeleteCampaignListPage DCL = PageFactory.initElements(driver,
				PageFactoryAdminDeleteCampaignListPage.class);

		try {

			DCL.AdminDeletedCampaignsList();
			Thread.sleep(2000);
			DCL.enterAdminDeletedCampaignsListSearch();
			Thread.sleep(4000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			DCL.AdminDeletedCampaignsListByAds();
			Thread.sleep(2000);
			DCL.AdminDeletedCampaignsListByAdsText();
			Thread.sleep(2000);
			DCL.AdminDeletedCampaignsListByAds();
			Thread.sleep(2000);
			DCL.AdminDeletedCampaignsListByAdsBanner();
			Thread.sleep(2000);
			DCL.AdminDeletedCampaignsListByAds();
			Thread.sleep(2000);
			DCL.AdminDeletedCampaignsListByAdsVideo();
			Thread.sleep(2000);
			DCL.AdminDeletedCampaignsListByAds();
			Thread.sleep(2000);
			DCL.AdminDeletedCampaignsListByAdsInPagePush();
			Thread.sleep(2000);
			DCL.AdminDeletedCampaignsListByAds();
			Thread.sleep(2000);
			DCL.AdminDeletedCampaignsListByAdsNative();
			Thread.sleep(2000);
			DCL.AdminDeletedCampaignsListByAds();
			Thread.sleep(2000);
			DCL.AdminDeletedCampaignsListByAdsPopunder();

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}