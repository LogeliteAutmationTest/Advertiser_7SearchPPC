package ADV7searchTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import ADV_7Search_genericPage.CommonMethod;
import Com.ADV7Search.pages.PageFactoryLoginPage;

public class PageFactoryLoginTest extends CommonMethod {

	public PageFactoryLoginTest() throws Exception {
		super();
	}

	@Test
	public void loginTest() {
		PageFactoryLoginPage pfc = PageFactory.initElements(driver, PageFactoryLoginPage.class);
		pfc.enterEmail();
		pfc.enterPassword();
		pfc.clickLoginButton();
	}

	@Test
	public static void getScreenshot(WebDriver driver, String filepath) {
        driver.get("https://advertiser.7searchppc.com/auth-login");
		driver.findElement(By.linkText("https://advertiser.7searchppc.com/")).click();
		// Capture a screenshot
		captureScreenshot("Success");
	}

	private static void captureScreenshot(String string) {
		// TODO Auto-generated method stub
		
	}

	

	


}
