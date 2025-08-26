package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Jobtitle {
    private WebDriver driver;
//    private By Addjobtitle = By.xpath("//label[text()='Job Title']/parent::div");
//    private By Jobdescription = By.xpath("//textarea[@placeholder='Type description here']");
//    private By Jobnote   = By.xpath("//textarea[@placeholder='Add note']");
    public Jobtitle(WebDriver driver) {
        this.driver = driver;
    }


    public void clickAdminButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement adminButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Admin']")));
        System.out.println("Admin button is visible");

        WebElement adminButtons = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Admin']")));
        adminButton.click();
    }

    public void jobclick() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement Jobclick = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Job ']")));
        Jobclick.click();
    }


    public void Clickjobtitlesbutton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement clickbutton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Job Titles']")));
        clickbutton.click();
    }


    public void Clickonaddbutton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement clickadd = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")));
        clickadd.click();
    }
    //public void Addjobdetails(String jobtitle)(String jobdescrpition)(String jobnote){


    }






