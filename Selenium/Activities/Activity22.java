package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity22 {
    public static void main(String[] args){
        //Webdriver installation and set up
        WebDriverManager.firefoxdriver().setup();
        //Driver instantiation
        WebDriver driver = new FirefoxDriver();
        //Explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        //Create the actions object
        Actions builder = new Actions(driver);
        //Open URL
        driver.get("https://v1.training-support.net/selenium/popups");
        //Home page title
        System.out.println("Home page title: "+ driver.getTitle());
        //Click on Sign in button for pop-up
        WebElement signin = driver.findElement(By.xpath("//button[contains(@class, 'orange button')]"));
        //Hover over the button
        builder.moveToElement(signin).build().perform();
        //Print the tooltip message
        String tooltipMessage = signin.getAttribute("data-tooltip");
        System.out.println(tooltipMessage);
        //Click on the button and wait for pop up
        signin.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
        //Find the input fields
        WebElement username = driver.findElement(By.id("username"));
        WebElement password = driver.findElement(By.id("password"));
        //Enter credentials
        username.sendKeys("admin");
        password.sendKeys("password");
        //Click on login button
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
        //Print the login message
        String loginMessage = driver.findElement(By.id("action-confirmation")).getText();
        System.out.println(loginMessage);
        //close the browser
        driver.quit();
    }
}
