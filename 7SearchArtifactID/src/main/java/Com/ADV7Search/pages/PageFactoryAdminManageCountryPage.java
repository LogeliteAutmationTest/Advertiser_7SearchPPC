package Com.ADV7Search.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class PageFactoryAdminManageCountryPage {

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

//#********************************************Manager Country Page**********************************

	@FindBy(xpath = "//span[normalize-space()='Manage Country']")
	@CacheLookup
	WebElement AdminManageCountry;

	@FindBy(xpath = "//input[@id='default-04']")
	@CacheLookup
	WebElement AdminManagerCountrySearch;

	@FindBy(xpath = "//span[contains(text(),'Add Country')]")
	@CacheLookup
	WebElement AdminManagerCountrySearchAdd;

	@FindBy(xpath = "//input[@name='name']")
	@CacheLookup
	WebElement AdminManagerCountrySearchAddName;

	@FindBy(xpath = "//input[@name='nicename']")
	@CacheLookup
	WebElement AdminManagerCountrySearchAddNickName;

	@FindBy(xpath = "//input[@name='iso']")
	@CacheLookup
	WebElement AdminManagerCountryISO;

	@FindBy(xpath = "//input[@name='iso3']")
	@CacheLookup
	WebElement AdminManagerCountryISO3;

	@FindBy(xpath = "//input[@name='numcode']")
	@CacheLookup
	WebElement AdminManagerCountrynumcode;

	@FindBy(xpath = "//input[@name='phonecode']")
	@CacheLookup
	WebElement AdminManagerCountryphonecode;

	@FindBy(xpath = "//input[@name='currency_code']")
	@CacheLookup
	WebElement AdminManagerCountrycurrencycode;

	@FindBy(xpath = "//span[contains(text(),'Add Country')]")
	@CacheLookup
	WebElement AdminManagerCountryAddButton;

	@FindBy(xpath = "//body/div[@id='root']/div[@class='nk-app-root']/div[@class='nk-main']/div[@class='nk-wrap']/div[@class='nk-content']/div[@class='container-fluid']/div[@class='nk-content-inner']/div[@class='nk-content-body']/div[@class='nk-block']/div[@class='card-bordered boxscroll card']/div[@class='card-inner-group']/div[@class='card-inner p-0']/div[@class='card-inner p-0 ']/div[1]/div[2]/div[9]/ul[1]/li[1]/div[1]/a[1]/em[1]")
	@CacheLookup
	WebElement AdminManagerCountryThreedot;

	@FindBy(xpath = "//div[contains(@class,'dropdown-menu dropdown-menu-right show')]//span[contains(text(),'Edit Country')]")
	@CacheLookup
	WebElement AdminManagerCountryEdit;

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

// #*******************************************Manage Country Page****************************************

	public void AdminManageCountry() {
		AdminManageCountry.click();
	}

	public void enterAdminManagerCountrySearch() {
		AdminManagerCountrySearch.sendKeys("INDIA");
	}

	public void AdminManagerCountrySearchAdd() {
		AdminManagerCountrySearchAdd.click();
	}

	public void enterAdminManagerCountrySearchAddName() {
		AdminManagerCountrySearchAddName.sendKeys("INDIA1");
	}

	public void enterAdminManagerCountrySearchAddNickName() {
		AdminManagerCountrySearchAddNickName.sendKeys("INDIA2");
	}

	public void enterAdminManagerCountryISO() {
		AdminManagerCountryISO.sendKeys("235");
	}

	public void enterAdminManagerCountryISO3() {
		AdminManagerCountryISO3.sendKeys("8965");
	}

	public void enterAdminManagerCountrynumcode() {
		AdminManagerCountrynumcode.sendKeys("658");
	}

	public void enterAdminManagerCountryphonecode() {
		AdminManagerCountryphonecode.sendKeys("91");
	}

	public void enterAdminManagerCountrycurrencycode() {
		AdminManagerCountrycurrencycode.sendKeys("INDIA");
	}

	public void AdminManagerCountryAddButton() {
		AdminManagerCountryAddButton.click();
	}

	public void AdminManagerCountryThreedot() {
		AdminManagerCountryThreedot.click();
	}

	public void AdminManagerCountryEdit() {
		AdminManagerCountryEdit.click();
	}

}
