package liveProject;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

public class Activity2_GoogleKeep {
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
    public void GoogleKeep(){
        //Find and click the add button
        driver.findElement(AppiumBy.accessibilityId("New text note")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.id("com.google.android.keep:id/editable_title"))).click();
        driver.findElement(AppiumBy.id("com.google.android.keep:id/edit_note_text")).sendKeys("Note from Appium");
        driver.findElement(AppiumBy.id("com.google.android.keep:id/edit_note_text")).click();
        driver.findElement(AppiumBy.id("com.google.android.keep:id/editable_title")).sendKeys("Google Keep task");
        driver.findElement(AppiumBy.id("com.google.android.keep:id/edit_note_text")).click();


        driver.findElement(AppiumBy.id("com.google.android.keep:id/editor_bottom_bar")).clear();
        //Press back button
        driver.navigate().back();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5));
        driver.findElement(AppiumBy.accessibilityId("Navigate up")).click();

        //driver.pressKey(new KeyEvent().withKey(AndroidKey.BACK));
        //driver.sendKeys('\b');
        //Assertion
        List<WebElement> newNote = driver.findElements(By.xpath("(//android.widget.TextView[@resource-id=\"com.google.android.keep:id/index_note_title\"])"));
        Assert.assertEquals(newNote.size(), 4);

    }
}
