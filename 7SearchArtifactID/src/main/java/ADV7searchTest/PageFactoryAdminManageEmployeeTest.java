package ADV7searchTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import ADV_7Search_genericPage.CommonMethod;
import Com.ADV7Search.pages.PageFactoryAdminManageEmployeePage;

public class PageFactoryAdminManageEmployeeTest extends CommonMethod {

	public PageFactoryAdminManageEmployeeTest() throws Exception {
		super();
	}

// #*************************************Login Page**********************************

	@Test
	public void AdminTestLogin1() {

		PageFactoryAdminManageEmployeePage ME = PageFactory.initElements(driver,
				PageFactoryAdminManageEmployeePage.class);

		try {

			ME.enterEmail();
			ME.enterPassword();
			ME.clickLoginButton();
			Thread.sleep(9000);
			driver.navigate().refresh();
			Thread.sleep(4000);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

// #********************************************Publisher Manage Employee Page**********************************

	@Test
	public void AdminTestManageEmployee() {

		PageFactoryAdminManageEmployeePage ME = PageFactory.initElements(driver,
				PageFactoryAdminManageEmployeePage.class);

		try {

			ME.AdminManageEmployee();
			Thread.sleep(2000);
			ME.enterAdminManageEmployeeSearch();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			ME.AdminManageEmployeeByStatus();
			ME.AdminManageEmployeeByStatusActive();
			Thread.sleep(2000);
			ME.AdminManageEmployeeByStatus();
			ME.AdminManageEmployeeByStatusInActive();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			ME.AdminManageEmployeeAddEmployee();
			Thread.sleep(2000);
			ME.enterAdminManageEmployeeAddEmployeeName();
			ME.enterAdminManageEmployeeAddUserName();
			Thread.sleep(1000);
			ME.AdminManageEmployeeAddUserRoleId();
			ME.AdminManageEmployeeAddUserRoleIDADVpannel();
			Thread.sleep(1000);
			ME.enterAdminManageEmployeeAddEmailId();
			ME.enterAdminManageEmployeeAddPassword();
			Thread.sleep(2000);
			ME.AdminManageEmployeeAddSubmit();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			ME.AdminManageEmployeeThreeDot();
			Thread.sleep(1000);
			ME.AdminManageEmployeeThreeDotEdit();
			Thread.sleep(1000);
			ME.AdminManageEmployeeThreeDotEditUpdate();

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
