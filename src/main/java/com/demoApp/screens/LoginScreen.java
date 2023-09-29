package com.demoApp.screens;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class LoginScreen {

    private final By emailLocator = AppiumBy.accessibilityId("Username input field");
    private final By passwordLocator = AppiumBy.accessibilityId("Password input field");
    private final By loginButtonLocator = AppiumBy.accessibilityId("Login button");

    AndroidDriver driver;
    public LoginScreen(AndroidDriver driver) {
        this.driver = driver;
    }

    /**
     *
     * @param email value from src/test/resources/testData/loginTestData.json
     * @param Password value from src/test/resources/testData/loginTestData.json
     * @return HomeScreen
     */

    public HomeScreen LoginWithValidEmailAndPassword (String email, String Password){
        driver.findElement(emailLocator).sendKeys(email);
        driver.findElement(passwordLocator).sendKeys(Password);
        driver.findElement(loginButtonLocator).click();
         return new HomeScreen (driver);
    }


}
