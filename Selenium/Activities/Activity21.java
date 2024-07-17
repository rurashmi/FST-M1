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

public class Activity21 {
    public static void main(String[] args){
        //Webdriver installation and set up
        WebDriverManager.firefoxdriver().setup();
        //Driver instantiation
        WebDriver driver= new FirefoxDriver();
        //Explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        //Open URL
        driver.get("https://v1.training-support.net/selenium/tab-opener");
        //Home page title
        System.out.println("Home page title is: "+ driver.getTitle());
        //Print handle of parent tab
        System.out.println("Current tab: "+ driver.getWindowHandle());
        //Find the button to open a new tab and click it
        WebElement NewTab = driver.findElement(By.id("launcher"));
        NewTab.click();
        //Wait for new tab to be opened
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        //Print handle of all tabs
        System.out.println("Currently open tabs: "+ driver.getWindowHandles());
        //Switch window focus
        for(String handle: driver.getWindowHandles()){
            driver.switchTo().window(handle);
        }
        //Wait for new page to load
        wait.until(ExpectedConditions.elementToBeClickable(By.id("actionButton")));
        //Print handle of current tab
        System.out.println("Current page "+ driver.getWindowHandle());
        // Print the title and heading of the new page
        System.out.println("Page title: " + driver.getTitle());
        String pageHeading = driver.findElement(By.className("content")).getText();
        System.out.println("Page heading: "+ pageHeading);

        //FInd and click on button in new page
        driver.findElement(By.id("actionButton")).click();

        //Wait for 3rd tab to open
        wait.until(ExpectedConditions.numberOfWindowsToBe(3));
        //Switch focus
        for(String handle:driver.getWindowHandles()){
            driver.switchTo().window(handle);
        }
        // Wait for the new page to load
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("content")));

        //Print handle of 3rd tab
        System.out.println("Current page 2"+ driver.getWindowHandle());
        // Print the title and heading of the new page
        System.out.println("Page title: " + driver.getTitle());
        String pageHeading2 = driver.findElement(By.className("content")).getText();
        System.out.println("Page heading: "+ pageHeading2);
        //close browser
        driver.quit();

    }
}
