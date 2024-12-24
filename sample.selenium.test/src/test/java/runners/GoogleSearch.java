package runners;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class GoogleSearch {
    public static void main(String[] args) {
        // Set the path to your ChromeDriver
        //System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

            // Navigate to Google
            driver.get("https://www.google.com");

            // Locate the search box and enter 'Bihar'
            WebElement searchBox = driver.findElement(By.xpath("//*[@class='gLFyf']"));
            searchBox.sendKeys("Bihar");
            driver.findElement(By.xpath("//*[@id=\"jZ2SBf\"]/div[1]/span")).click();
            //searchBox.sendKeys(Keys.RETURN);

            // Wait for the results to load (you can add explicit wait here if needed)

            // Fetch the list of search results         
            List<WebElement> searchResults = driver.findElements(By.xpath("//*[@class=\"LC20lb MBeuO DKV0Md\"]"));

            System.out.println(searchResults.size());
         
            
            driver.findElement(By.xpath("(//*[@class=\"LC20lb MBeuO DKV0Md\"])[3]")).click(); // Index is 2 because it's 0-based
               
            try {
				Thread.sleep(30000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
 
            // Close the browser after use
            driver.quit();
    }
}
