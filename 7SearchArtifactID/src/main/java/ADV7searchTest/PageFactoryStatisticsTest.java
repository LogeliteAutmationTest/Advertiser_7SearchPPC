package ADV7searchTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import ADV_7Search_genericPage.CommonMethod;
import Com.ADV7Search.pages.PageFactoryStatisticsPage;

public class PageFactoryStatisticsTest extends CommonMethod {

	public PageFactoryStatisticsTest() throws Exception {
		super();
	}

//#***************************Login Page*******************************

	@Test
	public void StatisticsTest() throws Exception {

		PageFactoryStatisticsPage st = PageFactory.initElements(driver, PageFactoryStatisticsPage.class);
		st.enterEmail();
		st.enterPassword();
		st.clickLoginButton();
		Thread.sleep(4000);
		driver.navigate().refresh();

	}

//#***************************Statistics Page*******************************

	@Test
	public void StatisticsTest1() throws Exception {

		PageFactoryStatisticsPage st = PageFactory.initElements(driver, PageFactoryStatisticsPage.class);

		Thread.sleep(5000);
		st.clickStatistics();
		Thread.sleep(2000);
		st.clickByCampaign();
		st.clickByCampaignAccount();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		st.clickByAds();
		st.clickByAdsText();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		st.clickByAds();
		st.clickByAdsBanner();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		st.clickByAds();
		st.clickByAdsInPagePush();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		st.clickByAds();
		st.clickByAdsNative();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		st.clickByAds();
		st.clickByAdsPopunder();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		st.clickCalender();
		st.clickCalender28Feb();
		st.clickCalender4March();
		st.clickSearch();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		st.clickDownload();

	}
}