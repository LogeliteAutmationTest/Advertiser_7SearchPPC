package ADV7searchTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import ADV_7Search_genericPage.CommonMethod;
import Com.ADV7Search.pages.PageFactoryAdminManualStatsLogPage;

public class PageFactoryAdminManualStatsLogTest extends CommonMethod {

	public PageFactoryAdminManualStatsLogTest() throws Exception {
		super();
	}

// #*************************************Login Page**********************************

	@Test
	public void AdminTestLogin1() {

		PageFactoryAdminManualStatsLogPage MSL = PageFactory.initElements(driver,
				PageFactoryAdminManualStatsLogPage.class);

		try {

			MSL.enterEmail();
			MSL.enterPassword();
			MSL.clickLoginButton();
			Thread.sleep(8000);
			driver.navigate().refresh();
			Thread.sleep(6000);

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

}
