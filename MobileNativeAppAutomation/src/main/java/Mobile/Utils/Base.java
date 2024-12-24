package Mobile.Utils;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class Base {
	
	public static AndroidDriver capabilities() throws MalformedURLException{
		
		File file=new File("/Users/avinashkumar/eclipse-workspace/MobileNativeAppAutomation/src/test/resources/Apps/");
		File app=new File(file, "ApiDemos-debug.apk");
		
		DesiredCapabilities cap=new DesiredCapabilities();
		
		cap.setCapability("deviceName", "Test");
		//cap.setCapability("automationName", "UiAutomator2");
		//cap.setCapability("app", app.getAbsolutePath());
		
		AndroidDriver driver=new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), cap);
		
		return driver;
		
	}

}
