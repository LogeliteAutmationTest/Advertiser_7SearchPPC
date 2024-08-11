package All_Master_Pages_7Search;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import ADV_7Search_genericPage.CommonMethod;
import Com.ADV7Search.pages.PageFactoryAdminManageAgentsPage;
import Com.ADV7Search.pages.PageFactoryAdminManageAppVersionPage;
import Com.ADV7Search.pages.PageFactoryAdminManageCheckoutPage;
import Com.ADV7Search.pages.PageFactoryAdminManageEmployeePage;
import Com.ADV7Search.pages.PageFactoryAdminManageHeaderMessagePage;
import Com.ADV7Search.pages.PageFactoryAdminManageMessengerPage;
import Com.ADV7Search.pages.PageFactoryAdminManageNotificationPage;
import Com.ADV7Search.pages.PageFactoryAdminManagePopupPage;
import Com.ADV7Search.pages.PageFactoryAdminManageRolePage;
import Com.ADV7Search.pages.PageFactoryAdminManageSupportPage;

public class PageFactory_Master6_AdminOther_Test extends CommonMethod {

	public PageFactory_Master6_AdminOther_Test() throws Exception {
		super();
	}

// #*************************************Login Page**********************************

	@Test
	public void AdminTestLogin1() {

		PageFactoryAdminManageEmployeePage ME = PageFactory.initElements(driver,
				PageFactoryAdminManageEmployeePage.class);

		try {

			ME.enterEmail();
			ME.enterPassword();
			ME.clickLoginButton();
			Thread.sleep(9000);
			driver.navigate().refresh();
			Thread.sleep(4000);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

// #********************************************Publisher Manage Employee Page**********************************

	@Test
	public void AdminTestManageEmployee() {

		PageFactoryAdminManageEmployeePage ME = PageFactory.initElements(driver,
				PageFactoryAdminManageEmployeePage.class);

		try {

			ME.AdminManageEmployee();
			Thread.sleep(2000);
			ME.enterAdminManageEmployeeSearch();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			ME.AdminManageEmployeeByStatus();
			ME.AdminManageEmployeeByStatusActive();
			Thread.sleep(2000);
			ME.AdminManageEmployeeByStatus();
			ME.AdminManageEmployeeByStatusInActive();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			ME.AdminManageEmployeeAddEmployee();
			Thread.sleep(2000);
			ME.enterAdminManageEmployeeAddEmployeeName();
			ME.enterAdminManageEmployeeAddUserName();
			Thread.sleep(1000);
			ME.AdminManageEmployeeAddUserRoleId();
			ME.AdminManageEmployeeAddUserRoleIDADVpannel();
			Thread.sleep(1000);
			ME.enterAdminManageEmployeeAddEmailId();
			ME.enterAdminManageEmployeeAddPassword();
			Thread.sleep(2000);
			ME.AdminManageEmployeeAddSubmit();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			ME.AdminManageEmployeeThreeDot();
			Thread.sleep(1000);
			ME.AdminManageEmployeeThreeDotEdit();
			Thread.sleep(1000);
			ME.AdminManageEmployeeThreeDotEditUpdate();

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

// #********************************************Publisher Manage Agents Page**********************************

	@Test
	public void AdminTestManageAgent() {

		PageFactoryAdminManageAgentsPage MA = PageFactory.initElements(driver, PageFactoryAdminManageAgentsPage.class);

		try {

			MA.AdminManageAgents();
			Thread.sleep(3000);
			MA.enterAdminManageAgentsSearch();
			Thread.sleep(4000);
			MA.AdminManageAgentsThreeDot();
			Thread.sleep(1000);
			MA.AdminManageAgentsEditAgent();
			Thread.sleep(1000);
			MA.AdminManageAgentsEditUpdate();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			MA.AdminManageAgentsADDAgent();
			Thread.sleep(2000);
			MA.enterAdminManageAgentsEnterName();
			MA.enterAdminManageAgentsEnterEmail();
			MA.enterAdminManageAgentsSkypeId();
			MA.enterAdminManageAgentsTelegramId();
			MA.enterAdminManageAgentsContactNo();
			Thread.sleep(1000);
			MA.enterAdminManageAgentsImage();
			MA.AdminManageAgentsCropImage();
			Thread.sleep(2000);
			// MA.AdminManageAgentsSubmit();
			MA.AdminManageAgentsCrossCut();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(5000);
			MA.enterAdminManageAgentsSearch1();
			Thread.sleep(4000);
			MA.AdminManageAgentsThreeDot1();
			Thread.sleep(1000);
			MA.AdminManageAgentsAssignClients();
			Thread.sleep(1000);
			MA.enterAdminManageAgentsAssignClientSearch();
			Thread.sleep(2000);
			MA.AdminManageAgentsSelectClient();
			Thread.sleep(1000);
			// MA.AdminManageAgentAssignClientButton();
			// Thread.sleep(1000);
			MA.AdminManageAgentsAssignClientBackButton();

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

// #********************************************Publisher Manage Version Page**********************************

	@Test
	public void AdminTestManageVersion() {

		PageFactoryAdminManageAppVersionPage AV = PageFactory.initElements(driver,
				PageFactoryAdminManageAppVersionPage.class);

		try {

			AV.AdminManageAppVersion();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			AV.AdminManageAppVersionThreeDot();
			Thread.sleep(2000);
			AV.AdminManageAppVersionEdit();
			Thread.sleep(2000);
			AV.AdminManageAppVersionCross();

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
//				MCO.AdminManageContentSubmitButton();
//				Thread.sleep(1000);
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

// #********************************************Publisher Manage Role Page**********************************

	@Test
	public void AdminTestManageRole() {

		PageFactoryAdminManageRolePage MRP = PageFactory.initElements(driver, PageFactoryAdminManageRolePage.class);

		try {

			MRP.AdminManageRole();
			Thread.sleep(1000);
			MRP.enterAdminManageRoleSearch();
			Thread.sleep(5000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			MRP.AdminManageRoleAddNewRole();
			Thread.sleep(2000);
			MRP.enterAdminManageRoleName();
			Thread.sleep(1000);
			MRP.AdminManageRoleSelectADv();
			Thread.sleep(1000);
			MRP.AdminManageRoleSelectPUB();
			Thread.sleep(1000);
			// MRP.AdminManageRoleSubmit();
			MRP.AdminManageThreeDotEditBackButton();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			MRP.AdminManageThreeDot();
			Thread.sleep(1000);
			MRP.AdminManageThreeDotView();
			Thread.sleep(2000);
			MRP.AdminManageThreeDotViewCross();
			Thread.sleep(2000);
			driver.navigate().refresh();
			Thread.sleep(5000);
			MRP.AdminManageThreeDot();
			Thread.sleep(1000);
			MRP.AdminManageThreeDotEdit();
			Thread.sleep(1000);
			MRP.AdminManageThreeDotEditSelect();
			Thread.sleep(1000);
			// MRP.AdminManageThreeDotEditSubmit();
			MRP.AdminManageThreeDotEditBackButton();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(4000);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

// #********************************************Publisher Manage Messenger Page**********************************

	@Test
	public void AdminTestManageMessenger() {

		PageFactoryAdminManageMessengerPage MM = PageFactory.initElements(driver,
				PageFactoryAdminManageMessengerPage.class);

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
			// MM.AdminManageMessengerSubmitButton();
			MM.AdminManageMessengerAddCross();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			MM.AdminManageMessengerThreeDotNone();
			Thread.sleep(1000);
//						MM.AdminManageMessengerThreeDotNoneInActive();
//						Thread.sleep(2000);
//						MM.AdminManageMessengerThreeDotNone();
//						Thread.sleep(1000);
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

// #********************************************Publisher Manage Header Message Page**********************************

	@Test
	public void AdminTestManageHeaderMessage() {

		PageFactoryAdminManageHeaderMessagePage MHM = PageFactory.initElements(driver,
				PageFactoryAdminManageHeaderMessagePage.class);

		try {

			MHM.AdminManageHeaderMessage();
			Thread.sleep(2000);
			MHM.AdminManageHeaderMessageADVThreeDot();
			Thread.sleep(1000);
			MHM.AdminManageHeaderMessageADVThreeDotEdit();
			Thread.sleep(2000);
			// MHM.AdminManageHeaderMessageADVThreeDotEditSubmit();
			MHM.AdminManageHeaderMessageADVThreeDotEditCross();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			MHM.AdminManageHeaderMessagePUBThreeDot();
			Thread.sleep(1000);
			MHM.AdminManageHeaderMessagePUBThreeDotEdit();
			Thread.sleep(2000);
			// MHM.AdminManageHeaderMessagePUBThreeDotSubmit();
			MHM.AdminManageHeaderMessagePUBThreeDotEditCross();

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

// #********************************************Publisher Manage PopUp Page**********************************

	@Test
	public void AdminTestManagePopUp() {

		PageFactoryAdminManagePopupPage POP = PageFactory.initElements(driver, PageFactoryAdminManagePopupPage.class);

		try {

			POP.AdminManagePopUp();
			Thread.sleep(2000);
			POP.AdminManagePopUpADVcongThreeDot();
			Thread.sleep(1000);
			POP.AdminManagePopUpADVcongThreeDotEdit();
			Thread.sleep(3000);
//				POP.AdminManagePopUpADVcongThreeDotSubmit();
//				Thread.sleep(2000);
			POP.AdminManagePopUpADVcongThreeDotCross();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			POP.AdminManagePopUpADVBalanceThreeDot();
			Thread.sleep(1000);
			POP.AdminManagePopUpADVBalanceThreeDotEdit();
			Thread.sleep(3000);
//				POP.AdminManagePopUpADVBalanceThreeDotEditSubmit();
//				Thread.sleep(2000);
			POP.AdminManagePopUpADVBalanceThreeDotEditCross();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			POP.AdminManagePopUpPUBCongThreeDot();
			Thread.sleep(1000);
			POP.AdminManagePopUpPUBCongThreeDotEdit();
			Thread.sleep(3000);
//				POP.AdminManagePopUpPUBCongThreeDotEditSubmit();
//				Thread.sleep(2000);
			POP.AdminManagePopUpPUBCongThreeDotEditCross();

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

// #********************************************Publisher Manage Support Page**********************************

	@Test
	public void AdminTestManageSupport() {

		PageFactoryAdminManageSupportPage MSP = PageFactory.initElements(driver,
				PageFactoryAdminManageSupportPage.class);

		try {

			MSP.AdminManageSupport();
			Thread.sleep(1000);
			MSP.AdminManageSupportADV();
			Thread.sleep(2000);
			driver.navigate().refresh();
			Thread.sleep(3000);
			MSP.AdminManageSupportADVChatOpen();
			Thread.sleep(2000);
			MSP.AdminManageSupportADVChatOpenSubmit();
			Thread.sleep(2000);
			MSP.AdminManageSupportADVChatOpenBack();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			MSP.AdminManageSupportPUB();
			Thread.sleep(2000);
			MSP.AdminManageSupportPUBChatOpen();
			Thread.sleep(2000);
			MSP.AdminManageSupportPUBChatOpenSubmit();
			Thread.sleep(2000);
			MSP.AdminManageSupportPUBChatOpenBack();

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
