package ADV7searchTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import ADV_7Search_genericPage.CommonMethod;
import Com.ADV7Search.pages.PageFactoryAdminReferralManagePartnerClientPage;
import Com.ADV7Search.pages.PageFactoryAdminReferralManagePartnerInhousePage;

public class PageFactoryAdminReferralManagePartnerClientTest extends CommonMethod {

	public PageFactoryAdminReferralManagePartnerClientTest() throws Exception {
		super();
	}

//#*************************************Login Page**********************************

	@Test
	public void AdminTestLogin() {

		PageFactoryAdminReferralManagePartnerClientPage MP = PageFactory.initElements(driver,
				PageFactoryAdminReferralManagePartnerClientPage.class);

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

//#*************************************Manage Partner Client Page**********************************

	@Test
	public void AdminTestManagePartnerClient() {

		PageFactoryAdminReferralManagePartnerClientPage MPI = PageFactory.initElements(driver,
				PageFactoryAdminReferralManagePartnerClientPage.class);

		try {

			MPI.RefAdminManagePartners();
			Thread.sleep(2000);
			MPI.RefAdminManagePartnersClient();
			Thread.sleep(2000);
			MPI.enterRefAdminManagePartnersClientSearch();
//				Thread.sleep(1000);
//				MPI.RefAdminManagePartnersInhouseSearchButton();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			MPI.RefAdminManagePartnersClient();
			MPI.RefAdminManagePartnersClientByCountryIndia();
			Thread.sleep(2000);
			MPI.RefAdminManagePartnersClientSearchButton();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(3000);
			MPI.RefAdminManagePartnersClientByStatus();
			MPI.RefAdminManagePartnersClientByStatusUnverified();
			Thread.sleep(1000);
			MPI.RefAdminManagePartnersClientSearchButton1();
			Thread.sleep(1000);
			MPI.RefAdminManagePartnersClientByStatusUnver();
			MPI.RefAdminManagePartnersClientByStatusActive();
			Thread.sleep(1000);
			MPI.RefAdminManagePartnersClientSearchButton1();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			MPI.RefAdminManagePartnersClientDate();
			Thread.sleep(1000);
			MPI.RefAdminManagePartnersClient10Sept();
			Thread.sleep(1000);
			MPI.RefAdminManagePartnersClient2Sept();
			Thread.sleep(2000);
			MPI.RefAdminManagePartnersClientSearchButton();

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

//#*************************************Manage Partner Client Page**********************************

	@Test(enabled = false)
	public void AdminTestManagePartnerClient1() {

		PageFactoryAdminReferralManagePartnerClientPage MPI = PageFactory.initElements(driver,
				PageFactoryAdminReferralManagePartnerClientPage.class);

		try {
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			MPI.RefAdminManagePartnersClientThreedot();
			Thread.sleep(1000);
			MPI.RefAdminManagePartnersClientThreedotHold();
			Thread.sleep(2000);
			MPI.RefAdminManagePartnersClientThreedot();
			Thread.sleep(1000);
			MPI.RefAdminManagePartnersClientThreedotSuspend();
			Thread.sleep(2000);
			driver.navigate().refresh();
			Thread.sleep(3000);
			MPI.RefAdminManagePartnersClientAdvAdd();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			MPI.RefAdminManagePartners();
			Thread.sleep(2000);
			MPI.RefAdminManagePartnersClient();
			Thread.sleep(2000);
			MPI.RefAdminManagePartnersClientPubAdd();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			MPI.RefAdminManagePartners();
			Thread.sleep(2000);
			MPI.RefAdminManagePartnersClient();
			Thread.sleep(2000);
			MPI.RefAdminManagePartnersClientThreedotMakePartner();

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
