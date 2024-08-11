package Com.ADV7Search.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class PageFactoryAdminManageCategoryPage {

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

//#********************************************Manager Category Page**********************************

	@FindBy(xpath = "//span[normalize-space()='Manage Category']")
	@CacheLookup
	WebElement AdminManagerCategory;

	@FindBy(xpath = "//input[@id='default-04']")
	@CacheLookup
	WebElement AdminManagerCategorySearch;

	@FindBy(xpath = "//span[contains(text(),'Add Category')]")
	@CacheLookup
	WebElement AdminManagerCategoryADD;

	@FindBy(xpath = "//input[@name='cat_name']")
	@CacheLookup
	WebElement AdminManagerCategoryName;

	@FindBy(xpath = "//input[@name='cpm']")
	@CacheLookup
	WebElement AdminManagerCategoryCPM;

	@FindBy(xpath = "//input[@name='cpc']")
	@CacheLookup
	WebElement AdminManagerCategoryCPC;

	@FindBy(xpath = "//input[@name='cpa_imp']")
	@CacheLookup
	WebElement AdminManagerCategoryCPAImp;

	@FindBy(xpath = "//input[@name='cpa_click']")
	@CacheLookup
	WebElement AdminManagerCategoryCPAClick;

	@FindBy(xpath = "//input[@name='video_adv']")
	@CacheLookup
	WebElement AdminManagerCategoryVideoADV;

	@FindBy(xpath = "//input[@name='video_pub']")
	@CacheLookup
	WebElement AdminManagerCategoryVideoPUB;

	@FindBy(xpath = "//input[@name='pub_cpm']")
	@CacheLookup
	WebElement AdminManagerCategoryPUBCpm;

	@FindBy(xpath = "//input[@name='pub_cpc']")
	@CacheLookup
	WebElement AdminManagerCategoryPUBCPC;

	@FindBy(xpath = "//span[contains(text(),'Add Category')]")
	@CacheLookup
	WebElement AdminManagerCategorySubmit;

	@FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[14]/ul[1]/li[1]/div[1]/a[1]/em[1]")
	@CacheLookup
	WebElement AdminManagerCategoryThreeDot;

	@FindBy(xpath = "//div[contains(@class,'dropdown-menu dropdown-menu-right show')]//span[contains(text(),'Edit Category')]")
	@CacheLookup
	WebElement AdminManagerCategoryEdit;

	@FindBy(xpath = "//span[normalize-space()='Update Category']")
	@CacheLookup
	WebElement AdminManagerCategoryUpdateSubmit;

// #*******************************************Login Page****************************************

	public void enterEmail() {
		Email.sendKeys("admin");
	}

	public void enterPassword() {
		Password.sendKeys("7Search@pass123");
	}
	//7Search@passcom555

	public void clickLoginButton() {
		clickLoginButton.click();

	}

// #*******************************************Manager Category Page****************************************

	public void AdminManagerCategory() {
		AdminManagerCategory.click();
	}

	public void enterAdminManagerCategorySearch() {
		AdminManagerCategorySearch.sendKeys("NGO");
	}

	public void AdminManagerCategoryADD() {
		AdminManagerCategoryADD.click();
	}

	public void enterAdminManagerCategoryName() {
		AdminManagerCategoryName.sendKeys("test");
	}

	public void enterAdminManagerCategoryCPM() {
		AdminManagerCategoryCPM.sendKeys("0.003");
	}

	public void enterAdminManagerCategoryCPC() {
		AdminManagerCategoryCPC.sendKeys("0.1");
	}

	public void enterAdminManagerCategoryCPAImp() {
		AdminManagerCategoryCPAImp.sendKeys("0.1");
	}

	public void enterAdminManagerCategoryCPAClick() {
		AdminManagerCategoryCPAClick.sendKeys("0.1");
	}

	public void enterAdminManagerCategoryVideoADV() {
		AdminManagerCategoryVideoADV.sendKeys("0.1");
	}

	public void enterAdminManagerCategoryVideoPUB() {
		AdminManagerCategoryVideoPUB.sendKeys("0.1");
	}

	public void enterAdminManagerCategoryPUBCpm() {
		AdminManagerCategoryPUBCpm.sendKeys("0.1");
	}

	public void enterAdminManagerCategoryPUBCPC() {
		AdminManagerCategoryPUBCPC.sendKeys("0.1");
	}

	public void AdminManagerCategorySubmit() {
		AdminManagerCategorySubmit.click();
	}

	public void AdminManagerCategoryThreeDot() {
		AdminManagerCategoryThreeDot.click();
	}

	public void AdminManagerCategoryEdit() {
		AdminManagerCategoryEdit.click();
	}

	public void AdminManagerCategoryUpdateSubmit() {
		AdminManagerCategoryUpdateSubmit.click();
	}

}
