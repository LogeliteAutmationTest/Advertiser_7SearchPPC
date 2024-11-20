package ADV7searchTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import ADV_7Search_genericPage.CommonMethod;
import Com.ADV7Search.pages.PageFactoryAdminReferralViewReportPage;

public class PageFactoryAdminReferralViewReportTest extends CommonMethod {

	public PageFactoryAdminReferralViewReportTest() throws Exception {
		super();
	}

//#*************************************Login Page**********************************

	@Test
	public void AdminTestLogin() {

		PageFactoryAdminReferralViewReportPage MP = PageFactory.initElements(driver,
				PageFactoryAdminReferralViewReportPage.class);

		try {

			MP.enterRefAdminLoginEmail();
			MP.enterRefAdminLoginPassword();
			Thread.sleep(1000);
			MP.RefAdminLoginPasswordEye();
			Thread.sleep(1000);
			MP.RefAdminLoginButton();
			Thread.sleep(4000);
			driver.navigate().refresh();
			Thread.sleep(4000);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

//#*************************************View Report Page**********************************

	@Test
	public void AdminTestViewReport() {

		PageFactoryAdminReferralViewReportPage VR = PageFactory.initElements(driver,
				PageFactoryAdminReferralViewReportPage.class);

		try {

			VR.RefAdminViewReport();
			Thread.sleep(2000);
			VR.enterRefAdminViewReportSearch();
			Thread.sleep(1000);
			VR.RefAdminViewReportByAccount();
			VR.RefAdminViewReportByAccountAdvertiser();
			VR.RefAdminViewReportByUserSearchButton();
			Thread.sleep(2000);
			VR.RefAdminViewReportByAccountADV();
			VR.RefAdminViewReportByAccountPublisher();
			VR.RefAdminViewReportByUserSearchButton();
			Thread.sleep(2000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			VR.RefAdminViewReportByUser();
			VR.RefAdminViewReportByUserInhouse();
			Thread.sleep(1000);
			VR.RefAdminViewReportByUserSearchButton();
			Thread.sleep(2000);
			VR.RefAdminViewReportByUserINh();
			VR.RefAdminViewReportByUserPartner();
			Thread.sleep(1000);
			VR.RefAdminViewReportByUserSearchButton();
			Thread.sleep(2000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			VR.RefAdminViewReportByUserDate();
			Thread.sleep(1000);
			VR.RefAdminViewReportByUserDate1Sept();
			VR.RefAdminViewReportByUserDate25Sept();
			Thread.sleep(1000);
			VR.RefAdminViewReportByUserSearchButton();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			VR.RefAdminViewReportByAccountPagenation();
			VR.RefAdminViewReportByAccountPagenation500();
			Thread.sleep(4000);
			driver.navigate().refresh();
			Thread.sleep(4000);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
