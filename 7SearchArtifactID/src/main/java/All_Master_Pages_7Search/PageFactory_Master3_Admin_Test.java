package All_Master_Pages_7Search;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import ADV_7Search_genericPage.CommonMethod;
import Com.ADV7Search.pages.PageFactoryAdminManageCouponListPage;
import Com.ADV7Search.pages.PageFactoryAdminManageReportPage;
import Com.ADV7Search.pages.PageFactoryAdminManualStatsLogPage;

public class PageFactory_Master3_Admin_Test extends CommonMethod {

	public PageFactory_Master3_Admin_Test() throws Exception {
		super();
	}

//#*************************************Login Page**********************************

	@Test
	public void AdminTestLogin1() {

		PageFactoryAdminManageCouponListPage Coupon = PageFactory.initElements(driver,
				PageFactoryAdminManageCouponListPage.class);

		try {

			Coupon.enterEmail();
			Coupon.enterPassword();
			Coupon.clickLoginButton();
			Thread.sleep(6000);
			driver.navigate().refresh();
			Thread.sleep(4000);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

//#*************************************Manager Coupon Page**********************************

	@Test
	// (enabled = false)
	public void ManageCoupon2() {

		PageFactoryAdminManageCouponListPage Coupon = PageFactory.initElements(driver,
				PageFactoryAdminManageCouponListPage.class);

		try {

			Coupon.AdminManagerCouponList();
			Thread.sleep(2000);
			Coupon.enterAdminManagerCouponListSearch();
			Thread.sleep(6000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			Coupon.AdminManagerCouponListByStatus();
			Coupon.AdminManagerCouponListByStatusInActive();
			Thread.sleep(2000);
			Coupon.AdminManagerCouponListByStatus();
			Coupon.AdminManagerCouponListByStatusActive();
			Thread.sleep(2000);
			Coupon.AdminManagerCouponListByStatus();
			Coupon.AdminManagerCouponListByStatusExpired();
			Thread.sleep(6000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			Coupon.AdminManagerCouponListCouponCategory();
			Thread.sleep(1000);
			Coupon.AdminManagerCouponListAddCategory();
			Thread.sleep(1000);
			Coupon.enterAdminManagerCouponListCategoryName();
//				Thread.sleep(2000);
//				Coupon.AdminManagerCouponListAddCategoryButton();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			Coupon.AdminManagerCouponListCouponCategoryThreedot();
			Thread.sleep(2000);
			Coupon.AdminManagerCouponListCouponCategoryThreedotEdit();
			Thread.sleep(2000);
			Coupon.AdminManagerCouponListCouponCategoryThreedotEditUpdate();
			Thread.sleep(2000);
			Coupon.AdminManagerCouponListCouponCategoryThreedotBackButton();

			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(4000);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

// #*************************************Manager Country Page**********************************

	@Test
	public void AdminManageCountry2() {

		PageFactoryAdminManualStatsLogPage MSL = PageFactory.initElements(driver,
				PageFactoryAdminManualStatsLogPage.class);

		try {

			MSL.AdminManualStatsLog();
			Thread.sleep(2000);
			MSL.enterAdminManualStatsLogSearch();
			MSL.AdminManualStatsLogSearchButton();
			Thread.sleep(4000);
			driver.navigate().refresh();
			Thread.sleep(5000);
			MSL.AdminManualStatsLogDate();
			MSL.AdminManualStatsLogDate6April();
			MSL.AdminManualStatsLogDate5May();
			MSL.AdminManualStatsLogSearchButton();
			Thread.sleep(6000);
			driver.navigate().refresh();
			Thread.sleep(6000);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

//#*************************************Manager Category Page**********************************

	@Test(enabled = false)
	public void CampaignReport2() {

		PageFactoryAdminManageReportPage MR = PageFactory.initElements(driver, PageFactoryAdminManageReportPage.class);

		try {

			MR.AdminManagerReport();
			Thread.sleep(1000);
			MR.AdminManagerCampaignReport();
			Thread.sleep(1000);
			MR.enterAdminManagerCampaignReportSearch();
			Thread.sleep(4000);
			driver.navigate().refresh();
			Thread.sleep(4000);
//				MR.AdminCampaignListCategory();
//				MR.AdminCampaignListCategory7SearchPPC();
//				MR.AdminCampaignListSearchButton2();
//				Thread.sleep(2000);
//				MR.AdminCampaignListCategory();
//				MR.AdminCampaignListCategoryCrypto();
//				MR.AdminCampaignListSearchButton2();
//				Thread.sleep(2000);
//				MR.AdminCampaignListCategory();
//				MR.AdminCampaignListCategoryGambling();
//				MR.AdminCampaignListSearchButton2();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			MR.AdminCampaignListByStatus();
			MR.AdminCampaignListByAdsInReview();
			Thread.sleep(1000);
			MR.AdminCampaignListSearchButton2();
			Thread.sleep(2000);
			MR.AdminCampaignListByStatus();
			MR.AdminCampaignListByAdsActive();
			Thread.sleep(1000);
			MR.AdminCampaignListSearchButton2();
			Thread.sleep(2000);
			MR.AdminCampaignListByStatus();
			MR.AdminCampaignListByAdsPaused();
			Thread.sleep(1000);
			MR.AdminCampaignListSearchButton2();
			Thread.sleep(2000);
			MR.AdminCampaignListByStatus();
			MR.AdminCampaignListByAdsOnHold();
			Thread.sleep(1000);
			MR.AdminCampaignListSearchButton2();
			Thread.sleep(2000);
			MR.AdminCampaignListByStatus();
			MR.AdminCampaignListByAdsSuspend();
			Thread.sleep(1000);
			MR.AdminCampaignListSearchButton2();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(4000);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

//#*************************************Manager Category Page**********************************

	@Test
	// (enabled = false)
	public void CampaignReport3() {

		PageFactoryAdminManageReportPage MR = PageFactory.initElements(driver, PageFactoryAdminManageReportPage.class);

		try {

			MR.AdminManagerReport();
			Thread.sleep(1000);
			MR.AdminManagerCampaignReport();
			Thread.sleep(1000);
			MR.enterAdminManagerCampaignReportSearch();
			Thread.sleep(4000);
			driver.navigate().refresh();
			Thread.sleep(4000);
//				MR.AdminCampaignListCategory();
//				MR.AdminCampaignListCategory7SearchPPC();
//				MR.AdminCampaignListSearchButton2();
//				Thread.sleep(2000);
//				MR.AdminCampaignListCategory();
//				MR.AdminCampaignListCategoryCrypto();
//				MR.AdminCampaignListSearchButton2();
//				Thread.sleep(2000);
//				MR.AdminCampaignListCategory();
//				MR.AdminCampaignListCategoryGambling();
//				MR.AdminCampaignListSearchButton2();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			MR.AdminCampaignListByStatus();
			MR.AdminCampaignListByAdsInReview();
			Thread.sleep(1000);
			MR.AdminCampaignListSearchButton2();
			Thread.sleep(2000);
			MR.AdminCampaignListByStatus();
			MR.AdminCampaignListByAdsActive();
			Thread.sleep(1000);
			MR.AdminCampaignListSearchButton2();
			Thread.sleep(2000);
			MR.AdminCampaignListByStatus();
			MR.AdminCampaignListByAdsPaused();
			Thread.sleep(1000);
			MR.AdminCampaignListSearchButton2();
			Thread.sleep(2000);
			MR.AdminCampaignListByStatus();
			MR.AdminCampaignListByAdsOnHold();
			Thread.sleep(1000);
			MR.AdminCampaignListSearchButton2();
			Thread.sleep(2000);
			MR.AdminCampaignListByStatus();
			MR.AdminCampaignListByAdsSuspend();
			Thread.sleep(1000);
			MR.AdminCampaignListSearchButton2();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(4000);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

// #*************************************User Wallet Report Page**********************************

	@Test
	public void UserWalletReport2() {

		PageFactoryAdminManageReportPage MR = PageFactory.initElements(driver, PageFactoryAdminManageReportPage.class);

		try {

			MR.AdminManagerReport();
			Thread.sleep(1000);
			MR.AdminUserWalletReport();
			Thread.sleep(1000);
			MR.enterAdminUserWalletReportSearch();
			MR.AdminCampaignListSearchButton2();
			Thread.sleep(6000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			MR.AdminUserWalletReportUserType();
			Thread.sleep(1000);
			MR.AdminUserWalletReportUserTypeADV();
			MR.AdminCampaignListSearchButton2();
			Thread.sleep(2000);
			MR.AdminUserWalletReportUserType();
			Thread.sleep(1000);
			MR.AdminUserWalletReportUserTypePUB();
			MR.AdminCampaignListSearchButton2();
			Thread.sleep(4000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			MR.AdminUserWalletReportOperator();
			Thread.sleep(1000);
			MR.AdminUserWalletReportOperatorClient();
			MR.AdminCampaignListSearchButton2();
			Thread.sleep(2000);
			MR.AdminUserWalletReportOperator();
			Thread.sleep(1000);
			MR.AdminUserWalletReportOperatorInhouse();
			MR.AdminCampaignListSearchButton2();
			Thread.sleep(4000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			MR.AdminUserWalletReportStatus();
			Thread.sleep(1000);
			MR.AdminUserWalletReportStatusActive();
			Thread.sleep(1000);
			MR.AdminCampaignListSearchButton2();
			Thread.sleep(2000);
			MR.AdminUserWalletReportStatus();
			MR.AdminUserWalletReportStatusPending();
			Thread.sleep(1000);
			MR.AdminCampaignListSearchButton2();
			Thread.sleep(2000);
			MR.AdminUserWalletReportStatus();
			MR.AdminUserWalletReportStatusSuspended();
			MR.AdminCampaignListSearchButton2();

		} catch (InterruptedException e) {
			e.printStackTrace();

		}
	}
	
	
}
