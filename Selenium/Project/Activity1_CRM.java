package project;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;

public class Activity1_CRM {
    public static void main(String[] args){
        //Webdriver manager installation and set up
        WebDriverManager.firefoxdriver().setup();
        //Webdriver instantiation
        WebDriver driver = new FirefoxDriver();
        //Explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        //Open URL
        driver.get("http://alchemy.hguy.co/crm");
        //Home page title
        String title = driver.getTitle();
        System.out.println(title);
        Assertions.assertEquals(title, "SuiteCRM");

        //CLose the browser
        driver.quit();
    }
}
