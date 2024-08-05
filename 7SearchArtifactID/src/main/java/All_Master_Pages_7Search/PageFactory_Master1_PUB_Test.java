package All_Master_Pages_7Search;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import ADV_7Search_genericPage.CommonMethod;
import Com.ADV7Search.pages.PageFactoryDashboardPublisherPage;
import Com.ADV7Search.pages.PageFactoryInboxPublisherPage;
import Com.ADV7Search.pages.PageFactoryPUBStatisticsPage;
import Com.ADV7Search.pages.PageFactoryWebsitePublisherPage;

public class PageFactory_Master1_PUB_Test extends CommonMethod {

	public PageFactory_Master1_PUB_Test() throws Exception {
		super();
	}

// #***************************Login Page*******************************

	@Test
	public void SwitchbuttonTest() throws Exception {

		PageFactoryDashboardPublisherPage PD = PageFactory.initElements(driver,
				PageFactoryDashboardPublisherPage.class);

//		Thread.sleep(3000);
//		driver.navigate().refresh();
//		Thread.sleep(6000);
		PD.enterEmail();
		PD.enterPassword();
		PD.clickLoginButton();
		Thread.sleep(5000);
		driver.navigate().refresh();
		Thread.sleep(4000);

//			ScreenshotUtil screenshotUtil = new ScreenshotUtil();
//			screenshotUtil.captureScreenshot(driver, "DashboardAttempt");

	}

// #***************************PUB Web site Page*******************************

	@Test
	public void WebsiteTest1() {

		PageFactoryWebsitePublisherPage WS = PageFactory.initElements(driver, PageFactoryWebsitePublisherPage.class);

		try {

			Thread.sleep(5000);
			driver.navigate().refresh();
			Thread.sleep(4000);
//				WS.clickswitchtoPublisher();
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
			Thread.sleep(5000);
			WS.clickWsByStatus();
			WS.clickWsByStatusSuspended();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(5000);
			WS.clickWsByStatus();
			WS.clickWsByStatusHold();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(5000);
			WS.clickWsByStatus();
			WS.clickWsByStatusRejected();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(5000);
			WS.enterWebsiteURL();
			WS.clickWebsiteCategory();
			WS.clickSelectCategory();
			WS.enterWsAdUnitName();
			Thread.sleep(3000);
			WS.clickWsTextAdsType();
//				WS.clickWsBannerAdsType();
//				WS.clickWsNativeAdsType();
//				WS.clickWsInPagePushAdsType();
//				WS.clickWsPopUnderAdsType();
			WS.clickWsEroticAdsCheckBox();
//				WS.clickWsAlertAdsCheckBox();
			WS.clickWsSubmitButton();
			Thread.sleep(3000);
			WS.clickWebsiteVerify();
			Thread.sleep(3000);
			WS.clickWsSubmitButton();
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

	}

// #***************************PUB Statistics Page*******************************

	@Test
	public void StatisticsTest1() throws Exception {

		PageFactoryPUBStatisticsPage PS = PageFactory.initElements(driver, PageFactoryPUBStatisticsPage.class);

		Thread.sleep(5000);
		driver.navigate().refresh();
		Thread.sleep(4000);
//				PS.clickswitchtoPublisher();
//				Thread.sleep(5000);
		PS.clickPUBStatistics();
		Thread.sleep(1000);
		PS.clickPUBStatisticsDomain();
		Thread.sleep(1000);
		PS.clickPUBStatisticsPlacement();
		Thread.sleep(1000);
		PS.clickPUBStatisticsCountry();
		Thread.sleep(1000);
		PS.clickPUBStatisticsDevice();
		Thread.sleep(1000);
		PS.clickPUBStatisticsOperatingSystem();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(5000);
		PS.clickPUBStatisticsPaginationdropdown();
		PS.clickPUBStatisticsPaginationdropdown50();
		Thread.sleep(2000);
		PS.clickPUBStatisticsCountrydropdown();
		PS.clickPUBStatisticsCountryIndia();
		PS.clickPUBStatisticsSearch();
		Thread.sleep(5000);
		PS.clickPUBStatisticsCountrydropdownIndia();
		Thread.sleep(1000);
		PS.clickPUBStatisticsCountryUnitedState();
		PS.clickPUBStatisticsSearch();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(5000);
		PS.clickPUBStatisticsWebsite();
		PS.clickPUBStatisticsWebsiteMeta2();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(4000);

	}

}
