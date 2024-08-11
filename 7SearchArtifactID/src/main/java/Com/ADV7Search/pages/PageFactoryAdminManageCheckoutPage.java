package Com.ADV7Search.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class PageFactoryAdminManageCheckoutPage {

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

// #*********************************Manage Checkout Page********************************

	@FindBy(xpath = "//span[normalize-space()='Manage Checkout']")
	@CacheLookup
	WebElement AdminManageCheckout;

	@FindBy(xpath = "//span[normalize-space()='Manage Content']")
	@CacheLookup
	WebElement AdminManageContent;

	@FindBy(xpath = "//em[contains(@class,'icon ni ni-more-h')]")
	@CacheLookup
	WebElement AdminManageContentThreeDot;

	@FindBy(xpath = "//a[@role='menuitem']")
	@CacheLookup
	WebElement AdminManageContentEdit;

	@FindBy(xpath = "//button[@class='btn btn-primary btn-md']")
	@CacheLookup
	WebElement AdminManageContentSubmitButton;

	@FindBy(xpath = "//em[@class='icon ni ni-cross-sm']")
	@CacheLookup
	WebElement AdminManageContentCross;

	@FindBy(xpath = "//span[normalize-space()='Manage Payment Gateway']")
	@CacheLookup
	WebElement AdminManagePaymentGateway;

	@FindBy(xpath = "//span[normalize-space()='Add Payment Gateway']")
	@CacheLookup
	WebElement AdminManagePaymentGatewayAdd;

	@FindBy(xpath = "//input[@id='title']")
	@CacheLookup
	WebElement AdminManagePaymentGatewayTitle;

	@FindBy(xpath = "//input[@id='sub_title']")
	@CacheLookup
	WebElement AdminManagePaymentGatewaySubTitle;

	@FindBy(xpath = "//input[@id='image']")
	@CacheLookup
	WebElement AdminManagePaymentGatewayUploadImage;

	@FindBy(xpath = "//button[@type='submit']")
	@CacheLookup
	WebElement AdminManagePaymentGatewaySubmitButton;

	@FindBy(xpath = "//em[@class='icon ni ni-cross-sm']")
	@CacheLookup
	WebElement AdminManagePaymentGatewaycross;

	@FindBy(xpath = "//body/div[@id='root']/div[@class='nk-app-root']/div[@class='nk-main']/div[@class='nk-wrap']/div[@class='nk-content']/div[@class='container-fluid']/div[@class='nk-content-inner']/div[@class='nk-content-body']/div[@class='nk-block']/div[@class='card-bordered card-stretch boxscroll card']/div[@class='card-inner-group']/div[@class='card-inner p-0 ']/div[1]/div[2]/div[7]/ul[1]/li[1]/div[1]/a[1]/em[1]")
	@CacheLookup
	WebElement AdminManagePaymentGatewayThreeDot;

	@FindBy(xpath = "//div[contains(@class,'dropdown-menu dropdown-menu-right show')]//span[contains(text(),'Edit Payment Gateway')]")
	@CacheLookup
	WebElement AdminManagePaymentGatewayEdit;

	@FindBy(xpath = "//em[contains(@class,'icon ni ni-cross-sm')]")
	@CacheLookup
	WebElement AdminManagePaymentGatewayEditCross;

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

// #*******************************************Publisher Manage Checkout Page****************************************

	public void AdminManageCheckout() {
		AdminManageCheckout.click();
	}

	public void AdminManageContent() {
		AdminManageContent.click();
	}

	public void AdminManageContentThreeDot() {
		AdminManageContentThreeDot.click();
	}

	public void AdminManageContentEdit() {
		AdminManageContentEdit.click();
	}

	public void AdminManageContentSubmitButton() {
		AdminManageContentSubmitButton.click();
	}

	public void AdminManageContentCross() {
		AdminManageContentCross.click();
	}

	public void AdminManagePaymentGateway() {
		AdminManagePaymentGateway.click();
	}

	public void AdminManagePaymentGatewayAdd() {
		AdminManagePaymentGatewayAdd.click();
	}

	public void enterAdminManagePaymentGatewayTitle() {
		AdminManagePaymentGatewayTitle.sendKeys("test");
	}

	public void enterAdminManagePaymentGatewaySubTitle() {
		AdminManagePaymentGatewaySubTitle.sendKeys("test1");
	}

	public void enterAdminManagePaymentGatewayUploadImage() {
		AdminManagePaymentGatewayUploadImage.sendKeys("C:\\Users\\DELL\\Downloads\\th (2).jpg");
	}

	public void AdminManagePaymentGatewaySubmitButton() {
		AdminManagePaymentGatewaySubmitButton.click();
	}

	public void AdminManagePaymentGatewaycross() {
		AdminManagePaymentGatewaycross.click();
	}

	public void AdminManagePaymentGatewayThreeDot() {
		AdminManagePaymentGatewayThreeDot.click();
	}

	public void AdminManagePaymentGatewayEdit() {
		AdminManagePaymentGatewayEdit.click();
	}

	public void AdminManagePaymentGatewayEditCross() {
		AdminManagePaymentGatewayEditCross.click();
	}

}
