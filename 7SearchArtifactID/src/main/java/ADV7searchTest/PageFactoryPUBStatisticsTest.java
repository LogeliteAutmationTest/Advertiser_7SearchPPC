package ADV7searchTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import ADV_7Search_genericPage.CommonMethod;
import Com.ADV7Search.pages.PageFactoryInboxPublisherPage;
import Com.ADV7Search.pages.PageFactoryPUBStatisticsPage;

public class PageFactoryPUBStatisticsTest extends CommonMethod {

	public PageFactoryPUBStatisticsTest() throws Exception {
		super();
	}

// #***************************Login Page*******************************

	@Test
	public void StatisticsTest() throws Exception {

		PageFactoryPUBStatisticsPage PS = PageFactory.initElements(driver, PageFactoryPUBStatisticsPage.class);
		PS.enterEmail();
		PS.enterPassword();
		PS.clickLoginButton();
		Thread.sleep(4000);
		driver.navigate().refresh();

	}

// #***************************PUB Statistics Page*******************************

	@Test
	public void StatisticsTest1() throws Exception {

		PageFactoryPUBStatisticsPage PS = PageFactory.initElements(driver, PageFactoryPUBStatisticsPage.class);

		Thread.sleep(5000);
//		PS.clickswitchtoPublisher();
//		Thread.sleep(5000);
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