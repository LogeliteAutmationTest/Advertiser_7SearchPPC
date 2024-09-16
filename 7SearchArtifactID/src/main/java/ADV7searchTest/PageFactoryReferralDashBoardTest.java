package ADV7searchTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import ADV_7Search_genericPage.CommonMethod;
import Com.ADV7Search.pages.PageFactoryReferralDashBoardPage;


public class PageFactoryReferralDashBoardTest extends CommonMethod {

	public PageFactoryReferralDashBoardTest() throws Exception {
		super();
	}
	
//#*************************************Login Page**********************************


	@Test
	public void AdminTestLogin1() {

		PageFactoryReferralDashBoardPage DD = PageFactory.initElements(driver, PageFactoryReferralDashBoardPage.class);

		try { 
			
			DD.enterRefLoginEmail();
			DD.enterRefLoginPassword();
			Thread.sleep(1000);
			DD.RefLoginPasswordEye();
			Thread.sleep(1000);
			DD.RefLoginButton();
			Thread.sleep(4000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			DD.RefDashboardCodeCopy();
			Thread.sleep(2000);
			DD.RefDashboardLinkCopy();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
		}

