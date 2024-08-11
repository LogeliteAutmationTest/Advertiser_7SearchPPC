package ADV7searchTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import ADV_7Search_genericPage.CommonMethod;
import Com.ADV7Search.pages.PageFactoryAdminManageRolePage;

public class PageFactoryAdminManageRoleTest extends CommonMethod {

	public PageFactoryAdminManageRoleTest() throws Exception {
		super();
	}

// #*************************************Login Page**********************************

	@Test
	public void AdminTestLogin1() {

		PageFactoryAdminManageRolePage MRP = PageFactory.initElements(driver, PageFactoryAdminManageRolePage.class);

		try {

			MRP.enterEmail();
			MRP.enterPassword();
			MRP.clickLoginButton();
			Thread.sleep(9000);
			driver.navigate().refresh();
			Thread.sleep(4000);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

// #********************************************Publisher Manage Role Page**********************************

	@Test
	public void AdminTestManageRole() {

		PageFactoryAdminManageRolePage MRP = PageFactory.initElements(driver, PageFactoryAdminManageRolePage.class);

		try {

			MRP.AdminManageRole();
			Thread.sleep(1000);
			MRP.enterAdminManageRoleSearch();
			Thread.sleep(5000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			MRP.AdminManageRoleAddNewRole();
			Thread.sleep(2000);
			MRP.enterAdminManageRoleName();
			Thread.sleep(1000);
			MRP.AdminManageRoleSelectADv();
			Thread.sleep(1000);
			MRP.AdminManageRoleSelectPUB();
			Thread.sleep(1000);
			// MRP.AdminManageRoleSubmit();
			MRP.AdminManageThreeDotEditBackButton();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			MRP.AdminManageThreeDot();
			Thread.sleep(1000);
			MRP.AdminManageThreeDotView();
			Thread.sleep(2000);
			MRP.AdminManageThreeDotViewCross();
			Thread.sleep(2000);
			driver.navigate().refresh();
			Thread.sleep(5000);
			MRP.AdminManageThreeDot();
			Thread.sleep(1000);
			MRP.AdminManageThreeDotEdit();
			Thread.sleep(1000);
			MRP.AdminManageThreeDotEditSelect();
			Thread.sleep(1000);
			// MRP.AdminManageThreeDotEditSubmit();
			MRP.AdminManageThreeDotEditBackButton();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(4000);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
