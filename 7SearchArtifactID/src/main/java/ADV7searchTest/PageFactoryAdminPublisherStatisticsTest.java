package ADV7searchTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import ADV_7Search_genericPage.CommonMethod;
import Com.ADV7Search.pages.PageFactoryAdminPublisherStatisticsPage;

public class PageFactoryAdminPublisherStatisticsTest extends CommonMethod {

	public PageFactoryAdminPublisherStatisticsTest() throws Exception {
		super();
	}

// #*************************************Login Page**********************************

	@Test
	public void AdminTestLogin1() {

		PageFactoryAdminPublisherStatisticsPage PS = PageFactory.initElements(driver,
				PageFactoryAdminPublisherStatisticsPage.class);

		try {

			PS.enterEmail();
			PS.enterPassword();
			PS.clickLoginButton();
			Thread.sleep(8000);
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
//			PS.AdminManageStatisticsFilteredBy();
//			PS.AdminManageStatisticsSearchButton();
//			Thread.sleep(3000);
//			driver.navigate().refresh();
//			Thread.sleep(4000);
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

}
