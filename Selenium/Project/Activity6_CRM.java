package project;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Activity6_CRM {
    public static void main(String[] args) throws InterruptedException{
        //Webdriver manager installation and set up
        WebDriverManager.firefoxdriver().setup();
        //Webdriver instantiation
        WebDriver driver = new FirefoxDriver();
        //Explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        //Open URL
        driver.get("http://alchemy.hguy.co/crm");
        //FInd the web elements
        WebElement username = driver.findElement(By.id("user_name"));
        WebElement password = driver.findElement(By.id("username_password"));
        //Provide credentials
        username.sendKeys("admin");
        password.sendKeys("pa$$w0rd");
        //CLick on login button
        driver.findElement(By.id("bigbutton")).click();
        //Wait for home page
        Thread.sleep(10);
        WebElement Activity = driver.findElement(By.id("grouptab_3"));
        System.out.println("Name of the tab is: "+ Activity.getText());
        //Actions object
        Actions builder = new Actions(driver);
        builder.clickAndHold().build().perform();
        Select singleSelect = new Select(Activity);
        singleSelect.selectByIndex(6);
        System.out.println("Seventh option =" +singleSelect.getFirstSelectedOption().getText());

        //Close the browser
        driver.quit();

    }
}
