package pageActions;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pageLocators.homePage_Locators;
import utils.SeleniumDriver;


public class homePage_Actions {
	public static WebDriver driver;
	homePage_Locators hL = new homePage_Locators();
	
	public void enterText(String text) {
		hL.searchTextBox.sendKeys(text, Keys.TAB);
	}
	
	public void enterText() {
		hL.searchTextBox.sendKeys("gmail",Keys.TAB);
	}
	
	public void clickOnSearchButton() {
		hL.searchButton.click();
		
	}
	
	public void clickOnGmailHomeLink() {
		hL.gmailHome.click();
	}


}
