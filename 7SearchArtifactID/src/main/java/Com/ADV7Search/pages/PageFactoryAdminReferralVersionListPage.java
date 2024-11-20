package Com.ADV7Search.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class PageFactoryAdminReferralVersionListPage {

//#******************************************Login Page**********************************************

	@FindBy(xpath = "//input[@id='default-01']")
	@CacheLookup
	WebElement RefAdminLoginEmail;

	@FindBy(xpath = "//input[@id='password']")
	@CacheLookup
	WebElement RefAdminLoginPassword;

	@FindBy(xpath = "//em[@class='passcode-icon icon-hide icon ni ni-eye-off']")
	@CacheLookup
	WebElement RefAdminLoginPasswordEye;

	@FindBy(xpath = "//button[@type='submit']")
	@CacheLookup
	WebElement RefAdminLoginButton;

//#******************************************Version List Page***************************************

	@FindBy(xpath = "//span[normalize-space()='Version List']")
	@CacheLookup
	WebElement RefAdminVersionList;

	@FindBy(xpath = "//span[normalize-space()='Add Version']")
	@CacheLookup
	WebElement RefAdminVersionListAdd;

	@FindBy(xpath = "//input[@placeholder='Enter Version name']")
	@CacheLookup
	WebElement RefAdminVersionListAddName;

	@FindBy(xpath = "//input[@placeholder='Enter Version']")
	@CacheLookup
	WebElement RefAdminVersionListAddVersion;

	@FindBy(xpath = "//button[@type='submit']")
	@CacheLookup
	WebElement RefAdminVersionListAddSubmit;

	@FindBy(xpath = "//em[@class='icon ni ni-cross-sm']")
	@CacheLookup
	WebElement RefAdminVersionListADDCross;

	@FindBy(xpath = "//body/div[@id='root']/div[contains(@class,'nk-app-root')]/div[contains(@class,'nk-main')]/div[contains(@class,'nk-wrap')]/div[contains(@class,'nk-content')]/div[contains(@class,'container-fluid')]/div[contains(@class,'nk-content-inner')]/div[contains(@class,'nk-content-body')]/div[contains(@class,'nk-block')]/div[contains(@class,'card-bordered boxscroll card')]/div[contains(@class,'card-inner-group')]/div[contains(@class,'card-inner p-0')]/div[contains(@class,'card-inner p-0')]/div[contains(@class,'')]/div[4]/div[4]/ul[1]/li[1]/div[1]/a[1]/em[1]")
	@CacheLookup
	WebElement RefAdminVersionListThreeDot;

	@FindBy(xpath = "//div[contains(@class,'dropdown-menu dropdown-menu-right show')]//span[contains(text(),'Edit Method')]")
	@CacheLookup
	WebElement RefAdminVersionListThreeDotEdit;

	@FindBy(xpath = "//input[contains(@placeholder,'Enter Version name')]")
	@CacheLookup
	WebElement RefAdminVersionListThreeDotEditName;

	@FindBy(xpath = "//button[@type='submit']")
	@CacheLookup
	WebElement RefAdminVersionListThreeDotEditSubmit;

	@FindBy(xpath = "//em[@class='icon ni ni-cross-sm']")
	@CacheLookup
	WebElement RefAdminVersionListThreeDotEditCross;

//#******************************************Login Page***************************************

	public void enterRefAdminLoginEmail() {
		RefAdminLoginEmail.sendKeys("Admin");
	}

	public void enterRefAdminLoginPassword() {
		RefAdminLoginPassword.sendKeys("123456");
	}

	public void RefAdminLoginPasswordEye() {
		RefAdminLoginPasswordEye.click();
	}

	public void RefAdminLoginButton() {
		RefAdminLoginButton.click();
	}

// #******************************************Version List Page***************************************

	public void RefAdminVersionList() {
		RefAdminVersionList.click();
	}

	public void RefAdminVersionListAdd() {
		RefAdminVersionListAdd.click();
	}

	public void enterRefAdminVersionListAddName() {
		RefAdminVersionListAddName.sendKeys("rajeev Test1");
	}

	public void enterRefAdminVersionListAddVersion() {
		RefAdminVersionListAddVersion.sendKeys("1.00.2");
	}

	public void RefAdminVersionListAddSubmit() {
		RefAdminVersionListAddSubmit.click();
	}

	public void RefAdminVersionListADDCross() {
		RefAdminVersionListADDCross.click();
	}

	public void RefAdminVersionListThreeDot() {
		RefAdminVersionListThreeDot.click();
	}

	public void RefAdminVersionListThreeDotEdit() {
		RefAdminVersionListThreeDotEdit.click();
	}

	public void enterRefAdminVersionListThreeDotEditName() {
		RefAdminVersionListThreeDotEditName.sendKeys("2");
	}

	public void RefAdminVersionListThreeDotEditSubmit() {
		RefAdminVersionListThreeDotEditSubmit.click();
	}

	public void RefAdminVersionListThreeDotEditCross() {
		RefAdminVersionListThreeDotEditCross.click();
	}

}
