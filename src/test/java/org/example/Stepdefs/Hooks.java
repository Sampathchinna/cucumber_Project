package org.example.Stepdefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.example.Pages.Jobtitle;
import org.example.Pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {

    // Declare the WebDriver instance
    private static WebDriver driver;

    // @Before hook to initialize WebDriver and page objects
    @Before
    public void setUp() {
       // System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");

        if (driver == null) {
            // Initialize the WebDriver (ChromeDriver in this case)
            driver = new ChromeDriver();
        }

        // Optional: Maximize the browser window for better visibility during tests
        driver.manage().window().maximize();

        // Optional: Wait for elements to be visible on the page
        driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
    }

    public static WebDriver getDriverInstance() {
        return driver;
    }

    // @After hook to quit the WebDriver after the test has run
    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();  // Close the browser after the test
            driver = null;  // Ensure the driver is set to null after quitting
        }
    }
}
