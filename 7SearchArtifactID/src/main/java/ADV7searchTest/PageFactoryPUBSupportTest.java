package ADV7searchTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import ADV_7Search_genericPage.CommonMethod;
import Com.ADV7Search.pages.PageFactoryPUBSupportPage;

public class PageFactoryPUBSupportTest extends CommonMethod {

	public PageFactoryPUBSupportTest() throws Exception {
		super();
	}

//**************************************Login Page**************************************

	@Test
	public void PUBSupportTest() {

		PageFactoryPUBSupportPage PSP = PageFactory.initElements(driver, PageFactoryPUBSupportPage.class);

		try {
			PSP.enterEmail();
			PSP.enterPassword();
			PSP.clickLoginButton();
			Thread.sleep(4000);
			driver.navigate().refresh();
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

//*************************************PUB Support Page*****************************************

	@Test
	//(enabled = false)
	public void PUBSupportTest1() {

		PageFactoryPUBSupportPage PSP = PageFactory.initElements(driver, PageFactoryPUBSupportPage.class);

		try {
			
//				PSP.clickswitchtoPublisher();
//				Thread.sleep(5000);
			PSP.clickPUBSupport();
			Thread.sleep(2000);
			PSP.PUBOpenThreedot();
			Thread.sleep(1000);
			PSP.clickPUBOpenChat();
			Thread.sleep(2000);
			PSP.enterPUBchatMessage();
			Thread.sleep(1000);
//			PSP.enterPUBSupportAttachment();
//			Thread.sleep(2000);
			PSP.clickPUBOpenChatSend();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
	
//*************************************PUB Support new Page*****************************************
	
	
	@Test
	// (enabled = false)
	public void PUBSupportTest2() {

		PageFactoryPUBSupportPage PSP = PageFactory.initElements(driver, PageFactoryPUBSupportPage.class);

		try {
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			PSP.clickPUBSupport();
			Thread.sleep(2000);
			PSP.clickPUBSupportNewRequest();
			Thread.sleep(1000);
			PSP.clickPUBSupportNewSelectCategory();
			Thread.sleep(1000);
			PSP.clickPUBSupporFeedbackCategory();
			Thread.sleep(1000);
			PSP.enterPUBSupportSubject();
			Thread.sleep(1000);
			PSP.enterPUBSupportMessage();
//			Thread.sleep(1000);
//			PSP.enterPUBSupportNewAttachment();
			Thread.sleep(1000);
			PSP.clickPUBOpenChatSend();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
	
	
}

