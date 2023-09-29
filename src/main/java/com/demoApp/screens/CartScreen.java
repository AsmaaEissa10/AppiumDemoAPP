package com.demoApp.screens;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class CartScreen {
    private final By proceedToCheckoutButton = AppiumBy.xpath("//*[@content-desc=\"Proceed To Checkout button\"]");
    AndroidDriver driver;
    public CartScreen(AndroidDriver driver) { this.driver = driver;}

    /**
     *
     * @return new Checkout Screen
     */
    public CheckoutScreen clickOnProceedToCheckoutButton(){
        driver.findElement(proceedToCheckoutButton).click();
        return new CheckoutScreen(driver);
    }
}
