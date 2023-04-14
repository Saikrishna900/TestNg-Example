package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DemoQA {
    ChromeDriver driver;

    @BeforeClass
    void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("https://demoqa.com/automation-practice-form");

        driver.manage().window().maximize();
    }
    @Test
    void Form() throws InterruptedException {

        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("window.scrollBy(0,360)","" );

        driver.findElement(By.xpath("//label[@for='hobbies-checkbox-1']")).click();
        driver.findElement(By.xpath("//label[@for='hobbies-checkbox-2']")).click();
        driver.findElement(By.xpath("//label[@for='hobbies-checkbox-3']")).click();
    }
}
