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

public class Approval_Flows {
    @Test
    public void Approve() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://test.web.cashbook.in/login");
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("phoneNumber"))).sendKeys("1231231235");
        Thread.sleep(6000);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[type='text']"))).sendKeys("123456");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Verify']"))).click();
        Thread.sleep(5000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[class='_1dl11776e _1dl11779e _1dl1177ce _1dl1177fe _1dl1177135 _1dl117713a _1dl117713f _1dl117713k _1dl117712o _1dl117712s _1dl117712w _1dl1177130 _1dl1177u8 _1dl1177vq _1dl1177v8 _1dl1177v9 _1dl1177va _1dl1177zk _1dl117719k']"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[name='q']"))).sendKeys("Rahul Mehta");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[value='lj6wYpwHdtxTL1acFmln']"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='Approvals']"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='_1dl11776e _1dl11779e _1dl1177ce _1dl1177fe _1dl11772e']"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Confirm']"))).click();
        Thread.sleep(2000);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='_1dl11776e _1dl11779e _1dl1177ce _1dl1177fe _1dl11772i']"))).click();
        Thread.sleep(2000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='search']"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Potentially Fraudulent Activity']"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("remark"))).sendKeys("test");
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[type='submit']"))).click();
        Thread.sleep(3000);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='_1dl11776e _1dl11779e _1dl1177ce _1dl1177fe _1dl11772g']"))).click();
        Thread.sleep(2000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='search']"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Potentially Fraudulent Activity']"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("remark"))).sendKeys("test");
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[type='submit']"))).click();
        Thread.sleep(3000);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='_1dl11776e _1dl11779e _1dl1177ce _1dl1177fe _1dl11772e']"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='Partially approve this transaction']"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("amount"))).sendKeys("0.5");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='search']"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Potentially Fraudulent Activity']"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("remark"))).sendKeys("test");
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[type='submit']"))).click();
        Thread.sleep(3000);
        driver.quit();
    }

}
