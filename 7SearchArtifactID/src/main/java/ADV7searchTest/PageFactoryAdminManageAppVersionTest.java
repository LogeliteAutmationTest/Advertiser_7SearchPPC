package ADV7searchTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import ADV_7Search_genericPage.CommonMethod;
import Com.ADV7Search.pages.PageFactoryAdminManageAppVersionPage;

public class PageFactoryAdminManageAppVersionTest extends CommonMethod {

	public PageFactoryAdminManageAppVersionTest() throws Exception {
		super();
	}

// #*************************************Login Page**********************************

	@Test
	public void AdminTestLogin1() {

		PageFactoryAdminManageAppVersionPage AV = PageFactory.initElements(driver,
				PageFactoryAdminManageAppVersionPage.class);

		try {

			AV.enterEmail();
			AV.enterPassword();
			AV.clickLoginButton();
			Thread.sleep(9000);
			driver.navigate().refresh();
			Thread.sleep(4000);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

// #********************************************Publisher Manage Version Page**********************************

	@Test
	public void AdminTestManageVersion() {

		PageFactoryAdminManageAppVersionPage AV = PageFactory.initElements(driver,
				PageFactoryAdminManageAppVersionPage.class);

		try {

			AV.AdminManageAppVersion();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			AV.AdminManageAppVersionThreeDot();
			Thread.sleep(2000);
			AV.AdminManageAppVersionEdit();
			Thread.sleep(2000);
			AV.AdminManageAppVersionCross();

		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}