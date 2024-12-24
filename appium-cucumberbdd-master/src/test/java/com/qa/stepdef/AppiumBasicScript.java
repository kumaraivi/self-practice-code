package com.qa.stepdef;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AppiumBasicScript {

    public static AppiumDriver<MobileElement> driver;

    public static void main(String[] args) {
        String platform = "android";  // Change to "ios" for iOS testing
        try {
            if (platform.equalsIgnoreCase("android")) {
                startAndroidDriver();
            } else if (platform.equalsIgnoreCase("ios")) {
                startIOSDriver();
            }

            // Example: Automating a simple action (finding and clicking a button)
            MobileElement element = driver.findElementByAccessibilityId("SomeAccessibilityId");
            element.click();
            
            // Further interactions...

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (driver != null) {
                driver.quit();
            }
        }
    }

    // Method to start Android driver
    public static void startAndroidDriver() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "11.0"); // Your Android version
        caps.setCapability("deviceName", "Android Emulator"); // Device name or emulator
        caps.setCapability("appPackage", "com.example.androidapp"); // Your app's package name
        caps.setCapability("appActivity", "com.example.androidapp.MainActivity"); // Your app's activity
        caps.setCapability("automationName", "UIAutomator2");

        // Set App path or use appPackage and appActivity for an already installed app
        // caps.setCapability("app", "/path/to/app.apk");

        // Initialize the Android Driver
        driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
    }

    // Method to start iOS driver
    public static void startIOSDriver() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "iOS");
        caps.setCapability("platformVersion", "15.0"); // Your iOS version
        caps.setCapability("deviceName", "iPhone 13"); // Device name or simulator
        caps.setCapability("automationName", "XCUITest");
        caps.setCapability("bundleId", "com.example.iosapp"); // Your iOS app bundle ID

        // Set App path for iOS app
        // caps.setCapability("app", "/path/to/app.app");

        // Initialize the iOS Driver
        driver = new IOSDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
    }
}
