package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity5 {
    public static void main(String[] args){
        //Set up firefox
        WebDriverManager.firefoxdriver().setup();
        //Create an instance of firefox
        WebDriver driver = new FirefoxDriver();
        //Create the actions object
        Actions builder = new Actions(driver);
        //OPen the browser
        driver.get("https://v1.training-support.net/selenium/input-events");
        System.out.println("Page title is: " + driver.getTitle());
        //Perform the left click
        builder.click().pause(1000).build().perform();
        //Print the front side text
        String frontText = driver.findElement(By.className("active")).getText();
        System.out.println(frontText);

        //Perform the double click
        builder.doubleClick().pause(1000).build().perform();
        //Print the front side text
        frontText = driver.findElement(By.className("active")).getText();
        System.out.println(frontText);

        //Perform the right click
        builder.contextClick().pause(1000).build().perform();
        //Print the front side text
        frontText = driver.findElement(By.className("active")).getText();
        System.out.println(frontText);
        // Close the browser
        driver.quit();


    }
}
