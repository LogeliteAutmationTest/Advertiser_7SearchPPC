package ADV7searchTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import ADV_7Search_genericPage.CommonMethod;
import Com.ADV7Search.pages.PageFactoryAdminPublisherInhouseListPage;

public class PageFactoryAdminPublisherInhouseListTest extends CommonMethod {

	public PageFactoryAdminPublisherInhouseListTest() throws Exception {
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

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
