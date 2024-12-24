package utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;







public class SeleniumHelper {



	// by web element
	public static boolean isElementPresent(WebElement webElement) {
		try {
			System.out.println(">>SeleniumHelper web helper WebElement=" + webElement.getText());
			boolean isPresent = webElement.isDisplayed();

			return isPresent;
		} catch (Exception e) {
			return false;
		}
	}

	// by xpath
	public static boolean isElementPresent(String xPath) {
		try {
			System.out.println(">>SeleniumHelper web helper xPath=" + xPath);
			boolean isPresent = !SeleniumDriver.getDriver().findElements(By.xpath(xPath)).isEmpty();
			System.out.println(xPath + " isPresent?=" + isPresent);
			return isPresent;
		} catch (Exception e) {
			return false;
		}
	}

	public static void takeScreenshot() {
		takeScreenshot("");

	}

	public static void takeScreenshot(String imageName) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		File srcFile = ((TakesScreenshot) SeleniumDriver.getDriver()).getScreenshotAs(OutputType.FILE);
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy_hhmmss");
			Date curDate = new Date();
			String imagePath;

			if (System.getProperty("os.name").contains("windows")) {
				String strDate = sdf.format(curDate);
				imagePath = System.getProperty("user.dir")+ "/Screenshots" + "/" + imageName + "_" + strDate + ".png";
			} else {
				String strDate = sdf.format(curDate);
				imagePath = System.getProperty("user.dir")+ "/Screenshots" + "/" + imageName + ".png";
			}
			FileUtils.copyFile(srcFile, new File(imagePath));
			//Reporter.addScreenCaptureFromPath(imagePath);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	

	public static void tearDownReport()  {
	
	

	}
	
	public static void waitForVisibilityofElement(WebElement we, int sec) {
		WebDriverWait wait=new WebDriverWait(SeleniumDriver.getDriver(),Duration.ofSeconds(sec));
		wait.until(ExpectedConditions.visibilityOf(we));
	}
	


}
