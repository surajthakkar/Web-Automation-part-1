package com.package1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Zohobooks {
    @Test
    public void Zoho() throws Exception {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://test.web.cashbook.in/login");
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("phoneNumber"))).sendKeys("1000111195");
        Thread.sleep(4000);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[type='text']"))).sendKeys("123456");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Verify']"))).click();
        Thread.sleep(5000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[class='_1dl11776e _1dl11779e _1dl1177ce _1dl1177fe _1dl1177135 _1dl117713a _1dl117713f _1dl117713k _1dl117712o _1dl117712s _1dl117712w _1dl1177130 _1dl1177u8 _1dl1177vq _1dl1177v8 _1dl1177v9 _1dl1177va _1dl1177zk _1dl117719k']"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[name='q']"))).sendKeys("Rahul Mehta");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[value='lj6wYpwHdtxTL1acFmln']"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='Zoho Books']"))).click();
        Thread.sleep(2000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[placeholder='Select ZohoBooks Accounts']"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[value='2032456000000170021']"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("svg[class='_7mcysm6o _176hfm410 _176hfm44u _1dl1177uk']"))).click();
        Thread.sleep(3000);
        driver.quit();
    }
}
