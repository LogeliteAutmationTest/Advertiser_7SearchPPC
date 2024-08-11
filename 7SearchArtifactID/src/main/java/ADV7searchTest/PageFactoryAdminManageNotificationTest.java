package ADV7searchTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import ADV_7Search_genericPage.CommonMethod;
import Com.ADV7Search.pages.PageFactoryAdminManageNotificationPage;

public class PageFactoryAdminManageNotificationTest extends CommonMethod {

	public PageFactoryAdminManageNotificationTest() throws Exception {
		super();
	}

// #*************************************Login Page**********************************

	@Test
	public void AdminTestLogin1() {

		PageFactoryAdminManageNotificationPage MN = PageFactory.initElements(driver,
				PageFactoryAdminManageNotificationPage.class);

		try {

			MN.enterEmail();
			MN.enterPassword();
			MN.clickLoginButton();
			Thread.sleep(9000);
			driver.navigate().refresh();
			Thread.sleep(4000);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

// #********************************************Publisher Manage Notifications Page**********************************

	@Test
	public void AdminTestManageNotifications() {

		PageFactoryAdminManageNotificationPage MN = PageFactory.initElements(driver,
				PageFactoryAdminManageNotificationPage.class);

		try {

			MN.AdminManageNotifications();
			Thread.sleep(2000);
			MN.enterAdminManageNotificationsSearch();
			Thread.sleep(4000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			MN.AdminManageNotificationsType();
			MN.AdminManageNotificationsTypeNotifications();
			Thread.sleep(2000);
			MN.AdminManageNotificationsType();
			MN.AdminManageNotificationsTypeOffers();
			Thread.sleep(4000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			MN.AdminManageNotificationsByUser();
			MN.AdminManageNotificationsByUserADV();
			Thread.sleep(2000);
			MN.AdminManageNotificationsByUser();
			MN.AdminManageNotificationsTypePUB();
			Thread.sleep(4000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			MN.AdminManageNotificationsAdd();
			Thread.sleep(2000);
			MN.AdminManageNotificationsSubmitButton();
			Thread.sleep(4000);
			driver.navigate().refresh();
			Thread.sleep(4000);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
