package Com.ADV7Search.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class PageFactoryAdminManageCouponListPage {

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

//#********************************************Manager Coupon List Page**********************************

	@FindBy(xpath = "//span[normalize-space()='Manage Coupons & Offers']")
	@CacheLookup
	WebElement AdminManagerCouponList;

	@FindBy(xpath = "//input[@id='default-04']")
	@CacheLookup
	WebElement AdminManagerCouponListSearch;

	@FindBy(xpath = "//em[@class='dd-indc icon ni ni-chevron-right']")
	@CacheLookup
	WebElement AdminManagerCouponListByStatus;

	@FindBy(xpath = "//div[@class='nk-block-head nk-block-head-sm']//li//li[2]//a[1]")
	@CacheLookup
	WebElement AdminManagerCouponListByStatusInActive;

	@FindBy(xpath = "//a[@href='#dropdownitem']//span[contains(text(),'Active')]")
	@CacheLookup
	WebElement AdminManagerCouponListByStatusActive;

	@FindBy(xpath = "//a[@role='menuitem']//span[contains(text(),'Expired')]")
	@CacheLookup
	WebElement AdminManagerCouponListByStatusExpired;

	@FindBy(xpath = "//span[normalize-space()='Manage Coupon Category']")
	@CacheLookup
	WebElement AdminManagerCouponListCouponCategory;

	@FindBy(xpath = "//span[contains(text(),'Add Category')]")
	@CacheLookup
	WebElement AdminManagerCouponListAddCategory;

	@FindBy(xpath = "//input[@id='category_name']")
	@CacheLookup
	WebElement AdminManagerCouponListCategoryName;

	@FindBy(xpath = "//span[contains(text(),'Add Category')]")
	@CacheLookup
	WebElement AdminManagerCouponListAddCategoryButton;

	@FindBy(xpath = "//body/div[@id='root']/div[contains(@class,'nk-app-root')]/div[contains(@class,'nk-main')]/div[contains(@class,'nk-wrap')]/div[contains(@class,'nk-content')]/div[contains(@class,'container-fluid')]/div[contains(@class,'nk-content-inner')]/div[contains(@class,'nk-content-body')]/div[contains(@class,'nk-block')]/div[contains(@class,'card-bordered boxscroll card')]/div[contains(@class,'card-inner-group')]/div[contains(@class,'card-inner p-0')]/div[contains(@class,'card-inner p-0')]/div[contains(@class,'')]/div[2]/div[6]/ul[1]/li[1]/div[1]/a[1]/em[1]")
	@CacheLookup
	WebElement AdminManagerCouponListCouponCategoryThreedot;

	@FindBy(xpath = "//div[@class='dropdown-menu dropdown-menu-right show']//span[contains(text(),'Edit Coupon Category')]")
	@CacheLookup
	WebElement AdminManagerCouponListCouponCategoryThreedotEdit;

	@FindBy(xpath = "//span[normalize-space()='Update Category']")
	@CacheLookup
	WebElement AdminManagerCouponListCouponCategoryThreedotEditUpdate;

	@FindBy(xpath = "//span[normalize-space()='Back']")
	@CacheLookup
	WebElement AdminManagerCouponListCouponCategoryThreedotBackButton;

//		@FindBy(xpath = "//span[normalize-space()='Manage Coupon Category']")
//		@CacheLookup
//		WebElement AdminManagerCouponList;
//		
//		@FindBy(xpath = "//span[normalize-space()='Manage Coupon Category']")
//		@CacheLookup
//		WebElement AdminManagerCouponList;
//		
//		@FindBy(xpath = "//span[normalize-space()='Manage Coupon Category']")
//		@CacheLookup
//		WebElement AdminManagerCouponList;
//		@FindBy(xpath = "//span[normalize-space()='Manage Coupon Category']")
//		@CacheLookup
//		WebElement AdminManagerCouponList;
//		

// #*******************************************Login Page****************************************

	public void enterEmail() {
		Email.sendKeys("admin");
	}

	public void enterPassword() {
		Password.sendKeys("7Search@pass123");
	}

	public void clickLoginButton() {
		clickLoginButton.click();

	}

// #*******************************************Manager Coupon List Page****************************************

	public void AdminManagerCouponList() {
		AdminManagerCouponList.click();

	}

	public void AdminManagerCouponListByStatus() {
		AdminManagerCouponListByStatus.click();

	}

	public void enterAdminManagerCouponListSearch() {
		AdminManagerCouponListSearch.sendKeys("CPN65535B2022CAC");
	}

	public void AdminManagerCouponListByStatusInActive() {
		AdminManagerCouponListByStatusInActive.click();

	}

	public void AdminManagerCouponListByStatusActive() {
		AdminManagerCouponListByStatusActive.click();

	}

	public void AdminManagerCouponListByStatusExpired() {
		AdminManagerCouponListByStatusExpired.click();

	}

	public void AdminManagerCouponListCouponCategory() {
		AdminManagerCouponListCouponCategory.click();

	}

	public void AdminManagerCouponListAddCategory() {
		AdminManagerCouponListAddCategory.click();

	}

	public void enterAdminManagerCouponListCategoryName() {
		AdminManagerCouponListCategoryName.sendKeys("test rajeev");

	}

	public void AdminManagerCouponListAddCategoryButton() {
		AdminManagerCouponListAddCategoryButton.click();

	}

	public void AdminManagerCouponListCouponCategoryThreedot() {
		AdminManagerCouponListCouponCategoryThreedot.click();

	}

	public void AdminManagerCouponListCouponCategoryThreedotEdit() {
		AdminManagerCouponListCouponCategoryThreedotEdit.click();

	}

	public void AdminManagerCouponListCouponCategoryThreedotEditUpdate() {
		AdminManagerCouponListCouponCategoryThreedotEditUpdate.click();

	}

	public void AdminManagerCouponListCouponCategoryThreedotBackButton() {
		AdminManagerCouponListCouponCategoryThreedotBackButton.click();

	}
//		public void AdminManagerCouponListAddCategory() {
//			AdminManagerCouponListAddCategory.click();
//
//		}

}
