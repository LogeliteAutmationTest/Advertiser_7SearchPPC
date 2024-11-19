package ADV7searchTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import ADV_7Search_genericPage.CommonMethod;
import Com.ADV7Search.pages.PageFactoryAdminReferralDashboardPage;

public class PageFactoryAdminReferralDashboardTest extends CommonMethod {

	public PageFactoryAdminReferralDashboardTest() throws Exception {
		super();
	}

//#*************************************Login Page**********************************

	@Test
	public void AdminTestLogin() {

		PageFactoryAdminReferralDashboardPage AD = PageFactory.initElements(driver,
				PageFactoryAdminReferralDashboardPage.class);

		try {

			AD.enterRefAdminLoginEmail();
			AD.enterRefAdminLoginPassword();
			Thread.sleep(1000);
			AD.RefAdminLoginPasswordEye();
			Thread.sleep(1000);
			AD.RefAdminLoginButton();
			Thread.sleep(4000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			AD.RefAdminGraphToday();
			AD.RefAdminGraph7Days();
			Thread.sleep(3000);
			AD.RefAdminGraphToday();
			AD.RefAdminGraph15Days();
			Thread.sleep(3000);
			AD.RefAdminGraphToday();
			AD.RefAdminGraph30Days();
			Thread.sleep(4000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			AD.RefAdminUserToday();
			AD.RefAdminUser7day();
			Thread.sleep(3000);
			AD.RefAdminUserToday();
			AD.RefAdminUser15day();
			Thread.sleep(3000);
			AD.RefAdminUserToday();
			AD.RefAdminUser30day();
			Thread.sleep(4000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			AD.RefAdminTop5Today();
			AD.RefAdminTop57day();
			Thread.sleep(3000);
			AD.RefAdminTop5Today();
			AD.RefAdminTop515day();
			Thread.sleep(3000);
			AD.RefAdminTop5Today();
			AD.RefAdminTop530day();
			Thread.sleep(4000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			AD.RefAdminByUserTotal();
			AD.RefAdminByUserInhouse();
			Thread.sleep(3000);
			AD.RefAdminByUserTotal();
			AD.RefAdminByUserPartner();
			Thread.sleep(4000);
			driver.navigate().refresh();
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

//#*************************************DashBoard Page**********************************

	@Test(enabled = false)
	public void AdminTestDashBoard() {

		PageFactoryAdminReferralDashboardPage AD = PageFactory.initElements(driver,
				PageFactoryAdminReferralDashboardPage.class);

		try {

			AD.RefAdminGraphToday();
			Thread.sleep(1000);
			AD.RefAdminGraph7Days();
			Thread.sleep(1000);
			AD.RefAdminGraphToday();
			Thread.sleep(1000);
			AD.RefAdminGraph15Days();
			Thread.sleep(1000);
			AD.RefAdminGraphToday();
			Thread.sleep(1000);
			AD.RefAdminGraph30Days();
			Thread.sleep(4000);
			driver.navigate().refresh();
			Thread.sleep(4000);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
