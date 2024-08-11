package Com.ADV7Search.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class PageFactoryAdminManageHeaderMessagePage {

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

// #*********************************Manage Header Message Page********************************

	@FindBy(xpath = "//span[normalize-space()='Header Message']")
	@CacheLookup
	WebElement AdminManageHeaderMessage;

	@FindBy(xpath = "//body/div[@id='root']/div[contains(@class,'nk-app-root')]/div[contains(@class,'nk-main')]/div[contains(@class,'nk-wrap')]/div[contains(@class,'nk-content')]/div[contains(@class,'container-fluid')]/div[contains(@class,'nk-content-inner')]/div[contains(@class,'nk-content-body')]/div[contains(@class,'nk-block')]/div[contains(@class,'card-bordered card-stretch boxscroll card')]/div[contains(@class,'card-inner-group')]/div[contains(@class,'card-inner p-0')]/div[contains(@class,'')]/div[2]/div[8]/ul[1]/li[1]/div[1]/a[1]/em[1]")
	@CacheLookup
	WebElement AdminManageHeaderMessageADVThreeDot;

	@FindBy(xpath = "//span[normalize-space()='Edit Advertiser Header Message']")
	@CacheLookup
	WebElement AdminManageHeaderMessageADVThreeDotEdit;

	@FindBy(xpath = "//button[contains(@type,'button')]")
	@CacheLookup
	WebElement AdminManageHeaderMessageADVThreeDotEditSubmit;

	@FindBy(xpath = "//em[@class='icon ni ni-cross-sm']")
	@CacheLookup
	WebElement AdminManageHeaderMessageADVThreeDotEditCross;

	@FindBy(xpath = "//body/div[@id='root']/div[@class='nk-app-root']/div[@class='nk-main']/div[@class='nk-wrap']/div[@class='nk-content']/div[@class='container-fluid']/div[@class='nk-content-inner']/div[@class='nk-content-body']/div[@class='nk-block']/div[@class='card-bordered card-stretch boxscroll card']/div[@class='card-inner-group']/div[@class='card-inner p-0 ']/div[1]/div[3]/div[8]/ul[1]/li[1]/div[1]/a[1]/em[1]")
	@CacheLookup
	WebElement AdminManageHeaderMessagePUBThreeDot;

	@FindBy(xpath = "//span[normalize-space()='Edit Publisher Header Message']")
	@CacheLookup
	WebElement AdminManageHeaderMessagePUBThreeDotEdit;

	@FindBy(xpath = "//button[contains(@type,'button')]")
	@CacheLookup
	WebElement AdminManageHeaderMessagePUBThreeDotSubmit;

	@FindBy(xpath = "//em[@class='icon ni ni-cross-sm']")
	@CacheLookup
	WebElement AdminManageHeaderMessagePUBThreeDotEditCross;

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

// #*******************************************Publisher Manage Notifications Page****************************************

	public void AdminManageHeaderMessage() {
		AdminManageHeaderMessage.click();
	}

	public void AdminManageHeaderMessageADVThreeDot() {
		AdminManageHeaderMessageADVThreeDot.click();
	}

	public void AdminManageHeaderMessageADVThreeDotEdit() {
		AdminManageHeaderMessageADVThreeDotEdit.click();
	}

	public void AdminManageHeaderMessageADVThreeDotEditSubmit() {
		AdminManageHeaderMessageADVThreeDotEditSubmit.click();
	}

	public void AdminManageHeaderMessageADVThreeDotEditCross() {
		AdminManageHeaderMessageADVThreeDotEditCross.click();
	}

	public void AdminManageHeaderMessagePUBThreeDot() {
		AdminManageHeaderMessagePUBThreeDot.click();
	}

	public void AdminManageHeaderMessagePUBThreeDotEdit() {
		AdminManageHeaderMessagePUBThreeDotEdit.click();
	}

	public void AdminManageHeaderMessagePUBThreeDotSubmit() {
		AdminManageHeaderMessagePUBThreeDotSubmit.click();
	}

	public void AdminManageHeaderMessagePUBThreeDotEditCross() {
		AdminManageHeaderMessagePUBThreeDotEditCross.click();
	}

}
