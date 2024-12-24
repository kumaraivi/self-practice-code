package com.eot.sample;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.File;
import java.net.URL;
import java.util.HashMap;

public class Hooks {
    private static AppiumDriverLocalService localAppiumServer;

    @BeforeSuite
    public void beforeAll() {
        System.out.println(String.format("Start local Appium server"));
        //AppiumServiceBuilder serviceBuilder = new AppiumServiceBuilder();
        // Use any port, in case the default 4723 is already taken (maybe by another Appium server)
        HashMap<String, String> environment = new HashMap<>();
        environment.put("PATH", "/usr/local/bin:" + System.getenv("PATH"));
        AppiumServiceBuilder serviceBuilder =
                new AppiumServiceBuilder()
                        .withAppiumJS(new File("/Applications/Appium Server GUI.app/Contents/Resources/app/node_modules/appium/build/lib/main.js"))
                        .withArgument(GeneralServerFlag.RELAXED_SECURITY)
                        .usingAnyFreePort()
                        .withEnvironment(environment);

        // Appium 1.x
        localAppiumServer = AppiumDriverLocalService.buildService(serviceBuilder)
                                                    .withBasePath("/wd/hub/");

        // Appium 2.x
        //localAppiumServer = AppiumDriverLocalService.buildService(serviceBuilder);
        localAppiumServer.start();
        System.out.println(String.format("Appium server started on url: '%s'",
                                         localAppiumServer.getUrl()
                                                          .toString()));
    }

    @AfterSuite
    public void afterSuite() {
        if (null != localAppiumServer) {
            System.out.println(String.format("Stopping the local Appium server running on: '%s'",
                                             localAppiumServer.getUrl()
                                                              .toString()));
            localAppiumServer.stop();
            System.out.println("Is Appium server running? " + localAppiumServer.isRunning());
        }
    }

    public URL getAppiumServerUrl() {
        System.out.println("Appium server url: " + localAppiumServer.getUrl());
        return localAppiumServer.getUrl();
    }
}
