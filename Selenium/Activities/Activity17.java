import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

//package examples;

public class Activity17 {
    public static void main (String[]args){
        WebDriverManager.firefoxdriver().setup();

        //New instance
        WebDriver driver = new FirefoxDriver();

        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //Open the browser
        driver.get("https://v1.training-support.net/selenium/selects");

        //get title

        String pageTitle = driver.getTitle();
        System.out.println("The page title is "+ pageTitle);
        //find elements
        WebElement dropdown = driver.findElement(By.id("single-select"));
        Select singleSelect = new Select(dropdown);
        // Select the second option using the visible text
        singleSelect.selectByVisibleText("Option 2");
        System.out.println("Second option =" +singleSelect.getFirstSelectedOption().getText());
        //Select the third option using index
        singleSelect.selectByIndex(3);
        System.out.println("Third option =" +singleSelect.getFirstSelectedOption().getText());
        //Select the fourth option using value
        singleSelect.selectByValue("4");
        System.out.println("Fourth option =" +singleSelect.getFirstSelectedOption().getText());

        //close browser
        driver.quit();

    }
}
