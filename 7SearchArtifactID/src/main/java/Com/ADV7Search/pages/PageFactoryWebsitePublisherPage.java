package Com.ADV7Search.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class PageFactoryWebsitePublisherPage {

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

// #*************************************Web site Page***************************************

	@FindBy(xpath = "//span[normalize-space()='Websites']")
	@CacheLookup
	WebElement PUBWebsite;
	
	@FindBy(xpath = "//span[normalize-space()='Inbox']")
	@CacheLookup
	WebElement PUBInbox;

	@FindBy(xpath = "//input[@id='default-04']")
	@CacheLookup
	WebElement WsSearch;

	@FindBy(xpath = "//span[normalize-space()='By Status']")
	@CacheLookup
	WebElement WsByStatus;

	@FindBy(xpath = "//a[@role='menuitem']//span[contains(text(),'In Review')]")
	@CacheLookup
	WebElement WsByStatusInReview;

	@FindBy(xpath = "//a[@role='menuitem']//span[contains(text(),'Active')]")
	@CacheLookup
	WebElement WsByStatusActive;

	@FindBy(xpath = "//span[normalize-space()='Hold']")
	@CacheLookup
	WebElement WsByStatusHold;

	@FindBy(xpath = "//a[@role='menuitem']//span[contains(text(),'Suspended')]")
	@CacheLookup
	WebElement WsByStatusSuspended;

	@FindBy(xpath = "//a[@role='menuitem']//span[contains(text(),'Rejected')]")
	@CacheLookup
	WebElement WsByStatusRejected;

	@FindBy(xpath = "//span[normalize-space()='Add New Website']")
	@CacheLookup
	WebElement AddNewWebsite;

	@FindBy(xpath = "//input[@placeholder='e.g. - domain.com or sub.domain.com']")
	@CacheLookup
	WebElement WebsiteURL;

	@FindBy(xpath = "//select[@name='website_category']")
	@CacheLookup
	WebElement WebsiteCategory;

	@FindBy(xpath = "//option[@value='17']")
	@CacheLookup
	WebElement SelectCategory;

	@FindBy(xpath = "//input[@placeholder='Ad unit name']")
	@CacheLookup
	WebElement WsAdUnitName;

	@FindBy(xpath = "//label[contains(@for,'adType1')]")
	@CacheLookup
	WebElement WsTextAdsType;

	@FindBy(xpath = "//label[@for='adType2']")
	@CacheLookup
	WebElement WsBannerAdsType;

	@FindBy(xpath = "//label[@for='adType3']")
	@CacheLookup
	WebElement WsNativeAdsType;

	@FindBy(xpath = "//label[@for='adType4']")
	@CacheLookup
	WebElement WsInPagePushAdsType;

	@FindBy(xpath = "//label[@for='adType5']")
	@CacheLookup
	WebElement WsPopUnderAdsType;

	@FindBy(xpath = "//label[@for='customCheck6']")
	@CacheLookup
	WebElement WsEroticAdsCheckBox;

	@FindBy(xpath = "//label[@for='customCheck7']")
	@CacheLookup
	WebElement WsAlertAdsCheckBox;

	@FindBy(xpath = "//button[@type='subit']")
	@CacheLookup
	WebElement WsSubmitButton;

	@FindBy(xpath = "//button[@type='submit']")
	@CacheLookup
	WebElement switchtoPublisher;

	@FindBy(xpath = "//button[normalize-space()='VERIFY']")
	@CacheLookup
	WebElement WebsiteVerify;
	
//			@FindBy(xpath = "//button[@type='submit']")
//			@CacheLookup
//			WebElement switchtoPublisher;
//			

// #*******************************************Login Page****************************************

	public void enterEmail() {
		Email.sendKeys("rajeevgp1596+20@gmail.com");
	}

	public void enterPassword() {
		Password.sendKeys("1234");
	}

	public void clickLoginButton() {
		clickLoginButton.click();

	}

// #****************************************Web site Page********************************************

	public void PUBWebsite() {
		PUBWebsite.click();

	}
	
	public void PUBInbox() {
		PUBInbox.click();

	}

	public void enterWsSearch() {
		WsSearch.sendKeys("metablog-rajeevgp.blogspot.com");

	}

	public void clickWsByStatus() {
		WsByStatus.click();

	}

	public void clickWsInReview() {
		WsByStatusInReview.click();

	}

	public void clickWsByStatusSuspended() {
		WsByStatusSuspended.click();

	}

	public void clickWsByStatusHold() {
		WsByStatusHold.click();

	}

	public void clickWsByStatusRejected() {
		WsByStatusRejected.click();

	}

	public void clickAddNewWebsite() {
		AddNewWebsite.click();

	}

	public void enterWebsiteURL() {
		WebsiteURL.sendKeys("meta14-3rajeev.blogspot.com");

	}

	public void clickWebsiteCategory() {
		WebsiteCategory.click();

	}

	public void clickSelectCategory() {
		SelectCategory.click();

	}

	public void enterWsAdUnitName() {
		WsAdUnitName.sendKeys("Automation Test");

	}

	public void clickWsTextAdsType() {
		WsTextAdsType.click();

	}

	public void clickWsBannerAdsType() {
		WsBannerAdsType.click();

	}

	public void clickWsNativeAdsType() {
		WsNativeAdsType.click();

	}

	public void clickWsInPagePushAdsType() {
		WsInPagePushAdsType.click();

	}

	public void clickWsPopUnderAdsType() {
		WsPopUnderAdsType.click();

	}

	public void clickWsEroticAdsCheckBox() {
		WsEroticAdsCheckBox.click();

	}

	public void clickWsAlertAdsCheckBox() {
		WsAlertAdsCheckBox.click();

	}

	public void clickWsSubmitButton() {
		WsSubmitButton.click();

	}

	public void clickswitchtoPublisher() {
		switchtoPublisher.click();

	}

	public void clickWebsiteVerify() {
		WebsiteVerify.click();

	}

//			public void clickWsSubmitButton() {
//				WsSubmitButton.click();
//				
//			}
//			

}