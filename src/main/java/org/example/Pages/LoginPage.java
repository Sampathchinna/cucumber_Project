package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
        private  final WebDriver driver;

        public LoginPage(WebDriver driver) {
            this.driver = driver;
        }


        public void enterUsername(String username) {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement usernameElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']")));
            usernameElement.sendKeys(username);
        }

        public void enterPassword(String password) {
            driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
        }

        public void clickLoginButton() {
            driver.findElement(By.xpath("//button[@type='submit']")).click();
        }
        public void InavalidLogin(String username,String password){
            enterUsername(username);
            enterPassword(password);
        }

        public boolean Error() {
            return driver.findElement(By.xpath("//p[text()='Invalid credentials']")).isDisplayed();
        }

        public boolean Dashboardtext() {
            return driver.findElement(By.tagName("h6")).isDisplayed();
        }

    }


