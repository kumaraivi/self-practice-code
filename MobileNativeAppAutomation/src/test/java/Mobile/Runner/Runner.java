package Mobile.Runner;

import java.net.MalformedURLException;
import java.time.Duration;

import org.openqa.selenium.By;

import Mobile.Utils.Base;
import dev.failsafe.internal.util.Durations;
import io.appium.java_client.android.AndroidDriver;

public class Runner extends Base{
	
	public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver driver=capabilities();
	
			driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"App\"]")).click();
			driver.quit();
			System.out.print("Script Passed");
		
	}

}
