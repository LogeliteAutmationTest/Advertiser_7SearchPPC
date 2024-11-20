package ADV7searchTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import ADV_7Search_genericPage.CommonMethod;
import Com.ADV7Search.pages.PageFactoryAdminReferralManagePayoutPage;
import Com.ADV7Search.pages.PageFactoryAdminReferralViewReportPage;

public class PageFactoryAdminReferralManagePayoutTest extends CommonMethod {

	public PageFactoryAdminReferralManagePayoutTest() throws Exception {
		super();
	}

//#*************************************Login Page**********************************

	@Test
	public void AdminTestLogin() {

		PageFactoryAdminReferralManagePayoutPage MP = PageFactory.initElements(driver,
				PageFactoryAdminReferralManagePayoutPage.class);

		try {

			MP.enterRefAdminLoginEmail();
			MP.enterRefAdminLoginPassword();
			Thread.sleep(1000);
			MP.RefAdminLoginPasswordEye();
			Thread.sleep(1000);
			MP.RefAdminLoginButton();
			Thread.sleep(4000);
			driver.navigate().refresh();
			Thread.sleep(4000);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

//#*************************************Manage Add Payout Page**********************************

	@Test
	(enabled = false)
	public void AdminTestManagePayout() {

		PageFactoryAdminReferralManagePayoutPage MP = PageFactory.initElements(driver,
				PageFactoryAdminReferralManagePayoutPage.class);

		try {

			MP.RefAdminManagePayout();
			Thread.sleep(1000);
			MP.RefAdminManagePayoutMethod();
			Thread.sleep(2000);
			MP.RefAdminViewReportByAccountAddMethod();
			Thread.sleep(1000);
			MP.enterRefAdminViewReportByAccountAddMethodName();
			MP.enterRefAdminViewReportByAccountDescription();
			MP.enterRefAdminViewReportByAccountAddPF();
			MP.enterRefAdminViewReportByAccountAddMethodWithdrawal();
			Thread.sleep(1000);
			MP.enterRefAdminViewReportByAccountADVUpoadImage();
			Thread.sleep(1000);
			// MP.RefAdminViewReportByAccountAddMethodSubmit();
			MP.RefAdminViewReportByAccountAddMethodCross();
			Thread.sleep(2000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			MP.RefAdminViewReportByAccountThreeDot();
			Thread.sleep(1000);
			MP.RefAdminViewReportByAccountThreeDotEdit();
			Thread.sleep(1000);
			MP.enterRefAdminViewReportByAccountAddMethodEditName();
			Thread.sleep(1000);
			MP.RefAdminViewReportByAccountAddMethodUpdate();
			Thread.sleep(2000);
			driver.navigate().refresh();
			Thread.sleep(4000);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

//#******************************************Manage Pending Payout Method Page***************************************

	@Test
	//(enabled = false)
	public void AdminTestManagePendingPayout() {

		PageFactoryAdminReferralManagePayoutPage MPP = PageFactory.initElements(driver,
				PageFactoryAdminReferralManagePayoutPage.class);

		try {

			MPP.RefAdminManagePayout();
			Thread.sleep(1000);
			MPP.RefAdminManagePendingPayoutList();
			Thread.sleep(2000);
			MPP.enterRefAdminManagePendingPayoutSearch();
			Thread.sleep(2000);
			driver.navigate().refresh();
			Thread.sleep(3000);
			MPP.RefAdminManagePendingPayoutDate();
			Thread.sleep(1000);
			MPP.RefAdminManagePendingPayoutDate1Sept();
			MPP.RefAdminManagePendingPayoutDate24Sept();
			Thread.sleep(1000);
			MPP.RefAdminManagePendingPayoutSearchButton();
			Thread.sleep(2000);
			driver.navigate().refresh();
			Thread.sleep(3000);
			MPP.RefAdminManagePendingPayoutThreeDot();
			Thread.sleep(1000);
			MPP.RefAdminManagePendingPayoutThreeDotViewDetail();
			Thread.sleep(2000);
			MPP.RefAdminManagePendingPayoutThreeDotViewDetailCross();
			Thread.sleep(2000);
			driver.navigate().refresh();
			Thread.sleep(3000);
			MPP.RefAdminManagePendingPayoutUpdate();
			Thread.sleep(1000);
			MPP.RefAdminManagePendingPayoutPendingStatus();
			MPP.RefAdminManagePendingPayoutStatusHold();
			Thread.sleep(1000);
			MPP.enterRefAdminManagePendingPayoutTransactionId();
			MPP.enterRefAdminManagePendingPayoutRemark();
			Thread.sleep(1000);
			MPP.RefAdminManagePendingPayoutUpdateSubmit();
//			MPP.RefAdminManagePendingPayoutUpdateCross();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(3000);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

//#******************************************Manage Released Payout Method Page***************************************

	@Test
	 (enabled = false)
	public void AdminTestManageReleasedPayout() {

		PageFactoryAdminReferralManagePayoutPage MRP = PageFactory.initElements(driver,
				PageFactoryAdminReferralManagePayoutPage.class);

		try {

			MRP.RefAdminManagePayout();
			Thread.sleep(1000);
			MRP.RefAdminManageReleasedPayout();
			Thread.sleep(2000);
			MRP.enterRefAdminManageReleasedPayoutSearch();
			Thread.sleep(2000);
			driver.navigate().refresh();
			Thread.sleep(3000);
			MRP.RefAdminManageReleasedPayoutDate();
			Thread.sleep(1000);
			MRP.RefAdminManageReleasedPayoutDate1stSept();
			MRP.RefAdminManageReleasedPayoutDate26stSept();
			Thread.sleep(1000);
			MRP.RefAdminManageReleasedPayoutSearchButton();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(3000);
			MRP.RefAdminManageReleasedPayoutThreeDot();
			Thread.sleep(1000);
			MRP.RefAdminManageReleasedPayoutThreeDotDetails();
			Thread.sleep(2000);
			MRP.RefAdminManageReleasedPayoutThreeDotDetailsCross();
			Thread.sleep(2000);
			driver.navigate().refresh();
			Thread.sleep(3000);
			MRP.RefAdminManageReleasedPayoutPagination();
			MRP.RefAdminManageReleasedPayoutPagination500();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(3000);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

//#******************************************Manage Hold Payout Method Page***************************************

	@Test
	 (enabled = false)
	public void AdminTestManageHoldPayout() {

		PageFactoryAdminReferralManagePayoutPage MRP = PageFactory.initElements(driver,
				PageFactoryAdminReferralManagePayoutPage.class);

		try {

			MRP.RefAdminManagePayout();
			Thread.sleep(1000);
			MRP.RefAdminManageHoldPayoutList();
			Thread.sleep(2000);
			MRP.enterRefAdminManageHoldPayoutListSearch();
			Thread.sleep(2000);
			driver.navigate().refresh();
			Thread.sleep(3000);
			MRP.RefAdminManageHoldPayoutListDate();
			Thread.sleep(1000);
			MRP.RefAdminManageHoldPayoutListDate1Sept();
			MRP.RefAdminManageHoldPayoutListDate27Sept();
			Thread.sleep(1000);
			MRP.RefAdminManageHoldPayoutListSearchButton();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(3000);
			MRP.RefAdminManageHoldPayoutListThreeDot();
			Thread.sleep(1000);
			MRP.RefAdminManageHoldPayoutListThreeDotViewDetails();
			Thread.sleep(2000);
			MRP.RefAdminManageHoldPayoutListThreeDotViewCross();
			Thread.sleep(2000);
			driver.navigate().refresh();
			Thread.sleep(3000);
			MRP.RefAdminManageHoldPayoutListUpdate();
			Thread.sleep(1000);
			MRP.enterRefAdminManageHoldPayoutListUpdateTransactionId();
			MRP.enterRefAdminManageHoldPayoutListUpdateRemark();
			Thread.sleep(1000);
			MRP.RefAdminManageHoldPayoutListUpdateStatusHold();
			MRP.RefAdminManageHoldPayoutListUpdatePending();
			Thread.sleep(1000);
			//MRP.RefAdminManageHoldPayoutListUpdateButton();
			MRP.RefAdminManageHoldPayoutListUpdateCross();

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
