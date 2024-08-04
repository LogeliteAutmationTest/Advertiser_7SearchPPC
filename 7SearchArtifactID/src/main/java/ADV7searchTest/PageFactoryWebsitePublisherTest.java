package ADV7searchTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import ADV_7Search_genericPage.CommonMethod;
import Com.ADV7Search.pages.PageFactoryWebsitePublisherPage;

public class PageFactoryWebsitePublisherTest extends CommonMethod {

	public PageFactoryWebsitePublisherTest() throws Exception {
		super();
	}

// #***************************Login Page*******************************

	@Test
	public void WesiteTest() throws Exception {

		PageFactoryWebsitePublisherPage PD = PageFactory.initElements(driver, PageFactoryWebsitePublisherPage.class);

		PD.enterEmail();
		PD.enterPassword();
		PD.clickLoginButton();
		Thread.sleep(5000);
		driver.navigate().refresh();
		Thread.sleep(4000);

	}

// #***************************PUB Web site Page*******************************

	@Test
	public void WebsiteTest1() {

		PageFactoryWebsitePublisherPage WS = PageFactory.initElements(driver, PageFactoryWebsitePublisherPage.class);

		try {

//		WS.clickswitchtoPublisher();
			WS.PUBInbox();
			Thread.sleep(1000);
			WS.PUBWebsite();
			Thread.sleep(3000);
			WS.enterWsSearch();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(3000);
			WS.clickWsByStatus();
			WS.clickWsInReview();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(3000);
			WS.clickWsByStatus();
			WS.clickWsByStatusSuspended();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(3000);
			WS.clickWsByStatus();
			WS.clickWsByStatusHold();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(3000);
			WS.clickWsByStatus();
			WS.clickWsByStatusRejected();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(3000);
			WS.enterWebsiteURL();
			WS.clickWebsiteCategory();
			WS.clickSelectCategory();
			WS.enterWsAdUnitName();
			Thread.sleep(3000);
			WS.clickWsTextAdsType();
//		WS.clickWsBannerAdsType();
//		WS.clickWsNativeAdsType();
//		WS.clickWsInPagePushAdsType();
//		WS.clickWsPopUnderAdsType();
			WS.clickWsEroticAdsCheckBox();
//		WS.clickWsAlertAdsCheckBox();
			WS.clickWsSubmitButton();
			Thread.sleep(3000);
			WS.clickWebsiteVerify();
			Thread.sleep(3000);
			WS.clickWsSubmitButton();
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

	}
}