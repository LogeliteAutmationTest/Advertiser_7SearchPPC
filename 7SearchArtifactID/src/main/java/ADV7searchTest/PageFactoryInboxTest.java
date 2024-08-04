package ADV7searchTest;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import ADV_7Search_genericPage.CommonMethod;
import Com.ADV7Search.pages.PageFactoryIndexPage;


public class PageFactoryInboxTest extends CommonMethod  {
	
	public PageFactoryInboxTest() throws Exception {
		super();
	}
	
//#***************************Login Page*******************************

		@Test
		public void InboxTest() throws Exception {

			PageFactoryIndexPage it = PageFactory.initElements(driver, PageFactoryIndexPage.class);
			it.enterEmail();
			it.enterPassword();
			it.clickLoginButton();
			Thread.sleep(3000);
			driver.navigate().refresh();

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
		
}
