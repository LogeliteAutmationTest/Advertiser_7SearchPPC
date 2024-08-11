package Com.ADV7Search.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class PageFactoryAdminManagePopupPage {

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

// #*********************************Manage Popup Page********************************

	@FindBy(xpath = "//span[normalize-space()='Manage Popup']")
	@CacheLookup
	WebElement AdminManagePopUp;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[9]/ul[1]/li[1]/div[1]/a[1]/em[1]")
	@CacheLookup
	WebElement AdminManagePopUpADVcongThreeDot;

	@FindBy(xpath = "//div[contains(@class,'dropdown show')]//span[1]")
	@CacheLookup
	WebElement AdminManagePopUpADVcongThreeDotEdit;

	@FindBy(xpath = "//button[contains(@type,'button')]")
	@CacheLookup
	WebElement AdminManagePopUpADVcongThreeDotSubmit;

	@FindBy(xpath = "//em[@class='icon ni ni-cross-sm']")
	@CacheLookup
	WebElement AdminManagePopUpADVcongThreeDotCross;

	@FindBy(xpath = "//body/div[@id='root']/div[@class='nk-app-root']/div[@class='nk-main']/div[@class='nk-wrap']/div[@class='nk-content']/div[@class='container-fluid']/div[@class='nk-content-inner']/div[@class='nk-content-body']/div[@class='nk-block']/div[@class='card-bordered card-stretch boxscroll card']/div[@class='card-inner-group']/div[@class='card-inner p-0 ']/div[1]/div[3]/div[9]/ul[1]/li[1]/div[1]/a[1]/em[1]")
	@CacheLookup
	WebElement AdminManagePopUpADVBalanceThreeDot;

	@FindBy(xpath = "//span[normalize-space()='Edit Insufficient Balance Popup']")
	@CacheLookup
	WebElement AdminManagePopUpADVBalanceThreeDotEdit;

	@FindBy(xpath = "//button[contains(@type,'button')]")
	@CacheLookup
	WebElement AdminManagePopUpADVBalanceThreeDotEditSubmit;

	@FindBy(xpath = "//em[@class='icon ni ni-cross-sm']")
	@CacheLookup
	WebElement AdminManagePopUpADVBalanceThreeDotEditCross;

	@FindBy(xpath = "//body/div[@id='root']/div[@class='nk-app-root']/div[@class='nk-main']/div[@class='nk-wrap']/div[@class='nk-content']/div[@class='container-fluid']/div[@class='nk-content-inner']/div[@class='nk-content-body']/div[@class='nk-block']/div[@class='card-bordered card-stretch boxscroll card']/div[@class='card-inner-group']/div[@class='card-inner p-0 ']/div[1]/div[4]/div[9]/ul[1]/li[1]/div[1]/a[1]/em[1]")
	@CacheLookup
	WebElement AdminManagePopUpPUBCongThreeDot;

	@FindBy(xpath = "//div[contains(@class,'dropdown show')]//span[1]")
	@CacheLookup
	WebElement AdminManagePopUpPUBCongThreeDotEdit;

	@FindBy(xpath = "//button[@type='button']")
	@CacheLookup
	WebElement AdminManagePopUpPUBCongThreeDotEditSubmit;

	@FindBy(xpath = "//em[@class='icon ni ni-cross-sm']")
	@CacheLookup
	WebElement AdminManagePopUpPUBCongThreeDotEditCross;

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

// #*******************************************Publisher Manage PopUp Page****************************************

	public void AdminManagePopUp() {
		AdminManagePopUp.click();
	}

	public void AdminManagePopUpADVcongThreeDot() {
		AdminManagePopUpADVcongThreeDot.click();
	}

	public void AdminManagePopUpADVcongThreeDotEdit() {
		AdminManagePopUpADVcongThreeDotEdit.click();
	}

	public void AdminManagePopUpADVcongThreeDotSubmit() {
		AdminManagePopUpADVcongThreeDotSubmit.click();
	}

	public void AdminManagePopUpADVcongThreeDotCross() {
		AdminManagePopUpADVcongThreeDotCross.click();
	}

	public void AdminManagePopUpADVBalanceThreeDot() {
		AdminManagePopUpADVBalanceThreeDot.click();
	}

	public void AdminManagePopUpADVBalanceThreeDotEdit() {
		AdminManagePopUpADVBalanceThreeDotEdit.click();
	}

	public void AdminManagePopUpADVBalanceThreeDotEditSubmit() {
		AdminManagePopUpADVBalanceThreeDotEditSubmit.click();
	}

	public void AdminManagePopUpADVBalanceThreeDotEditCross() {
		AdminManagePopUpADVBalanceThreeDotEditCross.click();
	}

	public void AdminManagePopUpPUBCongThreeDot() {
		AdminManagePopUpPUBCongThreeDot.click();
	}

	public void AdminManagePopUpPUBCongThreeDotEdit() {
		AdminManagePopUpPUBCongThreeDotEdit.click();
	}

	public void AdminManagePopUpPUBCongThreeDotEditSubmit() {
		AdminManagePopUpPUBCongThreeDotEditSubmit.click();
	}

	public void AdminManagePopUpPUBCongThreeDotEditCross() {
		AdminManagePopUpPUBCongThreeDotEditCross.click();
	}

}
