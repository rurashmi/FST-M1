package liveProject;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Activity3_GoogleKeepReminder {
    AndroidDriver driver;
    WebDriverWait wait;
    @BeforeClass
    public void setUp() throws MalformedURLException {
        //Desired Capabilities
        UiAutomator2Options caps = new UiAutomator2Options();
        caps.setPlatformName("Android");
        caps.setAutomationName("UiAutomator2");
        caps.setAppPackage("com.google.android.keep");
        caps.setAppActivity(".activities.BrowseActivity");
        caps.noReset();
        //Server URL
        URL serverURL = new URL("http://localhost:4723/wd/hub");
        //Initialize Android driver
        driver = new AndroidDriver(serverURL, caps);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    @Test
    public void Reminder(){
        //Find and click the add button
        driver.findElement(AppiumBy.accessibilityId("New text note")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.id("com.google.android.keep:id/editable_title"))).click();
        driver.findElement(AppiumBy.id("com.google.android.keep:id/editable_title")).sendKeys("Google Keep task");
        driver.findElement(AppiumBy.id("com.google.android.keep:id/edit_note_text")).click();
        driver.findElement(AppiumBy.id("com.google.android.keep:id/edit_note_text")).sendKeys("Note from Appium");
        driver.findElement(AppiumBy.accessibilityId("Reminder")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Later today']")).click();
        //Press back button
        driver.navigate().back();
        driver.findElement(AppiumBy.accessibilityId("Navigate up")).click();
        //driver.pressKey(new KeyEvent(AndroidKey.BACK).sendKeys('\b'));
        //driver.sendKeys('\b');


        //Assertion

    }
}
