
# ✨ Mobile Test Automation using Appium 2.0 ✨ 

*  **[ Mobile Application ]** => ( Android-MyDemoAppRN.1.3.0.build-244.apk )
 
* ### 🗃️ Documentation: [Appium 2.0 Docs] ( https://appium.io/docs/en/2.1/ )

### The main Frameworks included in the project:
* Appium 2.0
* TestNG

### Project Design:
* Page Object Model (POM) design pattern
* Data Driven framework using JSON
* Fluent design approach

### Running Tests:
1. Start appium server
2. start android emulator
3. Run android tests
4. Generate reports using allure report


### Covering The Following Test Cases (DemoAppTest):
1. user open mobile application
2. click on Menu
3. click on Login and login Using Valid Email & Password
4. choose Product and click on counter Plus Button 
5. click on add To Cart button and click on Cart Badge 
6. click on Proceed To Checkout Button 
7. fill Checkout Information 
8. fill Payment Information 
9. click on place order button 
10. click on continue shopping button 
11. validate that user should return to Home screen

* ### 🌐 Some important links:
* Install Appium v2 (https://appium.io/docs/en/2.0/quickstart/install/)
* Install the UiAutomator2 Driver (https://appium.io/docs/en/2.0/quickstart/uiauto2-driver/)
* DownLoad Android Studio ( https://developer.android.com/studio)
* DownLoad Appium Inspector (https://github.com/appium/appium-inspector)
* Capabilities ( https://appium.io/docs/en/2.1/guides/caps/ )


* ### 🗃️ set variables and paths:
* install Java JDK-20 & set JAVA_HOME: C:\Program Files\Java\jdk-20
* install Appium 2.0
* Install UiAutomator2 Driver
* DownLoad Android Studio
* set new Environment variable: ANDROID_HOME: C:\Users\yourUserName\AppData\Local\Android\Sdk
###### you can get the path of ANDROID_HOME from Andriod Studio ( Setting =>SDK Manage =>Android SDK Location)
* Add 3 variables to the path in user variables:
###### ( %ANDROID_HOME%\bin - %ANDROID_HOME%\tools - %ANDROID_HOME%\platform-tools)