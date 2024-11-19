package ADV7searchTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import ADV_7Search_genericPage.CommonMethod;
import Com.ADV7Search.pages.PageFactoryAdminReferralManagePartnerInhousePage;

public class PageFactoryAdminReferralManagePartnerInhouseTest extends CommonMethod {

	public PageFactoryAdminReferralManagePartnerInhouseTest() throws Exception {
		super();
	}

//#*************************************Login Page**********************************

	@Test
	public void AdminTestLogin() {

		PageFactoryAdminReferralManagePartnerInhousePage MP = PageFactory.initElements(driver,
				PageFactoryAdminReferralManagePartnerInhousePage.class);

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

//#*************************************Login Page**********************************

	@Test
	public void AdminTestLogin1() {

		PageFactoryAdminReferralManagePartnerInhousePage MPI = PageFactory.initElements(driver,
				PageFactoryAdminReferralManagePartnerInhousePage.class);

		try {

			MPI.RefAdminManagePartners();
			Thread.sleep(2000);
			MPI.RefAdminManagePartnersInhouse();
			Thread.sleep(2000);
			MPI.enterRefAdminManagePartnersInhouseSearch();
//			Thread.sleep(1000);
//			MPI.RefAdminManagePartnersInhouseSearchButton();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			MPI.RefAdminManagePartnersInhouseByCountry();
			MPI.RefAdminManagePartnersInhouseByCountryBrazil();
			Thread.sleep(2000);
			MPI.RefAdminManagePartnersInhouseSearchButton();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(3000);
			MPI.RefAdminManagePartnersInhouseByStatus();
			MPI.RefAdminManagePartnersInhouseByStatusUnverified();
			Thread.sleep(1000);
			MPI.RefAdminManagePartnersInhouseSearchButton1();
			Thread.sleep(1000);
			MPI.RefAdminManagePartnersInhouseByStatusUnver();
			MPI.RefAdminManagePartnersInhouseByStatusActive();
			Thread.sleep(1000);
			MPI.RefAdminManagePartnersInhouseSearchButton1();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			MPI.RefAdminManagePartnersInhouseDate();
			Thread.sleep(1000);
			MPI.RefAdminManagePartnersInhouse10Sept();
			Thread.sleep(1000);
			MPI.RefAdminManagePartnersInhouse2Sept();
			Thread.sleep(2000);
			MPI.RefAdminManagePartnersInhouseSearchButton();

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
//#*************************************Login Page**********************************

		@Test
		(enabled = false)
		public void AdminTestLogin2() {

			PageFactoryAdminReferralManagePartnerInhousePage MPI = PageFactory.initElements(driver,
					PageFactoryAdminReferralManagePartnerInhousePage.class);

			try {
				Thread.sleep(3000);
				driver.navigate().refresh();
				Thread.sleep(4000);
				MPI.RefAdminManagePartnersInhouseThreedot();
				Thread.sleep(1000);
				MPI.RefAdminManagePartnersInhouseThreedotHold();
				Thread.sleep(2000);
				MPI.RefAdminManagePartnersInhouseThreedot();
				Thread.sleep(1000);
				MPI.RefAdminManagePartnersInhouseThreedotSuspend();
				Thread.sleep(2000);
				driver.navigate().refresh();
				Thread.sleep(3000);
				MPI.RefAdminManagePartnersInhouseAdvAdd();
				Thread.sleep(3000);
				driver.navigate().refresh();
				Thread.sleep(4000);
				MPI.RefAdminManagePartners();
				Thread.sleep(2000);
				MPI.RefAdminManagePartnersInhouse();
				Thread.sleep(2000);
				MPI.RefAdminManagePartnersInhousePubAdd(); 
				Thread.sleep(3000);
				driver.navigate().refresh();
				Thread.sleep(4000);
				MPI.RefAdminManagePartners();
				Thread.sleep(2000);
				MPI.RefAdminManagePartnersInhouse();
				Thread.sleep(2000);
				MPI.RefAdminManagePartnersInhouseThreedotMakePartner();
	
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

}
