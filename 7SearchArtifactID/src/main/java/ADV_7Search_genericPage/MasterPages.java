package ADV_7Search_genericPage;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MasterPages {

	public static WebDriver driver;
	public Properties prop;
	public Properties or;
	public Properties td;

	// Constructor Implementation
	public MasterPages() throws Exception {

		// configuration properties file implementation
		FileInputStream ip = new FileInputStream(
				".\\src\\main\\java\\ADV7Search\\repository\\configuration.Properties");
		prop = new Properties();
		prop.load(ip);

		// Locators properties file implementation
		FileInputStream fs = new FileInputStream(".\\src\\main\\java\\ADV7Search\\repository\\Locators.Properties");
		or = new Properties();
		or.load(fs);

		// Test data properties file implementation
		FileInputStream ts = new FileInputStream(".\\src\\main\\java\\ADV7Search\\repository\\Testdata.Properties");
		td = new Properties();
		td.load(ts);

		// added web driver manager dependency
		if (prop.getProperty("browser").equalsIgnoreCase("chromes")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (prop.getProperty("browser").equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();

		} else if (prop.getProperty("browser").equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\src\\main\\java\\Common_ADV.Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		} else {
			System.out.println("no browser details found");
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));

	}

}
