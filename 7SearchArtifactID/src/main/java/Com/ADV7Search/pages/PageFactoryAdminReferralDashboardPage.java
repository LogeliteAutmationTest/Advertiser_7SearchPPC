package Com.ADV7Search.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class PageFactoryAdminReferralDashboardPage {

//#******************************************Login Page**********************************************

	@FindBy(xpath = "//input[@id='default-01']")
	@CacheLookup
	WebElement RefAdminLoginEmail;

	@FindBy(xpath = "//input[@id='password']")
	@CacheLookup
	WebElement RefAdminLoginPassword;

	@FindBy(xpath = "//em[@class='passcode-icon icon-hide icon ni ni-eye-off']")
	@CacheLookup
	WebElement RefAdminLoginPasswordEye;

	@FindBy(xpath = "//button[@type='submit']")
	@CacheLookup
	WebElement RefAdminLoginButton;

//#******************************************View Profile Page***************************************

	@FindBy(xpath = "//div[@class='card-title-group align-start gx-3 mb-4']//a[@class='dropdown-toggle btn btn-white btn-dim dropdown-reader']//span[contains(text(),'Today')]")
	@CacheLookup
	WebElement RefAdminGraphToday;

	@FindBy(xpath = "//div[@class='dropdown-menu dropdown-menu-right show']//span[contains(text(),'7 Days')]")
	@CacheLookup
	WebElement RefAdminGraph7Days;

	@FindBy(xpath = "//div[@class='dropdown-menu dropdown-menu-right show']//span[contains(text(),'15 Days')]")
	@CacheLookup
	WebElement RefAdminGraph15Days;

	@FindBy(xpath = "//div[@class='dropdown-menu dropdown-menu-right show']//span[contains(text(),'30 Days')]")
	@CacheLookup
	WebElement RefAdminGraph30Days;

	@FindBy(xpath = "//div[@class='card-inner h-100 stretch flex-column']//a[@class='dropdown-toggle btn btn-white btn-dim dropdown-reader']//span[contains(text(),'Today')]")
	@CacheLookup
	WebElement RefAdminUserToday;

	@FindBy(xpath = "//div[@class='dropdown-menu dropdown-menu-right show']//span[contains(text(),'7 Days')]")
	@CacheLookup
	WebElement RefAdminUser7day;

	@FindBy(xpath = "//div[@class='dropdown-menu dropdown-menu-right show']//span[contains(text(),'15 Days')]")
	@CacheLookup
	WebElement RefAdminUser15day;

	@FindBy(xpath = "//div[@class='dropdown-menu dropdown-menu-right show']//span[contains(text(),'30 Days')]")
	@CacheLookup
	WebElement RefAdminUser30day;

	@FindBy(xpath = "//div[@class='card-inner mb-n2']//a[@class='dropdown-toggle btn btn-white btn-dim dropdown-reader']//span[contains(text(),'Today')]")
	@CacheLookup
	WebElement RefAdminTop5Today;

	@FindBy(xpath = "//div[@class='dropdown-menu dropdown-menu-right show']//span[contains(text(),'7 Days')]")
	@CacheLookup
	WebElement RefAdminTop57day;

	@FindBy(xpath = "//div[@class='dropdown-menu dropdown-menu-right show']//span[contains(text(),'15 Days')]")
	@CacheLookup
	WebElement RefAdminTop515day;

	@FindBy(xpath = "//div[@class='dropdown-menu dropdown-menu-right show']//span[contains(text(),'30 Days')]")
	@CacheLookup
	WebElement RefAdminTop530day;

	@FindBy(xpath = "//span[normalize-space()='By User : Total']")
	@CacheLookup
	WebElement RefAdminByUserTotal;

	@FindBy(xpath = "//a[contains(@role,'menuitem')]//span[contains(text(),'Inhouse')]")
	@CacheLookup
	WebElement RefAdminByUserInhouse;

	@FindBy(xpath = "//a[contains(@role,'menuitem')]//span[contains(text(),'Partner')]")
	@CacheLookup
	WebElement RefAdminByUserPartner;

//#******************************************Login Page***************************************

	public void enterRefAdminLoginEmail() {
		RefAdminLoginEmail.sendKeys("Admin");
	}

	public void enterRefAdminLoginPassword() {
		RefAdminLoginPassword.sendKeys("123456");
	}

	public void RefAdminLoginPasswordEye() {
		RefAdminLoginPasswordEye.click();
	}

	public void RefAdminLoginButton() {
		RefAdminLoginButton.click();
	}

//#*****************************************Payment Method Page***************************************

	public void RefAdminGraphToday() {
		RefAdminGraphToday.click();
	}

	public void RefAdminGraph7Days() {
		RefAdminGraph7Days.click();
	}

	public void RefAdminGraph15Days() {
		RefAdminGraph15Days.click();
	}

	public void RefAdminGraph30Days() {
		RefAdminGraph30Days.click();
	}

	public void RefAdminUserToday() {
		RefAdminUserToday.click();
	}

	public void RefAdminUser7day() {
		RefAdminUserToday.click();
	}

	public void RefAdminUser15day() {
		RefAdminUserToday.click();
	}

	public void RefAdminUser30day() {
		RefAdminUserToday.click();
	}

	public void RefAdminTop5Today() {
		RefAdminTop5Today.click();
	}

	public void RefAdminTop57day() {
		RefAdminTop5Today.click();
	}

	public void RefAdminTop515day() {
		RefAdminTop5Today.click();
	}

	public void RefAdminTop530day() {
		RefAdminTop5Today.click();
	}

	public void RefAdminByUserTotal() {
		RefAdminByUserTotal.click();
	}

	public void RefAdminByUserInhouse() {
		RefAdminByUserInhouse.click();
	}

	public void RefAdminByUserPartner() {
		RefAdminByUserPartner.click();
	}
}
