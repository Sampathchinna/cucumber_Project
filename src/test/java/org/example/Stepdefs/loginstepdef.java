package org.example.Stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.Jobtitle;
import org.example.Pages.LoginPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class loginstepdef {
     //private final LoginPage loginPage;
     LoginPage loginPage;
     WebDriver driver;

     public loginstepdef(){
         this.driver = Hooks.getDriverInstance();
         this.loginPage=new LoginPage(driver);
     }

    @Given("user on the login page")
    public void i_am_on_the_login_page() {
       driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

    }
    @Given("user enter {string} and {string}")
    public void userEnterAnd(String username, String password) {
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.clickLoginButton();
    }




    @When("user click the login button")
    public void i_click_the_login_button() {
        loginPage.clickLoginButton();
    }

    @Then("user should be logged in")
    public void i_should_be_logged_in() {
        Assert.assertTrue(loginPage.Dashboardtext());
        // Verify login success
    }




    @When("I enter invalid credentials")
    public void iEnterInvalidCredentials() {
        loginPage.enterUsername("userrrr");
        loginPage.enterPassword("digit2333");
        loginPage.clickLoginButton();


    }
    @Then("I should see an error message")
    public void i_should_see_an_error_message() {
        Assert.assertEquals(loginPage.Error(),true);
        // Verify error message
    }


}