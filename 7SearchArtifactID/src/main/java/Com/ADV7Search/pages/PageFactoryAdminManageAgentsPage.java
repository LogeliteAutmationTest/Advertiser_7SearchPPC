package Com.ADV7Search.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class PageFactoryAdminManageAgentsPage {
	
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

// #*********************************Manage Agents Page********************************

		@FindBy(xpath = "//span[normalize-space()='Manage Agents']")
		@CacheLookup
		WebElement AdminManageAgents;

		@FindBy(xpath = "//input[@id='default-04']")
		@CacheLookup
		WebElement AdminManageAgentsSearch;
		
		@FindBy(xpath = "//span[normalize-space()='Add New Agent']")
		@CacheLookup
		WebElement AdminManageAgentsADDAgent;
		
		@FindBy(xpath = "//input[@placeholder='Enter Name']")
		@CacheLookup
		WebElement AdminManageAgentsEnterName;
		
		@FindBy(xpath = "//input[@placeholder='Enter Email']")
		@CacheLookup
		WebElement AdminManageAgentsEnterEmail;
		
		@FindBy(xpath = "//input[@placeholder='Enter Skype Id']")
		@CacheLookup
		WebElement AdminManageAgentsSkypeId;
		
		@FindBy(xpath = "//input[@placeholder='Enter Telegram Id']")
		@CacheLookup
		WebElement AdminManageAgentsTelegramId;
		
		@FindBy(xpath = "//input[@placeholder='Enter Contact No']")
		@CacheLookup
		WebElement AdminManageAgentsContactNo;
		
		@FindBy(xpath = "//input[@id='customFile']")
		@CacheLookup
		WebElement AdminManageAgentsImage;
		
		@FindBy(xpath = "//a[normalize-space()='CROP IMAGE']")
		@CacheLookup
		WebElement AdminManageAgentsCropImage;
		
		@FindBy(xpath = "//button[@type='submit']")
		@CacheLookup
		WebElement AdminManageAgentsSubmit;
		
		@FindBy(xpath = "//input[@id='default-04']")
		@CacheLookup
		WebElement AdminManageAgentsSearch1;
		
		@FindBy(xpath = "//em[@class='icon ni ni-cross-sm']")
		@CacheLookup
		WebElement AdminManageAgentsCrossCut;
		
		@FindBy(xpath = "//em[@class='icon ni ni-more-h']")
		@CacheLookup
		WebElement AdminManageAgentsThreeDot;
		
		@FindBy(xpath = "//span[normalize-space()='Edit Agent']")
		@CacheLookup
		WebElement AdminManageAgentsEditAgent;
		
		@FindBy(xpath = "//button[@type='submit']")
		@CacheLookup
		WebElement AdminManageAgentsEditUpdate;
		
		@FindBy(xpath = "//em[@class='icon ni ni-more-h']")
		@CacheLookup
		WebElement AdminManageAgentsThreeDot1;
		
		@FindBy(xpath = "//a[contains(text(),'Assign Clients')]")
		@CacheLookup
		WebElement AdminManageAgentsAssignClients;
		
		
		@FindBy(xpath = "//label[@for='ADV66A4D983EFDF7pid-all']")
		@CacheLookup
		WebElement AdminManageAgentsSelectClient;
		
		@FindBy(xpath = "//span[normalize-space()='Assign Cients']")
		@CacheLookup
		WebElement AdminManageAgentAssignClientButton;
		
		@FindBy(xpath = "//input[@id='default-04']")
		@CacheLookup
		WebElement AdminManageAgentsAssignClientSearch;
		
		@FindBy(xpath = "//a[@class='dropdown-item btn btn-primary']")
		@CacheLookup
		WebElement AdminManageAgentsAssignClientBackButton;
		
		
		
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

// #*******************************************Publisher Manage Agents Page****************************************

		public void AdminManageAgents() {
			AdminManageAgents.click();
		}

		public void enterAdminManageAgentsSearch() {
			AdminManageAgentsSearch.sendKeys("AGM9328");
		}

		public void AdminManageAgentsADDAgent() {
			AdminManageAgentsADDAgent.click();
		}

		public void enterAdminManageAgentsEnterName() {
			AdminManageAgentsEnterName.sendKeys("Automation test rajeev");
		}
		
		public void enterAdminManageAgentsEnterEmail() {
			AdminManageAgentsEnterEmail.sendKeys("rajeevgp15966@gmail.com");
		}
		
		public void enterAdminManageAgentsSkypeId() {
			AdminManageAgentsSkypeId.sendKeys("live:.cid.9e03c8bd1c357456");
		}
		
		public void enterAdminManageAgentsTelegramId() {
			AdminManageAgentsTelegramId.sendKeys("test rajeev");
		}
		
		public void enterAdminManageAgentsContactNo() {
			AdminManageAgentsContactNo.sendKeys("8956325458");
		}
		
		public void enterAdminManageAgentsImage() {
			AdminManageAgentsImage.sendKeys("C:\\Users\\DELL\\Downloads\\emoji.png");
		}

		public void AdminManageAgentsCropImage() {
			AdminManageAgentsCropImage.click();
		}
		
		public void AdminManageAgentsSubmit() {
			AdminManageAgentsSubmit.click();
		}
		
		public void AdminManageAgentsCrossCut() {
			AdminManageAgentsCrossCut.click();
		}
		
		public void enterAdminManageAgentsSearch1() {
			AdminManageAgentsSearch1.sendKeys("AGM9328");
		}
		
		public void AdminManageAgentsThreeDot() {
			AdminManageAgentsThreeDot.click();
		}
		
		public void AdminManageAgentsEditAgent() {
			AdminManageAgentsEditAgent.click();
		}
		
		public void AdminManageAgentsEditUpdate() {
			AdminManageAgentsEditUpdate.click();
		}
		
		public void AdminManageAgentsThreeDot1() {
			AdminManageAgentsThreeDot1.click();
		}
		
		public void AdminManageAgentsAssignClients() {
			AdminManageAgentsAssignClients.click();
		}
		
		public void AdminManageAgentsSelectClient() {
			AdminManageAgentsSelectClient.click();
		}
		
		public void enterAdminManageAgentsAssignClientSearch() {
			AdminManageAgentsAssignClientSearch.sendKeys("gurdilotru@gufum.com");
		}
		
		public void AdminManageAgentAssignClientButton() {
			AdminManageAgentAssignClientButton.click();
		}
		public void AdminManageAgentsAssignClientBackButton() {
			AdminManageAgentsAssignClientBackButton.click();
		}
		
		

}
