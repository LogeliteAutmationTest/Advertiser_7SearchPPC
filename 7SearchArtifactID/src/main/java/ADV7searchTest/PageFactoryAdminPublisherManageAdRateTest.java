package ADV7searchTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import ADV_7Search_genericPage.CommonMethod;
import Com.ADV7Search.pages.PageFactoryAdminPublisherManageAdRatePage;

public class PageFactoryAdminPublisherManageAdRateTest extends CommonMethod {

	public PageFactoryAdminPublisherManageAdRateTest() throws Exception {
		super();
	}

// #*************************************Login Page**********************************

	@Test
	public void AdminTestLogin1() {

		PageFactoryAdminPublisherManageAdRatePage AdRate = PageFactory.initElements(driver,
				PageFactoryAdminPublisherManageAdRatePage.class);

		try {

			AdRate.enterEmail();
			AdRate.enterPassword();
			AdRate.clickLoginButton();
			Thread.sleep(6000);
			driver.navigate().refresh();
			Thread.sleep(4000);

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
}