package Com.ADV7Search.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class PageFactoryInboxPublisherPage {
	
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
		
		@FindBy(xpath = "//button[@type='submit']")
		@CacheLookup
		WebElement switchtoPublisher;

// #************************************* Inbox Page***************************************

		@FindBy(xpath = "//span[normalize-space()='Inbox']")
		@CacheLookup
		WebElement PUBInbox;

		@FindBy(xpath = "//em[@class='icon ni ni-downward-ios']")
		@CacheLookup
		WebElement PUBPagenationDropDown;
		
		@FindBy(xpath = "//span[normalize-space()='20']")
		@CacheLookup
		WebElement PUBSelectPagenationDropDown;
		
// #*******************************************Login Page****************************************

		public void enterEmail() {
			Email.sendKeys("rajeevgp1596+20@gmail.com");
		}

		public void enterPassword() {
			Password.sendKeys("1234");
		}

		public void clickLoginButton() {
			clickLoginButton.click();

		}
		
		public void clickswitchtoPublisher() {
			switchtoPublisher.click();

		}

// #****************************************** Inbox Page *************************************************
		
		
		public void clickPUBInbox() {
			PUBInbox.click();

		}

		public void clickPUBPagenationDropDown() {
			PUBPagenationDropDown.click();

		}

		public void clickPUBSelectPagenationDropDown() {
			PUBSelectPagenationDropDown.click();

		}

}
