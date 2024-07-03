package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4 {
    public static void main(String[] args){
        //Set up firefox driver
        WebDriverManager.firefoxdriver().setup();
        //Create new instance of firefox driver
        WebDriver driver = new FirefoxDriver();
        //OPen the page
        driver.get("https://v1.training-support.net/selenium/target-practice");
        //Print the page title
        System.out.println("HomePage title is: " + driver.getTitle() );
        //Find 3rd header and print the text
        String thirdHeaderText = driver.findElement(By.xpath("//div/h3[@id = 'third-header']")).getText();
        System.out.println(thirdHeaderText);
        //Find  5th header and print the color
        String fifthHeaderColor = driver.findElement(By.xpath("//div/h5[@class = 'ui green header']")).getCssValue("color");
        System.out.println(fifthHeaderColor);
        //Find  violet button and print the class
        String violetButtonClass = driver.findElement(By.xpath("//button[text() = 'Violet']")).getAttribute("class");
        System.out.println(violetButtonClass);
        //Find  Grey button and print the text
        String GreyButtonText = driver.findElement(By.xpath("//button[@class = 'ui grey button']")).getText();
        System.out.println(GreyButtonText);

        driver.quit();

    }
}
