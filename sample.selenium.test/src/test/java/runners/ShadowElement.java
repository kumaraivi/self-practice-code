package runners;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowElement {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		

		try {
			// Navigate to the page with shadow DOM
			driver.get("https://practice.expandtesting.com/shadowdom");

			WebElement shadowHost = driver.findElement(By.id("shadow-host")); // Find the shadow host element

			SearchContext shadowRoot = shadowHost.getShadowRoot(); // Access the Shadow DOM

			WebElement shadowElement = shadowRoot.findElement(By.cssSelector("#my-btn")); // Locate element within the Shadow DOM

			// Perform actions on the shadow element
			System.out.println(shadowElement.getText());
		} finally {
			// Close the browser
			driver.quit();
		}
	}

}
