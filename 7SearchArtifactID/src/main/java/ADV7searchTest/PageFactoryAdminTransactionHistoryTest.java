package ADV7searchTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import ADV_7Search_genericPage.CommonMethod;
import Com.ADV7Search.pages.PageFactoryAdminTransactionHistoryPage;

public class PageFactoryAdminTransactionHistoryTest extends CommonMethod {

	public PageFactoryAdminTransactionHistoryTest() throws Exception {
		super();
	}

// #*************************************Login Page**********************************

	@Test
	public void AdminTestLogin1() {

		PageFactoryAdminTransactionHistoryPage PR = PageFactory.initElements(driver,
				PageFactoryAdminTransactionHistoryPage.class);

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
}