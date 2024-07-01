package StepDefinition;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstExample extends BaseClass {
    @BeforeAll
    public static void setUp() {
        //Driver set up
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
    }

    @Given("User is on the home page")
    public void openBrowser() {
        driver.get("https://v1.training-support.net");
        String title = driver.getTitle();
        System.out.println("Home page title is " + title);
        //assert page title
        Assertions.assertEquals("Training Support", title);
    }

    @When("The user clicks on the About us button")
    public void clickButton() {
        driver.findElement(By.id("about-link")).click();
    }

    @Then("The user is redirected to the About Page")
    public void newPage() {
        //New page title

        System.out.println("New page title is " + driver.getTitle());
        Assertions.assertEquals("About Training Support", driver.getTitle());
    }

    @Then("Close the browser")
    public void tearDown() {
        driver.quit();
    }

    @AfterAll
    public static void closeBrowser() {
        driver.quit();
    }


}
