package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity20 {
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
        System.out.println("Home page title: "+ driver.getTitle());
        //FInd the prompt alert button and click it
        driver.findElement(By.id("prompt")).click();
        //Switch to prompt window
        Alert promptAlert = driver.switchTo().alert();
        //Print alert text
        System.out.println("Text in alert: " + promptAlert.getText());
        //Type text in the prompt window
        promptAlert.sendKeys("Awesome!");
        // Close the alert by clicking OK
        promptAlert.accept();
        //CLose browser
        driver.quit();
    }
}
