package Com.ADV7Search.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class PageFactoryAdminReferralManagePayoutPage {

//#******************************************Login Page**********************************************

	@FindBy(xpath = "//input[@id='default-01']")
	@CacheLookup
	WebElement RefAdminLoginEmail;

	@FindBy(xpath = "//input[@id='password']")
	@CacheLookup
	WebElement RefAdminLoginPassword;

	@FindBy(xpath = "//em[@class='passcode-icon icon-hide icon ni ni-eye-off']")
	@CacheLookup
	WebElement RefAdminLoginPasswordEye;

	@FindBy(xpath = "//button[@type='submit']")
	@CacheLookup
	WebElement RefAdminLoginButton;

//#******************************************Manage Payout Method Page***************************************

	@FindBy(xpath = "//span[normalize-space()='Manage Payout']")
	@CacheLookup
	WebElement RefAdminManagePayout;

	@FindBy(xpath = "//span[normalize-space()='Manage Payout Method']")
	@CacheLookup
	WebElement RefAdminManagePayoutMethod;

	@FindBy(xpath = "//span[normalize-space()='Add Method']")
	@CacheLookup
	WebElement RefAdminViewReportByAccountAddMethod;

	@FindBy(xpath = "//input[@placeholder='Enter method name']")
	@CacheLookup
	WebElement RefAdminViewReportByAccountAddMethodName;

	@FindBy(xpath = "//input[@placeholder='Enter description']")
	@CacheLookup
	WebElement RefAdminViewReportByAccountDescription;

	@FindBy(xpath = "//input[@placeholder='Enter processing fee']")
	@CacheLookup
	WebElement RefAdminViewReportByAccountAddPF;

	@FindBy(xpath = "//input[@placeholder='Enter min withdrawal']")
	@CacheLookup
	WebElement RefAdminViewReportByAccountAddMethodWithdrawal;

	@FindBy(xpath = "//input[@id='customFile']")
	@CacheLookup
	WebElement RefAdminViewReportByAccountADVUpoadImage;

	@FindBy(xpath = "//button[@type='submit']")
	@CacheLookup
	WebElement RefAdminViewReportByAccountAddMethodSubmit;

	@FindBy(xpath = "//body/div[@id='root']/div[contains(@class,'nk-app-root')]/div[contains(@class,'nk-main')]/div[contains(@class,'nk-wrap')]/div[contains(@class,'nk-content')]/div[contains(@class,'container-fluid')]/div[contains(@class,'nk-content-inner')]/div[contains(@class,'nk-content-body')]/div[contains(@class,'nk-block')]/div[contains(@class,'card-bordered boxscroll card')]/div[contains(@class,'card-inner-group')]/div[contains(@class,'card-inner p-0')]/div[contains(@class,'card-inner p-0')]/div[contains(@class,'')]/div[2]/div[8]/ul[1]/li[1]/div[1]/a[1]/em[1]")
	@CacheLookup
	WebElement RefAdminViewReportByAccountThreeDot;

	@FindBy(xpath = "//div[contains(@class,'dropdown show')]//li[1]//a[1]")
	@CacheLookup
	WebElement RefAdminViewReportByAccountADVEdit;

	@FindBy(xpath = "//input[@placeholder='Enter method name']")
	@CacheLookup
	WebElement RefAdminViewReportByAccountAddMethodEditName;
	
	@FindBy(xpath = "//button[@type='submit']")
	@CacheLookup
	WebElement RefAdminViewReportByAccountAddMethodUpdate;

	@FindBy(xpath = "//em[contains(@class,'icon ni ni-cross-sm')]")
	@CacheLookup
	WebElement RefAdminViewReportByAccountAddMethodCross;
	
	@FindBy(xpath = "//div[@class='dropdown-menu dropdown-menu-right show']//span[contains(text(),'Edit Method')]")
	@CacheLookup
	WebElement RefAdminViewReportByAccountThreeDotEdit;

	@FindBy(xpath = "//div[@class='dropdown-menu dropdown-menu-right show']//span[contains(text(),'Disable')]")
	@CacheLookup
	WebElement RefAdminViewReportByAccountADVDisable;

	@FindBy(xpath = "//div[contains(@class,'nk-content')]//div[2]//div[2]//span[1]//a[1]//button[1]")
	@CacheLookup
	WebElement RefAdminViewReportByAccountViewImage;
	
//#******************************************Manage Pending Payout Method Page***************************************

	
	@FindBy(xpath = "//span[normalize-space()='Pending Payout List']")
	@CacheLookup
	WebElement RefAdminManagePendingPayoutList;
	
	@FindBy(xpath = "//input[@id='default-04']")
	@CacheLookup
	WebElement RefAdminManagePendingPayoutSearch;
	
	@FindBy(xpath = "//input[@placeholder='Please Select Date']")
	@CacheLookup
	WebElement RefAdminManagePendingPayoutDate;
	
	@FindBy(xpath = "//div[@aria-label='Choose Sunday, September 1st, 2024']")
	@CacheLookup
	WebElement RefAdminManagePendingPayoutDate1Sept;
	
	@FindBy(xpath = "//div[@aria-label='Choose Tuesday, September 24th, 2024']")
	@CacheLookup
	WebElement RefAdminManagePendingPayoutDate24Sept;
	
	@FindBy(xpath = "//span[normalize-space()='Search']")
	@CacheLookup
	WebElement RefAdminManagePendingPayoutSearchButton;
	
	@FindBy(xpath = "//body/div[@id='root']/div[contains(@class,'nk-app-root')]/div[contains(@class,'nk-main')]/div[contains(@class,'nk-wrap')]/div[contains(@class,'nk-content')]/div[contains(@class,'container-fluid')]/div[contains(@class,'nk-content-inner')]/div[contains(@class,'nk-content-body')]/div[contains(@class,'nk-block')]/div[contains(@class,'card-bordered card-stretch boxscroll card')]/div[contains(@class,'card-inner-group')]/div[contains(@class,'card-inner p-0')]/div[contains(@class,'')]/div[2]/div[8]/ul[1]/li[1]/div[1]/a[1]/em[1]")
	@CacheLookup
	WebElement RefAdminManagePendingPayoutThreeDot;
	
	@FindBy(xpath = "//div[contains(@class,'dropdown-menu dropdown-menu-right show')]//span[contains(text(),'View Details')]")
	@CacheLookup
	WebElement RefAdminManagePendingPayoutThreeDotViewDetail;
	
	@FindBy(xpath = "//em[contains(@class,'icon ni ni-cross-sm')]")
	@CacheLookup
	WebElement RefAdminManagePendingPayoutThreeDotViewDetailCross;
	
	@FindBy(xpath = "//div[@class='nk-content']//div[2]//div[5]//button[1]")
	@CacheLookup
	WebElement RefAdminManagePendingPayoutUpdate;
	
	@FindBy(xpath = "//div[contains(@class,'react-select__value-container react-select__value-container--has-value css-1hwfws3')]")
	@CacheLookup
	WebElement RefAdminManagePendingPayoutPendingStatus;
	
	@FindBy(id="react-select-1-option-0")
	@CacheLookup
	WebElement RefAdminManagePendingPayoutStatusHold;
	
	@FindBy(xpath = "//input[@placeholder='Enter payout transaction id']")
	@CacheLookup
	WebElement RefAdminManagePendingPayoutTransactionId;
	
	@FindBy(xpath = "//textarea[@placeholder='Enter remark']")
	@CacheLookup
	WebElement RefAdminManagePendingPayoutRemark;
	
	@FindBy(xpath = "//button[@type='submit']")
	@CacheLookup
	WebElement RefAdminManagePendingPayoutUpdateSubmit;
	
	@FindBy(xpath = "//em[@class='icon ni ni-cross-sm']")
	@CacheLookup
	WebElement RefAdminManagePendingPayoutUpdateCross;
	
//#******************************************Manage Released Payout Method Page***************************************

	@FindBy(xpath = "//span[normalize-space()='Released Payout List']")
	@CacheLookup
	WebElement RefAdminManageReleasedPayout;
	
	@FindBy(xpath = "//input[@id='default-04']")
	@CacheLookup
	WebElement RefAdminManageReleasedPayoutSearch;
	
	@FindBy(xpath = "//input[@placeholder='Please Select Date']")
	@CacheLookup
	WebElement RefAdminManageReleasedPayoutDate;
	
	@FindBy(xpath = "//div[@aria-label='Choose Sunday, September 1st, 2024']")
	@CacheLookup
	WebElement RefAdminManageReleasedPayoutDate1stSept;
	
	@FindBy(xpath = "//div[@aria-label='Choose Thursday, September 26th, 2024']")
	@CacheLookup
	WebElement RefAdminManageReleasedPayoutDate26stSept;
	
	@FindBy(xpath = "//span[normalize-space()='Search']")
	@CacheLookup
	WebElement RefAdminManageReleasedPayoutSearchButton;
	
	@FindBy(xpath = "//body/div[@id='root']/div[contains(@class,'nk-app-root')]/div[contains(@class,'nk-main')]/div[contains(@class,'nk-wrap')]/div[contains(@class,'nk-content')]/div[contains(@class,'container-fluid')]/div[contains(@class,'nk-content-inner')]/div[contains(@class,'nk-content-body')]/div[contains(@class,'nk-block')]/div[contains(@class,'card-bordered card-stretch card')]/div[contains(@class,'card-inner-group')]/div[contains(@class,'card-inner p-0')]/div[contains(@class,'')]/div[2]/div[8]/ul[1]/li[1]/div[1]/a[1]/em[1]")
	@CacheLookup
	WebElement RefAdminManageReleasedPayoutThreeDot;
	
	@FindBy(xpath = "//div[contains(@class,'dropdown-menu dropdown-menu-right show')]//span[contains(text(),'View Details')]")
	@CacheLookup
	WebElement RefAdminManageReleasedPayoutThreeDotDetails;
	
	@FindBy(xpath = "//em[contains(@class,'icon ni ni-cross-sm')]")
	@CacheLookup
	WebElement RefAdminManageReleasedPayoutThreeDotDetailsCross;
	
	@FindBy(xpath = "//a[@class='dropdown-toggle bg-white btn btn-sm btn-outline-light btn-icon']")
	@CacheLookup
	WebElement RefAdminManageReleasedPayoutPagination;
	
	@FindBy(xpath = "//span[normalize-space()='500']")
	@CacheLookup
	WebElement RefAdminManageReleasedPayoutPagination500;
	
//#******************************************Manage Hold Payout Method Page***************************************

	@FindBy(xpath = "//span[normalize-space()='Hold Payout List']")
	@CacheLookup
	WebElement RefAdminManageHoldPayoutList;
	
	@FindBy(xpath = "//input[@id='default-04']")
	@CacheLookup
	WebElement RefAdminManageHoldPayoutListSearch;
	
	@FindBy(xpath = "//input[@placeholder='Please Select Date']")
	@CacheLookup
	WebElement RefAdminManageHoldPayoutListDate;
	
	@FindBy(xpath = "//div[@aria-label='Choose Sunday, September 1st, 2024']")
	@CacheLookup
	WebElement RefAdminManageHoldPayoutListDate1Sept;
	
	@FindBy(xpath = "//div[@aria-label='Choose Friday, September 27th, 2024']")
	@CacheLookup
	WebElement RefAdminManageHoldPayoutListDate27Sept;
	
	@FindBy(xpath = "//span[normalize-space()='Search']")
	@CacheLookup
	WebElement RefAdminManageHoldPayoutListSearchButton;
	
	@FindBy(xpath = "//em[contains(@class,'icon ni ni-more-h')]")
	@CacheLookup
	WebElement RefAdminManageHoldPayoutListThreeDot;
	
	@FindBy(xpath = "//span[normalize-space()='View Details']")
	@CacheLookup
	WebElement RefAdminManageHoldPayoutListThreeDotViewDetails;
	
	@FindBy(xpath = "//em[contains(@class,'icon ni ni-cross-sm')]")
	@CacheLookup
	WebElement RefAdminManageHoldPayoutListThreeDotViewCross;
	
	@FindBy(xpath = "//button[@class='btn btn-info btn-sm btn']")
	@CacheLookup
	WebElement RefAdminManageHoldPayoutListUpdate;
	
	@FindBy(xpath = "//div[@class='react-select__single-value css-1uccc91-singleValue']")
	@CacheLookup
	WebElement RefAdminManageHoldPayoutListUpdateStatusHold;
	
	@FindBy(id= "react-select-2-option-0")
	@CacheLookup
	WebElement RefAdminManageHoldPayoutListUpdatePending;
	
	@FindBy(xpath = "//input[@placeholder='Enter payout transaction id']")
	@CacheLookup
	WebElement RefAdminManageHoldPayoutListUpdateTransactionId;
	
	@FindBy(xpath = "//textarea[@placeholder='Enter remark']")
	@CacheLookup
	WebElement RefAdminManageHoldPayoutListUpdateRemark;
	
	@FindBy(xpath = "//button[@type='submit']//em[@class='icon ni ni-cross-sm']")
	@CacheLookup
	WebElement RefAdminManageHoldPayoutListUpdateButton;
	
	@FindBy(xpath = "//em[@class='icon ni ni-cross-sm']")
	@CacheLookup
	WebElement RefAdminManageHoldPayoutListUpdateCross;
	

//#******************************************Login Page***************************************

	public void enterRefAdminLoginEmail() {
		RefAdminLoginEmail.sendKeys("Admin");
	}

	public void enterRefAdminLoginPassword() {
		RefAdminLoginPassword.sendKeys("123456");
	}

	public void RefAdminLoginPasswordEye() {
		RefAdminLoginPasswordEye.click();
	}

	public void RefAdminLoginButton() {
		RefAdminLoginButton.click();
	}

//#*****************************************Manage KYC Page***************************************

	public void RefAdminManagePayout() {
		RefAdminManagePayout.click();
	}

	public void RefAdminManagePayoutMethod() {
		RefAdminManagePayoutMethod.click();
	}

	public void RefAdminViewReportByAccountAddMethod() {
		RefAdminViewReportByAccountAddMethod.click();
	}

	public void enterRefAdminViewReportByAccountAddMethodName() {
		RefAdminViewReportByAccountAddMethodName.sendKeys("Test Rajeev");
	}

	public void enterRefAdminViewReportByAccountDescription() {
		RefAdminViewReportByAccountDescription.sendKeys("For Testing");
	}

	public void enterRefAdminViewReportByAccountAddPF() {
		RefAdminViewReportByAccountAddPF.sendKeys("10");
	}

	public void enterRefAdminViewReportByAccountAddMethodWithdrawal() {
		RefAdminViewReportByAccountAddMethodWithdrawal.sendKeys("10");
	}

	public void enterRefAdminViewReportByAccountADVUpoadImage() {
		RefAdminViewReportByAccountADVUpoadImage.sendKeys("C:\\Users\\DELL\\Downloads\\th.jpg");
	}

	public void RefAdminViewReportByAccountAddMethodSubmit() {
		RefAdminViewReportByAccountAddMethodSubmit.click();
	}
	
	public void RefAdminViewReportByAccountAddMethodCross() {
		RefAdminViewReportByAccountAddMethodCross.click();
	}

	public void RefAdminViewReportByAccountThreeDot() {
		RefAdminViewReportByAccountThreeDot.click();
	}
	
	public void RefAdminViewReportByAccountThreeDotEdit() {
		RefAdminViewReportByAccountThreeDotEdit.click();
	}

	public void enterRefAdminViewReportByAccountAddMethodEditName() {
		RefAdminViewReportByAccountAddMethodEditName.sendKeys("tttt");
	}

	public void RefAdminViewReportByAccountAddMethodUpdate() {
		RefAdminViewReportByAccountAddMethodUpdate.click();
	}

	public void RefAdminViewReportByAccountViewImage() {
		RefAdminViewReportByAccountViewImage.click();
	}
	
//#******************************************Manage Pending Payout Method Page***************************************


	public void RefAdminManageReleasedPayout() {
		RefAdminManageReleasedPayout.click();
	}

	public void RefAdminManageReleasedPayoutDate() {
		RefAdminManageReleasedPayoutDate.click();
	}
	
	public void enterRefAdminManageReleasedPayoutSearch() {
		RefAdminManageReleasedPayoutSearch.sendKeys("tttt");
	}
	
	public void RefAdminManageReleasedPayoutDate1stSept() {
		RefAdminManageReleasedPayoutDate1stSept.click();
	}

	public void RefAdminManageReleasedPayoutDate26stSept() {
		RefAdminManageReleasedPayoutDate26stSept.click();
	}
	
	public void RefAdminManageReleasedPayoutSearchButton() {
		RefAdminManageReleasedPayoutSearchButton.click();
	}

	public void RefAdminManageReleasedPayoutThreeDot() {
		RefAdminManageReleasedPayoutThreeDot.click();
	}
	
	public void RefAdminManageReleasedPayoutThreeDotDetails() {
		RefAdminManageReleasedPayoutThreeDotDetails.click();
	}

	public void RefAdminManageReleasedPayoutThreeDotDetailsCross() {
		RefAdminManageReleasedPayoutThreeDotDetailsCross.click();
	}
	 
	public void RefAdminManagePendingPayoutUpdate() {
		RefAdminManagePendingPayoutUpdate.click();
	}

	public void RefAdminManagePendingPayoutPendingStatus() {
		RefAdminManagePendingPayoutPendingStatus.click();
	}
	
	public void enterRefAdminManagePendingPayoutTransactionId() {
		RefAdminManagePendingPayoutTransactionId.sendKeys("tttt");
	}

	public void enterRefAdminManagePendingPayoutRemark() {
		RefAdminManagePendingPayoutRemark.sendKeys("tttt");
	}
	
	public void RefAdminManagePendingPayoutUpdateSubmit() {
		RefAdminManagePendingPayoutUpdateSubmit.click();
	}

	public void RefAdminManagePendingPayoutUpdateCross() {
		RefAdminManagePendingPayoutUpdateCross.click();
	}
	
	public void RefAdminManagePendingPayoutStatusHold() {
		RefAdminManagePendingPayoutStatusHold.click();
	}
	
//#******************************************Manage Released Payout Method Page***************************************

	public void RefAdminManagePendingPayoutList() {
		RefAdminManagePendingPayoutList.click();
	}

	public void RefAdminManagePendingPayoutDate() {
		RefAdminManagePendingPayoutDate.click();
	}
	
	public void enterRefAdminManagePendingPayoutSearch() {
		RefAdminManagePendingPayoutSearch.sendKeys("tttt");
	}
	
	public void RefAdminManagePendingPayoutDate1Sept() {
		RefAdminManagePendingPayoutDate1Sept.click();
	}

	public void RefAdminManagePendingPayoutDate24Sept() {
		RefAdminManagePendingPayoutDate24Sept.click();
	}
	
	public void RefAdminManagePendingPayoutSearchButton() {
		RefAdminManagePendingPayoutSearchButton.click();
	}

	public void RefAdminManagePendingPayoutThreeDot() {
		RefAdminManagePendingPayoutThreeDot.click();
	}
	
	public void RefAdminManagePendingPayoutThreeDotViewDetail() {
		RefAdminManagePendingPayoutThreeDotViewDetail.click();
	}

	public void RefAdminManagePendingPayoutThreeDotViewDetailCross() {
		RefAdminManagePendingPayoutThreeDotViewDetailCross.click();
	}
	public void RefAdminManageReleasedPayoutPagination() {
		RefAdminManageReleasedPayoutPagination.click();
	}

	public void RefAdminManageReleasedPayoutPagination500() {
		RefAdminManageReleasedPayoutPagination500.click();
	}
	
	
	
//#******************************************Manage Hold Payout Method Page***************************************

	public void RefAdminManageHoldPayoutList() {
		RefAdminManageHoldPayoutList.click();
	}

	public void enterRefAdminManageHoldPayoutListSearch() {
		RefAdminManageHoldPayoutListSearch.sendKeys("test");
	}
	public void RefAdminManageHoldPayoutListDate() {
		RefAdminManageHoldPayoutListDate.click();
	}

	public void RefAdminManageHoldPayoutListDate1Sept() {
		RefAdminManageHoldPayoutListDate1Sept.click();
	}
	public void RefAdminManageHoldPayoutListDate27Sept() {
		RefAdminManageHoldPayoutListDate27Sept.click();
	}

	public void RefAdminManageHoldPayoutListSearchButton() {
		RefAdminManageHoldPayoutListSearchButton.click();
	}
	
	public void RefAdminManageHoldPayoutListThreeDot() {
		RefAdminManageHoldPayoutListThreeDot.click();
	}

	public void RefAdminManageHoldPayoutListThreeDotViewDetails() {
		RefAdminManageHoldPayoutListThreeDotViewDetails.click();
	}
	public void RefAdminManageHoldPayoutListThreeDotViewCross() {
		RefAdminManageHoldPayoutListThreeDotViewCross.click();
	}

	public void RefAdminManageHoldPayoutListUpdate() {
		RefAdminManageHoldPayoutListUpdate.click();
	}
	
	public void RefAdminManageHoldPayoutListUpdatePending() {
		RefAdminManageHoldPayoutListUpdatePending.click();
	}
	
	public void enterRefAdminManageHoldPayoutListUpdateTransactionId() {
		RefAdminManageHoldPayoutListUpdateTransactionId.sendKeys("6576567675");
	}
	
	public void enterRefAdminManageHoldPayoutListUpdateRemark() {
		RefAdminManageHoldPayoutListUpdateRemark.sendKeys("test rajeev");
	}
	
	public void RefAdminManageHoldPayoutListUpdateButton() {
		RefAdminManageHoldPayoutListUpdateButton.click();
	}
	
	public void RefAdminManageHoldPayoutListUpdateCross() {
		RefAdminManageHoldPayoutListUpdateCross.click();
	}
	
	public void RefAdminManageHoldPayoutListUpdateStatusHold() {
		RefAdminManageHoldPayoutListUpdateStatusHold.click();
	}
	
}
