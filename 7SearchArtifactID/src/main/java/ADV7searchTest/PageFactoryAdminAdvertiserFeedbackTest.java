package ADV7searchTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import ADV_7Search_genericPage.CommonMethod;
import Com.ADV7Search.pages.PageFactoryAdminAdvertiserFeedbackPage;

public class PageFactoryAdminAdvertiserFeedbackTest extends CommonMethod {

	public PageFactoryAdminAdvertiserFeedbackTest() throws Exception {
	super();
	}

// #*************************************Login Page**********************************

	@Test
	public void AdminTestLogin1() {

		PageFactoryAdminAdvertiserFeedbackPage AF = PageFactory.initElements(driver,
				PageFactoryAdminAdvertiserFeedbackPage.class);

		try {

			AF.enterEmail();
			AF.enterPassword();
			AF.clickLoginButton();
			Thread.sleep(6000);
			driver.navigate().refresh();
			Thread.sleep(4000);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

// #*************************************Advertiser Feedback Page**********************************

	@Test
	public void AdvertiserFeedback() {

		PageFactoryAdminAdvertiserFeedbackPage AF = PageFactory.initElements(driver,
				PageFactoryAdminAdvertiserFeedbackPage.class);

		try {

			AF.AdminAdvertiserFeedback();
			AF.enterAdminAdvertiserFeedbackSearch();
			Thread.sleep(6000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			AF.AdminAdvertiserFeedbackBYRating();
			Thread.sleep(2000);
			AF.AdminAdvertiserFeedbackBYRating1();
			Thread.sleep(2000);
			AF.AdminAdvertiserFeedbackBYRating();
			Thread.sleep(2000);
			AF.AdminAdvertiserFeedbackBYRating2();
			Thread.sleep(2000);
			AF.AdminAdvertiserFeedbackBYRating();
			Thread.sleep(2000);
			AF.AdminAdvertiserFeedbackBYRating3();
			Thread.sleep(2000);
			AF.AdminAdvertiserFeedbackBYRating();
			Thread.sleep(2000);
			AF.AdminAdvertiserFeedbackBYRating4();
			Thread.sleep(2000);
			AF.AdminAdvertiserFeedbackBYRating();
			Thread.sleep(2000);
			AF.AdminAdvertiserFeedbackBYRating5();

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
