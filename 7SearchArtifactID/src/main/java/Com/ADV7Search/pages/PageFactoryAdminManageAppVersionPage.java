package Com.ADV7Search.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class PageFactoryAdminManageAppVersionPage {
	
	
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

// #*********************************Manage App Version Page********************************

			@FindBy(xpath = "//span[normalize-space()='Manage App Version']")
			@CacheLookup
			WebElement AdminManageAppVersion;

			@FindBy(xpath = "//body/div[@id='root']/div[contains(@class,'nk-app-root')]/div[contains(@class,'nk-main')]/div[contains(@class,'nk-wrap')]/div[contains(@class,'nk-content')]/div[contains(@class,'container-fluid')]/div[contains(@class,'nk-content-inner')]/div[contains(@class,'nk-content-body')]/div[contains(@class,'nk-block')]/div[contains(@class,'card-bordered card-stretch boxscroll card')]/div[contains(@class,'card-inner-group')]/div[contains(@class,'card-inner p-0')]/div[contains(@class,'')]/div[2]/div[4]/ul[1]/li[1]/div[1]/a[1]/em[1]")
			@CacheLookup
			WebElement AdminManageAppVersionThreeDot;
			
			@FindBy(xpath = "//div[@class='dropdown-menu dropdown-menu-right show']//a[@role='menuitem']")
			@CacheLookup
			WebElement AdminManageAppVersionEdit;
			
			@FindBy(xpath = "//em[contains(@class,'icon ni ni-cross-sm')]")
			@CacheLookup
			WebElement AdminManageAppVersionCross;
			
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

// #*******************************************Publisher Manage App Version Page****************************************

			public void AdminManageAppVersion() {
				AdminManageAppVersion.click();
			}
			
			public void AdminManageAppVersionThreeDot() {
				AdminManageAppVersionThreeDot.click();
			}
			
			public void AdminManageAppVersionEdit() {
				AdminManageAppVersionEdit.click();
			}
			
			public void AdminManageAppVersionCross() {
				AdminManageAppVersionCross.click();
			}

}
