package ADV7searchTest;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import ADV_7Search_genericPage.CommonMethod;
import Com.ADV7Search.pages.PageFactoryAdminPublisherAdUnitListPage;

public class PageFactoryAdminPublisherAdUnitListTest extends CommonMethod {

	public PageFactoryAdminPublisherAdUnitListTest() throws Exception {
		super();
	}

// #*************************************Login Page**********************************

	@Test
	public void AdminTestLogin1() {

		PageFactoryAdminPublisherAdUnitListPage ADL = PageFactory.initElements(driver,
				PageFactoryAdminPublisherAdUnitListPage.class);

		try {

			ADL.enterEmail();
			ADL.enterPassword();
			ADL.clickLoginButton();
			Thread.sleep(8000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(1, 500)");
			Thread.sleep(2000);
			jse.executeScript("window.scrollBy(1, 500)");
			Thread.sleep(2000);
//			WebElement targetElement = firstScrollableElement.findElement(By.xpath("//childElementXpath"));
//			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", targetElement);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
			
// #*************************************Ad unit Page**********************************

			@Test
			public void AdminTestAdUnit() {

				PageFactoryAdminPublisherAdUnitListPage ADL = PageFactory.initElements(driver,
						PageFactoryAdminPublisherAdUnitListPage.class);

				try {
			ADL.AdminManageAdUnitList();
			Thread.sleep(2000);
			ADL.enterAdminManageAdUnitListSearch();
			Thread.sleep(6000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			ADL.AdminManageAdUnitListByCategory();
			ADL.AdminManageAdUnitListByCategoryAdultDating();
			Thread.sleep(3000);
			ADL.AdminManageAdUnitListByCategory();
			ADL.AdminManageAdUnitListByCategoryAllCategories();
			Thread.sleep(2000);
			ADL.AdminManageAdUnitListByCategory();
			ADL.AdminManageAdUnitListByCategoryCrypto();
			Thread.sleep(3000);
			ADL.AdminManageAdUnitListByCategory();
			ADL.AdminManageAdUnitListByCategoryGambling();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			ADL.AdminManageAdUnitListByAds();
			ADL.AdminManageAdUnitListByAdsText();
			Thread.sleep(3000);
			ADL.AdminManageAdUnitListByAds();
			ADL.AdminManageAdUnitListByAdsBanner();
			Thread.sleep(3000);
			ADL.AdminManageAdUnitListByAds();
			ADL.AdminManageAdUnitListByAdsVideo();
			Thread.sleep(3000);
			ADL.AdminManageAdUnitListByAds();
			ADL.AdminManageAdUnitListByAdsInPagePush();
			Thread.sleep(3000);
			ADL.AdminManageAdUnitListByAds();
			ADL.AdminManageAdUnitListByAdsNative();
			Thread.sleep(3000);
			ADL.AdminManageAdUnitListByAds();
			ADL.AdminManageAdUnitListByAdsPopunder();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			ADL.AdminManageAdUnitListByStatus();
			ADL.AdminManageAdUnitListByStatusInactive();
			Thread.sleep(3000);
			ADL.AdminManageAdUnitListByStatus();
			ADL.AdminManageAdUnitListByStatusActive();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(4000);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

// #*******************************************Manage Publisher AdUnit list Page*************************************
//
//	@Test
//	public void AdminTestAdUnitt1() throws Throwable {
//
//		PageFactoryAdminPublisherAdUnitListPage ADL = PageFactory.initElements(driver,
//				PageFactoryAdminPublisherAdUnitListPage.class);
//
//		Thread.sleep(6000);
//		driver.navigate().refresh();
//		Thread.sleep(4000);
//		ADL.enterAdminManageAdUnitListSearch();
//		Thread.sleep(6000);
//		driver.navigate().refresh();
//		Thread.sleep(4000);
//
//	}
}