package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity15 {
    public static void main(String[] args){
        //Install and set up webdriver
        WebDriverManager.firefoxdriver().setup();
        //Driver instantiation
        WebDriver driver = new FirefoxDriver();
        //Explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        //OPen URL
        driver.get("https://v1.training-support.net/selenium/dynamic-attributes");
        System.out.println("Home page title is: " + driver.getTitle());
        WebElement username = driver.findElement(By.xpath("//div/input[starts-with(@class, 'username-')]"));
        WebElement password = driver.findElement(By.xpath("//div/input[starts-with(@class, 'password-')]"));
        //Enter the credentials
        username.sendKeys("admin");
        password.sendKeys("password");
        //Click submit button
        driver.findElement(By.xpath("//button[@type = 'submit']")).click();
        //Print the login message
        System.out.println("Login message: " + driver.findElement(By.id("action-confirmation")).getText());
        //Close browser
        driver.quit();

    }

}
