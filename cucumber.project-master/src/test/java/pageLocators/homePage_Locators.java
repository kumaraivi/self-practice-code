package pageLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.SeleniumDriver;

public class homePage_Locators {
	
	@FindBy(name="q")
	public WebElement searchTextBox;
	
	@FindBy(xpath="//div[@class='FPdoLc lJ9FBc']/center/input[1]")
	public WebElement searchButton;
	
	@FindBy(xpath="//h3[text()='Gmail - Google']")
	public WebElement gmailHome;
	
	public homePage_Locators() {
		PageFactory.initElements(SeleniumDriver.getDriver(), this);
		
	}

}
