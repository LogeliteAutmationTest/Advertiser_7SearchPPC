package Com.ADV7Search.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class PageFactoryAdminManageRolePage {

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

// #*********************************Manage Role Page********************************

	@FindBy(xpath = "//span[normalize-space()='Manage Roles']")
	@CacheLookup
	WebElement AdminManageRole;

	@FindBy(xpath = "//input[@id='default-04']")
	@CacheLookup
	WebElement AdminManageRoleSearch;

	@FindBy(xpath = "//span[normalize-space()='Add New Role']")
	@CacheLookup
	WebElement AdminManageRoleAddNewRole;

	@FindBy(xpath = "//input[@placeholder='Please Enter Role Name']")
	@CacheLookup
	WebElement AdminManageRoleName;
	

	@FindBy(xpath = "//span[normalize-space()='Display Role List']")
	@CacheLookup
	WebElement AdminManageThreeDotEditBackButton;

	@FindBy(xpath = "//label[@for='1pid-all']")
	@CacheLookup
	WebElement AdminManageRoleSelectADv;

	@FindBy(xpath = "//label[@for='16pid-all']")
	@CacheLookup
	WebElement AdminManageRoleSelectPUB;

	@FindBy(xpath = "//label[@for='29pid-all']")
	@CacheLookup
	WebElement AdminManageRoleManage;

	@FindBy(xpath = "//button[@class='btn btn-primary btn-sm']")
	@CacheLookup
	WebElement AdminManageRoleSubmit;

	@FindBy(xpath = "//body/div[@id='root']/div[@class='nk-app-root']/div[@class='nk-main']/div[@class='nk-wrap']/div[@class='nk-content']/div[@class='container-fluid']/div[@class='nk-content-inner']/div[@class='nk-content-body']/div[@class='nk-block nk-block-lg']/div[@id='roledata']/div[@class='col-lg-12']/div[@class='card-bordered card-stretch boxscroll card']/div[@class='card-inner-group']/div[@class='card-inner p-0 ']/div[1]/div[2]/div[4]/ul[1]/li[1]/div[1]/a[1]/em[1]")
	@CacheLookup
	WebElement AdminManageThreeDot;

	@FindBy(xpath = "//div[contains(@class,'dropdown-menu dropdown-menu-right show')]//span[contains(text(),'View')]")
	@CacheLookup
	WebElement AdminManageThreeDotView;

	@FindBy(xpath = "//em[contains(@class,'icon ni ni-cross-sm')]")
	@CacheLookup
	WebElement AdminManageThreeDotViewCross;

	@FindBy(xpath = "//a[@href='/add-new-role/OA==']//button[@role='menuitem']//span[@class='pl-2'][normalize-space()='Edit Role']")
	@CacheLookup
	WebElement AdminManageThreeDotEdit;

	@FindBy(xpath = "//label[contains(@for,'14pid-all')]")
	@CacheLookup
	WebElement AdminManageThreeDotEditSelect;

	@FindBy(xpath = "//button[@class='btn btn-primary btn-sm']")
	@CacheLookup
	WebElement AdminManageThreeDotEditSubmit;


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

// #*******************************************Publisher Manage Role Page****************************************

	public void AdminManageRole() {
		AdminManageRole.click();
	}

	public void enterAdminManageRoleSearch() {
		AdminManageRoleSearch.sendKeys("rajeev");
	}

	public void AdminManageRoleAddNewRole() {
		AdminManageRoleAddNewRole.click();
	}

	public void enterAdminManageRoleName() {
		AdminManageRoleName.sendKeys("Test");
	}

	public void AdminManageRoleSelectADv() {
		AdminManageRoleSelectADv.click();
	}

	public void AdminManageRoleSelectPUB() {
		AdminManageRoleSelectPUB.click();
	}

	public void AdminManageRoleManage() {
		AdminManageRoleManage.click();
	}

	public void AdminManageRoleSubmit() {
		AdminManageRoleSubmit.click();
	}

	public void AdminManageThreeDot() {
		AdminManageThreeDot.click();
	}

	public void AdminManageThreeDotView() {
		AdminManageThreeDotView.click();
	}

	public void AdminManageThreeDotViewCross() {
		AdminManageThreeDotViewCross.click();
	}

	public void AdminManageThreeDotEdit() {
		AdminManageThreeDotEdit.click();
	}

	public void AdminManageThreeDotEditSelect() {
		AdminManageThreeDotEditSelect.click();
	}

	public void AdminManageThreeDotEditSubmit() {
		AdminManageThreeDotEditSubmit.click();
	}

	public void AdminManageThreeDotEditBackButton() {
		AdminManageThreeDotEditBackButton.click();
	}

}
