package activities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Activity3 {
    AndroidDriver driver;
    WebDriverWait wait;
    @BeforeClass
    public void setUp() throws MalformedURLException {
        //Desired Capabilities
        UiAutomator2Options caps = new UiAutomator2Options();
        caps.setPlatformName("android");
        caps.setAutomationName("UiAutomator2");
        caps.setAppPackage("com.miui.calculator");
        caps.setAppActivity(".cal.CalculatorActivity");
        caps.noReset();
        //Set server URL
        URL serverURL = new URL("http://localhost:4723/wd/hub");
        //Initialize Android driver
        driver = new AndroidDriver(serverURL, caps);
    }
    @Test(priority = 1)
    public void additionTest(){
        //Perform calculation
        driver.findElement(AppiumBy.id("com.miui.calculator:id/btn_5_s")).click();
        driver.findElement(AppiumBy.accessibilityId("plus")).click();
        driver.findElement(AppiumBy.id("com.miui.calculator:id/btn_9_s")).click();
        driver.findElement(AppiumBy.accessibilityId("equals")).click();
        String result1 = driver.findElement(AppiumBy.id("com.miui.calculator:id/result")).getText();
        //Assertions
        Assert.assertEquals(result1, "= 14");
        driver.findElement(AppiumBy.accessibilityId("clear")).click();
    }

    @Test (priority = 2)
    public void subtractionTest(){
        //Perform calculation
        driver.findElement(AppiumBy.id("com.miui.calculator:id/btn_1_s")).click();
        driver.findElement(AppiumBy.id("com.miui.calculator:id/btn_0_s")).click();
        driver.findElement(AppiumBy.accessibilityId("minus")).click();
        driver.findElement(AppiumBy.id("com.miui.calculator:id/btn_5_s")).click();
        driver.findElement(AppiumBy.accessibilityId("equals")).click();
        String result2 = driver.findElement(AppiumBy.id("com.miui.calculator:id/result")).getText();
        //Assertions
        Assert.assertEquals(result2, "= 5");
        driver.findElement(AppiumBy.accessibilityId("clear")).click();
    }

    @Test(priority = 3)
    public void multiplyTest(){
        //Perform calculation
        driver.findElement(AppiumBy.id("com.miui.calculator:id/btn_5_s")).click();
        driver.findElement(AppiumBy.accessibilityId("multiply")).click();
        driver.findElement(AppiumBy.id("com.miui.calculator:id/btn_1_s")).click();
        driver.findElement(AppiumBy.id("com.miui.calculator:id/btn_0_s")).click();
        driver.findElement(AppiumBy.id("com.miui.calculator:id/btn_0_s")).click();
        driver.findElement(AppiumBy.accessibilityId("equals")).click();
        String result3 = driver.findElement(AppiumBy.id("com.miui.calculator:id/result")).getText();
        //Assertions
        Assert.assertEquals(result3, "= 500");
        driver.findElement(AppiumBy.accessibilityId("clear")).click();
    }

    @Test (priority = 4)
    public void divisionTest(){
        //Perform calculation
        driver.findElement(AppiumBy.id("com.miui.calculator:id/btn_5_s")).click();
        driver.findElement(AppiumBy.id("com.miui.calculator:id/btn_0_s")).click();
        driver.findElement(AppiumBy.accessibilityId("divide")).click();
        driver.findElement(AppiumBy.id("com.miui.calculator:id/btn_2_s")).click();
        driver.findElement(AppiumBy.accessibilityId("equals")).click();
        String result4 = driver.findElement(AppiumBy.id("com.miui.calculator:id/result")).getText();
        //Assertions
        Assert.assertEquals(result4, "= 25");
        driver.findElement(AppiumBy.accessibilityId("clear")).click();
    }

    // Tear down method
    @AfterClass
    public void tearDown(){
        // Close the app
        driver.quit();
    }
}
