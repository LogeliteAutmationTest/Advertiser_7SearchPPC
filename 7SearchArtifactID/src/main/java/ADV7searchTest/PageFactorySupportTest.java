package ADV7searchTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import ADV_7Search_genericPage.CommonMethod;
import Com.ADV7Search.pages.PageFactorySupportPage;

public class PageFactorySupportTest extends CommonMethod {

	public PageFactorySupportTest() throws Exception {
		super();
	}

// #***************************Login Page*******************************

	@Test
	public void SupportTest() throws Exception {

		PageFactorySupportPage ss = PageFactory.initElements(driver, PageFactorySupportPage.class);
		ss.enterEmail();
		ss.enterPassword();
		ss.clickLoginButton();
		Thread.sleep(4000);
		driver.navigate().refresh();

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