package ADV7searchTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import ADV_7Search_genericPage.CommonMethod;
import Com.ADV7Search.pages.PageFactoryAdminPublisherClientListPages;

public class PageFactoryAdminPublisherClientListTest extends CommonMethod {

	public PageFactoryAdminPublisherClientListTest() throws Exception {
		super();
	}

// #*************************************Login Page**********************************

	@Test
	public void AdminTestLogin1() {

		PageFactoryAdminPublisherClientListPages PUBC = PageFactory.initElements(driver,
				PageFactoryAdminPublisherClientListPages.class);

		try {

			PUBC.enterEmail();
			PUBC.enterPassword();
			PUBC.clickLoginButton();
			Thread.sleep(6000);
			driver.navigate().refresh();
			Thread.sleep(4000);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

// #*************************************Publisher Client Page**********************************

	@Test
	public void PublisherInHouse() {

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
			PUBC.AdminManagePublisherClientSearchButton();
			Thread.sleep(3000);
			PUBC.AdminManagePublisherClientByStatusActive1();
			PUBC.AdminManagePublisherClientByStatusSuspend();
			PUBC.AdminManagePublisherClientSearchButton();
			Thread.sleep(3000);
			PUBC.AdminManagePublisherClientByStatusSuspend1();
			PUBC.AdminManagePublisherClientByStatusHold();
			PUBC.AdminManagePublisherClientSearchButton();
			Thread.sleep(4000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			PUBC.AdminManagePublisherClientBySource();
			PUBC.AdminManagePublisherClientBySourceAdmin();
			PUBC.AdminManagePublisherClientSearchButton();
			Thread.sleep(3000);
			PUBC.AdminManagePublisherClientBySourceAdmin1();
			PUBC.AdminManagePublisherClientBySourceApp();
			PUBC.AdminManagePublisherClientSearchButton();
			Thread.sleep(3000);
			PUBC.AdminManagePublisherClientBySourceApp1();
			PUBC.AdminManagePublisherClientBySourceOrganic();
			PUBC.AdminManagePublisherClientSearchButton();
			Thread.sleep(3000);
			PUBC.AdminManagePublisherClientBySourceOrganic1();
			PUBC.AdminManagePublisherClientBySourceInfoAds();
			PUBC.AdminManagePublisherClientSearchButton();
			Thread.sleep(3000);
			PUBC.AdminManagePublisherClientBySourceInfoAds1();
			PUBC.AdminManagePublisherClientBySourceUSAds();
			PUBC.AdminManagePublisherClientSearchButton();
			Thread.sleep(3000);
			PUBC.AdminManagePublisherClientBySourceUSAds1();
			PUBC.AdminManagePublisherClientBySourceExternal();
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

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
