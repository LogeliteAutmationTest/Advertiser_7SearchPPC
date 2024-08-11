package ADV7searchTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import ADV_7Search_genericPage.CommonMethod;
import Com.ADV7Search.pages.PageFactoryAdminManageCountryPage;

public class PageFactoryAdminManageCountryTest extends CommonMethod {

	public PageFactoryAdminManageCountryTest() throws Exception {
		super();
	}

//#*************************************Login Page**********************************

	@Test
	public void AdminTestLogin1() {

		PageFactoryAdminManageCountryPage MC = PageFactory.initElements(driver,PageFactoryAdminManageCountryPage.class);

		try {

			MC.enterEmail();
			MC.enterPassword();
			MC.clickLoginButton();
			Thread.sleep(6000);
			driver.navigate().refresh();
			Thread.sleep(4000);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

//#*************************************Manager Country Page**********************************

	@Test
	public void AdminManageCountry2() {

		PageFactoryAdminManageCountryPage MC = PageFactory.initElements(driver,PageFactoryAdminManageCountryPage.class);

		try {

			MC.AdminManageCountry();
			Thread.sleep(1000);
			MC.enterAdminManagerCountrySearch();
			Thread.sleep(2000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			MC.AdminManagerCountrySearchAdd();
			Thread.sleep(1000);
			MC.enterAdminManagerCountrySearchAddName();
			MC.enterAdminManagerCountrySearchAddNickName();
			MC.enterAdminManagerCountryISO();
			MC.enterAdminManagerCountryISO3();
			MC.enterAdminManagerCountrynumcode();
			MC.enterAdminManagerCountryphonecode();
			MC.enterAdminManagerCountrycurrencycode();
			// MC.AdminManagerCountryAddButton();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			MC.AdminManagerCountryThreedot();
			MC.AdminManagerCountryEdit();

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
