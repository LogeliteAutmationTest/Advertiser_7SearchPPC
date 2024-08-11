package ADV7searchTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import ADV_7Search_genericPage.CommonMethod;
import Com.ADV7Search.pages.PageFactoryAdminAddNewUserPage1;

public class PageFactoryAdminAddNewUserTest1 extends CommonMethod {

	public PageFactoryAdminAddNewUserTest1() throws Exception {
		super();
	}

//#*************************************Login Page**********************************

	@Test
	public void AdminTestLogin1() {

		PageFactoryAdminAddNewUserPage1 AU = PageFactory.initElements(driver, PageFactoryAdminAddNewUserPage1.class);

		try {

			AU.enterEmail();
			AU.enterPassword();
			AU.clickLoginButton();
			Thread.sleep(6000);
			driver.navigate().refresh();
			Thread.sleep(4000);

			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

//#*************************************Add New User Page**********************************

	@Test
	public void AdminTestAddUser2() {

		PageFactoryAdminAddNewUserPage1 AU = PageFactory.initElements(driver, PageFactoryAdminAddNewUserPage1.class);

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
