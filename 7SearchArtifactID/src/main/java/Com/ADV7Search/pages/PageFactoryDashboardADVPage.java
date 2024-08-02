package Com.ADV7Search.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class PageFactoryDashboardADVPage {

//********************************************ADV LOgin Page******************************

	@FindBy(xpath = "//input[@id='default-01']")
	@CacheLookup
	WebElement Email;

	@FindBy(xpath = "//input[@id='password']")
	@CacheLookup
	WebElement Password;

	@FindBy(xpath = "//button[@type='submit']")
	@CacheLookup
	WebElement clickLoginButton;

//********************************************ADV DashBoard Page******************************

	@FindBy(xpath = "//a[@class='btn btn-primary btn-sm']")
	@CacheLookup
	WebElement ADVAddFund;

	@FindBy(xpath = "//span[normalize-space()='Feedback']")
	@CacheLookup
	WebElement ADVFeedback;

	@FindBy(xpath = "//textarea[@placeholder='Write your feedback about our services.']")
	@CacheLookup
	WebElement ADVFeedbackMessgage;

	@FindBy(xpath = "//a[@id='ibx-msg-attachment']")
	@CacheLookup
	WebElement ADVFeedbackAttachment;

	@FindBy(xpath = "//input[@placeholder='Subject']")
	@CacheLookup
	WebElement ADVFeedbackSubject;

	@FindBy(xpath = "//span[normalize-space()='Submit Feedback']")
	@CacheLookup
	WebElement ADVFeedbackSubmitButton;

	@FindBy(xpath = "//a[@class='dropdown-toggle nk-quick-nav-icon']")
	@CacheLookup
	WebElement ADVNotification;

	@FindBy(xpath = "//a[normalize-space()='View All']")
	@CacheLookup
	WebElement ADVNotificationViewAll;

	@FindBy(xpath = "//div[@class='user-toggle']")
	@CacheLookup
	WebElement ADVProfile;

	@FindBy(xpath = "//span[normalize-space()='View Profile']")
	@CacheLookup
	WebElement ADVProfileView;

	@FindBy(xpath = "//span[normalize-space()='Account Setting']")
	@CacheLookup
	WebElement ADVProfileAccountSetting;

	@FindBy(xpath = "//span[normalize-space()='Login Activity']")
	@CacheLookup
	WebElement ADVProfileLoginActivity;

	@FindBy(xpath = "//span[normalize-space()='Log Out']")
	@CacheLookup
	WebElement ADVProfileLogOut;

	@FindBy(xpath = "//a[@class='dropdown-toggle btn btn-white btn-dim btn-outline-light']//span[contains(text(),'Today')]")
	@CacheLookup
	WebElement Filter;
	
	@FindBy(xpath = "//span[normalize-space()='Dashboard']")
	@CacheLookup
	WebElement ADVDashboard;

	@FindBy(xpath = "//div[@class='dropdown-menu dropdown-menu-right show']//span[contains(text(),'7 Days')]")
	@CacheLookup
	WebElement Filter1;

	@FindBy(xpath = "//a[@class='dropdown-toggle btn btn-white btn-dim btn-outline-light']//span[contains(text(),'7 Days')]")
	@CacheLookup
	WebElement F1;

	@FindBy(xpath = "//div[@class='dropdown-menu dropdown-menu-right show']//span[contains(text(),'15 Days')]")
	@CacheLookup
	WebElement Filter2;

	@FindBy(xpath = "//a[@class='dropdown-toggle btn btn-white btn-dim btn-outline-light']//span[contains(text(),'15 Days')]")
	@CacheLookup
	WebElement F2;

	@FindBy(xpath = "//div[@class='dropdown-menu dropdown-menu-right show']//span[contains(text(),'30 Days')]")
	@CacheLookup
	WebElement Filter3;

//********************************************ADV LOgin Page******************************

	public void enterEmail() {
		Email.sendKeys("rajeevgp1596@gmail.com");
	}

	public void enterPassword() {
		Password.sendKeys("1234");
	}

	public void clickLoginButton() {
		clickLoginButton.click();

	}

//********************************************ADV LOgin Page******************************

	public void ADVAddFund() {
		ADVAddFund.click();

	}

	public void ADVFeedback() {
		ADVFeedback.click();
	}

	public void enterADVFeedbackMessgage() {
		ADVFeedbackMessgage.sendKeys("Test Rajeev");

	}

	public void enterADVFeedbackSubject() {
		ADVFeedbackSubject.sendKeys("Test");

	}
	
	public void ADVFeedbackAttachment() {
		ADVFeedbackAttachment.click();
	}

	public void enterADVFeedbackAttachment() {
		ADVFeedbackAttachment.sendKeys("C:\\Users\\DELL\\Downloads\\th (1).jpg");

	}

	public void ADVFeedbackSubmitButton() {
		ADVFeedbackSubmitButton.click();
	}

	public void ADVNotification() {
		ADVNotification.click();
	}

	public void ADVNotificationViewAll() {
		ADVNotificationViewAll.click();
	}

	public void ADVProfile() {
		ADVProfile.click();
	}

	public void ADVProfileView() {
		ADVProfileView.click();
	}

	public void ADVProfileAccountSetting() {
		ADVProfileAccountSetting.click();
	}

	public void ADVProfileLoginActivity() {
		ADVProfileLoginActivity.click();
	}

	public void ADVProfileLogOut() {
		ADVProfileLogOut.click();
	}
	
	public void ADVDashboard() {
		ADVDashboard.click();

	}

	public void clickFilter() {
		Filter.click();

	}

	public void clickFilter1() {
		Filter1.click();

	}

	public void clickF1() {
		F1.click();

	}

	public void clickFilter2() {
		Filter2.click();

	}

	public void clickF2() {
		F2.click();

	}

	public void clickFilter3() {
		Filter3.click();

	}

}
