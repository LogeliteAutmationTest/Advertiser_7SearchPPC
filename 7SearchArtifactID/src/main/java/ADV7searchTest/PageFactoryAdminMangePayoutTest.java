package ADV7searchTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import ADV_7Search_genericPage.CommonMethod;
import Com.ADV7Search.pages.PageFactoryAdminMangePayoutPage;

public class PageFactoryAdminMangePayoutTest extends CommonMethod {

	public PageFactoryAdminMangePayoutTest() throws Exception {
		super();
	}

// #*************************************Login Page**********************************

	@Test
	public void AdminTestLogin1() {

		PageFactoryAdminMangePayoutPage MPO = PageFactory.initElements(driver, PageFactoryAdminMangePayoutPage.class);

		try {

			MPO.enterEmail();
			MPO.enterPassword();
			MPO.clickLoginButton();
			Thread.sleep(9000);
			driver.navigate().refresh();
			Thread.sleep(4000);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

// #********************************************Publisher Manage Payout Page**********************************

	@Test
	public void AdminTestPayout() {

		PageFactoryAdminMangePayoutPage MPO = PageFactory.initElements(driver, PageFactoryAdminMangePayoutPage.class);

		try {

			MPO.AdminManagePayout();
			Thread.sleep(1000);
			MPO.AdminManagePayoutMethod();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(3000);
			MPO.AdminManagePayoutMethodAdd();
			Thread.sleep(2000);
			MPO.enterAdminManagePayoutMethodName();
			Thread.sleep(1000);
			MPO.enterAdminManagePayoutMethodDisplayName();
			MPO.enterAdminManagePayoutMethodprocessingfee();
			Thread.sleep(1000);
			MPO.enterAdminManagePayoutMethodwithdrawl();
			MPO.enterAdminManagePayoutMethodDescription();
			Thread.sleep(1000);
			MPO.enterAdminManagePayoutMethodUploadImage();
			Thread.sleep(2000);
			MPO.AdminManagePayoutMethodAddCancel();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			MPO.AdminManagePayoutMethodThreeDot();
			Thread.sleep(1000);
			MPO.AdminManagePayoutMethodEdit();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			MPO.AdminManagePayoutPendingList();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			MPO.AdminManagePayoutReleaseList();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			MPO.AdminManagePayoutHoldList();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(4000);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
