package project;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity3_CRM {
    public static void main(String[] args) {
        //Webdriver manager installation and set up
        WebDriverManager.firefoxdriver().setup();
        //Webdriver instantiation
        WebDriver driver = new FirefoxDriver();
        //Explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        //Open URL
        driver.get("http://alchemy.hguy.co/crm");
        //FInd the webelement text
        WebElement copyRightFooter = driver.findElement(By.id("admin_options"));
        String text = copyRightFooter.getText();
        System.out.println("Copyright text is: "+ text);
        //CLose the browser
        driver.quit();

    }
}
