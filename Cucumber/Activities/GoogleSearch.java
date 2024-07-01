package StepDefinition;

import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSearch extends BaseClass {


    @Given("User is on the Google Home Page")
    public void openBrowser() {
        driver.get("https://www.google.com");
        String title = driver.getTitle();
        System.out.println("Home page title is " + title);
        //assert page title
        Assertions.assertEquals("Google", title);
    }

    @When("User types in Amazon and hits enter")
    public void searchItem() {
        driver.findElement(By.name("q")).sendKeys("Amazon", Keys.RETURN);
    }

    @Then("Show the search results")
    public void searchResult() {
        //wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("result-stats")));
        String resultStats = driver.findElement(By.id("result-stats")).getText();
        System.out.println("Number of results found: " + resultStats);
    }
}


