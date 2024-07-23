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

public class Activity7_CRM {
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
        WebElement dashboard = driver.findElement(By.id("tab0"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("tab0")));
        System.out.println("Home page title after login is: "+ driver.getTitle());
        System.out.println(dashboard.getText());
        Assertions.assertEquals("SUITECRM DASHBOARD", dashboard.getText());
        //Navigate to Sales-> Leads
        //Actions object
        Actions builder = new Actions(driver);

        // Clicking on the Hidden SubMenu
        WebElement Sales = driver.findElement(By.id("grouptab_0"));
        builder.moveToElement(Sales).click().build().perform();
        driver.findElement(By.id("moduleTab_9_Leads")).click();
        //WebElement SalesHomepage = driver.findElement(By.xpath("//div[@class='moduleTitle']/h2"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='moduleTitle']/h2")));
        WebElement addInfo = driver.findElement(By.xpath("//table/tbody/tr[1]/td[10]/span/span"));
        //click on additional info icon
        addInfo.click();
        System.out.println("Additional info in the leads table is: "+ addInfo.getAttribute("title"));
        Assertions.assertEquals("Additional Details", addInfo.getAttribute("title"));
        //Close the browser
        driver.quit();

    }
}
