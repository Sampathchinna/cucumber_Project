package org.example.Stepdefs;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.Map;

public class DataTableStepdefs {
    WebDriver driver;

    public DataTableStepdefs() {
        this.driver = Hooks.getDriverInstance();
    }

    @When("User logs in with")
    public void userLogsInWith(DataTable dataTable) throws InterruptedException {
        List<Map<String, String>> users = dataTable.asMaps(String.class, String.class);

        for (Map<String, String> user : users) {
            // Enter Username
            driver.findElement(By.name("username")).clear();
            driver.findElement(By.name("username")).sendKeys(user.get("username"));

            // Enter Password
            driver.findElement(By.name("password")).clear();
            driver.findElement(By.name("password")).sendKeys(user.get("password"));

            // Click Login
            driver.findElement(By.xpath("//button[@type='submit']")).click();

            Thread.sleep(2000); // just to see the result, ideally use explicit wait

            // Validation
            if (driver.getCurrentUrl().contains("dashboard")) {
                System.out.println("Login Success for: " + user.get("username"));
                driver.findElement(By.className("oxd-userdropdown-tab")).click();
                driver.findElement(By.linkText("Logout")).click();
                Thread.sleep(2000);
            } else {
                System.out.println("Login Failed for: " + user.get("username"));
            }
        }
    }


    @Then("Verify login results")
    public void verifyLoginResults() {
        System.out.println("Succesfully login");
    }
}
