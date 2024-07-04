package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity10 {
    public static void main(String[] args){
    //Driver setup and installation
    WebDriverManager.firefoxdriver().setup();
    //Driver instantiation
        WebDriver driver = new FirefoxDriver();
    //Explicit waits
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    //open URL
    driver.get("https://v1.training-support.net/selenium/dynamic-controls");
    System.out.println("Home page title is: "+ driver.getTitle());
    //Find the checkbox element
        WebElement checkBox = driver.findElement(By.className("willDisappear"));
        System.out.println(checkBox.isDisplayed());
    //Click on remove button
        driver.findElement(By.id("toggleCheckbox")).click();
    //Wait for the check box to disappear
    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("willDisappear")));
        System.out.println(checkBox.isDisplayed());
        //Close the browser
        driver.quit();
}
}
