package ADV7searchTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import ADV_7Search_genericPage.CommonMethod;
import Com.ADV7Search.pages.PageFactoryDashboardADVPage;

public class PageFactoryDashBoardADVTest extends CommonMethod {

	public PageFactoryDashBoardADVTest() throws Exception {
		super();
	}

//********************************************ADV LOgin Page******************************
	
	@Test
	public void DashBoardTest() throws InterruptedException {
		PageFactoryDashboardADVPage DB = PageFactory.initElements(driver, PageFactoryDashboardADVPage.class);
		
		
		DB.enterEmail();
		DB.enterPassword();
		DB.clickLoginButton();
		Thread.sleep(3000);
		
		
		Thread.sleep(8000);
		driver.navigate().refresh();
		Thread.sleep(6000);
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
//		DB.enterADVFeedbackAttachment();
//		Thread.sleep(2000);
		DB.ADVFeedbackSubmitButton();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		DB.ADVNotification();
		Thread.sleep(2000);
		DB.ADVNotificationViewAll();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		DB.ADVDashboard();
		Thread.sleep(2000);
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
		DB.clickF1();
		DB.clickFilter2();
		Thread.sleep(2000);
		DB.clickF2();
		DB.clickFilter3();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
	
	}

}
