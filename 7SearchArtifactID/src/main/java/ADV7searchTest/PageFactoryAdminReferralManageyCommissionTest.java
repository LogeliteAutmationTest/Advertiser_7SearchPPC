package ADV7searchTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import ADV_7Search_genericPage.CommonMethod;
import Com.ADV7Search.pages.PageFactoryAdminReferralManageyCommissionPage;

public class PageFactoryAdminReferralManageyCommissionTest extends CommonMethod {

	public PageFactoryAdminReferralManageyCommissionTest() throws Exception {
		super();
	}

//#*************************************Login Page**********************************

	@Test
	public void AdminTestLogin() {

		PageFactoryAdminReferralManageyCommissionPage MP = PageFactory.initElements(driver,
				PageFactoryAdminReferralManageyCommissionPage.class);

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



//#*************************************Manage ADV Commissions Page**********************************

	@Test (enabled = false)
			
	public void AdminTestManageADVCommissions() {

		PageFactoryAdminReferralManageyCommissionPage MCADV = PageFactory.initElements(driver,
				PageFactoryAdminReferralManageyCommissionPage.class);

		try {

			MCADV.RefAdminManageCommissions();
			MCADV.RefAdminManageAdvertiserCommissions();
			Thread.sleep(1000);
			MCADV.RefAdminManageCommissionsAdd();
			Thread.sleep(1000);
			MCADV.enterRefAdminManageCommissionsAddAmount();
			MCADV.enterRefAdminManageCommissionsAddpercentage();
			Thread.sleep(1000);
//			MCADV.RefAdminManageCommissionsAddCheckbox();
//			Thread.sleep(1000);
			MCADV.RefAdminManageCommissionsAddCross();
			//MCADV.RefAdminManageADVCommissionsAddSubmit();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			MCADV.RefAdminManageADVCommissionsThreeDot();
			Thread.sleep(1000);
			MCADV.RefAdminManageADVCommissionsThreeDotDisable();
			MCADV.RefAdminManageADVCommissionsThreeDotDisableYes();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			MCADV.RefAdminManageADVCommissionsThreeDot();
			Thread.sleep(1000);
			MCADV.RefAdminManageADVCommissionsThreeDotEdit();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			MCADV.enterRefAdminManageADVCommissionsEditAmount();
			MCADV.enterRefAdminManageADVCommissionsEditPercentage(); 
			Thread.sleep(1000);
			MCADV.RefAdminManageADVCommissionsEditCheckbox();  
			Thread.sleep(1000);
			MCADV.RefAdminManageADVCommissionsEditAddCross(); 
			//MCADV.RefAdminManageADVCommissionsAddSubmit();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
//#*************************************Manage PUB Commissions Page**********************************


	@Test 
	//(enabled = false)
	public void AdminTestManagePUBCommissions() {

		PageFactoryAdminReferralManageyCommissionPage MCADV = PageFactory.initElements(driver,
				PageFactoryAdminReferralManageyCommissionPage.class);

		try {

			MCADV.RefAdminManageCommissions();
			Thread.sleep(1000);
			MCADV.RefAdminManagePUBCommissions();
			Thread.sleep(2000);
			MCADV.RefAdminManagePUBCommissionsAdd();
			Thread.sleep(1000);
			MCADV.enterRefAdminManagePUBCommissionsAddAmount();
			MCADV.enterRefAdminManagePUBCommissionsAddpercentage();
			Thread.sleep(1000);
//			MCADV.RefAdminManagePUBCommissionsAddCheckbox();
//			Thread.sleep(1000);
			MCADV.RefAdminManagePUBCommissionsAddCross();
			//MCADV.RefAdminManagePUBCommissionsAddSubmit();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			MCADV.RefAdminManagePUBCommissionsThreeDot();
			Thread.sleep(1000);
			MCADV.RefAdminManagePUBCommissionsThreeDotDisable();
			MCADV.RefAdminManagePUBCommissionsThreeDotDisableYes();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			MCADV.RefAdminManagePUBCommissionsThreeDot();
			Thread.sleep(1000);
			MCADV.RefAdminManagePUBCommissionsThreeDotEdit();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			MCADV.enterRefAdminManagePUBCommissionsEditAmount();
			MCADV.enterRefAdminManagePUBCommissionsEditPercentage(); 
			Thread.sleep(1000);
			MCADV.RefAdminManagePUBCommissionsEditCheckbox();  
			Thread.sleep(1000);
			MCADV.RefAdminManagePUBCommissionsEditAddCross(); 
			//MCADV.RefAdminManagePUBCommissionsEditSubmit();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
