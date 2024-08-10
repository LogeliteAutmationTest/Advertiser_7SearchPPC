package ADV_7Search_genericPage;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonMethod extends MasterPages {

	public CommonMethod() throws Exception {
		super();

	}

	public void getWebElementText(String xpathkey) {
		String getTextofWebElement = driver.findElement(By.xpath(or.getProperty(xpathkey))).getText();
		System.out.println(getTextofWebElement);

	}

	public void clickWebElement(String xpathkey) {
		driver.findElement(By.xpath(or.getProperty(xpathkey))).click();

	}

	public void clearData(String xpathkey) {
		driver.findElement(By.xpath(or.getProperty(xpathkey))).clear();

	}

	public void enterData(String xpathkey, String TestEmail) {
		driver.findElement(By.xpath(or.getProperty(xpathkey))).sendKeys(td.getProperty(TestEmail));

	}

	public void moveToElement(String xpathkey) {
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath(or.getProperty(xpathkey)))).build().perform();

	}

//	
//	public void Screenshot() {
//		try {
//			String LoginButtonFile = System.getProperty("user.dir") + "\\" + "Screenshot\\LoginButton - " + CaptureScreenshot.getDateTimeStamp()+" .png" ;
//		try {CaptureScreenshot.getScreenshot(CommonMethod.getDriver(), LoginButtonFile); 
//		} catch (Exception e) {e.printStackTrace();}
//		LoginTest . LoginButton();
//	} catch (Exception e) {
//		e.printStackTrace();
//	}
//	}
	public void clickListElement(String xpathkey, String Testdata) {
		List<WebElement> listofElements = driver.findElements(By.xpath(or.getProperty(xpathkey)));
		for (int i = 0; i < listofElements.size(); i++) {
			if (listofElements.get(i).getText().equalsIgnoreCase(td.getProperty(Testdata))) {
				listofElements.get(i).click();
			}
		}
	}

	// Select drop down value using visible text
	public void selectDropdownValue(String xpathkey, String Testdata) {
		WebElement ele = driver.findElement(By.xpath(or.getProperty(xpathkey)));
		Select webEle = new Select(ele);
		webEle.selectByVisibleText(td.getProperty(Testdata));

	}

	// Take Screenshot on Failure

	public static void getScreenshot(WebDriver driver, String filepath) {
		try {
			System.out.println("In getScreenshot method");
			TakesScreenshot ts = (TakesScreenshot) driver;
			System.out.println("before getScreenshotAs");
			File source = ts.getScreenshotAs(OutputType.FILE);
			System.out.println("after getScreenshotAs");
			FileUtils.copyFile(source, new File(filepath));
		} catch (WebDriverException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String getDateTimeStamp() {
		Date oDate;
		String[] sDatePart;
		String sDateStamp;
		oDate = new Date(0);
		System.out.println(oDate.toString());
		sDatePart = oDate.toString().split(" ");
		sDateStamp = sDatePart[5] + "_" + sDatePart[1] + "_" + sDatePart[2] + "_" + sDatePart[3];
		sDateStamp = sDateStamp.replace(":", "_");
		System.out.println(sDateStamp);
		return sDateStamp;
	}

//	public void captureScreenshot(ITestResult result) throws Exception {
//		
//		if(ITestResult.FAILURE == result.getStatus()) {
//			
//			// Create ref of TakeScreenshot Interface and type casting
//			TakesScreenshot ts = (TakesScreenshot) driver;  //	Type casting of 2 interfaces
//			
//			//Use getScreenshotAs() to capture the screenshot in file format
//			//getScreenshotAs() method return type = FILE
//			File sourceFile = ts.getScreenshotAs(OutputType.FILE);
//			
//			// copy to file to specific location
//			File destFolder = new File("./screenshot/" + result.getName() + ".png");
//			FileUtils.copyFile(sourceFile, destFolder);
//			System.out.println(result.getName() + "method() screenshot captured");
//		}
//	}

//	// Reading Excel Data
//	public void readExcelData(String xpathkey, int rowNo, int columNo) throws Exception {
//		File src = new File("/7SearchArtifactID/src/main/java/Com_ADV_7Search.resources/Excel Test Data.xlsx");
//		FileInputStream fis = new FileInputStream(src);
//		XSSFWorkbook wb = new XSSFWorkbook(fis);
//		XSSFSheet sh = wb.getSheet(prop.getProperty("ExcelTestDataSheetName"));
//		System.out.println(sh.getSheetName());
//		String abc = sh.getRow(rowNo).getCell(columNo).getStringCelValue();
//		driver.findElement(By.xpath(or.getProperty(xpathkey))).sendKeys(abc);
//	}

	// Handling Explicit Wait - visibityofElementLocated
	public void handleExplicitWait_visibityofElementLocated(String xpathkey, String Testdata) {
		WebDriverWait wt = new WebDriverWait(driver, 30);
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathkey))).sendKeys(td.getProperty(Testdata));

	}

	// Handling Explicit Wait - elementToBeClickable
	public void handleExplicitWait_elementToBeClickable(String xpathkey) {
		WebDriverWait wt = new WebDriverWait(driver, 30);
		wt.until(ExpectedConditions.elementToBeClickable(By.xpath(or.getProperty(xpathkey))));

	}

	public static Object getDriver() {
		// TODO Auto-generated method stub
		return null;
	}

}
