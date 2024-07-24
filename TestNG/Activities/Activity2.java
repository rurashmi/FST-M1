package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity2 {
    WebDriver driver;
    @BeforeClass
    public void setUp(){
        //Download and install driver
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();

        //Open browser
        driver.get("https://v1.training-support.net/selenium/target-practice");
    }

    @Test
    public void homepageTitle() {
        String title = driver.getTitle();
        System.out.println("Home page time is" +title);
        //assert page title
        Assert.assertEquals("Target Practice", title);

    }
    @Test
    public void throwError(){
        WebElement blackButton = driver.findElement(By.className("black" ));
        Assert.assertTrue(blackButton.isDisplayed());
        Assert.assertEquals(blackButton.getText(), "Black");
    }

    @Test (enabled = false)
    public void skipMethod(){
        WebElement greyButton = driver.findElement(By.className("grey"));
        Assert.assertTrue(greyButton.isDisplayed());
        Assert.assertEquals(greyButton.getText(), "grey");
    }
    @Test
    public void skipException(){
        throw new SkipException(("Skipping this test case"));
    }
    @AfterClass
    public void tearDown() {
        driver.quit();
    }


}

