package All_Master_Pages_7Search;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import ADV_7Search_genericPage.CommonMethod;
import Com.ADV7Search.pages.PageFactoryAdminADVPage;
import Com.ADV7Search.pages.PageFactoryAdminAdvertiserFeedbackPage;
import Com.ADV7Search.pages.PageFactoryAdminDeleteCampaignListPage;
import Com.ADV7Search.pages.PageFactoryAdminManageCategoryPage;
import Com.ADV7Search.pages.PageFactoryAdminPaymentReportPage;
import Com.ADV7Search.pages.PageFactoryAdminTransactionHistoryPage;

public class PageFactory_Master1_Admin_Test extends CommonMethod {

	public PageFactory_Master1_Admin_Test() throws Exception {
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
//	(enabled = false)
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
//				IH.ManagerADVCategoryFilter();
//				IH.ManagerADVCategoryEcommerce();
//				Thread.sleep(1000);
//				IH.ManagerADVSearchButton();
//				Thread.sleep(2000);
//				IH.ManagerADVCategoryFilter();
//				IH.ManagerADVCategoryFinance();
//				Thread.sleep(1000);
//				IH.ManagerADVSearchButton();
//				Thread.sleep(2000);
//				IH.ManagerADVCategoryFilter();
//				IH.ManagerADVCategoryFood();
//				Thread.sleep(1000);
//				IH.ManagerADVSearchButton();
//				Thread.sleep(2000);
//				IH.ManagerADVCategoryFilter();
//				IH.ManagerADVCategoryGambling();
//				Thread.sleep(1000);
//				IH.ManagerADVSearchButton();
//				Thread.sleep(2000);
//				IH.ManagerADVCategoryFilter();
//				IH.ManagerADVCategoryHealth();
//				Thread.sleep(1000);
//				IH.ManagerADVSearchButton();
//				Thread.sleep(2000);
//				driver.navigate().refresh();
//				Thread.sleep(4000);
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
//	(enabled = false)
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
//	(enabled = false)
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
//				Thread.sleep(1000);
//				IH.ManagerADVSearchButton();
//				Thread.sleep(2000);
//				IH.ManagerADVCategoryFilter();
//				IH.ManagerADVCategoryEcommerce();
//				Thread.sleep(1000);
//				IH.ManagerADVSearchButton();
//				Thread.sleep(2000);
//				IH.ManagerADVCategoryFilter();
//				IH.ManagerADVCategoryFinance();
//				Thread.sleep(1000);
//				IH.ManagerADVSearchButton();
//				Thread.sleep(2000);
//				IH.ManagerADVCategoryFilter();
//				IH.ManagerADVCategoryFood();
//				Thread.sleep(1000);
//				IH.ManagerADVSearchButton();
//				Thread.sleep(2000);
//				IH.ManagerADVCategoryFilter();
//				IH.ManagerADVCategoryGambling();
//				Thread.sleep(1000);
//				IH.ManagerADVSearchButton();
//				Thread.sleep(2000);
//				IH.ManagerADVCategoryFilter();
//				IH.ManagerADVCategoryHealth();
//				Thread.sleep(1000);
//				IH.ManagerADVSearchButton();
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
//	(enabled = false)
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

//#*************************************Manager Category Page**********************************

	@Test
	public void MangeCategory2() {

		PageFactoryAdminManageCategoryPage MC = PageFactory.initElements(driver,
				PageFactoryAdminManageCategoryPage.class);

		try {

			MC.AdminManagerCategory();
			Thread.sleep(2000);
			MC.enterAdminManagerCategorySearch();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			MC.AdminManagerCategoryADD();
			Thread.sleep(1000);
			MC.enterAdminManagerCategoryName();
			MC.enterAdminManagerCategoryCPM();
			MC.enterAdminManagerCategoryCPC();
			MC.enterAdminManagerCategoryCPAImp();
			MC.enterAdminManagerCategoryCPAClick();
			MC.enterAdminManagerCategoryVideoADV();
			MC.enterAdminManagerCategoryVideoPUB();
			MC.enterAdminManagerCategoryPUBCpm();
			MC.enterAdminManagerCategoryPUBCPC();
			Thread.sleep(3000);
			// MC.AdminManagerCategorySubmit();
			driver.navigate().refresh();
			Thread.sleep(4000);
			MC.AdminManagerCategoryThreeDot();
			Thread.sleep(1000);
			MC.AdminManagerCategoryEdit();
			Thread.sleep(2000);
			MC.AdminManagerCategoryUpdateSubmit();

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

//#*************************************Manager Payment Report Page**********************************

	@Test
	// (enabled = false)
	public void ManagePaymentReport2() {

		PageFactoryAdminPaymentReportPage PR = PageFactory.initElements(driver,
				PageFactoryAdminPaymentReportPage.class);

		try {

			PR.AdminManagerPaymentReport();
			Thread.sleep(2000);
			PR.enterAdminManagerPaymentReportSearch();
			Thread.sleep(4000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			PR.AdminManagerPaymentReportBySource();
			Thread.sleep(1000);
			PR.AdminManagerPaymentReportBySourceApp();
			Thread.sleep(1000);
			PR.AdminManagerPaymentReportSearchButton();
			Thread.sleep(3000);
			PR.AdminManagerPaymentReportBySourceA2();
			Thread.sleep(1000);
			PR.AdminManagerPaymentReportBySourceOrganic();
			Thread.sleep(1000);
			PR.AdminManagerPaymentReportSearchButton();
			Thread.sleep(2000);
			PR.AdminManagerPaymentReportBySourceO();
			Thread.sleep(1000);
			PR.AdminManagerPaymentReportBySourceInfoAds();
			Thread.sleep(1000);
			PR.AdminManagerPaymentReportSearchButton();
			Thread.sleep(2000);
			PR.AdminManagerPaymentReportBySourceI();
			Thread.sleep(1000);
			PR.AdminManagerPaymentReportBySourceUSAds();
			Thread.sleep(1000);
			PR.AdminManagerPaymentReportSearchButton();
			Thread.sleep(2000);
			PR.AdminManagerPaymentReportBySourceU();
			Thread.sleep(1000);
			PR.AdminManagerPaymentReportBySourceExternal();
			Thread.sleep(1000);
			PR.AdminManagerPaymentReportSearchButton();
			Thread.sleep(4000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			PR.AdminManagerPaymentReportByCountry();
			Thread.sleep(1000);
			PR.AdminManagerPaymentReportByCountryIndia();
			Thread.sleep(1000);
			PR.AdminManagerPaymentReportSearchButton();
			Thread.sleep(2000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			PR.AdminManagerPaymentReportByCountry();
			Thread.sleep(1000);
			PR.AdminManagerPaymentReportByCountryUS();
			Thread.sleep(1000);
			PR.AdminManagerPaymentReportSearchButton();
			Thread.sleep(6000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			PR.AdminManagerPaymentReportByCategory();
			Thread.sleep(1000);
			PR.AdminManagerPaymentReportByCategoryAdultDating();
			Thread.sleep(1000);
			PR.AdminManagerPaymentReportSearchButton();
			Thread.sleep(2000);
			PR.AdminManagerPaymentReportByCategory();
			Thread.sleep(1000);
			PR.AdminManagerPaymentReportByCategoryAllCategories();
			Thread.sleep(1000);
			PR.AdminManagerPaymentReportSearchButton();
			Thread.sleep(2000);
			PR.AdminManagerPaymentReportByCategory();
			Thread.sleep(1000);
			PR.AdminManagerPaymentReportByCategoryGambling();
			Thread.sleep(1000);
			PR.AdminManagerPaymentReportSearchButton();
			Thread.sleep(2000);
			PR.AdminManagerPaymentReportByCategory();
			Thread.sleep(1000);
			PR.AdminManagerPaymentReportByCategoryTravel();
			Thread.sleep(1000);
			PR.AdminManagerPaymentReportSearchButton();
			Thread.sleep(6000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			PR.AdminManagerPaymentReportByPaymentMethod();
			Thread.sleep(1000);
			PR.AdminManagerPaymentReportByPaymentMethodStripe();
			Thread.sleep(1000);
			PR.AdminManagerPaymentReportSearchButton();
			Thread.sleep(2000);
			PR.AdminManagerPaymentReportByPaymentMethod();
			Thread.sleep(1000);
			PR.AdminManagerPaymentReportByPaymentMethodTazapay();
			Thread.sleep(1000);
			PR.AdminManagerPaymentReportSearchButton();
			Thread.sleep(2000);
			PR.AdminManagerPaymentReportByPaymentMethod();
			Thread.sleep(1000);
			PR.AdminManagerPaymentReportByPaymentMethodPayu();
			Thread.sleep(1000);
			PR.AdminManagerPaymentReportSearchButton();
			Thread.sleep(2000);
			PR.AdminManagerPaymentReportByPaymentMethod();
			Thread.sleep(1000);
			PR.AdminManagerPaymentReportByPaymentMethodPhonepe();
			Thread.sleep(1000);
			PR.AdminManagerPaymentReportSearchButton();
			Thread.sleep(2000);
			PR.AdminManagerPaymentReportByPaymentMethod();
			Thread.sleep(1000);
			PR.AdminManagerPaymentReportByPaymentMethodAirpay();
			Thread.sleep(1000);
			PR.AdminManagerPaymentReportSearchButton();
			Thread.sleep(2000);
			PR.AdminManagerPaymentReportByPaymentMethod();
			Thread.sleep(1000);
			PR.AdminManagerPaymentReportByPaymentMethodCoinpay();
			Thread.sleep(1000);
			PR.AdminManagerPaymentReportSearchButton();
			Thread.sleep(2000);
			PR.AdminManagerPaymentReportByPaymentMethod();
			Thread.sleep(1000);
			PR.AdminManagerPaymentReportByPaymentMethodNowPayments();
			Thread.sleep(1000);
			PR.AdminManagerPaymentReportSearchButton();
			Thread.sleep(2000);
			PR.AdminManagerPaymentReportByPaymentMethod();
			Thread.sleep(1000);
			PR.AdminManagerPaymentReportByPaymentMethodBitcoin();
			Thread.sleep(1000);
			PR.AdminManagerPaymentReportSearchButton();
			Thread.sleep(4000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			PR.AdminManagerPaymentReportDate();
			Thread.sleep(3000);
			PR.AdminManagerPaymentReportDateselect1July();
			Thread.sleep(2000);
			PR.AdminManagerPaymentReportDateselect31July();
			Thread.sleep(2000);
			PR.AdminManagerPaymentReportSearchButton();

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

// #*************************************Manager Transaction History Page**********************************

	@Test
	// (enabled = false)
	public void ManagePaymentReport3() {

		PageFactoryAdminTransactionHistoryPage PR = PageFactory.initElements(driver,
				PageFactoryAdminTransactionHistoryPage.class);

		try {

			PR.AdminManagerTransactionHistory();
			Thread.sleep(2000);
			PR.enterAdminManagerTransactionHistorySearch();
			Thread.sleep(3000);
			PR.AdminManagerTransactionHistorySearchButton();
			Thread.sleep(6000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			PR.AdminManagerTransactionHistoryBySource();
			Thread.sleep(1000);
			PR.AdminManagerTransactionHistoryBySourceOrganic();
			Thread.sleep(2000);
			PR.AdminManagerTransactionHistorySearchButton();
			Thread.sleep(2000);
			PR.AdminManagerTransactionHistoryBySourceO();
			Thread.sleep(1000);
			PR.AdminManagerTransactionHistoryBySourceInfoAds();
			Thread.sleep(1000);
			PR.AdminManagerTransactionHistorySearchButton();
			Thread.sleep(2000);
			PR.AdminManagerTransactionHistoryBySourceI();
			Thread.sleep(1000);
			PR.AdminManagerTransactionHistoryBySourceUSAds();
			Thread.sleep(1000);
			PR.AdminManagerTransactionHistorySearchButton();
			Thread.sleep(2000);
			PR.AdminManagerTransactionHistoryBySourceU();
			Thread.sleep(1000);
			PR.AdminManagerTransactionHistoryBySourceExternal();
			Thread.sleep(1000);
			PR.AdminManagerTransactionHistorySearchButton();
			Thread.sleep(4000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			PR.AdminManagerTransactionHistoryByCountry();
			PR.AdminManagerTransactionHistoryByCountryIndia();
			Thread.sleep(1000);
			PR.AdminManagerTransactionHistorySearchButton();
			Thread.sleep(2000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			PR.AdminManagerTransactionHistoryByCountry();
			PR.AdminManagerTransactionHistoryByCountryUS();
			Thread.sleep(1000);
			PR.AdminManagerTransactionHistorySearchButton();
			Thread.sleep(6000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			PR.AdminManagerTransactionHistoryByPaymentMethod();
			PR.AdminManagerTransactionHistoryByPaymentMethodStripe();
			Thread.sleep(1000);
			PR.AdminManagerTransactionHistorySearchButton();
			Thread.sleep(2000);
			PR.AdminManagerTransactionHistoryByPaymentMethod();
			PR.AdminManagerTransactionHistoryByPaymentMethodTazapay();
			Thread.sleep(1000);
			PR.AdminManagerTransactionHistorySearchButton();
			Thread.sleep(2000);
			PR.AdminManagerTransactionHistoryByPaymentMethod();
			PR.AdminManagerTransactionHistoryByPaymentMethodPayu();
			Thread.sleep(1000);
			PR.AdminManagerTransactionHistorySearchButton();
			Thread.sleep(2000);
			PR.AdminManagerTransactionHistoryByPaymentMethod();
			PR.AdminManagerTransactionHistoryByPaymentMethodRazorpay();
			Thread.sleep(1000);
			PR.AdminManagerTransactionHistorySearchButton();
			Thread.sleep(2000);
			PR.AdminManagerTransactionHistoryByPaymentMethod();
			PR.AdminManagerTransactionHistoryByPaymentMethodPhonepe();
			Thread.sleep(1000);
			PR.AdminManagerTransactionHistorySearchButton();
			Thread.sleep(2000);
			PR.AdminManagerTransactionHistoryByPaymentMethod();
			PR.AdminManagerTransactionHistoryByPaymentMethodAirpay();
			Thread.sleep(1000);
			PR.AdminManagerTransactionHistorySearchButton();
			Thread.sleep(2000);
			PR.AdminManagerTransactionHistoryByPaymentMethod();
			PR.AdminManagerTransactionHistoryByPaymentMethodCoinpay();
			Thread.sleep(1000);
			PR.AdminManagerTransactionHistorySearchButton();
			Thread.sleep(2000);
			PR.AdminManagerTransactionHistoryByPaymentMethod();
			PR.AdminManagerTransactionHistoryByPaymentMethodNowPayments();
			Thread.sleep(1000);
			PR.AdminManagerTransactionHistorySearchButton();
			Thread.sleep(2000);
			PR.AdminManagerTransactionHistoryByPaymentMethod();
			PR.AdminManagerTransactionHistoryByPaymentMethodBitcoin();
			Thread.sleep(1000);
			PR.AdminManagerTransactionHistorySearchButton();
			Thread.sleep(4000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			PR.AdminManagerTransactionHistoryDate();
			Thread.sleep(3000);
			PR.AdminManagerTransactionHistoryDateselect1May();
			Thread.sleep(2000);
			PR.AdminManagerTransactionHistoryDateselect18May();
			Thread.sleep(2000);
			PR.AdminManagerTransactionHistorySearchButton();

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

// #*************************************Advertiser Feedback Page**********************************

	@Test
	public void AdvertiserFeedback() {

		PageFactoryAdminAdvertiserFeedbackPage AF = PageFactory.initElements(driver,
				PageFactoryAdminAdvertiserFeedbackPage.class);

		try {

			AF.AdminAdvertiserFeedback();
			AF.enterAdminAdvertiserFeedbackSearch();
			Thread.sleep(6000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			AF.AdminAdvertiserFeedbackBYRating();
			Thread.sleep(2000);
			AF.AdminAdvertiserFeedbackBYRating1();
			Thread.sleep(2000);
			AF.AdminAdvertiserFeedbackBYRating();
			Thread.sleep(2000);
			AF.AdminAdvertiserFeedbackBYRating2();
			Thread.sleep(2000);
			AF.AdminAdvertiserFeedbackBYRating();
			Thread.sleep(2000);
			AF.AdminAdvertiserFeedbackBYRating3();
			Thread.sleep(2000);
			AF.AdminAdvertiserFeedbackBYRating();
			Thread.sleep(2000);
			AF.AdminAdvertiserFeedbackBYRating4();
			Thread.sleep(2000);
			AF.AdminAdvertiserFeedbackBYRating();
			Thread.sleep(2000);
			AF.AdminAdvertiserFeedbackBYRating5();

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
