package All_Master_Pages_7Search;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import ADV_7Search_genericPage.CommonMethod;
import Com.ADV7Search.pages.PageFactoryDashboardPublisherPage;
import Com.ADV7Search.pages.PageFactoryInboxPublisherPage;
import Com.ADV7Search.pages.PageFactoryPUBProfilePage;
import Com.ADV7Search.pages.PageFactoryPUBSupportPage;

public class PageFactory_Master2_PUB_Test extends CommonMethod {

	public PageFactory_Master2_PUB_Test() throws Exception {
		super();
	}

// #***************************Login Page*******************************

	@Test
	public void SwitchbuttonTest() throws Exception {

		PageFactoryDashboardPublisherPage PD = PageFactory.initElements(driver,
				PageFactoryDashboardPublisherPage.class);

		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(6000);
		PD.enterEmail();
		PD.enterPassword();
		PD.clickLoginButton();
		Thread.sleep(5000);
		driver.navigate().refresh();
		Thread.sleep(4000);

//			ScreenshotUtil screenshotUtil = new ScreenshotUtil();
//			screenshotUtil.captureScreenshot(driver, "DashboardAttempt");

	}

// #***************************PUB Dash board Page*******************************

	@Test
	// (enabled = false)
	public void SwitchbuttonTest1() {

		PageFactoryDashboardPublisherPage PD = PageFactory.initElements(driver,
				PageFactoryDashboardPublisherPage.class);

		try {

//				Thread.sleep(5000);
//				PD.clickswitchtoPublisher();
			Thread.sleep(3000);
			PD.clickManageWebsite();
			Thread.sleep(2000);
			PD.clickPubNotification();
			Thread.sleep(1000);
			PD.PubNotificationView();
			Thread.sleep(2000);
			PD.PUBFeedback();
			Thread.sleep(1000);
			PD.enterPUBFeedbackSubject();
			PD.enterPUBFeedbackMessage();
			Thread.sleep(1000);
//					PD.enterPUBFeedbackAttachment();
//					Thread.sleep(1000);
//				PD.PUBFeedbackSubmit();
			Thread.sleep(2000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			PD.clickPBProfile();
			Thread.sleep(1000);
			PD.clickPBViewProfile();
			Thread.sleep(2000);
			PD.clickPBProfile();
			Thread.sleep(1000);
			PD.PUBAccountSetting();
			Thread.sleep(2000);
			driver.navigate().refresh();
			Thread.sleep(4000);

		} catch (InterruptedException e) {
			e.printStackTrace();

		}
	}

// #***************************PUB Inbox Page*******************************

	@Test
	// (enabled = false)
	public void InboxTest1() throws Exception {

		PageFactoryInboxPublisherPage IP = PageFactory.initElements(driver, PageFactoryInboxPublisherPage.class);

//					IP.clickswitchtoPublisher();
//					Thread.sleep(5000);
		IP.clickPUBInbox();
		Thread.sleep(5000);
		IP.clickPUBPagenationDropDown();
		IP.clickPUBSelectPagenationDropDown();
	}



//*************************************PUB Support Page*****************************************

	@Test
	// (enabled = false)
	public void PUBSupportTest1() {

		PageFactoryPUBSupportPage PSP = PageFactory.initElements(driver, PageFactoryPUBSupportPage.class);

		try {

//						PSP.clickswitchtoPublisher();
//						Thread.sleep(5000);
			PSP.clickPUBSupport();
			Thread.sleep(2000);
			PSP.PUBOpenThreedot();
			Thread.sleep(1000);
			PSP.clickPUBOpenChat();
			Thread.sleep(2000);
			PSP.enterPUBchatMessage();
			Thread.sleep(1000);
//					PSP.enterPUBSupportAttachment();
//					Thread.sleep(2000);
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
//					Thread.sleep(1000);
//					PSP.enterPUBSupportNewAttachment();
			Thread.sleep(1000);
			PSP.clickPUBOpenChatSend();

		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
