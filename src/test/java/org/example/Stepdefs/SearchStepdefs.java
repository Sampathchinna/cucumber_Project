package org.example.Stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchStepdefs {
    WebDriver driver;

    public SearchStepdefs(){
        this.driver=Hooks.getDriverInstance();
    }
    @Given("User is on OpenCart Search Page")
    public void userIsOnOpenCartSearchPage() {
        driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=674893540034&hvpos=&hvnetw=g&hvrand=10410450038992701211&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9181929&hvtargid=kwd-64107830&hydadcr=14452_2316413&gad_source=1");
    }
    @When("User searches for")
    public void user_searches_for(List<String> items) throws InterruptedException {
        for (String item : items) {
            WebElement searchBox = driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']"));
            WebElement searchBtn = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));

            // Highlight search box
            highlightElement(searchBox);
            highlightElement(searchBtn);

            searchBox.clear();
            searchBox.sendKeys(item);
            searchBtn.click();

            System.out.println("Searched: " + item);

            Thread.sleep(2000);
        }
    }

    @Then("Products should be displayed")
    public void products_should_be_displayed() {
        boolean resultsVisible = driver.findElements(By.xpath("//div[@data-component-type='s-search-result']")).size() > 0;
        if (resultsVisible) {
            System.out.println("Products displayed successfully");
        } else {
            System.out.println("No products found");
        }
    }

    // Highlight method
    public void highlightElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].style.border='3px solid red'", element);
    }
}

