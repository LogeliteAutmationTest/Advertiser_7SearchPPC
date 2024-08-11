package ADV7searchTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import ADV_7Search_genericPage.CommonMethod;
import Com.ADV7Search.pages.PageFactoryAdminPaymentReportPage;

public class PageFactoryAdminPaymentReportTest extends CommonMethod {

	public PageFactoryAdminPaymentReportTest() throws Exception {
		super();
	}

//#*************************************Login Page**********************************

	@Test
	public void AdminTestLogin1() {

		PageFactoryAdminPaymentReportPage PR = PageFactory.initElements(driver,
				PageFactoryAdminPaymentReportPage.class);

		try {

			PR.enterEmail();
			PR.enterPassword();
			PR.clickLoginButton();
			Thread.sleep(6000);
			driver.navigate().refresh();
			Thread.sleep(4000);

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

}
