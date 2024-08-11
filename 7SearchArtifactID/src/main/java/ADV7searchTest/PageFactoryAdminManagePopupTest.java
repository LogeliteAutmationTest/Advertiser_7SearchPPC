package ADV7searchTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import ADV_7Search_genericPage.CommonMethod;
import Com.ADV7Search.pages.PageFactoryAdminManagePopupPage;

public class PageFactoryAdminManagePopupTest extends CommonMethod {

	public PageFactoryAdminManagePopupTest() throws Exception {
		super();
	}

// #*************************************Login Page**********************************

	@Test
	public void AdminTestLogin1() {

		PageFactoryAdminManagePopupPage POP = PageFactory.initElements(driver,
				PageFactoryAdminManagePopupPage.class);

		try {

			POP.enterEmail();
			POP.enterPassword();
			POP.clickLoginButton();
			Thread.sleep(9000);
			driver.navigate().refresh();
			Thread.sleep(4000);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

// #********************************************Publisher Manage PopUp Page**********************************

	@Test
	public void AdminTestManagePopUp() {

		PageFactoryAdminManagePopupPage POP = PageFactory.initElements(driver,
				PageFactoryAdminManagePopupPage.class);


		try {

			POP.AdminManagePopUp();
			Thread.sleep(2000);
			POP.AdminManagePopUpADVcongThreeDot();
			Thread.sleep(1000);
			POP.AdminManagePopUpADVcongThreeDotEdit();
			Thread.sleep(3000);
//			POP.AdminManagePopUpADVcongThreeDotSubmit();
//			Thread.sleep(2000);
			POP.AdminManagePopUpADVcongThreeDotCross();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			POP.AdminManagePopUpADVBalanceThreeDot();
			Thread.sleep(1000);
			POP.AdminManagePopUpADVBalanceThreeDotEdit();
			Thread.sleep(3000);
//			POP.AdminManagePopUpADVBalanceThreeDotEditSubmit();
//			Thread.sleep(2000);
			POP.AdminManagePopUpADVBalanceThreeDotEditCross();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			POP.AdminManagePopUpPUBCongThreeDot();
			Thread.sleep(1000);
			POP.AdminManagePopUpPUBCongThreeDotEdit();
			Thread.sleep(3000);
//			POP.AdminManagePopUpPUBCongThreeDotEditSubmit();
//			Thread.sleep(2000);
			POP.AdminManagePopUpPUBCongThreeDotEditCross();

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
		

}
