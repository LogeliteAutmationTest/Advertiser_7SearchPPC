package ADV7searchTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import ADV_7Search_genericPage.CommonMethod;
import Com.ADV7Search.pages.PageFactoryAdminManageHeaderMessagePage;


public class PageFactoryAdminManageHeaderMessageTest extends CommonMethod {

	public PageFactoryAdminManageHeaderMessageTest() throws Exception {
		super();
	}

// #*************************************Login Page**********************************

	@Test
	public void AdminTestLogin1() {

		PageFactoryAdminManageHeaderMessagePage MHM = PageFactory.initElements(driver,
				PageFactoryAdminManageHeaderMessagePage.class);

		try {

			MHM.enterEmail();
			MHM.enterPassword();
			MHM.clickLoginButton();
			Thread.sleep(9000);
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
			//MHM.AdminManageHeaderMessageADVThreeDotEditSubmit();
			MHM.AdminManageHeaderMessageADVThreeDotEditCross();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			MHM.AdminManageHeaderMessagePUBThreeDot();
			Thread.sleep(1000);
			MHM.AdminManageHeaderMessagePUBThreeDotEdit();
			Thread.sleep(2000);
			//MHM.AdminManageHeaderMessagePUBThreeDotSubmit();
			MHM.AdminManageHeaderMessagePUBThreeDotEditCross();
			

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}


}
