package Com.ADV7Search.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class PageFactoryProfilePage {
	
// #***************************Login Page*******************************

			@FindBy(xpath = "//input[@id='default-01']")
			@CacheLookup
			WebElement Email;

			@FindBy(xpath = "//input[@id='password']")
			@CacheLookup
			WebElement Password;

			@FindBy(xpath = "//button[@type='submit']")
			@CacheLookup
			WebElement clickLoginButton;
			
// #***************************Profile Page*******************************
			
			@FindBy(xpath = "//span[normalize-space()='Profile']")
			@CacheLookup
			WebElement Profile;
			
			@FindBy(xpath = "//em[@class='icon ni ni-more-v']")
			@CacheLookup
			WebElement ProfileThreeDot;
			
			@FindBy(xpath = "//span[normalize-space()='Update Profile']")
			@CacheLookup
			WebElement UpdateProfile;
			
			@FindBy(xpath = "//input[@id='address1']")
			@CacheLookup
			WebElement ProfileAddress1;
			
			@FindBy(xpath = "//div[9]//div[1]//input[1]")
			@CacheLookup
			WebElement ProfileCity;
			
			@FindBy(xpath = "//button[@class='btn btn-primary btn-lg']")
			@CacheLookup
			WebElement ProfileUpdate;
			
			@FindBy(xpath = "//div[@class='nk-block-head nk-block-head-lg']//span[1]")
			@CacheLookup
			WebElement EditProfile;
			
// #***************************AccountActivity Page*******************************
			
			@FindBy(xpath = "//div[@class='card-inner p-0']//li[1]//a[1]")
			@CacheLookup
			WebElement AccountActivity;
			
// #***************************Change Password Page*******************************
			
			@FindBy(xpath = "//span[normalize-space()='Change Password']")
			@CacheLookup
			WebElement ChangePassword;
			
			@FindBy(xpath = "//input[@placeholder='Enter your current password']")
			@CacheLookup
			WebElement CurrenPassword;
			
			@FindBy(xpath = "//input[@placeholder='Enter your new password']")
			@CacheLookup
			WebElement NewPassword;
			
			@FindBy(xpath = "//input[@placeholder='Repeat your new password']")
			@CacheLookup
			WebElement RepeatPassword;
			
			@FindBy(xpath = "//button[normalize-space()='Update Password']")
			@CacheLookup
			WebElement UpdatePassword;
			
			@FindBy(xpath = "//div[@class='col-md-6']//div[1]//div[1]//a[1]//em[2]")
			@CacheLookup
			WebElement PasswordEyeicon;
			
			
			
			
// #***************************Login Page*******************************
			
			public void enterEmail() {
				Email.sendKeys("rajeevgp1596@gmail.com");
			}

			public void enterPassword() {
				Password.sendKeys("Tester@01");
			}

			public void clickLoginButton() {
				clickLoginButton.click();

			}
			
// #***************************Profile Page*******************************
			
			public void clickProfile() {
				Profile.click();
			}
				
			public void clickProfileThreeDot() {
				ProfileThreeDot.click();				
				
			}
			
			public void clickUpdateProfile() {
				UpdateProfile.click();				
				
			}
			public void enterProfileAddress1() {
				ProfileAddress1.sendKeys("test");				
				
			}
			public void enterProfileCity() {
				ProfileCity.sendKeys("Lucknow");				
				
			}
			public void clickProfileUpdate() {
				ProfileUpdate.click();				
				
			}
			public void clickEditProfile() {
				EditProfile.click();				
				
			}
			
// #***************************AccountActivity Page*******************************
			
			public void clickAccountActivity() {
				AccountActivity.click();				
				
			}
			
// #***************************ChangePassword Page*******************************
			
			public void clickChangePassword() {
				ChangePassword.click();				
				
			}
			public void enterCurrenPassword() {
				CurrenPassword.sendKeys("Tester@01");				
				
			}
			public void enterNewPassword() {
				NewPassword.sendKeys("Lucknow");				
				
			}
			public void enterRepeatPassword() {
				ProfileCity.sendKeys("Lucknow");				
				
			}
			public void clickUpdatePassword() {
				UpdatePassword.click();				
				
			}
			
			public void clickPasswordEyeicon() {
				PasswordEyeicon.click();				
				
			}
			
			
}
