package ADV7searchTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import ADV_7Search_genericPage.CommonMethod;
import Com.ADV7Search.pages.PageFactoryReferralPaymentMethodPage;

public class PageFactoryReferralPaymentMethodTest extends CommonMethod {

	public PageFactoryReferralPaymentMethodTest() throws Exception {
		super();
	}

//#*************************************Login Page**********************************

	@Test
	public void AdminTestLogin() {

		PageFactoryReferralPaymentMethodPage PM = PageFactory.initElements(driver,
				PageFactoryReferralPaymentMethodPage.class);

		try {
			
			PM.enterRefLoginEmail();
			PM.enterRefLoginPassword();
			Thread.sleep(1000);
			PM.RefLoginPasswordEye();
			Thread.sleep(1000);
			PM.RefLoginButton();
			Thread.sleep(4000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			PM.RefPaymentMethods();
			Thread.sleep(1000);
			PM.enterRefPaymentMethodsSearch();
			Thread.sleep(2000);
			driver.navigate().refresh();
			Thread.sleep(3000);
			PM.RefPaymentMethodsBankEdit();
			Thread.sleep(1000);
			PM.enterRefPaymentMethodsBankName();
			PM.enterRefPaymentMethodsBankHolderName();
			PM.enterRefPaymentMethodsBankAccountNo();
			PM.enterRefPaymentMethodsBankIFSCCode();
			PM.enterRefPaymentMethodsBankSwiftCode();
			PM.enterRefPaymentMethodsBankIbanCode();
			Thread.sleep(1000);
//			PM.RefPaymentMethodsBankSave();
//			Thread.sleep(1000);
			PM.RefPaymentMethodsBankCancel();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			PM.RefPaymentMethodsBank2();
			Thread.sleep(1000);
			PM.RefPaymentMethodsPayID();
			Thread.sleep(2000);
			PM.RefPaymentMethodsBank2PayIDSave();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			PM.RefPaymentMethodsBank3();
			Thread.sleep(1000);
//			PM.RefPaymentMethodsPayID();
//			Thread.sleep(2000);
			//PM.RefPaymentMethodsBank2PayIDSave();
			//PM.RefPaymentMethodsBankCancel();
//			Thread.sleep(1000);
//			PM.RefPaymentMethodsPayID();
//			Thread.sleep(2000);
//			PM.RefPaymentMethodsBank2PayIDSave();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			PM.RefPaymentMethodsUPI();
			Thread.sleep(1000);
			PM.enterRefPaymentMethodsUPIID();
			Thread.sleep(1000);
			PM.enterRefPaymentMethodsUPIQR();
			Thread.sleep(1000);
			PM.RefPaymentMethodsUPISave();
			
			
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
		}


