package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity1_CRM {
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        //Open the browser
        driver.get("https://alchemy.hguy.co/crm/");
    }

    @Test
    public void TitleCheck() {
        String title = driver.getTitle();
        System.out.println("Home page title is " + title);
        //assert page title
        Assert.assertEquals("SuiteCRM", title);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
