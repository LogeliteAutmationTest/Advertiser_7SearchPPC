package Com.ADV7Search.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class PageFactoryAdminReferralManagePartnerInhousePage {
	
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

//#******************************************View Profile Page***************************************

		@FindBy(xpath = "//span[normalize-space()='Manage Partners']")
		@CacheLookup
		WebElement RefAdminManagePartners;

		@FindBy(xpath = "//span[normalize-space()='Inhouse']")
		@CacheLookup
		WebElement RefAdminManagePartnersInhouse;

		@FindBy(xpath = "//input[@id='default-04']")
		@CacheLookup
		WebElement RefAdminManagePartnersInhouseSearch;
		
		@FindBy(xpath = "//a[@class='dropdown-toggle btn btn-white btn-dim btn-outline-light']")
		@CacheLookup
		WebElement RefAdminManagePartnersInhouseByCountry;
		
		@FindBy(xpath = "//button[normalize-space()='Brazil']")
		@CacheLookup
		WebElement RefAdminManagePartnersInhouseByCountryBrazil;
		
		@FindBy(xpath = "//span[normalize-space()='By Status : All']")
		@CacheLookup
		WebElement RefAdminManagePartnersInhouseByStatus;
		
		@FindBy(xpath = "//a[@role='menuitem']//span[contains(text(),'Unverified')]")
		@CacheLookup
		WebElement RefAdminManagePartnersInhouseByStatusUnverified;
		
		@FindBy(xpath = "//a[@href='#dropdownitem']//span[contains(text(),'Active')]")
		@CacheLookup
		WebElement RefAdminManagePartnersInhouseByStatusActive;
		
		@FindBy(xpath = "//span[normalize-space()='By Status : Unverified']")
		@CacheLookup
		WebElement RefAdminManagePartnersInhouseByStatusUnver;
		
		
		@FindBy(xpath = "//input[@value='05-07-2023 - 09-09-2024']")
		@CacheLookup
		WebElement RefAdminManagePartnersInhouseDate;
		
		@FindBy(xpath = "//div[@aria-label='Choose Monday, September 2nd, 2024']")
		@CacheLookup
		WebElement RefAdminManagePartnersInhouse2Sept;
		
		@FindBy(xpath = "//div[@aria-label='Choose Tuesday, September 10th, 2024']")
		@CacheLookup
		WebElement RefAdminManagePartnersInhouse10Sept;
		
		@FindBy(xpath = "//span[normalize-space()='Search']")
		@CacheLookup
		WebElement RefAdminManagePartnersInhouseSearchButton;
		
		@FindBy(xpath = "//span[normalize-space()='Search']")
		@CacheLookup
		WebElement RefAdminManagePartnersInhouseSearchButton1;
		
		@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[10]/ul[1]/li[1]/div[1]/a[1]/em[1]")
		@CacheLookup
		WebElement RefAdminManagePartnersInhouseThreedot;
		
		@FindBy(xpath = "//div[contains(@class,'dropdown-menu dropdown-menu-right show')]//span[contains(text(),'Log In As User')]")
		@CacheLookup
		WebElement RefAdminManagePartnersInhouseThreedotLoginAsUser;
		
		@FindBy(xpath = "//div[contains(@class,'dropdown-menu dropdown-menu-right show')]//span[contains(text(),'Suspend')]")
		@CacheLookup
		WebElement RefAdminManagePartnersInhouseThreedotSuspend;
		
		@FindBy(xpath = "//div[contains(@class,'dropdown-menu dropdown-menu-right show')]//span[contains(text(),'Hold')]")
		@CacheLookup
		WebElement RefAdminManagePartnersInhouseThreedotHold;
		
		@FindBy(xpath = "//div[contains(@class,'dropdown-menu dropdown-menu-right show')]//span[contains(text(),'Make Partner')]")
		@CacheLookup
		WebElement RefAdminManagePartnersInhouseThreedotMakePartner;
		
		@FindBy(xpath = "//button[normalize-space()='19']")
		@CacheLookup
		WebElement RefAdminManagePartnersInhouseAdvAdd;
		
		@FindBy(xpath = "//div[5]//div[6]//a[1]//button[1]")
		@CacheLookup
		WebElement RefAdminManagePartnersInhousePubAdd;
		

		
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

//#*****************************************Manage Partners Inhouse Page***************************************

		public void RefAdminManagePartners() {
			RefAdminManagePartners.click();
		}

		public void RefAdminManagePartnersInhouse() {
			RefAdminManagePartnersInhouse.click();
		}
		
		public void RefAdminManagePartnersInhouseByCountry() {
			RefAdminManagePartnersInhouseByCountry.click();
		}
		public void enterRefAdminManagePartnersInhouseSearch() {
			RefAdminManagePartnersInhouseSearch.sendKeys("Raf");
		}
		
		public void RefAdminManagePartnersInhouseByCountryBrazil() {
			RefAdminManagePartnersInhouseByCountryBrazil.click();
		}
		
		public void RefAdminManagePartnersInhouseByStatus() {
			RefAdminManagePartnersInhouseByStatus.click();
		}

		public void RefAdminManagePartnersInhouseByStatusUnverified() {
			RefAdminManagePartnersInhouseByStatusUnverified.click();
		}
		
		public void RefAdminManagePartnersInhouseByStatusActive() {
			RefAdminManagePartnersInhouseByStatusActive.click();
		}
		
		public void RefAdminManagePartnersInhouseByStatusUnver() {
			RefAdminManagePartnersInhouseByStatusUnver.click();
		}

		
		public void RefAdminManagePartnersInhouseDate() {
			RefAdminManagePartnersInhouseDate.click();
		}
		
		public void RefAdminManagePartnersInhouse2Sept() {
			RefAdminManagePartnersInhouse2Sept.click();
		}
		
		public void RefAdminManagePartnersInhouse10Sept() {
			RefAdminManagePartnersInhouse10Sept.click();
		}
		
		public void RefAdminManagePartnersInhouseSearchButton() {
			RefAdminManagePartnersInhouseSearchButton.click();
		}
		
		public void RefAdminManagePartnersInhouseSearchButton1() {
			RefAdminManagePartnersInhouseSearchButton1.click();
		}
		
		public void RefAdminManagePartnersInhouseThreedot() {
			RefAdminManagePartnersInhouseThreedot.click();
		}
		public void RefAdminManagePartnersInhouseThreedotLoginAsUser() {
			RefAdminManagePartnersInhouseThreedotLoginAsUser.click();
		}
		
		public void RefAdminManagePartnersInhouseThreedotSuspend() {
			RefAdminManagePartnersInhouseThreedotSuspend.click();
		}
		public void RefAdminManagePartnersInhouseThreedotHold() {
			RefAdminManagePartnersInhouseThreedotHold.click();
		}
		
		public void RefAdminManagePartnersInhouseThreedotMakePartner() {
			RefAdminManagePartnersInhouseThreedotMakePartner.click();
		}
		public void RefAdminManagePartnersInhouseAdvAdd() {
			RefAdminManagePartnersInhouseAdvAdd.click();
		}
		
		public void RefAdminManagePartnersInhousePubAdd() {
			RefAdminManagePartnersInhousePubAdd.click();
		}
		
		
}
