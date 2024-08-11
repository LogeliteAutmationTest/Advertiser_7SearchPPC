package All_Master_Pages_7Search;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import ADV_7Search_genericPage.CommonMethod;
import Com.ADV7Search.pages.PageFactoryAdminAddNewUserPage1;
import Com.ADV7Search.pages.PageFactoryAdminCampaign1ListPage;
import Com.ADV7Search.pages.PageFactoryAdminDashboard1Page;

public class PageFactory_Master2_Admin_Test extends CommonMethod {

	public PageFactory_Master2_Admin_Test() throws Exception {
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
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0, 500)");
			Thread.sleep(2000);
			jse.executeScript("window.scrollBy(0, 500)");
			Thread.sleep(4000);
			driver.navigate().refresh();
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

//#*************************************PUBDashboard Page**********************************

	@Test
	public void AdminPUBDashboard2() throws Exception {

		PageFactoryAdminDashboard1Page PD = PageFactory.initElements(driver, PageFactoryAdminDashboard1Page.class);

		PD.PUBDashboard();
		Thread.sleep(2000);
		PD.PUBToday();
		PD.PUB7Day();
		Thread.sleep(3000);
		PD.PUBSelect7Day();
		PD.PUB15Day();
		Thread.sleep(3000);
		PD.PUBSelect15Day();
		PD.PUB30Day();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(4000);
//			JavascriptExecutor jse = (JavascriptExecutor) driver;
//			jse.executeScript("window.scrollBy(0, 500)");
//			Thread.sleep(2000);
//			jse.executeScript("window.scrollBy(0, 500)");
//			Thread.sleep(2000);
//			driver.navigate().refresh();
//			Thread.sleep(4000);

	}

//#*************************************Notification Page**********************************

	@Test
	public void AdminNotification3() {

		PageFactoryAdminDashboard1Page AN = PageFactory.initElements(driver, PageFactoryAdminDashboard1Page.class);

		try {

			AN.AdminNotification();
			Thread.sleep(2000);
			AN.enterAdminNotificationSearch();
			Thread.sleep(4000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			AN.AdminNotificationDate();
			Thread.sleep(1000);
			AN.AdminNotificationDate7th();
			Thread.sleep(1000);
			AN.AdminNotificationDate19th();
			Thread.sleep(1000);
			AN.AdminNotificationSearchButton();
			Thread.sleep(2000);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

// #*******************************************Campaign List Page****************************************

	@Test(enabled = false)
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
			// AU.AdminCampaignListSearchThreedotPaused();
//			Thread.sleep(1000);
//			AU.AdminCampaignListSearchThreedotYes();
//			Thread.sleep(2000);
//			driver.navigate().refresh();
//			Thread.sleep(5000);
//			AU.enterAdminCampaignListSearch();
//			Thread.sleep(5000);
//			AU.AdminCampaignListSearchThreedot();
//			Thread.sleep(1000);
			// AU.AdminCampaignListSearchThreedotYes();
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

//#*************************************Add New User Page**********************************

	@Test(enabled = false)
	public void AdminTestAddUser2() {

		PageFactoryAdminAddNewUserPage1 AU = PageFactory.initElements(driver, PageFactoryAdminAddNewUserPage1.class);

		try {

			AU.AdminAddNewUser();
			Thread.sleep(1000);
			AU.enterAdminFirstName();
			AU.enterAdminLastName();
			AU.enterAdminEnterEmail();
			Thread.sleep(1000);
			AU.AdminCountry();
			AU.AdminSelectIndia();
			AU.enterAdminPhoneNo();
			Thread.sleep(1000);
			AU.AdminCategory();
			AU.AdminselectCategory();
			Thread.sleep(1000);
			AU.enterAdminEnterAddress();
			AU.enterAdminEnterAddress2();
			AU.enterAdminEnterCity();
			AU.enterAdminEnterState();
			AU.enterAdminEnterPassword();
			Thread.sleep(1000);
			AU.AdminAccounType();
			AU.AdmincheckBox();
			// AU.AdminSaveButton();
			Thread.sleep(4000);
			driver.navigate().refresh();
			Thread.sleep(4000);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

// #*******************************************Category Page****************************************
	@Test(enabled = false)
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
