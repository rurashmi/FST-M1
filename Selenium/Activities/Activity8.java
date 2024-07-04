package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity8 {
    public static void main(String[] args){
        //Driver set up
        WebDriverManager.firefoxdriver().setup();
        //Instantiate driver
        WebDriver driver = new FirefoxDriver();
        //Explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //Open the URL
        driver.get("https://v1.training-support.net/selenium/dynamic-controls");
        System.out.println("Home page title is: " + driver.getTitle());

        //Find the toggle button and click it
        WebElement toggleButton = driver.findElement(By.id("toggleCheckbox"));
        toggleButton.click();
        //Wait for checkbox to disappear
        WebElement dynamicCheckbox = driver.findElement(By.id("dynamicCheckbox"));
        wait.until(ExpectedConditions.invisibilityOf(dynamicCheckbox));
        System.out.println(dynamicCheckbox.isDisplayed());
        //Click the button again
        toggleButton.click();
        //Wait for element to reappear
        wait.until(ExpectedConditions.visibilityOf(dynamicCheckbox));
        System.out.println(dynamicCheckbox.isDisplayed());
        //Close the browser
        driver.quit();

    }
}
