package ADV7searchTest;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import ADV_7Search_genericPage.CommonMethod;
import Com.ADV7Search.pages.PageFactoryAdminAddNewUserPage;
import Com.ADV7Search.pages.PageFactoryAdminCampaign1ListPage;

public class PageFactoryAdminAddNewUserTest extends CommonMethod {

	public PageFactoryAdminAddNewUserTest() throws Exception {
		super();
	}

//#*************************************Login Page**********************************

	@Test
	public void AdminTestLogin1() {

		PageFactoryAdminCampaign1ListPage AU = PageFactory.initElements(driver,
				PageFactoryAdminCampaign1ListPage.class);

		try {

			AU.enterEmail();
			AU.enterPassword();
			AU.clickLoginButton();
			Thread.sleep(6000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0, 500)");
			Thread.sleep(2000);
			jse.executeScript("window.scrollBy(0, 500)");
			Thread.sleep(4000);
			driver.navigate().refresh();
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

//#*************************************Add New User Page**********************************

	@Test
	public void AdminTestAddUser2() {

		PageFactoryAdminAddNewUserPage AU = PageFactory.initElements(driver, PageFactoryAdminAddNewUserPage.class);

		try {

			AU.AdminAddNewUser();
			Thread.sleep(1000);
			AU.enterAdminFirstName();
			AU.enterAdminLastName();
			AU.enterAdminEnterEmail();
			Thread.sleep(1000);
			AU.AdminCountry();
			AU.AdminSelectIndia();
			AU.enterAdminPhoneNo();
			Thread.sleep(1000);
			AU.AdminCategory();
			AU.AdminselectCategory();
			Thread.sleep(1000);
			AU.enterAdminEnterAddress();
			AU.enterAdminEnterAddress2();
			AU.enterAdminEnterCity();
			AU.enterAdminEnterState();
			AU.enterAdminEnterPassword();
			Thread.sleep(1000);
			AU.AdminAccounType();
			AU.AdmincheckBox();
			// AU.AdminSaveButton();
			Thread.sleep(4000);
			driver.navigate().refresh();
			Thread.sleep(4000);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}
