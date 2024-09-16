package Com.ADV7Search.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class PageFactoryReferralRegisterPage {
	
	
// #*************************************Reg. Page**************************************

		@FindBy(xpath = "//input[@id='first_name']")
		@CacheLookup
		WebElement RefFirstName;

		@FindBy(xpath = "//input[@id='last_name']")
		@CacheLookup
		WebElement RefLastName;

		@FindBy(xpath = "//input[@id='email']")
		@CacheLookup
		WebElement RefEmail;

		@FindBy(xpath = "//div[@id='country']/div/div")
		@CacheLookup
		WebElement RefCountry;
		
		@FindBy(id = "react-select-2-option-7")
		@CacheLookup
		WebElement RefCountryIndia;
		
		@FindBy(xpath = "//input[@id='state']")
		@CacheLookup
		WebElement RefState;
		
		@FindBy(xpath = "//input[@id='phone']")
		@CacheLookup
		WebElement RefPhone;
		
		@FindBy(xpath = "//input[@id='address']")
		@CacheLookup
		WebElement RefAddress;
		
		@FindBy(xpath = "//input[@id='password']")
		@CacheLookup
		WebElement RefPassword;
		
		@FindBy(xpath = "//input[@id='password_confirmation']")
		@CacheLookup
		WebElement RefConfirmPassword;
		
		@FindBy(xpath = "//a[@href='#password']//em[@class='passcode-icon icon-hide icon ni ni-eye-off']")
		@CacheLookup
		WebElement RefPasswordEye;
		
		@FindBy(xpath = "//a[@href='#cpassword']//em[@class='passcode-icon icon-hide icon ni ni-eye-off']")
		@CacheLookup
		WebElement RefConfirmPasswordEye;
		
		@FindBy(xpath = "//button[@type='submit']")
		@CacheLookup
		WebElement RefRegSubmit;
		
		@FindBy(xpath = "//a[normalize-space()='Sign in']")
		@CacheLookup
		WebElement RefRegSingnIn;
		
		@FindBy(xpath = "//input[@id='email']")
		@CacheLookup
		WebElement RefLoginEmail;
		
		@FindBy(xpath = "//input[@id='password']")
		@CacheLookup
		WebElement RefLoginPassword;
		
		@FindBy(xpath = "//em[@class='passcode-icon icon-hide icon ni ni-eye-off']")
		@CacheLookup
		WebElement RefLoginPasswordEye;
		
		@FindBy(xpath = "//button[@type='submit']")
		@CacheLookup
		WebElement RefLoginButton;
		
		
// #*************************************Reg. Page**************************************
		
		public void enterRefFirstName() {
			RefFirstName.sendKeys("Test");
		}

		public void enterRefLastName() {
			RefLastName.sendKeys("Rajeev");
		}
		
		public void enterRefEmail() {
			RefEmail.sendKeys("tifibe1959@brinkc.com");
		}

		public void RefCountry() {
			RefCountry.click();
		}
		
		public void RefCountryIndia() {
			RefCountryIndia.click();
		}

		public void enterRefState() {
			RefState.sendKeys("Test");
		}
		
		public void enterRefPhone() {
			RefPhone.sendKeys("56894255");
		}

		public void enterRefAddress() {
			RefAddress.sendKeys("testrajeev");
		}
		
		public void enterRefPassword() {
			RefPassword.sendKeys("123456");
		}
		
		public void enterRefConfirmPassword() {
			RefConfirmPassword.sendKeys("123456");
		}
		
		public void RefPasswordEye() {
			RefPasswordEye.click();
		}
		
		public void RefConfirmPasswordEye() {
			RefConfirmPasswordEye.click();
		}
		
		public void RefRegSubmit() {
			RefRegSubmit.click();
		}
		
		public void RefRegSingnIn() {
			RefRegSingnIn.click();
		}
		
		public void enterRefLoginEmail() {
			RefLoginEmail.sendKeys("hokej59751@acpeak.com");
		}
		
		public void enterRefLoginPassword() {
			RefLoginPassword.sendKeys("123456");
		}
		
		public void RefLoginPasswordEye() {
			RefLoginPasswordEye.click();
		}
		
		public void RefLoginButton() {
			RefLoginButton.click();
		}

}
