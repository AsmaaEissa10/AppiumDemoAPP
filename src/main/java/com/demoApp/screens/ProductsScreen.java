package com.demoApp.screens;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class ProductsScreen {

    private final By counterPlusButton = AppiumBy.xpath("//*[@content-desc=\"counter plus button\"]");
    private final By addToCartButton = AppiumBy.xpath("//*[@content-desc=\"Add To Cart button\"]");
    private final By cartBadge = AppiumBy.xpath("//*[@content-desc=\"cart badge\"]");


     AndroidDriver driver;
    public ProductsScreen(AndroidDriver driver) {this.driver = driver;}

    /**
     *
     * @return Product Screen
     */
    public ProductsScreen clickOncounterPlusButton() {
        driver.findElement(counterPlusButton).click();
        return this;
    }

    /**
     *
     * @return Product Screen
     */
    public ProductsScreen clickOnaddToCartbutton() {
        driver.findElement(addToCartButton).click();
        return this;
    }

    /**
     *
     * @return new CartScreen
     */
    public CartScreen clickOnCartBadge() {
        driver.findElement(cartBadge).click();
        return new CartScreen(driver);
    }
}
