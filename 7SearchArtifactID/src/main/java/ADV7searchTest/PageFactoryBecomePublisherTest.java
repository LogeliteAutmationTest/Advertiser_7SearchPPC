package ADV7searchTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import ADV_7Search_genericPage.CommonMethod;
import Com.ADV7Search.pages.PageFactoryBecomePublisherPage;


public class PageFactoryBecomePublisherTest extends CommonMethod {

	public PageFactoryBecomePublisherTest() throws Exception {
		super();
	}

	// #***************************Login Page*******************************

	@Test
	public void SwitchbuttonTest() throws Exception {

		PageFactoryBecomePublisherPage BP = PageFactory.initElements(driver, PageFactoryBecomePublisherPage.class);
		BP.enterEmail();
		BP.enterPassword();
		BP.clickLoginButton();
		Thread.sleep(3000);
		driver.navigate().refresh();

	}

	// #***************************Switch to Publisher Page*******************************

	@Test
	public void SwitchbuttonTest1() throws Exception {

		PageFactoryBecomePublisherPage BP = PageFactory.initElements(driver, PageFactoryBecomePublisherPage.class);

		Thread.sleep(3000);
//		BP.clickBecometoPublisher();
//		BP.clickProceedtoPublisher();
//		Thread.sleep(7000);
		BP.clickSwitchtoPublisher();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		
		
		
		
	

}
}