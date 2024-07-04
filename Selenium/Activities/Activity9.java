import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
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
        driver.findElement(By.xpath("//button[@onclick = 'loadText()']")).click();


        // Print the confirmation message
        String message = driver.findElement(By.xpath("//div[@id ='ajax-content']/h1")).getText();
        System.out.println("Login message: " + message);



        WebElement delayedText = driver.findElement(By.tagName("h3"));
        System.out.println(delayedText.getText());
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.tagName("h3"), "I'm late!"));
        String lateMessage = driver.findElement(By.xpath("//div[@id ='ajax-content']/h3")).getText();
        System.out.println("Late message: " + lateMessage);
        // Close the browser
        driver.close();
    }

}
