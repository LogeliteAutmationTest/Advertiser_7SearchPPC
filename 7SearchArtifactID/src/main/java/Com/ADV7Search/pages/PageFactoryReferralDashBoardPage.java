package Com.ADV7Search.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import ADV7searchTest.PageFactoryReferralDashBoardPage;

public class PageFactoryReferralDashBoardPage {

//#******************************************Login Page***************************************

	@FindBy(xpath = "//input[@id='email']")
	@CacheLookup
	WebElement RefLoginEmail;

	@FindBy(xpath = "//input[@id='password']")
	@CacheLookup
	WebElement RefLoginPassword;

	@FindBy(xpath = "//em[@class='passcode-icon icon-hide icon ni ni-eye-off']")
	@CacheLookup
	WebElement RefLoginPasswordEye;

	@FindBy(xpath = "//button[@type='submit']")
	@CacheLookup
	WebElement RefLoginButton;

//#******************************************DashBoard Page***************************************

	@FindBy(xpath = "//button[@id='id']//em[@class='icon ni ni-copy']")
	@CacheLookup
	WebElement RefDashboardCodeCopy;

	@FindBy(xpath = "//button[@id='linkId']//em[@class='icon ni ni-copy']")
	@CacheLookup
	WebElement RefDashboardLinkCopy;

//#******************************************Login Page***************************************

	public void enterRefLoginEmail() {
		RefLoginEmail.sendKeys("rajeevgp1596+15@gmail.com");
	}

	public void enterRefLoginPassword() {
		RefLoginPassword.sendKeys("123456");
	}

	public void RefLoginPasswordEye() {
		RefLoginPasswordEye.click();
	}

	public void RefLoginButton() {
		RefLoginButton.click();
	}

//#******************************************DashBoard Page***************************************

	public void RefDashboardCodeCopy() {
		RefDashboardCodeCopy.click();
	}

	public void RefDashboardLinkCopy() {
		RefDashboardLinkCopy.click();
	}
}
