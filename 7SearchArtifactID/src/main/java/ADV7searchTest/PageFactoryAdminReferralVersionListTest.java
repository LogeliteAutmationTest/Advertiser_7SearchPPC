package ADV7searchTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import ADV_7Search_genericPage.CommonMethod;
import Com.ADV7Search.pages.PageFactoryAdminReferralVersionListPage;

public class PageFactoryAdminReferralVersionListTest extends CommonMethod {

	public PageFactoryAdminReferralVersionListTest() throws Exception {
		super();
	}

//#*************************************Login Page**********************************

	@Test
	public void AdminTestLogin() {

		PageFactoryAdminReferralVersionListPage MP = PageFactory.initElements(driver,
				PageFactoryAdminReferralVersionListPage.class);

		try {

			MP.enterRefAdminLoginEmail();
			MP.enterRefAdminLoginPassword();
			Thread.sleep(1000);
			MP.RefAdminLoginPasswordEye();
			Thread.sleep(1000);
			MP.RefAdminLoginButton();
			Thread.sleep(4000);
			driver.navigate().refresh();
			Thread.sleep(4000);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

//#*************************************Version Page**********************************

	@Test
	public void AdminTestVersion() {

		PageFactoryAdminReferralVersionListPage RV = PageFactory.initElements(driver,
				PageFactoryAdminReferralVersionListPage.class);

		try {

			RV.RefAdminVersionList();
			Thread.sleep(2000);
			RV.RefAdminVersionListAdd();
			Thread.sleep(1000);
			RV.enterRefAdminVersionListAddName();
			RV.enterRefAdminVersionListAddVersion();
			Thread.sleep(1000);
			RV.RefAdminVersionListAddSubmit();
			//RV.RefAdminVersionListADDCross();
			Thread.sleep(2000);
			driver.navigate().refresh();
			Thread.sleep(3000);
			RV.RefAdminVersionListThreeDot();
			Thread.sleep(1000);
			RV.RefAdminVersionListThreeDotEdit();
			Thread.sleep(1000);
			RV.enterRefAdminVersionListThreeDotEditName();
			Thread.sleep(1000);
			//RV.RefAdminVersionListThreeDotEditCross();
			RV.RefAdminVersionListThreeDotEditSubmit();
			Thread.sleep(4000);
			driver.navigate().refresh();
			Thread.sleep(4000);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
