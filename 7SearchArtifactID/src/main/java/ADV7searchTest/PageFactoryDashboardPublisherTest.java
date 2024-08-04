package ADV7searchTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import ADV_7Search_genericPage.CommonMethod;
import Com.ADV7Search.pages.PageFactoryBecomePublisherPage;
import Com.ADV7Search.pages.PageFactoryDashboardPublisherPage;

public class PageFactoryDashboardPublisherTest extends CommonMethod {

	public PageFactoryDashboardPublisherTest() throws Exception {
		super();
	}

// #***************************Login Page*******************************

	@Test
	public void SwitchbuttonTest() throws Exception {

		PageFactoryDashboardPublisherPage PD = PageFactory.initElements(driver,
				PageFactoryDashboardPublisherPage.class);
		PD.enterEmail();
		PD.enterPassword();
		PD.clickLoginButton();
		Thread.sleep(5000);
		driver.navigate().refresh();
		Thread.sleep(4000);

//		ScreenshotUtil screenshotUtil = new ScreenshotUtil();
//		screenshotUtil.captureScreenshot(driver, "DashboardAttempt");

	}

// #***************************PUB Dash board Page*******************************

	@Test
	public void SwitchbuttonTest1() {

		PageFactoryDashboardPublisherPage PD = PageFactory.initElements(driver,
				PageFactoryDashboardPublisherPage.class);

		try {

//		Thread.sleep(5000);
//		PD.clickswitchtoPublisher();
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
//			PD.enterPUBFeedbackAttachment();
//			Thread.sleep(1000);
			PD.PUBFeedbackSubmit();
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
}