package ADV7searchTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import ADV_7Search_genericPage.CommonMethod;
import Com.ADV7Search.pages.PageFactoryAdminManageAppVersionPage;
import Com.ADV7Search.pages.PageFactoryAdminManageCheckoutPage;

public class PageFactoryAdminManageCheckoutTest extends CommonMethod {

	public PageFactoryAdminManageCheckoutTest() throws Exception {
		super();
	}

// #*************************************Login Page**********************************

	@Test
	public void AdminTestLogin1() {

		PageFactoryAdminManageCheckoutPage MCO = PageFactory.initElements(driver,
				PageFactoryAdminManageCheckoutPage.class);

		try {

			MCO.enterEmail();
			MCO.enterPassword();
			MCO.clickLoginButton();
			Thread.sleep(9000);
			driver.navigate().refresh();
			Thread.sleep(4000);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

// #********************************************Publisher Manage Checkout Page**********************************

	@Test
	public void AdminTestManageCheckout() {

		PageFactoryAdminManageCheckoutPage MCO = PageFactory.initElements(driver,
				PageFactoryAdminManageCheckoutPage.class);

		try {

			MCO.AdminManageCheckout();
			Thread.sleep(1000);
			MCO.AdminManageContent();
			Thread.sleep(1000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			MCO.AdminManageContentThreeDot();
			Thread.sleep(1000);
			MCO.AdminManageContentEdit();
			Thread.sleep(2000);
//			MCO.AdminManageContentSubmitButton();
//			Thread.sleep(1000);
			MCO.AdminManageContentCross();
			Thread.sleep(2000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			MCO.AdminManagePaymentGateway();
			Thread.sleep(3000);
			MCO.AdminManagePaymentGatewayAdd();
			Thread.sleep(1000);
			MCO.enterAdminManagePaymentGatewayTitle();
			MCO.enterAdminManagePaymentGatewaySubTitle();
			Thread.sleep(1000);
			MCO.enterAdminManagePaymentGatewayUploadImage();
			Thread.sleep(1000);
			// MCO.AdminManagePaymentGatewaySubmitButton();
			MCO.AdminManagePaymentGatewaycross();
			Thread.sleep(2000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			MCO.AdminManagePaymentGatewayThreeDot();
			MCO.AdminManagePaymentGatewayEdit();
			Thread.sleep(1000);
			MCO.AdminManagePaymentGatewayEditCross();

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
