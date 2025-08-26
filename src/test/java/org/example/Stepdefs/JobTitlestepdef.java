package org.example.Stepdefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.Jobtitle;
import org.example.Pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JobTitlestepdef {
    WebDriver driver;
    Jobtitle jobtitle;
    LoginPage loginPage;

          //add a public zero-argument constructor

    public JobTitlestepdef(){
        this.driver=Hooks.getDriverInstance();
//        this.loginPage = new LoginPage(driver);
        this.jobtitle = new Jobtitle(driver);
    }


    // Step: When Click on Admin Button
    @When("Click on Admin Button")
    public void clickOnAdminButton() {
        jobtitle.clickAdminButton();    // Call the method to click the admin button
    }

    @Then("Click on Job")
    public void clickOnJob() {
        jobtitle.jobclick();
    }

    @Then("Click on the Job Titles")
    public void clickOnTheJobTitles() {
         jobtitle.Clickjobtitlesbutton();
    }

    @And("Click on Add Button")
    public void clickOnAddButton() {
       jobtitle.Clickonaddbutton();
    }


    @And("I enter the Job Titles {string} and {string} and {string}")
    public void iEnterTheJobTitlesAndAnd(String arg0, String arg1, String arg2) {

    }
}


    // @After hook to clean up the WebDriver after test execution








