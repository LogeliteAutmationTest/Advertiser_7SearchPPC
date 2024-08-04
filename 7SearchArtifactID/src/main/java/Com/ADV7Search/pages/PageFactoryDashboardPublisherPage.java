package Com.ADV7Search.pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class PageFactoryDashboardPublisherPage {

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

	@FindBy(xpath = "//button[@type='submit']")
	@CacheLookup
	WebElement switchtoPublisher;

// #***************************PUB Dash Board Page*******************************

	@FindBy(xpath = "//a[@class='btn btn-primary btn-sm mwbtn']")
	@CacheLookup
	WebElement ManageWebsite;

	@FindBy(xpath = "//em[@class='icon ni ni-bell-fill']")
	@CacheLookup
	WebElement PubNotification;

	@FindBy(xpath = "//div[@class='user-avatar sm']")
	@CacheLookup
	WebElement PBProfile;

	@FindBy(xpath = "//span[normalize-space()='View Profile']")
	@CacheLookup
	WebElement PBViewProfile;

	@FindBy(xpath = "//span[normalize-space()='Account Setting']")
	@CacheLookup
	WebElement PUBAccountSetting;
	
	@FindBy(xpath = "//input[@placeholder='Subject']")
	@CacheLookup
	WebElement PUBFeedbackSubject;
	
	@FindBy(xpath = "//span[normalize-space()='Feedback']")
	@CacheLookup
	WebElement PUBFeedback;
	
	@FindBy(xpath = "//textarea[@placeholder='Write your feedback about our services.']")
	@CacheLookup
	WebElement PUBFeedbackMessage;
	
	@FindBy(xpath = "//a[@id='ibx-msg-attachment']")
	@CacheLookup
	WebElement PUBFeedbackAttachment;
	
	@FindBy(xpath = "//span[normalize-space()='Submit Feedback']")
	@CacheLookup
	WebElement PUBFeedbackSubmit;
	
	@FindBy(xpath = "//a[normalize-space()='View All']")
	@CacheLookup
	WebElement PubNotificationView;


// #***************************Login Page*******************************

	public void enterEmail() {
		Email.sendKeys("rajeevgp1596+20@gmail.com");
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

// #***************************PUB Dash Board Page*******************************

	public void clickManageWebsite() {
		ManageWebsite.click();

	}

	public void clickPubNotification() {
		PubNotification.click();

	}
	
	public void PubNotificationView() {
		PubNotificationView.click();

	}

	public void clickPBProfile() {
		PBProfile.click();

	}

	public void clickPBViewProfile() {
		PBViewProfile.click();

	}

	public void PUBAccountSetting() {
		PUBAccountSetting.click();

	}

	public void PUBFeedback() {
		PUBFeedback.click();
	}

	public void enterPUBFeedbackSubject() {
		PUBFeedbackSubject.sendKeys("Test");
	}

	public void enterPUBFeedbackMessage() {
		PUBFeedbackMessage.sendKeys("Automation Test Rajeev");
	}

	public void enterPUBFeedbackAttachment() {
		PUBFeedbackAttachment.sendKeys("C:\\Users\\DELL\\Downloads\\emoji.png");
	}

	public void PUBFeedbackSubmit() {
		PUBFeedbackSubmit.click();
	}

		

	public static void captureScreenshot(WebDriver driver, String screenshotName) {
		try {
			File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshotFile, new File("screenshots/" + screenshotName + ".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
