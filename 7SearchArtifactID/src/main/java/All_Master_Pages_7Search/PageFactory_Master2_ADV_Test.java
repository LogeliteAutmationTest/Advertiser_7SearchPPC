package All_Master_Pages_7Search;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import ADV_7Search_genericPage.CommonMethod;
import Com.ADV7Search.pages.PageFactoryDashboardADVPage;
import Com.ADV7Search.pages.PageFactoryIndexPage;
import Com.ADV7Search.pages.PageFactoryProfilePage;
import Com.ADV7Search.pages.PageFactoryStatisticsPage;
import Com.ADV7Search.pages.PageFactorySupportPage;

public class PageFactory_Master2_ADV_Test extends CommonMethod {

	public PageFactory_Master2_ADV_Test() throws Exception {
		super();
	}

//********************************************ADV LOgin Page******************************

	@Test
	// (enabled = false)
	public void DashBoardTest() throws InterruptedException {
		PageFactoryDashboardADVPage DB = PageFactory.initElements(driver, PageFactoryDashboardADVPage.class);

//			Thread.sleep(8000);
//			driver.navigate().refresh();
//			Thread.sleep(3000);
		DB.enterEmail();
		DB.enterPassword();
		DB.clickLoginButton();
		Thread.sleep(8000);
		driver.navigate().refresh();
		Thread.sleep(6000);
	}

//********************************************ADV DashBoard Page******************************

	@Test
	// (dependsOnMethods = {"MasterLoginPage"})
	// (enabled = false)
	public void MasterDashBoardPage() throws InterruptedException {
		PageFactoryDashboardADVPage DB = PageFactory.initElements(driver, PageFactoryDashboardADVPage.class);

		DB.ADVAddFund();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		DB.ADVFeedback();
		Thread.sleep(1000);
		DB.enterADVFeedbackMessgage();
		Thread.sleep(1000);
		DB.enterADVFeedbackSubject();
		Thread.sleep(2000);
//				DB.enterADVFeedbackAttachment();
//				Thread.sleep(2000);
		// DB.ADVFeedbackSubmitButton();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		DB.ADVNotification();
		Thread.sleep(2000);
		DB.ADVNotificationViewAll();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		DB.ADVProfile();
		Thread.sleep(1000);
		DB.ADVProfileView();
		Thread.sleep(2000);
		DB.ADVProfile();
		Thread.sleep(1000);
		DB.ADVProfileAccountSetting();
		Thread.sleep(2000);
		DB.ADVProfile();
		Thread.sleep(1000);
		DB.ADVProfileLoginActivity();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		DB.ADVDashboard();
		Thread.sleep(2000);
		DB.clickF1();
		DB.clickFilter2();
		Thread.sleep(2000);
		DB.clickF2();
		DB.clickFilter3();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);

	}

//#***************************Inbox Page*******************************	

	@Test
	public void InboxTest1() throws Exception {

		PageFactoryIndexPage it = PageFactory.initElements(driver, PageFactoryIndexPage.class);
		Thread.sleep(3000);
		it.clickInbox();
		it.clickOpenMessage();
		Thread.sleep(2000);
		it.clickBackMessage();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0, 500)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0, 1000)");
		Thread.sleep(2000);

	}

//#***************************Profile Page*******************************

	@Test
	public void ProfileTest2() throws Exception {

		PageFactoryProfilePage pt = PageFactory.initElements(driver, PageFactoryProfilePage.class);

		Thread.sleep(3000);
		pt.clickProfile();
		pt.clickProfileThreeDot();
		pt.clickUpdateProfile();
		pt.enterProfileAddress1();
		pt.enterProfileCity();
		Thread.sleep(2000);
		pt.clickProfileUpdate();
		Thread.sleep(1000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		pt.clickEditProfile();
		pt.clickUpdateProfile();
		pt.enterProfileAddress1();
		pt.enterProfileCity();
		Thread.sleep(2000);
		pt.clickProfileUpdate();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		pt.clickAccountActivity();

	}

//#***************************ChangePassword Page*******************************

	@Test
	public void ProfileTest3() throws Exception {

		PageFactoryProfilePage pt = PageFactory.initElements(driver, PageFactoryProfilePage.class);

		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		pt.clickProfile();
		pt.clickChangePassword();
		pt.enterCurrenPassword();
		pt.clickPasswordEyeicon();
		Thread.sleep(2000);
		pt.enterNewPassword();
		pt.clickPasswordEyeicon();
		Thread.sleep(2000);
		pt.enterRepeatPassword();
		pt.clickPasswordEyeicon();
		Thread.sleep(2000);
		pt.clickUpdatePassword();

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

// #***************************Support Page*******************************

	@Test
	public void SupportTest1() throws Exception {

		PageFactorySupportPage ss = PageFactory.initElements(driver, PageFactorySupportPage.class);

		Thread.sleep(5000);
		ss.clickSupport();
		Thread.sleep(2000);
		ss.clickNewRequest();
		ss.clickSupportCancel();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		ss.clickNewRequest();
		ss.clickSelectoption();
		ss.clickSelection3();
		ss.enterSubject();
		ss.enterMessage();
		ss.enterAttachment();
		Thread.sleep(3000);
		ss.clickSend();

	}

}
