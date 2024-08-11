package ADV7searchTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import ADV_7Search_genericPage.CommonMethod;
import Com.ADV7Search.pages.PageFactoryAdminManageMessengerPage;


public class PageFactoryAdminManageMessengerTest extends CommonMethod {

	public PageFactoryAdminManageMessengerTest() throws Exception {
		super();
	}
	
// #*************************************Login Page**********************************

		@Test
		public void AdminTestLogin1() {

			PageFactoryAdminManageMessengerPage MM = PageFactory.initElements(driver, PageFactoryAdminManageMessengerPage.class);

			try {

				MM.enterEmail();
				MM.enterPassword();
				MM.clickLoginButton();
				Thread.sleep(9000);
				driver.navigate().refresh();
				Thread.sleep(4000);

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

// #********************************************Publisher Manage Messenger Page**********************************

		@Test
		public void AdminTestManageMessenger() {

			PageFactoryAdminManageMessengerPage MM = PageFactory.initElements(driver, PageFactoryAdminManageMessengerPage.class);

	
			try {

				MM.AdminManageMessenger();
				Thread.sleep(2000);
				MM.enterAdminManageMessengerSearch();
				Thread.sleep(3000);
				driver.navigate().refresh();
				Thread.sleep(4000);
				MM.AdminManageMessengerStatus();
				MM.AdminManageMessengerStatusActive();
				Thread.sleep(3000);
				MM.AdminManageMessengerStatus();
				MM.AdminManageMessengerStatusInActive();
				Thread.sleep(3000);
				driver.navigate().refresh();
				Thread.sleep(4000);
				MM.AdminManageMessengerAdd();
				Thread.sleep(1000);
				MM.enterAdminManageMessengerEnterName();
				//MM.AdminManageMessengerSubmitButton();
				MM.AdminManageMessengerAddCross();
				Thread.sleep(3000);
				driver.navigate().refresh();
				Thread.sleep(4000);
				MM.AdminManageMessengerThreeDotNone();
				Thread.sleep(1000);
//				MM.AdminManageMessengerThreeDotNoneInActive();
//				Thread.sleep(2000);
//				MM.AdminManageMessengerThreeDotNone();
//				Thread.sleep(1000);
				MM.AdminManageMessengerThreeDotNoneEdit();
				Thread.sleep(2000);
				MM.AdminManageMessengerThreeDotNoneUpdateButton();
				Thread.sleep(3000);
				driver.navigate().refresh();
				Thread.sleep(4000);
				MM.AdminManageMessengerThreeDotNone();
				Thread.sleep(1000);
				MM.AdminManageMessengerThreeDotNoneEdit();
				Thread.sleep(2000);
				MM.AdminManageMessengerThreeDotNoneCross();

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	

}
