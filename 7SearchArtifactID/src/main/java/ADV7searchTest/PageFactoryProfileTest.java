package ADV7searchTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import ADV_7Search_genericPage.CommonMethod;
import Com.ADV7Search.pages.PageFactoryProfilePage;

public class PageFactoryProfileTest extends CommonMethod {

	public PageFactoryProfileTest() throws Exception {
		super();
	}

//#***************************Login Page*******************************

	@Test
	public void ProfileTest() throws Exception {

		PageFactoryProfilePage pt = PageFactory.initElements(driver, PageFactoryProfilePage.class);
		pt.enterEmail();
		pt.enterPassword();
		pt.clickLoginButton();
		Thread.sleep(3000);
		driver.navigate().refresh();

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
}