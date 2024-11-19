package ADV7searchTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import ADV_7Search_genericPage.CommonMethod;
import Com.ADV7Search.pages.PageFactoryAdminReferralManageKYCPage;

public class PageFactoryAdminReferralManageKYCTest extends CommonMethod {

	public PageFactoryAdminReferralManageKYCTest() throws Exception {
		super();
	}

//#*************************************Login Page**********************************

	@Test
	public void AdminTestLogin() {

		PageFactoryAdminReferralManageKYCPage MP = PageFactory.initElements(driver,
				PageFactoryAdminReferralManageKYCPage.class);

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

//#*************************************Manage KYC Page**********************************

	@Test
	public void AdminTestManageKYC() {

		PageFactoryAdminReferralManageKYCPage KYC = PageFactory.initElements(driver,
				PageFactoryAdminReferralManageKYCPage.class);

		try {

			KYC.RefAdminManageKYC();
			Thread.sleep(2000);
			KYC.enterRefAdminManageKYCSearch();
			Thread.sleep(2000);
			driver.navigate().refresh();
			Thread.sleep(3000);
			KYC.RefAdminManageKYCByCountry();
			KYC.RefAdminManageKYCByCountryIndia();
			Thread.sleep(1000);
			KYC.RefAdminManageKYCSearchButton();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			KYC.RefAdminManageKYCByStatus();
//			KYC.RefAdminManageKYCByStatusPending();
//		    Thread.sleep(1000);
//			KYC.RefAdminManageKYCSearchButton();
//			Thread.sleep(1000);
//			KYC.RefAdminManageKYCByStatusPend();
			KYC.RefAdminManageKYCByStatusRejected();
			Thread.sleep(1000);
			KYC.RefAdminManageKYCSearchButton();
			Thread.sleep(1000);
			KYC.RefAdminManageKYCByStatusReject();
			KYC.RefAdminManageKYCByStatusApproved();
			Thread.sleep(1000);
			KYC.RefAdminManageKYCSearchButton();
			Thread.sleep(4000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			KYC.RefAdminManageKYCByUser();
			KYC.RefAdminManageKYCByUserInhouse();
			Thread.sleep(1000);
			KYC.RefAdminManageKYCSearchButton();
			Thread.sleep(1000);
			KYC.RefAdminManageKYCByUserInHou();
			KYC.RefAdminManageKYCByUserPartner();
			Thread.sleep(1000);
			KYC.RefAdminManageKYCSearchButton();
			Thread.sleep(4000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			KYC.RefAdminManageKYCDate();
			Thread.sleep(1000);
			KYC.RefAdminManageKYCDate1September();
			KYC.RefAdminManageKYCDate30September();
			Thread.sleep(1000);
			KYC.RefAdminManageKYCSearchButton();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(4000);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

//#*************************************Manage KYC Page**********************************

	@Test
	(enabled = false)
	public void AdminTestManageKYC1() {

		PageFactoryAdminReferralManageKYCPage KYC = PageFactory.initElements(driver,
				PageFactoryAdminReferralManageKYCPage.class);

		try {

			KYC.RefAdminManageKYCViewLog();
			Thread.sleep(2000);
			KYC.RefAdminManageKYCViewLogBack();
			Thread.sleep(2000);
			KYC.RefAdminManageKYCViewLog1();
			Thread.sleep(2000);
			KYC.RefAdminManageKYCViewLogBack1();
			Thread.sleep(2000);
			driver.navigate().refresh();
			Thread.sleep(3000);
			KYC.RefAdminManageKYCSelfieUpdate();
			Thread.sleep(1000);
			KYC.RefAdminManageKYCSelfieUpdateStatus();
			KYC.RefAdminManageKYCSelfieUpdateStatusAccept();
			Thread.sleep(2000);
			KYC.enterRefAdminManageKYCSelfieUpdateRemark();
			Thread.sleep(1000);
			KYC.RefAdminManageKYCIDUpdateSubmitButton();
			Thread.sleep(2000);
			KYC.RefAdminManageKYCIDUpdate();
			Thread.sleep(1000);
			KYC.RefAdminManageKYCIDUpdateStatus();
			KYC.RefAdminManageKYCIDUpdateStatusReject();
			Thread.sleep(1000);
			KYC.enterRefAdminManageKYCIDUpdateRemark();
			Thread.sleep(1000);
			KYC.RefAdminManageKYCIDUpdateSubmit();
			Thread.sleep(1000);
			KYC.RefAdminManageKYCSelfieView();
			Thread.sleep(1000);
			KYC.RefAdminManageKYCIDView();
			Thread.sleep(4000);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
