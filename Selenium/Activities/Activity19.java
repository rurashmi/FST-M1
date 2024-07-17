package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity19 {
    public static void main(String[] args){
        //Webdriver installation and set up
        WebDriverManager.firefoxdriver().setup();
        //Driver instantiation
        WebDriver driver = new FirefoxDriver();
        //Explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        //Open URL
        driver.get("https://v1.training-support.net/selenium/javascript-alerts");
        //Home page title
        System.out.println("Home page title is: "+ driver.getTitle());
        // Find and click the button to open the alert
        driver.findElement(By.id("confirm")).click();
        //Switch focus to alert window
        Alert confirmAlert = driver.switchTo().alert();
        // Print the text in the alert
        System.out.println("Text in alert: "+ confirmAlert.getText());
        // Close the alert by clicking OK
        confirmAlert.accept();
        // Close the browser
        driver.quit();
    }
}
