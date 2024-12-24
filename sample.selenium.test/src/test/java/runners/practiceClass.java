package runners;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chromium.ChromiumDriverLogLevel;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class practiceClass {

	public static void main(String[] args) throws InterruptedException {
	    ChromeDriverService service =
	            new ChromeDriverService.Builder().withLogLevel(ChromiumDriverLogLevel.DEBUG).build();
	   
		ChromeOptions op=new ChromeOptions();
		//op.addArguments("--headless");
	    op.addArguments("--start-maximized");
		WebDriver driver=new ChromeDriver(op);
		System.out.println(service.getDriverName());
		 System.out.println(service.CHROME_DRIVER_LOG_LEVEL_PROPERTY.toString());
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		try {
        //driver.get("https://www.selenium.dev/selenium/web/web-form.html");
        driver.navigate().to("https://www.selenium.dev/selenium/web/web-form.html");
        Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'Submit')]")).isDisplayed());
        WebElement textField=driver.findElement(By.name("my-text"));
        WebElement submitButton=driver.findElement(By.xpath("//*[contains(text(),'Submit')]"));
        Select dropdown=new Select(driver.findElement(By.name("my-select")));
       
        dropdown.selectByValue("2");
        dropdown.selectByVisibleText("One");
        Wait<WebDriver> wait=new WebDriverWait(driver, Duration.ofMillis(30));
        wait.until(ExpectedConditions.visibilityOf(submitButton));
        
        
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView(true);", submitButton);
        textField.sendKeys("Selenium");
        submitButton.click();
//        
//        
//        File uploadFile=new File("");
//        Thread.sleep(10);
//        WebElement fileInput = driver.findElement(By.xpath("//input[@name='my-file']"));
//        wait.until(ExpectedConditions.visibilityOf(fileInput));
//        fileInput.sendKeys(uploadFile.getAbsolutePath());
//        driver.findElement(By.id("file-submit")).click();
//        Actions action=new Actions(driver);
//        
//        Action ac=action.clickAndHold(submitButton).build();
//        ac.perform();
     Wait<WebDriver> fluentWait=new FluentWait<>(driver).withTimeout(Duration.ofMillis(300))
    		 .pollingEvery(Duration.ofMillis(20)).ignoring(ElementNotInteractableException.class);
     WebElement message=driver.findElement(By.id("message"));
     fluentWait.until(ExpectedConditions.visibilityOf(message));
        
        Assert.assertEquals(message.getText(), "Received!");
        String windowTitle=driver.getTitle();
        System.out.println(windowTitle);
        Assert.assertEquals(windowTitle, driver.getTitle());
        System.out.println("Script executed successfully headless");
		} catch (TimeoutException e) {
			e.printStackTrace();
		}catch (ArithmeticException e) {
			e.printStackTrace();
		}
		 finally {
	         	driver.quit();
	         }
	       

	}
	 

}
