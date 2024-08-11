package All_Master_Pages_7Search;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import ADV7searchTest.PageFactoryAdminPUBFeedbackPage;
import ADV_7Search_genericPage.CommonMethod;
import Com.ADV7Search.pages.PageFactoryAdminMangePayoutPage;
import Com.ADV7Search.pages.PageFactoryAdminPublisherClientListPages;
import Com.ADV7Search.pages.PageFactoryAdminPublisherInhouseListPage;
import Com.ADV7Search.pages.PageFactoryAdminPublisherStatisticsPage;

public class PageFactory_Master4_AdminPUB_Test extends CommonMethod {

	public PageFactory_Master4_AdminPUB_Test() throws Exception {
		super();
	}

// #*************************************Login Page**********************************

	@Test
	public void AdminTestLogin1() {

		PageFactoryAdminPublisherInhouseListPage PUBI = PageFactory.initElements(driver,
				PageFactoryAdminPublisherInhouseListPage.class);

		try {

			PUBI.enterEmail();
			PUBI.enterPassword();
			PUBI.clickLoginButton();
			Thread.sleep(6000);
			driver.navigate().refresh();
			Thread.sleep(4000);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

// #*************************************Publisher Client Page**********************************

	@Test
	public void PublisherClient() {

		PageFactoryAdminPublisherClientListPages PUBC = PageFactory.initElements(driver,
				PageFactoryAdminPublisherClientListPages.class);

		try {

			PUBC.AdminManagePublisher();
			Thread.sleep(1000);
			PUBC.AdminManagePublisherClient();
			Thread.sleep(2000);
			PUBC.enterAdminManagePublisherClientSearch();
			Thread.sleep(4000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			PUBC.AdminManagePublisherClientByCategory();
			Thread.sleep(1000);
			PUBC.AdminManagePublisherClientByCategoryAdult();
			Thread.sleep(1000);
			PUBC.AdminManagePublisherClientSearchButton();
			Thread.sleep(3000);
			PUBC.AdminManagePublisherClientByCategoryA();
			Thread.sleep(1000);
			PUBC.AdminManagePublisherClientByCategoryAllCategories();
			Thread.sleep(1000);
			PUBC.AdminManagePublisherClientSearchButton();
			Thread.sleep(3000);
			PUBC.AdminManagePublisherClientByCategoryAll();
			PUBC.AdminManagePublisherClientByCategoryGambling();
			PUBC.AdminManagePublisherClientSearchButton();
			Thread.sleep(3000);
			PUBC.AdminManagePublisherClientByCategoryG();
			PUBC.AdminManagePublisherClientByCategoryTechSupport();
			PUBC.AdminManagePublisherClientSearchButton();
			Thread.sleep(4000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			PUBC.AdminManagePublisherClientByStatus();
			PUBC.AdminManagePublisherClientByStatusActive();
			Thread.sleep(1000);
			PUBC.AdminManagePublisherClientSearchButton();
			Thread.sleep(3000);
			PUBC.AdminManagePublisherClientByStatusActive1();
			PUBC.AdminManagePublisherClientByStatusSuspend();
			Thread.sleep(1000);
			PUBC.AdminManagePublisherClientSearchButton();
			Thread.sleep(3000);
			PUBC.AdminManagePublisherClientByStatusSuspend1();
			PUBC.AdminManagePublisherClientByStatusHold();
			Thread.sleep(1000);
			PUBC.AdminManagePublisherClientSearchButton();
			Thread.sleep(4000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			PUBC.AdminManagePublisherClientBySource();
			PUBC.AdminManagePublisherClientBySourceAdmin();
			Thread.sleep(1000);
			PUBC.AdminManagePublisherClientSearchButton();
			Thread.sleep(3000);
			PUBC.AdminManagePublisherClientBySourceAdmin1();
			PUBC.AdminManagePublisherClientBySourceApp();
			Thread.sleep(1000);
			PUBC.AdminManagePublisherClientSearchButton();
			Thread.sleep(3000);
			PUBC.AdminManagePublisherClientBySourceApp1();
			PUBC.AdminManagePublisherClientBySourceOrganic();
			Thread.sleep(1000);
			PUBC.AdminManagePublisherClientSearchButton();
			Thread.sleep(3000);
			PUBC.AdminManagePublisherClientBySourceOrganic1();
			PUBC.AdminManagePublisherClientBySourceInfoAds();
			Thread.sleep(1000);
			PUBC.AdminManagePublisherClientSearchButton();
			Thread.sleep(3000);
			PUBC.AdminManagePublisherClientBySourceInfoAds1();
			PUBC.AdminManagePublisherClientBySourceUSAds();
			Thread.sleep(1000);
			PUBC.AdminManagePublisherClientSearchButton();
			Thread.sleep(3000);
			PUBC.AdminManagePublisherClientBySourceUSAds1();
			PUBC.AdminManagePublisherClientBySourceExternal();
			Thread.sleep(1000);
			PUBC.AdminManagePublisherClientSearchButton();
			Thread.sleep(4000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			PUBC.AdminManagePublisherClientDate();
			Thread.sleep(2000);
			PUBC.AdminManagePublisherClientDateMay1st();
			Thread.sleep(1000);
			PUBC.AdminManagePublisherClientDateMay22nd();
			Thread.sleep(2000);
			PUBC.AdminManagePublisherClientSearchButton();
			Thread.sleep(4000);
			driver.navigate().refresh();
			Thread.sleep(4000);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

// #*************************************Manage Publisher InHouse Page**********************************

	@Test
	public void PublisherInHouse() {

		PageFactoryAdminPublisherInhouseListPage PUBI = PageFactory.initElements(driver,
				PageFactoryAdminPublisherInhouseListPage.class);

		try {

			PUBI.AdminManagePublisher();
			Thread.sleep(1000);
			PUBI.AdminManagePublisherInHouse();
			Thread.sleep(1000);
			PUBI.enterAdminManagePublisherInHouseSearch();
			Thread.sleep(6000);
			driver.navigate().refresh();
			Thread.sleep(4000);
//			PUBI.AdminManagePublisherInHouseByCategory();
//			Thread.sleep(2000);
//			PUBI.AdminManagePublisherInHouseByCategoryAllCategories();
//			Thread.sleep(1000);
//			PUBI.AdminManagePublisherInHouseDateSearchButton();
//			Thread.sleep(2000);
//			PUBI.AdminManagePublisherInHouseByCategory();
//			Thread.sleep(2000);
//			PUBI.AdminManagePublisherInHouseByCategoryCrypto();
//			Thread.sleep(1000);
//			PUBI.AdminManagePublisherInHouseDateSearchButton();
//			Thread.sleep(2000);
//			PUBI.AdminManagePublisherInHouseByCategory();
//			Thread.sleep(2000);
//			PUBI.AdminManagePublisherInHouseByCategoryGambling();
//			Thread.sleep(1000);
//			PUBI.AdminManagePublisherInHouseDateSearchButton();
//			Thread.sleep(2000);
//			PUBI.AdminManagePublisherInHouseByCategory();
//			Thread.sleep(2000);
//			PUBI.AdminManagePublisherInHouseByCategoryTechSupport();
//			Thread.sleep(1000);
//			PUBI.AdminManagePublisherInHouseDateSearchButton();
//			Thread.sleep(6000);
//			driver.navigate().refresh();
//			Thread.sleep(4000);
			PUBI.AdminManagePublisherInHouseByStatus();
			Thread.sleep(2000);
			PUBI.AdminManagePublisherInHouseByStatusActive();
			Thread.sleep(2000);
			PUBI.AdminManagePublisherInHouseDateSearchButton();
			Thread.sleep(2000);
			PUBI.AdminManagePublisherInHouseByStatusA();
			Thread.sleep(2000);
			PUBI.AdminManagePublisherInHouseByStatusHold();
			Thread.sleep(1000);
			PUBI.AdminManagePublisherInHouseDateSearchButton();
			Thread.sleep(2000);
			PUBI.AdminManagePublisherInHouseByStatusH();
			Thread.sleep(2000);
			PUBI.AdminManagePublisherInHouseByStatusSuspend();
			Thread.sleep(1000);
			PUBI.AdminManagePublisherInHouseDateSearchButton();
			Thread.sleep(6000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			PUBI.AdminManagePublisherInHouseBySource();
			Thread.sleep(1000);
			PUBI.AdminManagePublisherInHouseBySourceAdmin();
			Thread.sleep(1000);
			PUBI.AdminManagePublisherInHouseDateSearchButton();
			Thread.sleep(2000);
			PUBI.AdminManagePublisherInHouseBySourceA();
			Thread.sleep(1000);
			PUBI.AdminManagePublisherInHouseBySourceApp();
			Thread.sleep(1000);
			PUBI.AdminManagePublisherInHouseDateSearchButton();
			Thread.sleep(2000);
			PUBI.AdminManagePublisherInHouseBySourceA1();
			Thread.sleep(1000);
			PUBI.AdminManagePublisherInHouseBySourceCA();
			Thread.sleep(1000);
			PUBI.AdminManagePublisherInHouseDateSearchButton();
			Thread.sleep(2000);
			PUBI.AdminManagePublisherInHouseBySourceC();
			Thread.sleep(1000);
			PUBI.AdminManagePublisherInHouseBySourceInfoADS();
			Thread.sleep(1000);
			PUBI.AdminManagePublisherInHouseDateSearchButton();
			Thread.sleep(2000);
			PUBI.AdminManagePublisherInHouseBySourceIN();
			Thread.sleep(1000);
			PUBI.AdminManagePublisherInHouseBySourceUSAds();
			Thread.sleep(1000);
			PUBI.AdminManagePublisherInHouseDateSearchButton();
			Thread.sleep(2000);
			PUBI.AdminManagePublisherInHouseBySourceU();
			Thread.sleep(1000);
			PUBI.AdminManagePublisherInHouseBySourceExternal();
			Thread.sleep(1000);
			PUBI.AdminManagePublisherInHouseDateSearchButton();
			Thread.sleep(6000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			PUBI.AdminManagePublisherInHouseDate();
			Thread.sleep(2000);
			PUBI.AdminManagePublisherInHouseDate1stMay();
			Thread.sleep(2000);
			PUBI.AdminManagePublisherInHouseDate21May();
			Thread.sleep(2000);
			PUBI.AdminManagePublisherInHouseDateSearchButton();
			Thread.sleep(4000);
			driver.navigate().refresh();
			Thread.sleep(4000);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

// #********************************************Publisher Statistics Page**********************************

	@Test
	public void AdminTestStatistics() {

		PageFactoryAdminPublisherStatisticsPage PS = PageFactory.initElements(driver,
				PageFactoryAdminPublisherStatisticsPage.class);

		try {

			PS.AdminManageStatistics();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(3000);
			PS.AdminManageStatisticsByCountry();
			PS.AdminManageStatisticsByCountryINDIA();
			PS.AdminManageStatisticsSearchButton();
			Thread.sleep(3000);
			PS.AdminManageStatisticsByCountry();
			PS.AdminManageStatisticsByCountryINDONESIA();
			PS.AdminManageStatisticsSearchButton();
			Thread.sleep(3000);
			PS.AdminManageStatisticsByCountry();
			PS.AdminManageStatisticsByCountryPAKISTAN();
			PS.AdminManageStatisticsSearchButton();
			Thread.sleep(3000);
			PS.AdminManageStatisticsByCountry();
			PS.AdminManageStatisticsByCountrySINGAPORE();
			PS.AdminManageStatisticsSearchButton();
			Thread.sleep(3000);
			PS.AdminManageStatisticsByCountry();
			PS.AdminManageStatisticsByCountryUS();
			PS.AdminManageStatisticsSearchButton();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			PS.AdminManageStatisticsByWebsite();
			PS.AdminManageStatisticsByWebsitemetatag2();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(4000);
//				PS.AdminManageStatisticsFilteredBy();
//				PS.AdminManageStatisticsSearchButton();
//				Thread.sleep(3000);
//				driver.navigate().refresh();
//				Thread.sleep(4000);
			PS.AdminManageStatisticsDomain();
			Thread.sleep(2000);
			PS.AdminManageStatisticsPlacement();
			Thread.sleep(2000);
			PS.AdminManageStatisticsCountry();
			Thread.sleep(2000);
			PS.AdminManageStatisticsDevice();
			Thread.sleep(2000);
			PS.AdminManageStatisticsOperating();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			PS.AdminManageStatisticsDate02_09();
			Thread.sleep(2000);
			PS.AdminManageStatisticsDateJune1st();
			PS.AdminManageStatisticsDateJune9th();
			Thread.sleep(1000);
			PS.AdminManageStatisticsSearchButton();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(4000);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

// #********************************************Publisher Manage Payout Page**********************************

	@Test
	public void AdminTestPayout() {

		PageFactoryAdminMangePayoutPage MPO = PageFactory.initElements(driver, PageFactoryAdminMangePayoutPage.class);

		try {

			MPO.AdminManagePayout();
			Thread.sleep(1000);
			MPO.AdminManagePayoutMethod();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(3000);
			MPO.AdminManagePayoutMethodAdd();
			Thread.sleep(2000);
			MPO.enterAdminManagePayoutMethodName();
			Thread.sleep(1000);
			MPO.enterAdminManagePayoutMethodDisplayName();
			MPO.enterAdminManagePayoutMethodprocessingfee();
			Thread.sleep(1000);
			MPO.enterAdminManagePayoutMethodwithdrawl();
			MPO.enterAdminManagePayoutMethodDescription();
			Thread.sleep(1000);
			MPO.enterAdminManagePayoutMethodUploadImage();
			Thread.sleep(2000);
			MPO.AdminManagePayoutMethodAddCancel();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			MPO.AdminManagePayoutMethodThreeDot();
			Thread.sleep(1000);
			MPO.AdminManagePayoutMethodEdit();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			MPO.AdminManagePayoutPendingList();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			MPO.AdminManagePayoutReleaseList();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			MPO.AdminManagePayoutHoldList();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(4000);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

// #********************************************Publisher FeedBack Page**********************************

	@Test
	public void AdminTestPubFeedback() {

		PageFactoryAdminPUBFeedbackPage PF = PageFactory.initElements(driver, PageFactoryAdminPUBFeedbackPage.class);

		try {

			PF.AdminManagePublisherFeedback();
			Thread.sleep(3000);
			PF.enterAdminManagePublisherFeedbackSearch();
			Thread.sleep(5000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			PF.AdminManagePublisherFeedbackBYRating();
			PF.AdminManagePublisherFeedbackBYRating1();
			Thread.sleep(3000);
			PF.AdminManagePublisherFeedbackBYRating();
			PF.AdminManagePublisherFeedbackBYRating2();
			Thread.sleep(3000);
			PF.AdminManagePublisherFeedbackBYRating();
			PF.AdminManagePublisherFeedbackBYRating3();
			Thread.sleep(3000);
			PF.AdminManagePublisherFeedbackBYRating();
			PF.AdminManagePublisherFeedbackBYRating4();
			Thread.sleep(3000);
			PF.AdminManagePublisherFeedbackBYRating();
			PF.AdminManagePublisherFeedbackBYRating5();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			PF.AdminManagePublisherFeedbackViewAttachment();

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
