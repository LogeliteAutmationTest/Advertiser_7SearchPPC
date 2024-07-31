package Com.ADV7Search.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class PageFactoryIndexPage {

// #***************************Login Page*******************************

	@FindBy(xpath = "//input[@id='default-01']")
	@CacheLookup
	WebElement Email;

	@FindBy(xpath = "//input[@id='password']")
	@CacheLookup
	WebElement Password;

	@FindBy(xpath = "//button[@type='submit']")
	@CacheLookup
	WebElement clickLoginButton;

//#***************************Inbox Page*******************************	

	@FindBy(xpath = "//span[normalize-space()='Inbox']")
	@CacheLookup
	WebElement Inbox;

	@FindBy(xpath = "//a[1]//li[1]//div[1]//em[1]")
	@CacheLookup
	WebElement OpenMessage;

	@FindBy(xpath = "//a[@class='btn btn-icon btn-trigger nk-ibx-hide']//em[@class='icon ni ni-arrow-left']")
	@CacheLookup
	WebElement BackMessage;
// #***************************Login Page*******************************

	public void enterEmail() {
		Email.sendKeys("rajeevgp1596@gmail.com");
	}

	public void enterPassword() {
		Password.sendKeys("Tester@01");
	}

	public void clickLoginButton() {
		clickLoginButton.click();

	}

//#***************************Inbox Page*******************************	

	public void clickInbox() {
		Inbox.click();

	}

	public void clickOpenMessage() {
		OpenMessage.click();

	}

	public void clickBackMessage() {
		BackMessage.click();

	}

}
