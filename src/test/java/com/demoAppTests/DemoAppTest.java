package com.demoAppTests;

import com.demoApp.screens.HomeScreen;
import com.demoApp.ulits.JsonReader;
import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class DemoAppTest extends BaseTest {
    String loginTestData = "src/test/resources/testData/loginTestData.json";
    String checkoutTestData = "src/test/resources/testData/checkoutTestData.json";
    String paymentTestData = "src/test/resources/testData/paymentTestData.json";

    @Test
    public void CheckOutOrderTest() throws IOException, ParseException {
        new HomeScreen(driver)
                .ClickOnOpenMenu()
                .ClickOnLoginButton()
                .LoginWithValidEmailAndPassword
                        (
                                JsonReader.TestJson.getJson(loginTestData, "email"),
                                JsonReader.TestJson.getJson(loginTestData, "password")
                        )
                .ClickOnProduct1()
                .clickOncounterPlusButton()
                .clickOnaddToCartbutton()
                .clickOnCartBadge()
                .clickOnProceedToCheckoutButton()
                .fillCheckoutInformation
                        (
                                JsonReader.TestJson.getJson(checkoutTestData, "FullName"),
                                JsonReader.TestJson.getJson(checkoutTestData, "AddressLine"),
                                JsonReader.TestJson.getJson(checkoutTestData, "AddressLine2"),
                                JsonReader.TestJson.getJson(checkoutTestData, "City"),
                                JsonReader.TestJson.getJson(checkoutTestData, "State"),
                                JsonReader.TestJson.getJson(checkoutTestData, "ZipCode"),
                                JsonReader.TestJson.getJson(checkoutTestData, "Country")
                        )
                .fillPaymentInformation
                        (
                                JsonReader.TestJson.getJson(paymentTestData, "FullName"),
                                JsonReader.TestJson.getJson(paymentTestData, "CardNumber"),
                                JsonReader.TestJson.getJson(paymentTestData, "ExpirationDate"),
                                JsonReader.TestJson.getJson(paymentTestData, "SecurityCode")

                        )
                .clickOnplaceOrderbutton()
                .ClickOncontinueShoppingButton();

        String productText = driver.findElement(HomeScreen.products).getText();
        Assert.assertEquals(productText, "Products");
    }
}