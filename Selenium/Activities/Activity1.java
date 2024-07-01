package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {
    public static void main(String[]args){
        // Set up Firefox driver
        WebDriverManager.firefoxdriver().setup();
        // create a new instance of firefox driver
        WebDriver driver = new FirefoxDriver();

        // open the page
        driver.get("https://v1.training-support.net/");
        //print the title page
        System.out.println("Page title is " + driver.getTitle());
        //FInd the button element
        WebElement element = driver.findElement(By.id("about-link"));
        element.click();
        //navigate to the new page
        System.out.println("About Page title is " + driver.getTitle());


        driver.quit();
    }
}
