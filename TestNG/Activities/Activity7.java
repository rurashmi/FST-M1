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
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Activity7 {
    WebDriver driver;
    @BeforeClass
    public void setUp(){
        //Download and install driver
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();

        //Open browser
        driver.get("https://v1.training-support.net/selenium/login-form");
    }

    @Test
    public void homepageTitle() {
        String title = driver.getTitle();
        System.out.println("Home page time is" +title);
        //assert page title
        Assert.assertEquals("Login Form", title);
    }
    @DataProvider(name = "Authentication")
    public static Object[][] credentials() {
        return new Object[][] {{"admin", "password"}};
    }

    @Test (dataProvider = "Authentication")
    public void loginTestCase(String username, String password) {
        //Find username and password fields
        WebElement usernameField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.id("password"));

        //Enter values
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);

        //Click Log in
        driver.findElement(By.cssSelector("button[type='submit']")).click();

        //Assert Message
        String loginMessage = driver.findElement(By.id("action-confirmation")).getText();
        Assert.assertEquals(loginMessage, "Welcome Back, admin");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }


}

