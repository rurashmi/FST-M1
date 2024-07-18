package project;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity4_CRM {
    public static void main(String[] args) throws InterruptedException{
        //Webdriver manager installation and set up
        WebDriverManager.firefoxdriver().setup();
        //Webdriver instantiation
        WebDriver driver = new FirefoxDriver();
        //Explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        //Open URL
        driver.get("http://alchemy.hguy.co/crm");
        //FInd the web elements
       WebElement username = driver.findElement(By.id("user_name"));
       WebElement password = driver.findElement(By.id("username_password"));
       //Provide credentials
        username.sendKeys("admin");
        password.sendKeys("pa$$w0rd");
        //CLick on login button
        driver.findElement(By.id("bigbutton")).click();
        //Wait for home page
        WebElement dashboard = driver.findElement(By.id("tab0"));
        Thread.sleep(10);
        //wait.until(ExpectedConditions.visibilityOfElementLocated(dashboard));
        String dashboardtext = dashboard.getText();
        System.out.println(dashboardtext);
        Assertions.assertEquals(dashboardtext, "SUITECRM DASHBOARD");
        System.out.println("Home page title is: "+ driver.getTitle());

        //Close the browser
        driver.quit();

    }
}

