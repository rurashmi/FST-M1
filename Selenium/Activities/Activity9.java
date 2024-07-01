import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

//package activities;

public class Activity9 {
    public static void main (String[] args) {
        // Set up Firefox driver
        WebDriverManager.firefoxdriver().setup();
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));


        // Open the page
        driver.get("https://v1.training-support.net/selenium/ajax");
        // Print the title of the page
        System.out.println("Home page title is: " + driver.getTitle());

        // Find the change content button
        driver.findElement(By.xpath("//button[@onCLick = 'loadText()']")).click();


        // Print the confirmation message
        String message = driver.findElement(By.xpath("//div[id ='action-confirmation']")).getText();
        System.out.println("Login message: " + message);

        // Close the browser
        driver.close();
    }

}
