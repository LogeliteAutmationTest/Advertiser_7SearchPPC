package ADV7searchTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import ADV_7Search_genericPage.CommonMethod;
import Com.ADV7Search.pages.PageFactoryAdminPublisherHoldListPage;

public class PageFactoryAdminPublisherHoldListTest extends CommonMethod {

	public PageFactoryAdminPublisherHoldListTest() throws Exception {
		super();
	}

// #*************************************Login Page**********************************

	@Test
	public void AdminTestLogin1() {

		PageFactoryAdminPublisherHoldListPage PUBH = PageFactory.initElements(driver,
				PageFactoryAdminPublisherHoldListPage.class);

		try {

			PUBH.enterEmail();
			PUBH.enterPassword();
			PUBH.clickLoginButton();
			Thread.sleep(6000);
			driver.navigate().refresh();
			Thread.sleep(4000);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

// #*************************************Publisher Hold Page**********************************

	@Test
	public void PublisherInHouse() {

		PageFactoryAdminPublisherHoldListPage PUBH = PageFactory.initElements(driver,
				PageFactoryAdminPublisherHoldListPage.class);

		try {

			PUBH.AdminManagePublisher();
			PUBH.AdminManagePublisherHold();
			Thread.sleep(2000);
			PUBH.enterAdminManagePublisherHoldSearch();
			PUBH.AdminManagePublisherHoldSearchButton();
			Thread.sleep(6000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			PUBH.AdminManagePublisherHoldDate();
			PUBH.AdminManagePublisherHoldDateMay1st();
			PUBH.AdminManagePublisherHoldDateMay22nd();
			Thread.sleep(2000);
			PUBH.AdminManagePublisherHoldSearchButton();

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
