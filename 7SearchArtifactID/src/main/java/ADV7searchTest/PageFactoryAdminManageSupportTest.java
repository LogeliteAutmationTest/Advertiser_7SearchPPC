package ADV7searchTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import ADV_7Search_genericPage.CommonMethod;
import Com.ADV7Search.pages.PageFactoryAdminManageSupportPage;

public class PageFactoryAdminManageSupportTest extends CommonMethod {

	public PageFactoryAdminManageSupportTest() throws Exception {
		super();
	}

// #*************************************Login Page**********************************

	@Test
	public void AdminTestLogin1() {

		PageFactoryAdminManageSupportPage MSP = PageFactory.initElements(driver,
				PageFactoryAdminManageSupportPage.class);

		try {

			MSP.enterEmail();
			MSP.enterPassword();
			MSP.clickLoginButton();
			Thread.sleep(9000);
			driver.navigate().refresh();
			Thread.sleep(4000);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

// #********************************************Publisher Manage Support Page**********************************

	@Test
	public void AdminTestManageSupport() {

		PageFactoryAdminManageSupportPage MSP = PageFactory.initElements(driver,
				PageFactoryAdminManageSupportPage.class);

		try {

			MSP.AdminManageSupport();
			Thread.sleep(1000);
			MSP.AdminManageSupportADV();
			Thread.sleep(2000);
			driver.navigate().refresh();
			Thread.sleep(3000);
			MSP.AdminManageSupportADVChatOpen();
			Thread.sleep(2000);
			MSP.AdminManageSupportADVChatOpenSubmit();
			Thread.sleep(2000);
			MSP.AdminManageSupportADVChatOpenBack();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			MSP.AdminManageSupportPUB();
			Thread.sleep(2000);
			MSP.AdminManageSupportPUBChatOpen();
			Thread.sleep(2000);
			MSP.AdminManageSupportPUBChatOpenSubmit();
			Thread.sleep(2000);
			MSP.AdminManageSupportPUBChatOpenBack();

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
