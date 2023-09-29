package com.demoAppTests;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.testng.annotations.*;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class BaseTest {
    AppiumDriverLocalService service;
    UiAutomator2Options option;
    public AndroidDriver driver;
   @BeforeSuite
        public void RunServer(){
       service = AppiumDriverLocalService.buildDefaultService();
       service = new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\Mohmmed\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js")).withTimeout(Duration.ofSeconds(120))
            .withIPAddress("0.0.0.0").usingPort(4723).build();
       service.start();
}
  @BeforeClass
    public void RunApplication(){
    option = new UiAutomator2Options();
    option.setDeviceName(System.getProperty("deviceName"));
    option.setPlatformName(System.getProperty("platformName"));
    option.setAutomationName(System.getProperty("androidAutomationName"));
    option.setAppActivity(System.getProperty("androidAppActivity"));
    option.setAppPackage(System.getProperty("androidAppPackage"));

    option.setApp(System.getProperty("user.dir") + "/src/test/resources/app/Android-MyDemoAppRN.1.3.0.build-244.apk");

  }
  @BeforeMethod
    public void AndroidDriver () throws MalformedURLException {
    driver = new AndroidDriver(new URL("http://0.0.0.0:4723"),option);
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
  }
  @AfterMethod
    public void quitAndroidDriver() { driver.quit(); }
    @AfterSuite
    public void stopServer(){ service.stop(); }

   }
