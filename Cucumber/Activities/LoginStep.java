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
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginStep extends BaseClass {

    @Given("User is on the login page")
    public void openBrowser() {
        driver.get("https://v1.training-support.net/selenium/login-form");
        String title = driver.getTitle();
        System.out.println("Home page title is " + title);
        //assert page title
        Assertions.assertEquals("Login Form", title);
    }

    @When("The user enters {string} and {string}")
    public void enterCredentials(String username, String password) {
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    @Then("Read the page title and confirmation message")
    public void verifyLogin() {
        //New page title
        String LoginMessage = driver.findElement(By.id("action-confirmation")).getText();
        System.out.println("confirmation message is " + LoginMessage);
        Assertions.assertEquals("Welcome Back, admin", LoginMessage);
    }


}
