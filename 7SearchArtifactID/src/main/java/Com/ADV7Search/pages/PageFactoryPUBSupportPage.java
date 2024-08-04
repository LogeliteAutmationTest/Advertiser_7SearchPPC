package Com.ADV7Search.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class PageFactoryPUBSupportPage {

// #*************************************Login Page**************************************

	@FindBy(xpath = "//input[@id='default-01']")
	@CacheLookup
	WebElement Email;

	@FindBy(xpath = "//input[@id='password']")
	@CacheLookup
	WebElement Password;

	@FindBy(xpath = "//button[@type='submit']")
	@CacheLookup
	WebElement clickLoginButton;

	@FindBy(xpath = "//button[@type='submit']")
	@CacheLookup
	WebElement switchtoPublisher;

// #*************************************PUB Support Page***************************************

	@FindBy(xpath = "//span[normalize-space()='Support']")
	@CacheLookup
	WebElement PUBSupport;

	@FindBy(xpath = "//body/div[@id='root']/div[@class='nk-app-root']/div[@class='nk-main']/div[@class='nk-wrap']/div[@class='nk-content']/div[@class='container-fluid']/div[@class='nk-content-inner']/div[@class='nk-content-body']/div[@class='nk-ibx']/div[@class='nk-ibx-body bg-white']/div[@class='nk-ibx-list']/div[@class='simplebar-wrapper']/div[@class='simplebar-mask']/div[@class='simplebar-offset']/div[@aria-label='scrollable content']/div[@class='simplebar-content']/div[1]/div[4]/div[1]/ul[1]/li[1]/div[1]/a[1]/em[1]")
	@CacheLookup
	WebElement PUBOpenThreedot;
	
	@FindBy(xpath = "//div[@class='dropdown-menu dropdown-menu-right show']//span[contains(text(),'View')]")
	@CacheLookup
	WebElement PUBOpenChat;

	@FindBy(xpath = "//textarea[@placeholder='Reply']")
	@CacheLookup
	WebElement PUBchatMessage;

	@FindBy(xpath = "//a[@id='ibx-msg-attachment']")
	@CacheLookup
	WebElement PUBSupportAttachment;

	@FindBy(xpath = "//button[normalize-space()='Send']")
	@CacheLookup
	WebElement PUBOpenChatSend;

//*************************************PUB Support new Page*****************************************

	@FindBy(xpath = "//span[normalize-space()='New Request']")
	@CacheLookup
	WebElement PUBSupportNewRequest;

	@FindBy(xpath = "//div[@class='react-select__value-container css-1hwfws3']")
	@CacheLookup
	WebElement PUBSupportNewSelectCategory;

	@FindBy(xpath = "//div[@class='react-select__value-container css-1hwfws3']")
	@CacheLookup
	WebElement PUBSupporFeedbackCategory;

	@FindBy(xpath = "//input[@placeholder='Subject']")
	@CacheLookup
	WebElement PUBSupportSubject;

	@FindBy(xpath = "//textarea[@placeholder='Your Message']")
	@CacheLookup
	WebElement PUBSupportMessage;

	@FindBy(xpath = "//em[@class='icon ni ni-clip-v']")
	@CacheLookup
	WebElement PUBSupportNewAttachment;

	@FindBy(xpath = "//span[normalize-space()='Send']")
	@CacheLookup
	WebElement PUBSupportNewSend;

//	@FindBy(xpath = "//textarea[@placeholder='Your Message']")
//	@CacheLookup
//	WebElement PUBSupportMessage;
//	
//	
//	@FindBy(xpath = "//textarea[@placeholder='Your Message']")
//	@CacheLookup
//	WebElement PUBSupportMessage;
//	
//	@FindBy(xpath = "//textarea[@placeholder='Your Message']")
//	@CacheLookup
//	WebElement PUBSupportMessage;

// #*******************************************Login Page****************************************

	public void enterEmail() {
		Email.sendKeys("rajeevgp1596@gmail.com");
	}

	public void enterPassword() {
		Password.sendKeys("1234");
	}

	public void clickLoginButton() {
		clickLoginButton.click();

	}

	public void clickswitchtoPublisher() {
		switchtoPublisher.click();

	}

// #******************************************PUB SupportPage*************************************************

	public void clickPUBSupport() {
		PUBSupport.click();
	}

	public void clickPUBOpenChat() {
		PUBOpenChat.click();
	}
	
	public void PUBOpenThreedot() {
		PUBOpenThreedot.click();
	}

	public void enterPUBchatMessage() {
		PUBchatMessage.sendKeys("test rajeev");
	}

	public void enterPUBSupportAttachment() {
		PUBSupportAttachment.sendKeys("C:\\Users\\DELL\\Downloads\\4k-spiderman-pldtgcv0s70pp654.jpg");
	}

	public void clickPUBOpenChatSend() {
		PUBOpenChatSend.click();

	}

//*************************************PUB Support new Page*****************************************

	public void clickPUBSupportNewRequest() {
		PUBSupportNewRequest.click();
	}

	public void clickPUBSupportNewSelectCategory() {
		PUBSupportNewSelectCategory.click();
	}

	public void clickPUBSupporFeedbackCategory() {
		PUBSupporFeedbackCategory.click();
	}

	public void enterPUBSupportSubject() {
		PUBSupportSubject.sendKeys("Test Rajeev");
	}

	public void enterPUBSupportMessage() {
		PUBSupportMessage.sendKeys("Test Rajeev Automation");
	}

	public void enterPUBSupportNewAttachment() {
		PUBSupportNewAttachment.sendKeys("C:\\Users\\DELL\\Downloads\\th (2).jpg");
	}

	public void clickPUBSupportNewSend() {
		PUBSupportNewSend.click();
	}

}
