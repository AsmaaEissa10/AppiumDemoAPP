package com.demoApp.screens;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class CheckoutScreen {
    private final By fullNameinputField = AppiumBy.accessibilityId("Full Name* input field");
    private final By addressLine = AppiumBy.accessibilityId("Address Line 1* input field");
    private final By addressLine2 = AppiumBy.accessibilityId("Address Line 2 input field");
    private final By city = AppiumBy.accessibilityId("City* input field");
    private final By state = AppiumBy.accessibilityId("State/Region input field");
    private final By zipCode = AppiumBy.accessibilityId("Zip Code* input field");
    private final By country = AppiumBy.accessibilityId("Country* input field");
    private final By paymentButton = AppiumBy.xpath("//*[@content-desc=\"To Payment button\"]");

    AndroidDriver driver;
    public CheckoutScreen(AndroidDriver driver) {this.driver = driver;}

    /**
     *
     * @param FullName value from src/test/resources/testData/paymentTestData.json
     * @param AddressLine value from src/test/resources/testData/paymentTestData.json
     * @param AddressLine2 value from src/test/resources/testData/paymentTestData.json
     * @param City value from src/test/resources/testData/paymentTestData.json
     * @param State value from src/test/resources/testData/paymentTestData.json
     * @param ZipCode value from src/test/resources/testData/paymentTestData.json
     * @param Country value from src/test/resources/testData/paymentTestData.json
     * @return  PaymentScreen
     */
    public PaymentScreen fillCheckoutInformation(String FullName , String AddressLine ,String AddressLine2 , String City , String State , String ZipCode , String Country  ){
        driver.findElement(fullNameinputField).clear();
        driver.findElement(fullNameinputField).sendKeys(FullName);

        driver.findElement(addressLine).clear();
        driver.findElement(addressLine).sendKeys(AddressLine);

        driver.findElement(addressLine2).clear();
        driver.findElement(addressLine2).sendKeys(AddressLine2);

        driver.findElement(city).clear();
        driver.findElement(city).sendKeys(City);

        driver.findElement(state).clear();
        driver.findElement(state).sendKeys(State);

        driver.findElement(zipCode).clear();
        driver.findElement(zipCode).sendKeys(ZipCode);

        driver.findElement(country).clear();
        driver.findElement(country).sendKeys(Country);

        driver.findElement(paymentButton).click();

        return new PaymentScreen(driver);
    }
}
