package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity11 {
    public static void main(String[] args){
        //Driver set up and Installation
        WebDriverManager.firefoxdriver().setup();
        //Driver instantiation
        WebDriver driver = new FirefoxDriver();
        //Explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //OPen URL
        driver.get("https://v1.training-support.net/selenium/dynamic-controls");
        //Home page title
        System.out.println("Home page title is: " + driver.getTitle());
        //Find the Checkbox element
        WebElement CheckBox = driver.findElement(By.name("toggled"));
        System.out.println("Check box is selected? "+ CheckBox.isSelected());
       CheckBox.click();
        //Wait
        //wait.until(ExpectedConditions.elementToBeSelected(By.className("willDisappear")));
        System.out.println("Checkbox selected? " + CheckBox.isSelected());
        //Close
        driver.quit();
    }
}
