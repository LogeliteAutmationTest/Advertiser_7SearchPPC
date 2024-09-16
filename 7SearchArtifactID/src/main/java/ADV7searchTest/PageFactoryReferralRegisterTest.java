package ADV7searchTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import ADV_7Search_genericPage.CommonMethod;
import Com.ADV7Search.pages.PageFactoryReferralRegisterPage;

public class PageFactoryReferralRegisterTest extends CommonMethod {

	public PageFactoryReferralRegisterTest() throws Exception {
		super();
	}
	
//#*************************************Reg. Page**********************************

		@Test
		public void AdminTestLogin1() {

			PageFactoryReferralRegisterPage RReg = PageFactory.initElements(driver, PageFactoryReferralRegisterPage.class);

			try {
				RReg.enterRefFirstName();
				RReg.enterRefLastName();
				RReg.enterRefEmail();
				Thread.sleep(1000);
				RReg.RefCountry();
				RReg.RefCountryIndia();
				Thread.sleep(1000);
				RReg.enterRefState();
				RReg.enterRefPhone();
				RReg.enterRefAddress();
				Thread.sleep(1000);
				RReg.enterRefPassword();
				RReg.RefPasswordEye();
				Thread.sleep(1000);
				RReg.enterRefConfirmPassword();
				RReg.RefConfirmPasswordEye();
				Thread.sleep(1000);
				RReg.RefRegSubmit();
				Thread.sleep(1000);
				RReg.RefRegSingnIn();
				Thread.sleep(5000);
				RReg.enterRefLoginEmail();
				Thread.sleep(1000);
				RReg.enterRefLoginPassword();
				Thread.sleep(1000);
				RReg.RefLoginPasswordEye();
				Thread.sleep(5000);
				RReg.RefLoginButton();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

			}


