package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity6 {

    public static void main(String[] args){
        //Webdriver setup
        WebDriverManager.firefoxdriver().setup();
        //Driver instantiation
        WebDriver driver = new FirefoxDriver();
        //Actions object
        Actions builder = new Actions(driver);
        //Open the browser
        driver.get("https://v1.training-support.net/selenium/input-events");
        System.out.println("Page title is: "+ driver.getTitle());
        //Press the key
        builder.sendKeys("R").build().perform();
        //Press Ctrl+A and Ctrl+C
        builder.keyDown(Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.COMMAND).build().perform();
        // Close the browser
        driver.quit();
    }

}
