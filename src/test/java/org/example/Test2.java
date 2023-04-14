package org.example;

import org.testng.annotations.*;

public class Test2 {
    @BeforeClass
    void BeforeClass(){
        System.out.println("This will run before the class");
    }
    @AfterClass
    void AfterClass(){
        System.out.println("This will run after the class");
    }
    @BeforeMethod
    void BeforeMethod(){
        System.out.println("This will run before the method");
    }

    @Test
    void test4()
    {
        System.out.println("This is test4");
    }
    @Test
    void test5(){
        System.out.println("This is test4");
    }
    @Test
    void test6(){
        System.out.println("This is test6");
    }
    @AfterMethod
    void AfterMethod(){
        System.out.println("This will run after the method");
    }
}
