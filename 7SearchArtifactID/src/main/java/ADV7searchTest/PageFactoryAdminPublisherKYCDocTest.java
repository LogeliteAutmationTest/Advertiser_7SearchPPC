package ADV7searchTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import ADV_7Search_genericPage.CommonMethod;
import Com.ADV7Search.pages.PageFactoryAdminPublisherKYCDocPage;

public class PageFactoryAdminPublisherKYCDocTest extends CommonMethod {

	public PageFactoryAdminPublisherKYCDocTest() throws Exception {
		super();
	}

// #*************************************Login Page**********************************

	@Test
	public void AdminTestLogin1() {

		PageFactoryAdminPublisherKYCDocPage PUBK = PageFactory.initElements(driver,
				PageFactoryAdminPublisherKYCDocPage.class);

		try {

			PUBK.enterEmail();
			PUBK.enterPassword();
			PUBK.clickLoginButton();
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

}
