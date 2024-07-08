package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Activity14 {
    public static void main(String[] args){
        //Webdriver installation and set up
        WebDriverManager.firefoxdriver().setup();
        // Driver instantiation
        WebDriver driver = new FirefoxDriver();
        // Explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //Open URL
        driver.get("https://v1.training-support.net/selenium/tables");
        //Get title
        System.out.println("Home page title is: " + driver.getTitle());
        //Find rows and columns of the 2nd table
        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='sortableTable']/tbody/tr/td[1]"));
        List<WebElement> cols = driver.findElements(By.xpath("//table[@id='sortableTable']/thead/tr/th"));
        System.out.println("Number of rows in the sortable table is: "+ rows.size());
        System.out.println("Number of columns in the sortable table is: "+ cols.size());
        WebElement cellValue = driver.findElement(By.xpath("//table[@id='sortableTable']/tbody/tr[2]/td[2]"));
        System.out.println(cellValue.getText());
        //Sort the table
        driver.findElement(By.xpath("//table[@id='sortableTable']/thead/tr/th")).click();
        //Print cellValue again
        System.out.println(cellValue);
        // Print the cell values of the footer
        List<WebElement> footer = driver.findElements(By.xpath("//table[@id='sortableTable']/tfoot/tr/th"));
        System.out.println("Cell values of the footer is");
        for (WebElement cell:footer){
            System.out.println(cell.getText());
        }
        //Close the browser
        driver.quit();
    }
}
