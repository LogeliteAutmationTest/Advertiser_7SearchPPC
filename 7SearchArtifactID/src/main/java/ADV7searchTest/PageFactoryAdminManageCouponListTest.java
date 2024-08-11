package ADV7searchTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import ADV_7Search_genericPage.CommonMethod;
import Com.ADV7Search.pages.PageFactoryAdminManageCouponListPage;

public class PageFactoryAdminManageCouponListTest extends CommonMethod {

	public PageFactoryAdminManageCouponListTest() throws Exception {
		super();
	}

//#*************************************Login Page**********************************

	@Test
	public void AdminTestLogin1() {

		PageFactoryAdminManageCouponListPage Coupon = PageFactory.initElements(driver,
				PageFactoryAdminManageCouponListPage.class);

		try {

			Coupon.enterEmail();
			Coupon.enterPassword();
			Coupon.clickLoginButton();
			Thread.sleep(6000);
			driver.navigate().refresh();
			Thread.sleep(4000);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

//#*************************************Manager Coupon Page**********************************

	@Test
	// (enabled = false)
	public void ManageCoupon2() {

		PageFactoryAdminManageCouponListPage Coupon = PageFactory.initElements(driver,
				PageFactoryAdminManageCouponListPage.class);

		try {

			Coupon.AdminManagerCouponList();
			Thread.sleep(2000);
			Coupon.enterAdminManagerCouponListSearch();
			Thread.sleep(6000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			Coupon.AdminManagerCouponListByStatus();
			Coupon.AdminManagerCouponListByStatusInActive();
			Thread.sleep(2000);
			Coupon.AdminManagerCouponListByStatus();
			Coupon.AdminManagerCouponListByStatusActive();
			Thread.sleep(2000);
			Coupon.AdminManagerCouponListByStatus();
			Coupon.AdminManagerCouponListByStatusExpired();
			Thread.sleep(6000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			Coupon.AdminManagerCouponListCouponCategory();
			Thread.sleep(1000);
			Coupon.AdminManagerCouponListAddCategory();
			Thread.sleep(1000);
			Coupon.enterAdminManagerCouponListCategoryName();
//				Thread.sleep(2000);
//				Coupon.AdminManagerCouponListAddCategoryButton();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			Coupon.AdminManagerCouponListCouponCategoryThreedot();
			Thread.sleep(2000);
			Coupon.AdminManagerCouponListCouponCategoryThreedotEdit();
			Thread.sleep(2000);
			Coupon.AdminManagerCouponListCouponCategoryThreedotEditUpdate();
			Thread.sleep(2000);
			Coupon.AdminManagerCouponListCouponCategoryThreedotBackButton();

		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}