package Com.ADV7Search.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class PageFactoryAdminPublisherHoldListPage {

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

// #********************************************Publisher Hold User's List Page**********************************

	@FindBy(xpath = "//span[normalize-space()='Manage Publisher']")
	@CacheLookup
	WebElement AdminManagePublisher;

	@FindBy(xpath = "//span[normalize-space()='Hold User Log']")
	@CacheLookup
	WebElement AdminManagePublisherHold;

	@FindBy(xpath = "//input[@id='default-04']")
	@CacheLookup
	WebElement AdminManagePublisherHoldSearch;

	@FindBy(xpath = "//input[@id='default-04']")
	@CacheLookup
	WebElement AdminManagePublisherHoldSearchButton;

	@FindBy(xpath = "//input[@value='17-3-2023 - 22-5-2024']")
	@CacheLookup
	WebElement AdminManagePublisherHoldDate;

	@FindBy(xpath = "//div[@aria-label='Choose Wednesday, May 1st, 2024']")
	@CacheLookup
	WebElement AdminManagePublisherHoldDateMay1st;

	@FindBy(xpath = "//div[@aria-label='Choose Wednesday, May 22nd, 2024']")
	@CacheLookup
	WebElement AdminManagePublisherHoldDateMay22nd;

// #*******************************************Login Page****************************************

	public void enterEmail() {
		Email.sendKeys("admin");
	}

	public void enterPassword() {
		Password.sendKeys("7Search@passcom123");
	}

	public void clickLoginButton() {
		clickLoginButton.click();

	}

// #*******************************************Manage Publisher Client Page****************************************

	public void AdminManagePublisher() {
		AdminManagePublisher.click();
	}

	public void AdminManagePublisherHold() {
		AdminManagePublisherHold.click();
	}

	public void enterAdminManagePublisherHoldSearch() {
		AdminManagePublisherHoldSearch.sendKeys("ADV663B1F21A704E");
	}

	public void AdminManagePublisherHoldSearchButton() {
		AdminManagePublisherHoldSearchButton.click();
	}

	public void AdminManagePublisherHoldDate() {
		AdminManagePublisherHoldDate.click();
	}

	public void AdminManagePublisherHoldDateMay1st() {
		AdminManagePublisherHoldDateMay1st.click();
	}

	public void AdminManagePublisherHoldDateMay22nd() {
		AdminManagePublisherHoldDateMay22nd.click();
	}

}
