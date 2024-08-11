package Com.ADV7Search.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class PageFactoryAdminPublisherWebsiteListPage {

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

// #********************************************Publisher Web site List Page**********************************

	@FindBy(xpath = "//span[normalize-space()='Website List']")
	@CacheLookup
	WebElement AdminManageWebsiteList;

	@FindBy(xpath = "//input[@id='default-04']")
	@CacheLookup
	WebElement AdminManageWebsiteListSearch;

	@FindBy(xpath = "//span[normalize-space()='By Category']")
	@CacheLookup
	WebElement AdminManageWebsiteListByCategory;

	@FindBy(xpath = "//a[@role='menuitem']//span[contains(text(),'Dating & Adult')]")
	@CacheLookup
	WebElement AdminManageWebsiteListByCategoryAdultDating;

	@FindBy(xpath = "//a[@role='menuitem']//span[contains(text(),'All Categories')]")
	@CacheLookup
	WebElement AdminManageWebsiteListByCategoryAllCategories;

	@FindBy(xpath = "//a[contains(@role,'menuitem')]//span[contains(text(),'Finance & Crypto')]")
	@CacheLookup
	WebElement AdminManageWebsiteListByCategoryCrypto;

	@FindBy(xpath = "//span[normalize-space()='Gambling']")
	@CacheLookup
	WebElement AdminManageWebsiteListByCategoryGambling;

	@FindBy(xpath = "//body/div[@id='root']/div[@class='nk-app-root']/div[@class='nk-main']/div[@class='nk-wrap']/div[@class='nk-content']/div[@class='container-fluid']/div[@class='nk-content-inner']/div[@class='nk-content-body']/div[@class='nk-block-head nk-block-head-sm']/div[contains(@class,'nk-block-between')]/div[@class='nk-block-head-content']/div[@class='toggle-wrap nk-block-tools-toggle']/div[@class='toggle-expand-content']/ul[@class='nk-block-tools g-3']/li[3]/div[1]/a[1]/span[1]")
	@CacheLookup
	WebElement AdminManageWebsiteListByStatus;

	@FindBy(xpath = "//a[@role='menuitem']//span[contains(text(),'In Review')]")
	@CacheLookup
	WebElement AdminManageWebsiteListByStatusInReview;

	@FindBy(xpath = "//a[@href='#dropdownitem']//span[contains(text(),'Hold')]")
	@CacheLookup
	WebElement AdminManageWebsiteListByStatusHold;

	@FindBy(xpath = "//span[normalize-space()='Approved']")
	@CacheLookup
	WebElement AdminManageWebsiteListByStatusApproved;

	@FindBy(xpath = "//span[normalize-space()='Suspended']")
	@CacheLookup
	WebElement AdminManageWebsiteListByStatusSuspended;

	@FindBy(xpath = "//span[normalize-space()='Rejected']")
	@CacheLookup
	WebElement AdminManageWebsiteListByStatusRejected;

	@FindBy(xpath = "//span[normalize-space()='By Operator']")
	@CacheLookup
	WebElement AdminManageWebsiteListByOperator;

	@FindBy(xpath = "//a[@role='menuitem']//span[contains(text(),'Client')]")
	@CacheLookup
	WebElement AdminManageWebsiteListByOperatorClient;

	@FindBy(xpath = "//a[@role='menuitem']//span[contains(text(),'Inhouse')]")
	@CacheLookup
	WebElement AdminManageWebsiteListByOperatorInhouse;

//		@FindBy(xpath = "//span[normalize-space()='Gambling']")
//		@CacheLookup
//		WebElement AdminManageWebsiteListByOperator;
//		
//		@FindBy(xpath = "//span[normalize-space()='Gambling']")
//		@CacheLookup
//		WebElement AdminManageWebsiteListByOperator;

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

// #*******************************************Manage Publisher Web site List Page****************************************

	public void AdminManageWebsiteList() {
		AdminManageWebsiteList.click();
	}

	public void AdminManageWebsiteListByCategory() {
		AdminManageWebsiteListByCategory.click();
	}

	public void enterAdminManageWebsiteListSearch() {
		AdminManageWebsiteListSearch.sendKeys("PUB660AAF4537B64");
	}

	public void AdminManageWebsiteListByCategoryAdultDating() {
		AdminManageWebsiteListByCategoryAdultDating.click();
	}

	public void AdminManageWebsiteListByCategoryAllCategories() {
		AdminManageWebsiteListByCategoryAllCategories.click();
	}

	public void AdminManageWebsiteListByCategoryCrypto() {
		AdminManageWebsiteListByCategoryCrypto.click();
	}

	public void AdminManageWebsiteListByCategoryGambling() {
		AdminManageWebsiteListByCategoryGambling.click();
	}

	public void AdminManageWebsiteListByStatus() {
		AdminManageWebsiteListByStatus.click();
	}

	public void AdminManageWebsiteListByStatusInReview() {
		AdminManageWebsiteListByStatusInReview.click();
	}

	public void AdminManageWebsiteListByStatusHold() {
		AdminManageWebsiteListByStatusHold.click();
	}

	public void AdminManageWebsiteListByStatusApproved() {
		AdminManageWebsiteListByStatusApproved.click();
	}

	public void AdminManageWebsiteListByStatusSuspended() {
		AdminManageWebsiteListByStatusSuspended.click();
	}

	public void AdminManageWebsiteListByStatusRejected() {
		AdminManageWebsiteListByStatusRejected.click();
	}

	public void AdminManageWebsiteListByOperator() {
		AdminManageWebsiteListByOperator.click();
	}

	public void AdminManageWebsiteListByOperatorClient() {
		AdminManageWebsiteListByOperatorClient.click();
	}

	public void AdminManageWebsiteListByOperatorInhouse() {
		AdminManageWebsiteListByOperatorInhouse.click();
	}

}
