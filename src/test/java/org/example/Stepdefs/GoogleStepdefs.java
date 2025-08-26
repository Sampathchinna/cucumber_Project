package org.example.Stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertTrue;

public class GoogleStepdefs {
    WebDriver driver;

    public  GoogleStepdefs(){
        this.driver=Hooks.getDriverInstance();
    }



    @Given("User is on Google Home Page")
    public void userIsOnGoogleHomePage() {
        driver.get("https://www.google.com");
    }

    @When("User searches for {string}")
    public void userSearchesFor(String query) {
        driver.findElement(By.name("q")).sendKeys(query);
        driver.findElement(By.name("q")).submit();
    }

    @Then("Results should contain {string}")
    public void resultsShouldContain(String keyword) {
        assertTrue(driver.getPageSource().contains(keyword));
    }
}
