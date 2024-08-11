package Com.ADV7Search.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class PageFactoryAdminManageEmployeePage {

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

// #*********************************Manage Employee  Page********************************

	@FindBy(xpath = "//span[normalize-space()='Manage Employees']")
	@CacheLookup
	WebElement AdminManageEmployee;

	@FindBy(xpath = "//input[@id='default-04']")
	@CacheLookup
	WebElement AdminManageEmployeeSearch;

	@FindBy(xpath = "//span[contains(text(),'By')]")
	@CacheLookup
	WebElement AdminManageEmployeeByStatus;

	@FindBy(xpath = "//a[@role='menuitem']//span[contains(text(),'Active')]")
	@CacheLookup
	WebElement AdminManageEmployeeByStatusActive;

	@FindBy(xpath = "//a[@href='#dropdownitem']//span[contains(text(),'Inactive')]")
	@CacheLookup
	WebElement AdminManageEmployeeByStatusInActive;

	@FindBy(xpath = "//span[normalize-space()='Add New Employee']")
	@CacheLookup
	WebElement AdminManageEmployeeAddEmployee;

	@FindBy(xpath = "//input[@placeholder='Please Enter Name']")
	@CacheLookup
	WebElement AdminManageEmployeeAddEmployeeName;

	@FindBy(xpath = "//input[@placeholder='Please Enter User Name']")
	@CacheLookup
	WebElement AdminManageEmployeeAddUserName;

	@FindBy(xpath = "//div[@class='react-select__value-container css-1hwfws3']")
	@CacheLookup
	WebElement AdminManageEmployeeAddUserRoleID;
	
	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/div/div/div/form/div[1]/div[3]/div/div/div/div/div[1]")
	@CacheLookup
	WebElement AdminManageEmployeeAddUserRoleIDADVpannel;

	@FindBy(xpath = "//input[@placeholder='Please Enter Email']")
	@CacheLookup
	WebElement AdminManageEmployeeAddEmailId;

	@FindBy(xpath = "//input[@placeholder='Please Enter Password']")
	@CacheLookup
	WebElement AdminManageEmployeeAddPassword;

	@FindBy(xpath = "//span[normalize-space()='Generate Password']")
	@CacheLookup
	WebElement AdminManageEmployeeAddGeneratePassword;

	@FindBy(xpath = "//button[@type='submit']")
	@CacheLookup
	WebElement AdminManageEmployeeAddSubmit;

	@FindBy(xpath = "//body/div[@id='root']/div[contains(@class,'nk-app-root')]/div[contains(@class,'nk-main')]/div[contains(@class,'nk-wrap')]/div[contains(@class,'nk-content')]/div[contains(@class,'container-fluid')]/div[contains(@class,'nk-content-inner')]/div[contains(@class,'nk-content-body')]/div[contains(@class,'nk-block')]/div[contains(@class,'card-bordered card-stretch boxscroll card')]/div[contains(@class,'card-inner-group')]/div[contains(@class,'card-inner p-0')]/div[contains(@class,'')]/div[2]/div[7]/ul[1]/li[1]/div[1]/a[1]/em[1]")
	@CacheLookup
	WebElement AdminManageEmployeeThreeDot;

	@FindBy(xpath = "//div[contains(@class,'dropdown-menu dropdown-menu-right show')]//span[contains(text(),'Edit')]")
	@CacheLookup
	WebElement AdminManageEmployeeThreeDotEdit;

	@FindBy(xpath = "//button[contains(@type,'submit')]")
	@CacheLookup
	WebElement AdminManageEmployeeThreeDotEditUpdate;

	@FindBy(xpath = "//div[contains(@class,'dropdown-menu dropdown-menu-right show')]//span[contains(text(),'Inactive')]")
	@CacheLookup
	WebElement AdminManageEmployeeThreeDotInactive;

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

// #*******************************************Publisher Manage Employee Page****************************************

	public void AdminManageEmployee() {
		AdminManageEmployee.click();
	}

	public void enterAdminManageEmployeeSearch() {
		AdminManageEmployeeSearch.sendKeys("ADV652E5165508A0");
	}

	public void AdminManageEmployeeByStatus() {
		AdminManageEmployeeByStatus.click();
	}

	public void AdminManageEmployeeByStatusActive() {
		AdminManageEmployeeByStatusActive.click();
	}

	public void AdminManageEmployeeByStatusInActive() {
		AdminManageEmployeeByStatusInActive.click();
	}

	public void AdminManageEmployeeAddEmployee() {
		AdminManageEmployeeAddEmployee.click();
	}

	public void enterAdminManageEmployeeAddEmployeeName() {
		AdminManageEmployeeAddEmployeeName.sendKeys("Test rajeev");
	}

	public void enterAdminManageEmployeeAddUserName() {
		AdminManageEmployeeAddUserName.sendKeys("AutomationTest");
	}

	public void AdminManageEmployeeAddUserRoleId() {
		AdminManageEmployeeAddUserRoleID.click();
	}
	
	public void AdminManageEmployeeAddUserRoleIDADVpannel() {
		AdminManageEmployeeAddUserRoleIDADVpannel.click();
	}

	public void enterAdminManageEmployeeAddEmailId() {
		AdminManageEmployeeAddEmailId.sendKeys("rajeevtest01@gmail.com");
	}

	public void enterAdminManageEmployeeAddPassword() {
		AdminManageEmployeeAddPassword.sendKeys("123456");
	}

	public void AdminManageEmployeeAddSubmit() {
		AdminManageEmployeeAddSubmit.click();
	}

	public void AdminManageEmployeeThreeDot() {
		AdminManageEmployeeThreeDot.click();
	}

	public void AdminManageEmployeeThreeDotEdit() {
		AdminManageEmployeeThreeDotEdit.click();
	}

	public void AdminManageEmployeeThreeDotEditUpdate() {
		AdminManageEmployeeThreeDotEditUpdate.click();
	}

}
