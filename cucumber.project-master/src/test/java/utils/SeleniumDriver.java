package utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumDriver {
	// Initialize driver
	private static SeleniumDriver seleniumDriver;
	public static WebDriver driver;

	// Initialize timeouts
	private static WebDriverWait waitDriver;
	public final static int TIMEOUT = 60;
	public final static int PAGE_LOAF_TIMEOUT = 60;
	ConfigFileReader configFileReader;

	ChromeOptions options = new ChromeOptions();

	private SeleniumDriver() {
		//WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver(options);
		driver.manage().window().maximize();
		waitDriver = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(PAGE_LOAF_TIMEOUT));

	}

	public static void openPage(String url) {
		System.out.println(url);
		System.out.println(driver);
		driver.get(url);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public static void setUpDriver() {
		seleniumDriver = new SeleniumDriver();
	}

	public static void tearDown() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
		seleniumDriver = null;
	}

	public static void waitForPageToLoad() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
