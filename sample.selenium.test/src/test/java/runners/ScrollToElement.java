package runners;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ScrollToElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.selenium.dev/selenium/web/scroll.html");
		
		
		WebElement element= driver.findElement(By.xpath("//*[@id='line9']"));
		
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView(true)", element);
		
		element.click();
		
		Wait<WebDriver> wait=new FluentWait<>(driver).withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class);
		WebElement ele=driver.findElement(By.xpath("//*[@id='clicked' and text()='line9']"));
		wait.until(ExpectedConditions.visibilityOf(ele));
		
		String text=ele.getText();
		
		Assert.assertEquals("line9", text);
		
		System.out.println(text);
		
		driver.navigate().to("https://www.selenium.dev/selenium/web/dragAndDropTest.html");
		
		driver.navigate().refresh();
		
		WebElement source1=driver.findElement(By.xpath("//*[@id=\"test4\"]"));
		WebElement source2=driver.findElement(By.xpath("//*[@id=\"test3\"]"));
		
		WebElement dest1=driver.findElement(By.xpath("//*[@id=\"test2\"]"));
		WebElement dest2=driver.findElement(By.xpath("//*[@id=\"test1\"]"));
		
		Actions action=new Actions(driver);
		
		action.dragAndDrop(source1, dest2).perform();
		
		action.dragAndDrop(source2, dest1).perform();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.navigate().to("https://www.selenium.dev/selenium/web/iframes.html");
		
		driver.switchTo().frame(driver.findElement(By.name("iframe1-name")));
		System.out.println(driver.getTitle());
		
		driver.findElement(By.id("email")).sendKeys("test@gmail.com");
		driver.findElement(By.id("age")).sendKeys("21");
		driver.findElement(By.id("submitButton")).click();
		
		driver.switchTo().defaultContent();
		
		String text2=driver.findElement(By.id("iframe_page_heading")).getText();
		
		System.out.println(text2);
		
		
		driver.navigate().to("https://www.selenium.dev/selenium/web/window_switching_tests/page_with_frame.html");
		
		driver.switchTo().frame(0);
		
		System.out.println(driver.findElement(By.xpath("//*[contains(text(), 'Simple page with simple test.')]")).getText());
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.id("a-link-that-opens-a-new-window")).click();
		
		String parentWindow=driver.getWindowHandle();
		
		for(String childWindow:driver.getWindowHandles()) {
			if(!parentWindow.equals(childWindow)) {
				driver.switchTo().window(childWindow);
				System.out.println(driver.findElement(By.xpath("//*[contains(text(),'Simple page with simple test.')]")).getText());
			}
		}
		driver.close();
		
		driver.switchTo().window(parentWindow);
		
		
		driver.get("https://practice.expandtesting.com/dynamic-table");
		
		String ChromeCPUPercentage1=driver.findElement(By.xpath("//tbody/tr/td[contains(text(),'Chrome')]/following-sibling::td[contains(text(),'%')]"))
				.getText();
		
		System.out.println(ChromeCPUPercentage1);
		
		String ChromeCPUPercentage2=driver.findElement(By.xpath("//*[@id='chrome-cpu']")).getText();
		
		System.out.println(ChromeCPUPercentage2);
		
		if(ChromeCPUPercentage2.contains(ChromeCPUPercentage1)) {
			System.out.println("Script passed successfully.");
		}
		
		
		driver.get("https://practice.expandtesting.com/inputs");
		
		driver.findElement(By.id("input-number")).sendKeys("1234567");
		driver.findElement(By.id("input-text")).sendKeys("Avinash Kumar");
		driver.findElement(By.id("input-password")).sendKeys("test123");
		driver.findElement(By.id("input-date")).sendKeys("28/12/1992");
		
		driver.findElement(By.xpath("//*[@id=\"btn-display-inputs\"]")).click();
		
		Assert.assertEquals(true, driver.findElement(By.id("output-number")).isDisplayed());
		
	
		driver.get("https://admin:admin@practice.expandtesting.com/digest-auth");
		

		driver.navigate().to("https://workspace.google.com/intl/en-US/gmail/");
		
		driver.findElement(By.xpath("(//span[contains(text(),'Sign in')])[2]")).click();
		
		driver.findElement(By.id("identifierId")).sendKeys("avina3086");
		
		driver.findElement(By.xpath("//*[@class=\"VfPpkd-vQzf8d\" and text()='Next']")).click();
		
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class=\"VfPpkd-vQzf8d\" and text()='Try again']")));
		
		
		driver.quit();
		

	}

}
