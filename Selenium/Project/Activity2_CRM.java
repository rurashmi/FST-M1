package project;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity2_CRM {
    public static void main(String[] args){
        //Webdriver manager installation and set up
        WebDriverManager.firefoxdriver().setup();
        //Webdriver instantiation
        WebDriver driver = new FirefoxDriver();
        //Explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        //Open URL
        driver.get("http://alchemy.hguy.co/crm");
        //LOgo URL
        WebElement logo = driver.findElement(By.xpath("//div[contains(@class,'companylogo')]/img"));
        String logoURL = logo.getAttribute("src");
        System.out.println("Logo URL is: "+ logoURL);
        Assertions.assertTrue(logoURL.contains("https://alchemy.hguy.co/crm/themes/default/images/company_logo.png?"));

        //Close the browser
        driver.quit();
    }
}
