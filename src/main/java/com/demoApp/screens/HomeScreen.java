package com.demoApp.screens;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class HomeScreen {
    public static By products = AppiumBy.xpath("//*[@text='Products']");
    private final By openMenuLocator = AppiumBy.xpath("//*[@content-desc=\"open menu\"]");
    private final By loginButton = AppiumBy.accessibilityId("menu item log in");
    private final By product1 = AppiumBy.xpath("(//*[@content-desc=\"store item\"])[1]");

    AndroidDriver driver;
    public HomeScreen(AndroidDriver driver) {
        this.driver = driver;
    }

    /**
     *
     * @return HomeScreen
     */
    public HomeScreen ClickOnOpenMenu(){
        driver.findElement(openMenuLocator).click();
        return this;
    }

    /**
     *
     * @return LoginScreen
     */
    public LoginScreen ClickOnLoginButton (){
        driver.findElement(loginButton).click();
        return new LoginScreen(driver);
    }

    /**
     *
     * @return ProductsScreen
     */
    public ProductsScreen ClickOnProduct1 (){
        driver.findElement(product1).click();
        return new ProductsScreen(driver);
    }
}

