package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity16 {
    public static void main(String[] args){
        //Driver installation and set up
        WebDriverManager.firefoxdriver().setup();
        //Driver instantiation
        WebDriver driver = new FirefoxDriver();
        //Explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        //Open URL
        driver.get("https://v1.training-support.net/selenium/dynamic-attributes");
        System.out.println("Home page title is: " + driver.getTitle());
        //Find attributes
        WebElement username = driver.findElement(By.xpath("//div/input[contains(@class, '-username')]"));
        WebElement password = driver.findElement(By.xpath("//div/input[contains(@class, '-password')]"));
        WebElement Cnfpassword = driver.findElement(By.xpath("//label[text() = 'Confirm Password']/following-sibling::input"));
        WebElement email = driver.findElement(By.xpath("//label[text() = 'Email']/following-sibling::input"));
        //user input
        username.sendKeys("user1");
        password.sendKeys("password1");
        Cnfpassword.sendKeys("password1");
        email.sendKeys("dummyemail@gmail.com");
        //Click on submit
        driver.findElement(By.xpath("//button[contains(text(), 'Sign Up')]")).click();
        // Print login message
        String loginMessage = driver.findElement(By.id("action-confirmation")).getText();
        System.out.println("Login message: " + loginMessage);

        // Close the browser
        driver.quit();

    }
}
