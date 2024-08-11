package ADV7searchTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import ADV_7Search_genericPage.CommonMethod;
import Com.ADV7Search.pages.PageFactoryAdminManageCategoryPage;

public class PageFactoryAdminManageCategoryTest extends CommonMethod {

	public PageFactoryAdminManageCategoryTest() throws Exception {
		super();
	}

//#*************************************Login Page**********************************

	@Test
	public void AdminTestLogin1() {

		PageFactoryAdminManageCategoryPage MC = PageFactory.initElements(driver,
				PageFactoryAdminManageCategoryPage.class);

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

//#*************************************Manager Category Page**********************************

	@Test
	public void MangeCategory2() {

		PageFactoryAdminManageCategoryPage MC = PageFactory.initElements(driver,
				PageFactoryAdminManageCategoryPage.class);

		try {

			MC.AdminManagerCategory();
			Thread.sleep(2000);
			MC.enterAdminManagerCategorySearch();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			MC.AdminManagerCategoryADD();
			Thread.sleep(1000);
			MC.enterAdminManagerCategoryName();
			MC.enterAdminManagerCategoryCPM();
			MC.enterAdminManagerCategoryCPC();
			MC.enterAdminManagerCategoryCPAImp();
			MC.enterAdminManagerCategoryCPAClick();
			MC.enterAdminManagerCategoryVideoADV();
			MC.enterAdminManagerCategoryVideoPUB();
			MC.enterAdminManagerCategoryPUBCpm();
			MC.enterAdminManagerCategoryPUBCPC();
			Thread.sleep(3000);
			// MC.AdminManagerCategorySubmit();
			driver.navigate().refresh();
			Thread.sleep(4000);
			MC.AdminManagerCategoryThreeDot();
			Thread.sleep(1000);
			MC.AdminManagerCategoryEdit();
			Thread.sleep(2000);
			MC.AdminManagerCategoryUpdateSubmit();

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
