package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Activity9 {
WebDriver driver;
WebDriverWait wait;
@BeforeClass
    public void setUp(){
    WebDriverManager.firefoxdriver().setup();
    driver = new FirefoxDriver();
    wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    Reporter.log("Starting log test!");
    driver.get("https://v1.training-support.net/selenium/javascript-alerts");
    Reporter.log("Opened Browser!");
    //Print the title of page
    Reporter.log("Home page title is: "+ driver.getTitle());
}
@BeforeMethod
    public void beforeMethod(){
    Reporter.log("Test case set up started!");
    driver.switchTo().defaultContent();
}
@Test(priority = 0)
    public void simpleAlert(){
    Reporter.log("Simple alert case started!");
    driver.findElement(By.id("simple")).click();
    Reporter.log("Simple alert opened!");
    //Switch to alert window
    Alert simpleAlert = driver.switchTo().alert();
    Reporter.log("Switched focus to alert window!");
    Reporter.log("Alert text is: "+ simpleAlert.getText() + "!");
    //Assertion
    Assert.assertEquals("This is a JavaScript Alert!", simpleAlert.getText());
    simpleAlert.accept();
    Reporter.log("Alert closed");
    Reporter.log("Test case ended");
}

    @Test(priority = 1)
    public void confirmAlert() {
        Reporter.log("Simple alert case started!");
        driver.findElement(By.id("confirm")).click();
        Reporter.log("Confirmation alert opened!");
        //Switch to alert window
        Alert confirmAlert = driver.switchTo().alert();
        Reporter.log("Switched focus to alert window!");
        Reporter.log("Alert text is: " + confirmAlert.getText() + "!");
        //Assertion
        Assert.assertEquals("This is a JavaScript Confirmation!", confirmAlert.getText());
        confirmAlert.accept();
        Reporter.log("Alert closed");
        Reporter.log("Test case ended");
    }

    @Test(priority = 2)
    public void promptAlert() {
        Reporter.log("Simple alert case started!");
        driver.findElement(By.id("prompt")).click();
        Reporter.log("Prompt alert opened!");
        //Switch to alert window
        Alert promptAlert = driver.switchTo().alert();
        Reporter.log("Switched focus to alert window!");
        Reporter.log("Alert text is: " + promptAlert.getText() + "!");
        //Assertion
        //Assert.assertEquals("This is a JavaScript Alert!", promptAlert.getText());
        promptAlert.sendKeys("Awesome!!");
        Reporter.log("Text entered in prompt alert!");
        //Assertion
        Assert.assertEquals("This is a JavaScript Prompt!", promptAlert.getText());

        promptAlert.accept();
        Reporter.log("Alert closed |");

        Reporter.log("Test case ended |");
    }
@AfterClass
    public void tearDown(){
    Reporter.log("Ending Test!");
    driver.quit();
}
}