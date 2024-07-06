package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity12 {
    public static void main(String[] args){
        //Webdriver set installation and set up
        WebDriverManager.firefoxdriver().setup();
        //Webdriver instantiation
        WebDriver driver = new FirefoxDriver();
        //WExplicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        //OPen URL
        driver.get("https://v1.training-support.net/selenium/dynamic-controls");
        System.out.println("Home page title is: " + driver.getTitle());
        //Find web element for text input
        WebElement textField = driver.findElement(By.id("input-text"));
        System.out.println("Text field enabled? " + textField.isEnabled());
        //Press button to enable the text field
        driver.findElement(By.id("toggleInput")).click();
        System.out.println("Text field enabled? " + textField.isEnabled());
        driver.quit();
    }
}
