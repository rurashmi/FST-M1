package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Activity18 {
    public static void main(String[] args){
        //Webdriver installation and set up
        WebDriverManager.firefoxdriver().setup();
        //Driver Instantiation
        WebDriver driver= new FirefoxDriver();
        //Explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        //OPen URL
        driver.get("https://v1.training-support.net/selenium/selects");
        //Home page title
        System.out.println("Home page title is: " + driver.getTitle());
        //Multiselect list
        WebElement selectElement = driver.findElement(By.id("multi-select"));
        //Pass the Web element to select object
        Select MultiSelect = new Select(selectElement);
        // Select "Javascript" using visible text
        MultiSelect.selectByVisibleText("Javascript");
        // Select 4th, 5th, and 6th index options
        MultiSelect.selectByIndex(4);
        MultiSelect.selectByIndex(5);
        MultiSelect.selectByIndex(6);
        // Select "NodeJS" using value attribute
        MultiSelect.selectByValue("node");
        // Print the selected options
        List<WebElement> selectedItems = MultiSelect.getAllSelectedOptions();
        System.out.println("Selected options are: ");
        for (WebElement option: selectedItems){
            System.out.println(option.getText());
        }
        // Deselect the 5th index option
        MultiSelect.deselectByIndex(5);
        selectedItems = MultiSelect.getAllSelectedOptions();
        System.out.println("Selected options are: ");
        for (WebElement option: selectedItems){
            System.out.println(option.getText());
        }
        //Close the browser
        driver.quit();





    }
}
