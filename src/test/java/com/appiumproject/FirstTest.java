package com.appiumproject;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.junit.jupiter.api.*;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class FirstTest {
    String appPath = "/Users/USERNAME/appiumproject/src/test/resources/calc.apk";
    String deviceName = "Pixel_7_API_TiramisuPrivacySandbox";
    String ipAddress = "http://127.0.0.1";
    int port = 4723;
    String appiumServer = String.format("%s:%d", ipAddress, port);
    String appiumServerMainJsFileLocation = "/usr/local/lib/node_modules/appium/build/lib/main.js";
    AndroidDriver androidDriver;
    AppiumDriverLocalService appiumServiceBuilder;

    @BeforeAll
    public void setup() throws MalformedURLException {
        appiumServiceBuilder = new AppiumServiceBuilder()
                .withAppiumJS(new File(appiumServerMainJsFileLocation))
                .withIPAddress("127.0.0.1")
                .usingPort(port).build();

        appiumServiceBuilder.start();

        UiAutomator2Options options = new UiAutomator2Options()
                .setDeviceName(deviceName)
                .setApp(appPath);

        androidDriver = new AndroidDriver(new URL(appiumServer), options);
    }

    @AfterAll
    public void tearDown() {
        androidDriver.quit();
        appiumServiceBuilder.stop();
    }

    @Test
    public void exampleTest() throws InterruptedException {
        System.out.println("this is the first test");
        Thread.sleep(20000);
    }
}
