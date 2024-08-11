package ADV7searchTest;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import ADV_7Search_genericPage.CommonMethod;
import Com.ADV7Search.pages.PageFactoryAdminDashboardPage;

public class PageFactoryAdminDashboardTest extends CommonMethod {

	public PageFactoryAdminDashboardTest() throws Exception {
		super();
	}

//#*************************************Login Page**********************************

	@Test
	public void AdminTestLogin1() {

		PageFactoryAdminDashboardPage AD = PageFactory.initElements(driver, PageFactoryAdminDashboardPage.class);

		try {

			AD.enterEmail();
			AD.enterPassword();
			AD.clickLoginButton();
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

//#*************************************PUBDashboard Page**********************************

	@Test
	public void AdminPUBDashboard2() throws Exception {

		PageFactoryAdminDashboardPage PD = PageFactory.initElements(driver, PageFactoryAdminDashboardPage.class);

		PD.PUBDashboard();
		Thread.sleep(2000);
		PD.PUBToday();
		PD.PUB7Day();
		Thread.sleep(3000);
		PD.PUBSelect7Day();
		PD.PUB15Day();
		Thread.sleep(3000);
		PD.PUBSelect15Day();
		PD.PUB30Day();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(4000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0, 500)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0, 500)");
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(4000);

	}

//#*************************************Notification Page**********************************

	@Test
	public void AdminNotification3() {

		PageFactoryAdminDashboardPage AN = PageFactory.initElements(driver, PageFactoryAdminDashboardPage.class);

		try {

			AN.AdminNotification();
			Thread.sleep(2000);
			AN.enterAdminNotificationSearch();
			Thread.sleep(4000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			AN.AdminNotificationDate();
			Thread.sleep(1000);
			AN.AdminNotificationDate7th();
			Thread.sleep(1000);
			AN.AdminNotificationDate19th();
			Thread.sleep(1000);
			AN.AdminNotificationSearchButton();
			Thread.sleep(2000);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
