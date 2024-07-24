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

public class Activity3_CRM {
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        //Open the browser
        driver.get("https://alchemy.hguy.co/crm/");
    }

    @Test
    public void copyrightCheck() {
        WebElement footer = driver.findElement(By.id("admin_options"));
        String text = footer.getText();
        System.out.println("Footer text is: " + text);
        Assert.assertEquals("© Supercharged by SuiteCRM", text);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}

