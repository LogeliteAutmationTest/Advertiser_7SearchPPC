package Com.ADV7Search.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class PageFactoryAdminAddNewUserPage {

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

// #********************************************Add New User Page**********************************

	@FindBy(xpath = "//span[normalize-space()='Add New Users']")
	@CacheLookup
	WebElement AdminAddNewUser;

	@FindBy(xpath = "//input[@placeholder='Please Enter First Name']")
	@CacheLookup
	WebElement AdminFirstName;

	@FindBy(xpath = "//input[@placeholder='Please Enter Last Name']")
	@CacheLookup
	WebElement AdminLastName;

	@FindBy(xpath = "//input[@placeholder='Please Enter Email']")
	@CacheLookup
	WebElement AdminEnterEmail;

	@FindBy(xpath = "//form[@id='create-course-form']/div[2]/div/div/div/div/div/div/div/div/div/div")
	@CacheLookup
	WebElement AdminCountry;

	@FindBy(id = "react-select-2-option-4")
	@CacheLookup
	WebElement AdminSelectIndia;

	@FindBy(xpath = "//input[@placeholder='Please Enter Phone No.']")
	@CacheLookup
	WebElement AdminPhoneNo;

	@FindBy(xpath = "//form[@id='create-course-form']/div[2]/div/div/div[3]/div/div/div/div/div/div")
	@CacheLookup
	WebElement AdminCategory;

	@FindBy(id = "react-select-3-option-2")
	@CacheLookup
	WebElement AdminselectCategory;

	@FindBy(xpath = "//input[@placeholder='Please Enter address']")
	@CacheLookup
	WebElement AdminEnterAddress;

	@FindBy(xpath = "//input[@placeholder='Please Enter address line 2']")
	@CacheLookup
	WebElement AdminEnterAddress2;

	@FindBy(xpath = "//input[@placeholder='Please Enter city']")
	@CacheLookup
	WebElement AdminEnterCity;

	@FindBy(xpath = "//input[@placeholder='Please Enter state']")
	@CacheLookup
	WebElement AdminEnterState;

	@FindBy(xpath = "//input[@placeholder='Please Enter Password']")
	@CacheLookup
	WebElement AdminEnterPassword;

	@FindBy(xpath = "//form[@id='create-course-form']/div[3]/div/div[2]/div[3]/div/div/div/div/div/div/div")
	@CacheLookup
	WebElement AdminAccounType;

	@FindBy(id = "react-select-4-option-0")
	@CacheLookup
	WebElement AdminSelectADV;

	@FindBy(xpath = "//label[@for='verifymailuser']")
	@CacheLookup
	WebElement AdmincheckBox;

	@FindBy(xpath = "//button[@class='btn btn-primary btn-sm']")
	@CacheLookup
	WebElement AdminSaveButton;

// #*******************************************Login Page****************************************

	public void enterEmail() {
		Email.sendKeys("admin");
	}

	public void enterPassword() {
		Password.sendKeys("7Search@pass123");
	}
	// 7Search@passcom555

	public void clickLoginButton() {
		clickLoginButton.click();

	}

// #*******************************************Add New User Page****************************************

	public void AdminAddNewUser() {
		AdminAddNewUser.click();
	}

	public void enterAdminFirstName() {
		AdminFirstName.sendKeys("Test");
	}

	public void enterAdminLastName() {
		AdminLastName.sendKeys("Rajeev");
	}

	public void enterAdminEnterEmail() {
		AdminEnterEmail.sendKeys("Test@gmail.com");
	}

	public void AdminCountry() {
		AdminCountry.click();
	}

	public void AdminSelectIndia() {
		AdminSelectIndia.click();
	}

	public void enterAdminPhoneNo() {
		AdminPhoneNo.sendKeys("76556456435");
	}

	public void AdminCategory() {
		AdminCategory.click();
	}

	public void AdminselectCategory() {
		AdminselectCategory.click();
	}

	public void enterAdminEnterAddress() {
		AdminEnterAddress.sendKeys("76556AdminEnterAddress456435");
	}

	public void enterAdminEnterAddress2() {
		AdminEnterAddress2.sendKeys("765564AdminEnterAddress56435");
	}

	public void enterAdminEnterCity() {
		AdminEnterCity.sendKeys("Testdssd");
	}

	public void enterAdminEnterState() {
		AdminEnterState.sendKeys("jksddfsk");
	}

	public void enterAdminEnterPassword() {
		AdminEnterPassword.sendKeys("123456");
	}

	public void AdminAccounType() {
		AdminAccounType.click();
	}

	public void AdminSelectADV() {
		AdminSelectADV.click();
	}

	public void AdmincheckBox() {
		AdmincheckBox.click();
	}

	public void AdminSaveButton() {
		AdminSaveButton.click();
	}

}
