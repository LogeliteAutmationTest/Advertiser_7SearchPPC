package ADV7searchTest;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import ADV_7Search_genericPage.CommonMethod;
import Com.ADV7Search.pages.PageFactoryAdminPublisherWebsiteListPage;

public class PageFactoryAdminPublisherWebsiteListTest extends CommonMethod {

	public PageFactoryAdminPublisherWebsiteListTest() throws Exception {
		super();
	}

// #*************************************Login Page**********************************

	@Test
	public void AdminTestLogin1() {

		PageFactoryAdminPublisherWebsiteListPage WL = PageFactory.initElements(driver,
				PageFactoryAdminPublisherWebsiteListPage.class);

		try {

			WL.enterEmail();
			WL.enterPassword();
			WL.clickLoginButton();
			Thread.sleep(6000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(1, 500)");
			Thread.sleep(2000);
			jse.executeScript("window.scrollBy(1, 500)");
			Thread.sleep(2000);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

// #*******************************************Manage Publisher Web site list Page*************************************

	@Test
	public void AdminTestWebsite() {

		PageFactoryAdminPublisherWebsiteListPage WL = PageFactory.initElements(driver,
				PageFactoryAdminPublisherWebsiteListPage.class);

		try {

			WL.AdminManageWebsiteList();
			Thread.sleep(1000);
			WL.enterAdminManageWebsiteListSearch();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			WL.AdminManageWebsiteListByCategory();
			WL.AdminManageWebsiteListByCategoryAdultDating();
			WL.AdminManageWebsiteListByCategory();
			WL.AdminManageWebsiteListByCategoryAllCategories();
			WL.AdminManageWebsiteListByCategory();
			WL.AdminManageWebsiteListByCategoryCrypto();
			WL.AdminManageWebsiteListByCategory();
			WL.AdminManageWebsiteListByCategoryGambling();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			WL.AdminManageWebsiteListByStatus();
			WL.AdminManageWebsiteListByStatusApproved();
			WL.AdminManageWebsiteListByStatus();
			WL.AdminManageWebsiteListByStatusHold();
			WL.AdminManageWebsiteListByStatus();
			WL.AdminManageWebsiteListByStatusInReview();
			WL.AdminManageWebsiteListByStatus();
			WL.AdminManageWebsiteListByStatusRejected();
			WL.AdminManageWebsiteListByStatus();
			WL.AdminManageWebsiteListByStatusSuspended();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			WL.AdminManageWebsiteListByOperator();
			WL.AdminManageWebsiteListByOperatorClient();
			WL.AdminManageWebsiteListByOperator();
			WL.AdminManageWebsiteListByOperatorInhouse();

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
