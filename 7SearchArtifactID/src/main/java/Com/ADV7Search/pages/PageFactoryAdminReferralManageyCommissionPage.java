package Com.ADV7Search.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class PageFactoryAdminReferralManageyCommissionPage {

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

//#******************************************Manage ADV Commissions Page***************************************

	@FindBy(xpath = "//span[normalize-space()='Manage Commissions']")
	@CacheLookup
	WebElement RefAdminManageCommissions;

	@FindBy(xpath = "//span[normalize-space()='Advertiser Commission']")
	@CacheLookup
	WebElement RefAdminManageAdvertiserCommissions;

	@FindBy(xpath = "//span[normalize-space()='Add Commission']")
	@CacheLookup
	WebElement RefAdminManageCommissionsAdd;

	@FindBy(xpath = "//input[@id='amount']")
	@CacheLookup
	WebElement RefAdminManageCommissionsAddAmount;

	@FindBy(xpath = "//input[@id='percentage']")
	@CacheLookup
	WebElement RefAdminManageCommissionsAddpercentage;

	@FindBy(xpath = "//label[@for='advAbove']")
	@CacheLookup
	WebElement RefAdminManageCommissionsAddCheckbox;

	@FindBy(xpath = "//button[@type='button']")
	@CacheLookup
	WebElement RefAdminManageCommissionsAddSubmit;

	@FindBy(xpath = "//button[@class='close btn']")
	@CacheLookup
	WebElement RefAdminManageCommissionsAddCross;

	@FindBy(xpath = "//body/div[@id='root']/div[@class='nk-app-root']/div[@class='nk-main']/div[@class='nk-wrap']/div[@class='nk-content']/div[@class='container-fluid']/div[@class='nk-content-inner']/div[@class='nk-content-body']/div[@class='nk-block']/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[7]/ul[1]/li[1]/div[1]/a[1]/em[1]")
	@CacheLookup
	WebElement RefAdminManageADVCommissionsThreeDot;

	@FindBy(xpath = "//div[contains(@class,'dropdown-menu dropdown-menu-right show')]//span[contains(text(),'Disable')]")
	@CacheLookup
	WebElement RefAdminManageADVCommissionsThreeDotDisable;

	@FindBy(xpath = "//div[contains(@class,'dropdown-menu dropdown-menu-right show')]//span[contains(text(),'Edit Commission')]")
	@CacheLookup
	WebElement RefAdminManageADVCommissionsThreeDotEdit;

	@FindBy(xpath = "//input[@id='amount']")
	@CacheLookup
	WebElement RefAdminManageADVCommissionsEditAmount;

	@FindBy(xpath = "//input[@id='percentage']")
	@CacheLookup
	WebElement RefAdminManageADVCommissionsEditPercentage;

	@FindBy(xpath = "//label[@for='advAbove']")
	@CacheLookup
	WebElement RefAdminManageADVCommissionsEditCheckbox;

	@FindBy(xpath = "//button[@type='button']")
	@CacheLookup
	WebElement RefAdminManageADVCommissionsAddSubmit;

	@FindBy(xpath = "//button[@class='close btn']")
	@CacheLookup
	WebElement RefAdminManageADVCommissionsEditAddCross;
	
	@FindBy(xpath = "//button[normalize-space()='Yes']")
	@CacheLookup
	WebElement RefAdminManageADVCommissionsThreeDotDisableYes;
	
	
//#*************************************Manage PUB Commissions Page**********************************


	@FindBy(xpath = "//span[@class='nk-menu-text'][normalize-space()='Publisher Commission']")
	@CacheLookup
	WebElement RefAdminManagePUBCommissions;

	@FindBy(xpath = "//span[normalize-space()='Add Commission']")
	@CacheLookup
	WebElement RefAdminManagePUBCommissionsAdd;

	@FindBy(xpath = "//input[@id='amount']")
	@CacheLookup
	WebElement RefAdminManagePUBCommissionsAddAmount;

	@FindBy(xpath = "//input[@id='percentage']")
	@CacheLookup
	WebElement RefAdminManagePUBCommissionsAddpercentage;

	@FindBy(xpath = "//label[@for='advAbove']")
	@CacheLookup
	WebElement RefAdminManagePUBCommissionsAddCheckbox;

	@FindBy(xpath = "//button[@type='button']")
	@CacheLookup
	WebElement RefAdminManagePUBCommissionsAddSubmit;

	@FindBy(xpath = "//button[@class='close btn']")
	@CacheLookup
	WebElement RefAdminManagePUBCommissionsAddCross;

	@FindBy(xpath = "//body/div[@id='root']/div[@class='nk-app-root']/div[@class='nk-main']/div[@class='nk-wrap']/div[@class='nk-content']/div[@class='container-fluid']/div[@class='nk-content-inner']/div[@class='nk-content-body']/div[@class='nk-block']/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[7]/ul[1]/li[1]/div[1]/a[1]/em[1]")
	@CacheLookup
	WebElement RefAdminManagePUBCommissionsThreeDot;

	@FindBy(xpath = "//div[contains(@class,'dropdown-menu dropdown-menu-right show')]//span[contains(text(),'Disable')]")
	@CacheLookup
	WebElement RefAdminManagePUBCommissionsThreeDotDisable;

	@FindBy(xpath = "//div[contains(@class,'dropdown-menu dropdown-menu-right show')]//span[contains(text(),'Edit Commission')]")
	@CacheLookup
	WebElement RefAdminManagePUBCommissionsThreeDotEdit;

	@FindBy(xpath = "//input[@id='amount']")
	@CacheLookup
	WebElement RefAdminManagePUBCommissionsEditAmount;

	@FindBy(xpath = "//input[@id='percentage']")
	@CacheLookup
	WebElement RefAdminManagePUBCommissionsEditPercentage;

	@FindBy(xpath = "//label[@for='advAbove']")
	@CacheLookup
	WebElement RefAdminManagePUBCommissionsEditCheckbox;

	@FindBy(xpath = "//button[@type='button']")
	@CacheLookup
	WebElement RefAdminManagePUBCommissionsEditUpdate;

	@FindBy(xpath = "//button[@class='close btn']")
	@CacheLookup
	WebElement RefAdminManagePUBCommissionsEditAddCross;
	
	@FindBy(xpath = "//button[normalize-space()='Yes']")
	@CacheLookup
	WebElement RefAdminManagePUBCommissionsThreeDotDisableYes;
	
	
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

//#******************************************Manage ADV Commissions Page***************************************

	public void RefAdminManageCommissions() {
		RefAdminManageCommissions.click();
	}

	public void RefAdminManageAdvertiserCommissions() {
		RefAdminManageAdvertiserCommissions.click();
	}

	public void RefAdminManageCommissionsAdd() {
		RefAdminManageCommissionsAdd.click();
	}

	public void enterRefAdminManageCommissionsAddAmount() {
		RefAdminManageCommissionsAddAmount.sendKeys("150");
	}

	public void enterRefAdminManageCommissionsAddpercentage() {
		RefAdminManageCommissionsAddpercentage.sendKeys("7");
	}

	public void RefAdminManageCommissionsAddCheckbox() {
		RefAdminManageCommissionsAddCheckbox.click();
	}

	public void RefAdminManageCommissionsAddSubmit() {
		RefAdminManageCommissionsAddSubmit.click();
	}

	public void RefAdminManageCommissionsAddCross() {
		RefAdminManageCommissionsAddCross.click();
	}

	public void RefAdminManageADVCommissionsThreeDot() {
		RefAdminManageADVCommissionsThreeDot.click();
	}

	public void RefAdminManageADVCommissionsThreeDotDisable() {
		RefAdminManageADVCommissionsThreeDotDisable.click();
	}

	public void RefAdminManageADVCommissionsThreeDotEdit() {
		RefAdminManageADVCommissionsThreeDotEdit.click();
	}

	public void enterRefAdminManageADVCommissionsEditAmount() {
		RefAdminManageADVCommissionsEditAmount.sendKeys("1");
	}

	public void enterRefAdminManageADVCommissionsEditPercentage() {
		RefAdminManageADVCommissionsEditPercentage.sendKeys("1");
	}

	public void RefAdminManageADVCommissionsEditCheckbox() {
		RefAdminManageADVCommissionsEditCheckbox.click();
	}

	public void RefAdminManageADVCommissionsAddSubmit() {
		RefAdminManageADVCommissionsAddSubmit.click();
	}

	public void RefAdminManageADVCommissionsEditAddCross() {
		RefAdminManageADVCommissionsEditAddCross.click();
	}
	
	public void RefAdminManageADVCommissionsThreeDotDisableYes() {
		RefAdminManageADVCommissionsThreeDotDisableYes.click();
	}
	
//#*************************************Manage PUB Commissions Page**********************************

	
	public void RefAdminManagePUBCommissions() {
		RefAdminManagePUBCommissions.click();
	}

	public void RefAdminManagePUBCommissionsAdd() {
		RefAdminManagePUBCommissionsAdd.click();
	}

	public void enterRefAdminManagePUBCommissionsAddAmount() {
		RefAdminManagePUBCommissionsAddAmount.sendKeys("150");
	}

	public void enterRefAdminManagePUBCommissionsAddpercentage() {
		RefAdminManagePUBCommissionsAddpercentage.sendKeys("7");
	}

	public void RefAdminManagePUBCommissionsAddCheckbox() {
		RefAdminManagePUBCommissionsAddCheckbox.click();
	}

	public void RefAdminManagePUBCommissionsAddSubmit() {
		RefAdminManagePUBCommissionsAddSubmit.click();
	}

	public void RefAdminManagePUBCommissionsAddCross() {
		RefAdminManagePUBCommissionsAddCross.click();
	}

	public void RefAdminManagePUBCommissionsThreeDot() {
		RefAdminManagePUBCommissionsThreeDot.click();
	}

	public void RefAdminManagePUBCommissionsThreeDotDisable() {
		RefAdminManagePUBCommissionsThreeDotDisable.click();
	}

	public void RefAdminManagePUBCommissionsThreeDotEdit() {
		RefAdminManagePUBCommissionsThreeDotEdit.click();
	}

	public void enterRefAdminManagePUBCommissionsEditAmount() {
		RefAdminManagePUBCommissionsEditAmount.sendKeys("2");
	}

	public void enterRefAdminManagePUBCommissionsEditPercentage() {
		RefAdminManagePUBCommissionsEditPercentage.sendKeys("1");
	}

	public void RefAdminManagePUBCommissionsEditCheckbox() {
		RefAdminManagePUBCommissionsEditCheckbox.click();
	}

	public void RefAdminManagePUBCommissionsAddUpdate() {
		RefAdminManagePUBCommissionsEditUpdate.click();
	}

	public void RefAdminManagePUBCommissionsEditAddCross() {
		RefAdminManagePUBCommissionsEditAddCross.click();
	}
	
	public void RefAdminManagePUBCommissionsThreeDotDisableYes() {
		RefAdminManagePUBCommissionsThreeDotDisableYes.click();
	}

}
