package Com.ADV7Search.pages;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import ADV7searchTest.PageFactoryAdminPUBFeedbackPage;
import ADV_7Search_genericPage.CommonMethod;

public class PageFactoryAdminPUBFeedbackTest extends CommonMethod {

	public PageFactoryAdminPUBFeedbackTest() throws Exception {
		super();
	}

// #*************************************Login Page**********************************

	@Test
	public void AdminTestLogin1() {

		PageFactoryAdminPUBFeedbackPage PF = PageFactory.initElements(driver, PageFactoryAdminPUBFeedbackPage.class);

		try {

			PF.enterEmail();
			PF.enterPassword();
			PF.clickLoginButton();
			Thread.sleep(9000);
			driver.navigate().refresh();
			Thread.sleep(4000);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

// #********************************************Publisher FeedBack Page**********************************

	@Test
	public void AdminTestPubFeedback() {

		PageFactoryAdminPUBFeedbackPage PF = PageFactory.initElements(driver, PageFactoryAdminPUBFeedbackPage.class);

		try {

			PF.AdminManagePublisherFeedback();
			Thread.sleep(3000);
			PF.enterAdminManagePublisherFeedbackSearch();
			Thread.sleep(5000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			PF.AdminManagePublisherFeedbackBYRating();
			PF.AdminManagePublisherFeedbackBYRating1();
			Thread.sleep(3000);
			PF.AdminManagePublisherFeedbackBYRating();
			PF.AdminManagePublisherFeedbackBYRating2();
			Thread.sleep(3000);
			PF.AdminManagePublisherFeedbackBYRating();
			PF.AdminManagePublisherFeedbackBYRating3();
			Thread.sleep(3000);
			PF.AdminManagePublisherFeedbackBYRating();
			PF.AdminManagePublisherFeedbackBYRating4();
			Thread.sleep(3000);
			PF.AdminManagePublisherFeedbackBYRating();
			PF.AdminManagePublisherFeedbackBYRating5();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			PF.AdminManagePublisherFeedbackViewAttachment();

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
