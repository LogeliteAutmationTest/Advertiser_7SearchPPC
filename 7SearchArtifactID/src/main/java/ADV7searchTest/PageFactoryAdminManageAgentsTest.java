package ADV7searchTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import ADV_7Search_genericPage.CommonMethod;
import Com.ADV7Search.pages.PageFactoryAdminManageAgentsPage;

public class PageFactoryAdminManageAgentsTest extends CommonMethod {

	public PageFactoryAdminManageAgentsTest() throws Exception {
		super();
	}

// #*************************************Login Page**********************************

	@Test
	public void AdminTestLogin1() {

		PageFactoryAdminManageAgentsPage MA = PageFactory.initElements(driver, PageFactoryAdminManageAgentsPage.class);

		try {

			MA.enterEmail();
			MA.enterPassword();
			MA.clickLoginButton();
			Thread.sleep(9000);
			driver.navigate().refresh();
			Thread.sleep(4000);

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

}
