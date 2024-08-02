package Com.ADV7Search.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class PageFactorySupportPage {

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

// #***************************Support Page*******************************

	@FindBy(xpath = "//span[normalize-space()='Support']")
	@CacheLookup
	WebElement Support;

	@FindBy(xpath = "//span[normalize-space()='New Request']")
	@CacheLookup
	WebElement NewRequest;

	@FindBy(xpath = "//em[@class='icon ni ni-cross-sm']")
	@CacheLookup
	WebElement SupportCancel;

	@FindBy(xpath = "//div[@class='react-select__value-container css-1hwfws3']")
	@CacheLookup
	WebElement Selectoption;

	@FindBy(id = "//input[@id='react-select-3-input']")
	@CacheLookup
	WebElement Selection3;

	@FindBy(xpath = "//input[@placeholder='Subject']")
	@CacheLookup
	WebElement Subject;

	@FindBy(xpath = "//textarea[@placeholder='Your Message']")
	@CacheLookup
	WebElement Message;

	@FindBy(xpath = "//a[@id='ibx-msg-attachment']")
	@CacheLookup
	WebElement Attachment;

	@FindBy(xpath = "//span[normalize-space()='Send']")
	@CacheLookup
	WebElement Send;

//		@FindBy(xpath = "//a[@id='ibx-msg-attachment']")
//		@CacheLookup
//		WebElement Attachment;

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

// #***************************Support Page*******************************

	public void clickSupport() {
		Support.click();
	}

	public void clickNewRequest() {
		NewRequest.click();
	}

	public void clickSupportCancel() {
		SupportCancel.click();
	}
	
	public void clickSelectoption() {
		Selectoption.click();
	}

	public void clickSelection3() {
		Selection3.click();
	}

	public void enterSubject() {
		Subject.sendKeys("Test rajeev automation");
		;
	}

	public void enterMessage() {
		Message.sendKeys("Test rajeev");
		;
	}

	public void enterAttachment() {
		Attachment.sendKeys("C:\\Users\\DELL\\Downloads\\th (1).jpg");
	}

	public void clickSend() {
		Send.click();
	}

}
