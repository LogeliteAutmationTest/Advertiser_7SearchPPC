package Com.ADV7Search.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class PageFactoryAdminAdvertiserFeedbackPage {

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

// #********************************************Advertiser Feedback Page**********************************

	@FindBy(xpath = "//span[normalize-space()='Advertiser Feedback']")
	@CacheLookup
	WebElement AdminAdvertiserFeedback;

	@FindBy(xpath = "//input[@id='default-04']")
	@CacheLookup
	WebElement AdminAdvertiserFeedbackSearch;

	@FindBy(xpath = "//span[contains(text(),'By')]")
	@CacheLookup
	WebElement AdminAdvertiserFeedbackBYRating;

	@FindBy(xpath = "//span[normalize-space()='One Rating']")
	@CacheLookup
	WebElement AdminAdvertiserFeedbackBYRating1;

	@FindBy(xpath = "//span[normalize-space()='Two Rating']")
	@CacheLookup
	WebElement AdminAdvertiserFeedbackBYRating2;

	@FindBy(xpath = "//span[normalize-space()='Three Rating']")
	@CacheLookup
	WebElement AdminAdvertiserFeedbackBYRating3;

	@FindBy(xpath = "//span[normalize-space()='Four Rating']")
	@CacheLookup
	WebElement AdminAdvertiserFeedbackBYRating4;

	@FindBy(xpath = "//span[normalize-space()='Five Rating']")
	@CacheLookup
	WebElement AdminAdvertiserFeedbackBYRating5;

// #*******************************************Login Page****************************************

	public void enterEmail() {
		Email.sendKeys("admin");
	}

	public void enterPassword() {
		Password.sendKeys("7Search@pass123");
	}

	public void clickLoginButton() {
		clickLoginButton.click();

	}

// #*******************************************Advertiser Feedback Page****************************************

	public void AdminAdvertiserFeedback() {
		AdminAdvertiserFeedback.click();
	}

	public void enterAdminAdvertiserFeedbackSearch() {
		AdminAdvertiserFeedbackSearch.sendKeys("ADV6634D782BA824");
	}

	public void AdminAdvertiserFeedbackBYRating() {
		AdminAdvertiserFeedbackBYRating.click();
	}

	public void AdminAdvertiserFeedbackBYRating1() {
		AdminAdvertiserFeedbackBYRating1.click();
	}

	public void AdminAdvertiserFeedbackBYRating2() {
		AdminAdvertiserFeedbackBYRating2.click();
	}

	public void AdminAdvertiserFeedbackBYRating3() {
		AdminAdvertiserFeedbackBYRating3.click();
	}

	public void AdminAdvertiserFeedbackBYRating4() {
		AdminAdvertiserFeedbackBYRating4.click();
	}

	public void AdminAdvertiserFeedbackBYRating5() {
		AdminAdvertiserFeedbackBYRating5.click();
	}

}
