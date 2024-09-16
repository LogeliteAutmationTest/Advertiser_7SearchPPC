package Com.ADV7Search.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class PageFactoryReferralNotifcationPage {

//#******************************************Login Page***************************************

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

//#******************************************Notification Page***************************************

		@FindBy(xpath = "//span[normalize-space()='Notification']")
		@CacheLookup
		WebElement RefNotification;

		@FindBy(xpath = "//a[1]//li[1]//div[2]//div[1]//b[1]")
		@CacheLookup
		WebElement RefNotificationOpen;
		
		@FindBy(xpath = "//span[@class='icon-wrapper']//em[@class='icon ni ni-arrow-left']")
		@CacheLookup
		WebElement RefNotificationOpenBack;
		
		@FindBy(xpath = "//em[@class='icon ni ni-downward-ios']")
		@CacheLookup
		WebElement RefNotificationPagenationdrop;
		
		@FindBy(xpath = "//span[normalize-space()='50']")
		@CacheLookup
		WebElement RefNotificationPagenationdrop50;
		
//#******************************************Login Page***************************************

		public void enterRefLoginEmail() {
			RefLoginEmail.sendKeys("rajeevgp1596+13@gmail.com");
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

//#*****************************************Payment Method Page***************************************

		public void RefNotification() {
			RefNotification.click();
		}
		
		public void RefNotificationOpen() {
			RefNotificationOpen.click();
		}
		
		public void RefNotificationOpenBack() {
			RefNotificationOpenBack.click();
		}
		
		public void RefNotificationPagenationdrop() {
			RefNotificationPagenationdrop.click();
		}
		
		public void RefNotificationPagenationdrop50() {
			RefNotificationPagenationdrop50.click();
		}

}
