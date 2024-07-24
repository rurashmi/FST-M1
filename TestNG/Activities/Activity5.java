package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity5 {
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        //Download and install driver
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        //OPen broser
        driver.get("https://v1.training-support.net/selenium/target-practice");
    }

    @Test
    public void homepageTest() {
        String title = driver.getTitle();
        System.out.println("Home page title is " + title);
        //assert page title
        Assert.assertEquals("Target Practice", title);
    }

    @Test
    public void headerTest() {
        WebElement thirdHeader = driver.findElement(By.id("third-header"));
        //New page title
        System.out.println("3rd Header text is " + thirdHeader);
        Assert.assertEquals("Third header", thirdHeader);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}

