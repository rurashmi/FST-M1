package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity1 {
    WebDriver driver;
    @BeforeClass
    public void setUp(){
        //Download and install driver
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        //OPen broser
        driver.get("https://v1.training-support.net");
    }

    @Test
    public void homepageTest() {
        String title = driver.getTitle();
        System.out.println("Home page title is " + title);
        //assert page title
        Assert.assertEquals("Training Support", title);
        driver.findElement(By.id("about-link")).click();
        //New page title
        System.out.println("New page title is " + driver.getTitle());
        Assert.assertEquals("About Training Support", driver.getTitle());
    }
    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
