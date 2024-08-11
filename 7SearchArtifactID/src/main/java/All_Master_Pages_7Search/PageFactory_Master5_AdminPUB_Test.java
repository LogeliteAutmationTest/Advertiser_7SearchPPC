package All_Master_Pages_7Search;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import ADV_7Search_genericPage.CommonMethod;
import Com.ADV7Search.pages.PageFactoryAdminPublisherAdUnitListPage;
import Com.ADV7Search.pages.PageFactoryAdminPublisherInhouseListPage;
import Com.ADV7Search.pages.PageFactoryAdminPublisherKYCDocPage;
import Com.ADV7Search.pages.PageFactoryAdminPublisherManageAdRatePage;
import Com.ADV7Search.pages.PageFactoryAdminPublisherWebsiteListPage;

public class PageFactory_Master5_AdminPUB_Test extends CommonMethod {

	public PageFactory_Master5_AdminPUB_Test() throws Exception {
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

// #*******************************************Manage Publisher KYC Document Page****************************************

	@Test
	public void AdminKYCDoc1() {

		PageFactoryAdminPublisherKYCDocPage PUBK = PageFactory.initElements(driver,
				PageFactoryAdminPublisherKYCDocPage.class);

		try {

			PUBK.AdminManageKYCDoc();
			Thread.sleep(1000);
			PUBK.enterAdminManageKYCDocSearch();
			Thread.sleep(2000);
			PUBK.AdminManagePublisherKYCIDView();
			Thread.sleep(4000);
			driver.navigate().to("https://crm.7searchppc.com/document-list");
			Thread.sleep(2000);
			PUBK.AdminManagePublisherKYCSelfieView();
			Thread.sleep(4000);
			driver.navigate().to("https://crm.7searchppc.com/document-list");
			Thread.sleep(2000);
			PUBK.AdminManagePublisherKYCIDUpdate();
			Thread.sleep(1000);
			PUBK.AdminManagePublisherKYCIDUpdateStatus();
			PUBK.AdminManagePublisherKYCIDUpdateStatusReject();
			Thread.sleep(1000);
			PUBK.enterAdminManagePublisherKYCIDUpdateDescription();
			Thread.sleep(1000);
			// PUBK.AdminManagePublisherKYCIDUpdateSubmit();
			Thread.sleep(2000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			PUBK.AdminManagePublisherKYCSelfieUpdate();
			Thread.sleep(1000);
			PUBK.AdminManagePublisherKYCSelfieUpdateStatus();
			PUBK.AdminManagePublisherKYCSelfieUpdateStatusReject();
			Thread.sleep(1000);
			PUBK.enterAdminManagePublisherKYCSelfieUpdateDescription();
			Thread.sleep(1000);
			// PUBK.AdminManagePublisherKYCSelfieUpdateSubmit();

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

// #*******************************************Manage Publisher Ads Rate  Page*************************************

	@Test
	public void AdminTestAdRate() {

		PageFactoryAdminPublisherManageAdRatePage AdRate = PageFactory.initElements(driver,
				PageFactoryAdminPublisherManageAdRatePage.class);

		try {

			AdRate.AdminManageAdRates();
			Thread.sleep(2000);
			AdRate.enterAdminManageAdRatesSearch();
			Thread.sleep(6000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			AdRate.AdminManageAdRatesByCountry();
			AdRate.AdminManageAdRatesByCountryIndia();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(3000);
			AdRate.AdminManageAdRatesByCountryI();
			AdRate.AdminManageAdRatesByCountryUS();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(3000);
			AdRate.AdminManageAdRatesByCategory();
			AdRate.AdminManageAdRatesByCategoryAdult();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(3000);
			AdRate.AdminManageAdRatesByCategoryCrypto();
			AdRate.AdminManageAdRatesByCategoryAllCategories();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(3000);
			AdRate.AdminManageAdRatesAddRates();

		} catch (InterruptedException e) {
			e.printStackTrace();

		}
	}

// #*******************************************Manage Publisher Web site list Page*************************************

	@Test
	public void AdminTestWebsite() {

		PageFactoryAdminPublisherWebsiteListPage WL = PageFactory.initElements(driver,
				PageFactoryAdminPublisherWebsiteListPage.class);

		try {

			WL.AdminManageWebsiteList();
			Thread.sleep(1000);
			WL.enterAdminManageWebsiteListSearch();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			WL.AdminManageWebsiteListByCategory();
			WL.AdminManageWebsiteListByCategoryAdultDating();
			WL.AdminManageWebsiteListByCategory();
			WL.AdminManageWebsiteListByCategoryAllCategories();
			WL.AdminManageWebsiteListByCategory();
			WL.AdminManageWebsiteListByCategoryCrypto();
			WL.AdminManageWebsiteListByCategory();
			WL.AdminManageWebsiteListByCategoryGambling();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			WL.AdminManageWebsiteListByStatus();
			WL.AdminManageWebsiteListByStatusApproved();
			WL.AdminManageWebsiteListByStatus();
			WL.AdminManageWebsiteListByStatusHold();
			WL.AdminManageWebsiteListByStatus();
			WL.AdminManageWebsiteListByStatusInReview();
			WL.AdminManageWebsiteListByStatus();
			WL.AdminManageWebsiteListByStatusRejected();
			WL.AdminManageWebsiteListByStatus();
			WL.AdminManageWebsiteListByStatusSuspended();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			WL.AdminManageWebsiteListByOperator();
			WL.AdminManageWebsiteListByOperatorClient();
			WL.AdminManageWebsiteListByOperator();
			WL.AdminManageWebsiteListByOperatorInhouse();

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

// #*************************************Ad unit Page**********************************

	@Test
	public void AdminTestAdUnit() {

		PageFactoryAdminPublisherAdUnitListPage ADL = PageFactory.initElements(driver,
				PageFactoryAdminPublisherAdUnitListPage.class);

		try {
			ADL.AdminManageAdUnitList();
			Thread.sleep(2000);
			ADL.enterAdminManageAdUnitListSearch();
			Thread.sleep(6000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			ADL.AdminManageAdUnitListByCategory();
			ADL.AdminManageAdUnitListByCategoryAdultDating();
			Thread.sleep(3000);
			ADL.AdminManageAdUnitListByCategory();
			ADL.AdminManageAdUnitListByCategoryAllCategories();
			Thread.sleep(2000);
			ADL.AdminManageAdUnitListByCategory();
			ADL.AdminManageAdUnitListByCategoryCrypto();
			Thread.sleep(3000);
			ADL.AdminManageAdUnitListByCategory();
			ADL.AdminManageAdUnitListByCategoryGambling();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			ADL.AdminManageAdUnitListByAds();
			ADL.AdminManageAdUnitListByAdsText();
			Thread.sleep(3000);
			ADL.AdminManageAdUnitListByAds();
			ADL.AdminManageAdUnitListByAdsBanner();
			Thread.sleep(3000);
			ADL.AdminManageAdUnitListByAds();
			ADL.AdminManageAdUnitListByAdsVideo();
			Thread.sleep(3000);
			ADL.AdminManageAdUnitListByAds();
			ADL.AdminManageAdUnitListByAdsInPagePush();
			Thread.sleep(3000);
			ADL.AdminManageAdUnitListByAds();
			ADL.AdminManageAdUnitListByAdsNative();
			Thread.sleep(3000);
			ADL.AdminManageAdUnitListByAds();
			ADL.AdminManageAdUnitListByAdsPopunder();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			ADL.AdminManageAdUnitListByStatus();
			ADL.AdminManageAdUnitListByStatusInactive();
			Thread.sleep(3000);
			ADL.AdminManageAdUnitListByStatus();
			ADL.AdminManageAdUnitListByStatusActive();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(4000);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
