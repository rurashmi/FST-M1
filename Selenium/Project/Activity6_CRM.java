package project;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
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
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("grouptab_3")));
        WebElement Activity = driver.findElement(By.id("grouptab_3"));
        WebElement ActivityList =driver.findElement(By.id("moduleTab_9_Meetings"));

        System.out.println("Name of the tab is: "+ Activity.getText());

        //Actions object
        Actions builder = new Actions(driver);

        // Clicking on the Hidden SubMenu
        builder.moveToElement(Activity).click().build().perform();
        driver.findElement(By.id("moduleTab_9_Meetings")).click();
        //Sleep
        Thread.sleep(10);
        WebElement Meetings = driver.findElement(By.xpath("//div[@class='moduleTitle']/h2"));

        System.out.println("Activity meeting menu list is: "+ Meetings.getText());
        Assertions.assertEquals("Meetings", Meetings.getText());


        //Close the browser
        driver.quit();

    }
}
