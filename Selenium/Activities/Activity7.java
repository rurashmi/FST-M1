import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

//package examples;

public class Activity7 {
    public static void main (String[]args){
        WebDriverManager.firefoxdriver().setup();

        //New instance
        WebDriver driver = new FirefoxDriver();

        //Actions object
        Actions builder = new Actions(driver);
        //OPen the browser
        driver.get("https://v1.training-support.net/selenium/drag-drop");

        //get title

        String pageTitle = driver.getTitle();
        System.out.println("The page title is "+ pageTitle);
        //find elements
        WebElement football = driver.findElement(By.id("draggable"));
        WebElement box1 = driver.findElement(By.id("droppable"));
        WebElement box2 = driver.findElement(By.id("dropzone2"));

        // drag and drop to box1
        builder.clickAndHold(football).moveToElement(box1).pause(2000).release().build().perform();
        //Verify
        String dropzone1Verify = box1.getText();
        System.out.println(dropzone1Verify);
        if (dropzone1Verify.contains("Dropped!")){
            System.out.println("The ball was dropped in box1");
        }
        else{
            System.out.println("The ball was not dragged to the box");
        }
        //drag and drop to box2
        builder.clickAndHold(football).moveToElement(box2).pause(2000).release().build().perform();
        String dropzone2Verify = box2.getText();
        if (dropzone2Verify.contains("Dropped!")){
            System.out.println("The ball was dropped in box2");
        }

        //close browser
        driver.quit();

    }
}
