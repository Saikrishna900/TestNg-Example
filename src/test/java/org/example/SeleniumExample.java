package org.example;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class SeleniumExample {



    ChromeDriver driver;

    @BeforeClass
    void setUpDriver(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");

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
@AfterClass
    void closeDriver(){
    driver.close();
    }
}
