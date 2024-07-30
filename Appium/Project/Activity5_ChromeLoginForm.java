package liveProject;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Activity5_ChromeLoginForm {
    AndroidDriver driver;
    WebDriverWait wait;
    @BeforeClass
    public void setUp() throws MalformedURLException {
        //Desired capabilities
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("Android");
        options.setAutomationName("UiAutomator2");
        options.setAppPackage("com.android.chrome");
        options.setAppActivity("com.google.android.apps.chrome.Main");
        //Server URL
        URL serverURL = new URL("http://localhost:4723/wd/hub");
        //Driver initialization
        driver = new AndroidDriver(serverURL, options);
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        //Open Selenium page
        driver.get("https://v1.training-support.net/selenium");

    }
    @Test(priority = 0)
    public void LoginForm() {
        String UiScrollable = "UiScrollable(UiSelector().scrollable(true))";
        // Wait for the page to load
        wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//android.view.View")));

        // Just scroll
        driver.findElement(AppiumBy.androidUIAutomator(UiScrollable + ".scrollForward()"));
        // Locate Login form tab
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Login Form']")).click();
        // Print page title
        String pageTitle = driver.findElement(AppiumBy.xpath("//android.widget.TextView[contains(@text, 'Login Form')]")).getText();
        System.out.println("Page title is: " + pageTitle);
        //Enter credentials
        WebElement username = driver.findElement(AppiumBy.xpath("//android.webkit.WebView[@text=\"Login Form\"]/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]"));
        WebElement password = driver.findElement(AppiumBy.xpath("//android.webkit.WebView[@text=\"Login Form\"]/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]"));
        username.sendKeys("admin");
        password.sendKeys("password");
        //Click on login button and verify login message
        driver.findElement(AppiumBy.xpath("//android.widget.Button[@text=\"Log in\"]")).click();
        // Print the confirmation message
        String message = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Welcome Back, admin\"]")).getText();
        System.out.println("Login message: " + message);

        // Assertion
        Assert.assertEquals(message, "Welcome Back, admin");
    }
    @Test(priority = 1)
    public void LoginForm2() {
        //Enter credentials
        WebElement username = driver.findElement(AppiumBy.xpath("//android.webkit.WebView[@text=\"Login Form\"]/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]"));
        WebElement password = driver.findElement(AppiumBy.xpath("//android.webkit.WebView[@text=\"Login Form\"]/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]"));
        username.sendKeys("admin1");
        password.sendKeys("password");
        //Click on login button and verify login message
        driver.findElement(AppiumBy.xpath("//android.widget.Button[@text=\"Log in\"]")).click();
        // Print the confirmation message
        String message = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Invalid Credentials\"]")).getText();
        System.out.println("Login message: " + message);

        // Assertion
        Assert.assertEquals(message, "Invalid Credentials");
    }
    @AfterClass
    public void tearDown() {
        driver.quit();

    }
}
