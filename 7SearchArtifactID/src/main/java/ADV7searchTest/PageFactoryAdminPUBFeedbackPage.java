package ADV7searchTest;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class PageFactoryAdminPUBFeedbackPage {

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

// #*********************************Publisher Feedback Page********************************

	@FindBy(xpath = "//span[normalize-space()='Publisher Feedback']")
	@CacheLookup
	WebElement AdminManagePublisherFeedback;

	@FindBy(xpath = "//input[@id='default-04']")
	@CacheLookup
	WebElement AdminManagePublisherFeedbackSearch;

	@FindBy(xpath = "//span[contains(text(),'By')]")
	@CacheLookup
	WebElement AdminManagePublisherFeedbackBYRating;

	@FindBy(xpath = "//span[normalize-space()='One Rating']")
	@CacheLookup
	WebElement AdminManagePublisherFeedbackBYRating1;

	@FindBy(xpath = "//span[normalize-space()='Two Rating']")
	@CacheLookup
	WebElement AdminManagePublisherFeedbackBYRating2;

	@FindBy(xpath = "//span[normalize-space()='Three Rating']")
	@CacheLookup
	WebElement AdminManagePublisherFeedbackBYRating3;

	@FindBy(xpath = "//span[normalize-space()='Four Rating']")
	@CacheLookup
	WebElement AdminManagePublisherFeedbackBYRating4;

	@FindBy(xpath = "//span[normalize-space()='Five Rating']")
	@CacheLookup
	WebElement AdminManagePublisherFeedbackBYRating5;

	@FindBy(xpath = "//div[5]//div[4]//span[1]//a[1]//button[1]")
	@CacheLookup
	WebElement AdminManagePublisherFeedbackViewAttachment;

// #*************************************Login Page************************************

	public void enterEmail() {
		Email.sendKeys("admin");
	}

	public void enterPassword() {
		Password.sendKeys("7Search@pass123");
	}

	public void clickLoginButton() {
		clickLoginButton.click();

	}

// #*******************************************Publisher Feedback Page****************************************

	public void AdminManagePublisherFeedback() {
		AdminManagePublisherFeedback.click();
	}

	public void enterAdminManagePublisherFeedbackSearch() {
		AdminManagePublisherFeedbackSearch.sendKeys("ADV652E5165508A0");
	}

	public void AdminManagePublisherFeedbackBYRating() {
		AdminManagePublisherFeedbackBYRating.click();
	}

	public void AdminManagePublisherFeedbackBYRating1() {
		AdminManagePublisherFeedbackBYRating1.click();
	}

	public void AdminManagePublisherFeedbackBYRating2() {
		AdminManagePublisherFeedbackBYRating2.click();
	}

	public void AdminManagePublisherFeedbackBYRating3() {
		AdminManagePublisherFeedbackBYRating3.click();
	}

	public void AdminManagePublisherFeedbackBYRating4() {
		AdminManagePublisherFeedbackBYRating4.click();
	}

	public void AdminManagePublisherFeedbackBYRating5() {
		AdminManagePublisherFeedbackBYRating5.click();
	}

	public void AdminManagePublisherFeedbackViewAttachment() {
		AdminManagePublisherFeedbackViewAttachment.click();
	}

}
