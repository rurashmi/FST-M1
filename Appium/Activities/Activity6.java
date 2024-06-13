package activities;

import examples.UIScrollable;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
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
import java.util.List;

public class Activity6 {
    AndroidDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        //Desired Capabilities
        UiAutomator2Options caps = new UiAutomator2Options();
        caps.setPlatformName("android");
        caps.setAutomationName("UiAutomator2");
        caps.setAppPackage("com.android.chrome");
        caps.setAppActivity("com.google.android.apps.chrome.Main");
        caps.noReset();

        //Set server URL
        URL serverURL = new URL("http://localhost:4723/wd/hub");
        //Initialize Android driver
        driver = new AndroidDriver(serverURL, caps);
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        //Open Selenium page
        driver.get("https://v1.training-support.net/selenium/lazy-loading");
    }
    @Test
    public void ChromeTest(){
        String UiScrollable = "UiScrollable(UiSelector().scrollable(true))";
        //Wait for page to load
        //wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.className("android.widget.Image")));
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        //Find all the image elements on the page
        List<WebElement> imageElements = driver.findElements(AppiumBy.className("android.widget.Image"));
        //Number of elements before scrolling
        System.out.println("Number of images before scroll" + imageElements.size());
        //Scroll using Ui Scrollable
        driver.findElement(AppiumBy.androidUIAutomator(UiScrollable+".scrollTextIntoView(\"helen\")"));

        //Image elements after scroll
        imageElements = driver.findElements(AppiumBy.className("android.widget.Image"));
        //Number of elements after scrolling
        System.out.println("Number of images after scroll" + imageElements.size());

        // Assertions
        Assert.assertEquals(imageElements.size(), 5);
            }

   @AfterClass
//Tear down script
    public void tearDown(){
       driver.quit();
    }
}