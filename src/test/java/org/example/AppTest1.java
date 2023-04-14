package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest1 {
    @Test(priority = 1)
    void openApp(){
        System.out.println("Opening App");
        //Assert.assertEquals("true","false");
    }
    @Test(priority = 2)
    void clickMenu(){
        System.out.println("clicking on Menu");
    }
    @Test(priority = 3)
    void closeApp(){
        System.out.println("closing Menu");
    }

}
