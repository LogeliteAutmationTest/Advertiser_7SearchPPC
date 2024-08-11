package Com.ADV7Search.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class PageFactoryAdminMangePayoutPage {

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

// #********************************************Publisher Manage Payout Page**********************************

	@FindBy(xpath = "//span[normalize-space()='Manage Payout']")
	@CacheLookup
	WebElement AdminManagePayout;

	@FindBy(xpath = "//span[normalize-space()='Manage Payout Method']")
	@CacheLookup
	WebElement AdminManagePayoutMethod;

	@FindBy(xpath = "//span[normalize-space()='Add Method']")
	@CacheLookup
	WebElement AdminManagePayoutMethodAdd;

	@FindBy(xpath = "//input[@name='method_name']")
	@CacheLookup
	WebElement AdminManagePayoutMethodName;

	@FindBy(xpath = "//input[@name='display_name']")
	@CacheLookup
	WebElement AdminManagePayoutMethodDisplayName;

	@FindBy(xpath = "//input[@placeholder='Enter processing fee']")
	@CacheLookup
	WebElement AdminManagePayoutMethodprocessingfee;

	@FindBy(xpath = "//input[@placeholder='Enter min withdrawl']")
	@CacheLookup
	WebElement AdminManagePayoutMethodwithdrawl;

	@FindBy(xpath = "//input[@placeholder='Enter description']")
	@CacheLookup
	WebElement AdminManagePayoutMethodDescription;

	@FindBy(xpath = "//input[@id='customFile']")
	@CacheLookup
	WebElement AdminManagePayoutMethodUploadImage;

	@FindBy(xpath = "//em[@class='icon ni ni-cross-sm']")
	@CacheLookup
	WebElement AdminManagePayoutMethodAddCancel;

	@FindBy(xpath = "//body/div[@id='root']/div[contains(@class,'nk-app-root')]/div[contains(@class,'nk-main')]/div[contains(@class,'nk-wrap')]/div[contains(@class,'nk-content')]/div[contains(@class,'container-fluid')]/div[contains(@class,'nk-content-inner')]/div[contains(@class,'nk-content-body')]/div[contains(@class,'nk-block')]/div[contains(@class,'card-bordered boxscroll card')]/div[contains(@class,'card-inner-group')]/div[contains(@class,'card-inner p-0')]/div[contains(@class,'card-inner p-0')]/div[contains(@class,'')]/div[2]/div[9]/ul[1]/li[1]/div[1]/a[1]/em[1]")
	@CacheLookup
	WebElement AdminManagePayoutMethodThreeDot;

	@FindBy(xpath = "//div[contains(@class,'dropdown-menu dropdown-menu-right show')]//span[contains(text(),'Edit Method')]")
	@CacheLookup
	WebElement AdminManagePayoutMethodEdit;

// #********************************************Publisher Payout List Page**********************************

	@FindBy(xpath = "//span[normalize-space()='Pending Payout List']")
	@CacheLookup
	WebElement AdminManagePayoutPendingList;

	@FindBy(xpath = "//span[normalize-space()='Released Payout List']")
	@CacheLookup
	WebElement AdminManagePayoutReleaseList;

	@FindBy(xpath = "//span[normalize-space()='Hold Payout List']")
	@CacheLookup
	WebElement AdminManagePayoutHoldList;

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

// #*******************************************Publisher Manage Payout Page****************************************

	public void AdminManagePayout() {
		AdminManagePayout.click();
	}

	public void AdminManagePayoutMethod() {
		AdminManagePayoutMethod.click();
	}

	public void AdminManagePayoutMethodAdd() {
		AdminManagePayoutMethodAdd.click();
	}

	public void enterAdminManagePayoutMethodName() {
		AdminManagePayoutMethodName.sendKeys("Test1");
	}

	public void enterAdminManagePayoutMethodDisplayName() {
		AdminManagePayoutMethodDisplayName.sendKeys("testRajeev");
	}

	public void enterAdminManagePayoutMethodprocessingfee() {
		AdminManagePayoutMethodprocessingfee.sendKeys("435");
	}

	public void enterAdminManagePayoutMethodwithdrawl() {
		AdminManagePayoutMethodwithdrawl.sendKeys("100");
	}

	public void enterAdminManagePayoutMethodDescription() {
		AdminManagePayoutMethodDescription.sendKeys("Testrajeev123");
	}

	public void enterAdminManagePayoutMethodUploadImage() {
		AdminManagePayoutMethodUploadImage.sendKeys("C:\\Users\\DELL\\Downloads\\th.jpg");
	}

	public void AdminManagePayoutMethodAddCancel() {
		AdminManagePayoutMethodAddCancel.click();
	}

	public void AdminManagePayoutMethodThreeDot() {
		AdminManagePayoutMethodThreeDot.click();
	}

	public void AdminManagePayoutMethodEdit() {
		AdminManagePayoutMethodEdit.click();
	}

	public void AdminManagePayoutPendingList() {
		AdminManagePayoutPendingList.click();
	}

	public void AdminManagePayoutReleaseList() {
		AdminManagePayoutReleaseList.click();
	}

	public void AdminManagePayoutHoldList() {
		AdminManagePayoutHoldList.click();
	}

}
