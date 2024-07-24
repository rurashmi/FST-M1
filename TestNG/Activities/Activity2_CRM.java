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

public class Activity2_CRM {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        //Open the browser
        driver.get("https://alchemy.hguy.co/crm/");
    }

    @Test
    public void LogoCheck() {
        WebElement CRMLogo = driver.findElement(By.xpath("//img[@alt='SuiteCRM']"));
        String url = CRMLogo.getAttribute("src");
        System.out.println("Logo URL is: " +url);
        Assert.assertEquals("https://alchemy.hguy.co/crm/themes/default/images/company_logo.png?v=cK7kLsY0ftg72ZVHTYUT_g", url);
    }
    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
