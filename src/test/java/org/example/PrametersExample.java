package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PrametersExample {
   WebDriver driver;

    @BeforeClass
    @Parameters({"browser","url"})

    void setUpDriver(String browser,String link){
        if(browser.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        driver.get(link);
        driver.manage().window().maximize();
    }
    @Test
    void getTitleFromPage() throws InterruptedException{
        driver.findElement(By.name("q")).sendKeys("phone");
        Thread.sleep(1000);

        driver.findElement(By.name("btnK")).click();
        Thread.sleep(1000);
        Assert.assertEquals(driver.getTitle(), "phone - Google Search");

    }
    //data providers are used for data given testing which means same test case be run with diffterent set of data>IT is very powerful of TestNg.and effectively used during framework development
    //annotated methods returns an array of object[][] like 2d Array
    //parameters is not possible
    @AfterClass
    void closeDriver(){
        driver.close();
    }
}
