package Com.ADV7Search.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class PageFactoryBecomePublisherPage {

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

// #***************************Switch to Publisher Page*******************************

	@FindBy(xpath = "//a[@class='btn btn-primary']")
	@CacheLookup
	WebElement BecometoPublisher;

	@FindBy(xpath = "//button[@type='submit']")
	@CacheLookup
	WebElement ProceedtoPublisher;

	@FindBy(xpath = "//button[normalize-space()='Switch to Publisher']")
	@CacheLookup
	WebElement SwitchtoPublisher;

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

// #***************************Switch to Publisher Page*******************************

	public void clickBecometoPublisher() {
		BecometoPublisher.click();

	}

	public void clickProceedtoPublisher() {
		ProceedtoPublisher.click();

	}

	public void clickSwitchtoPublisher() {
		SwitchtoPublisher.click();

	}
	
	

}
