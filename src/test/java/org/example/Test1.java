package org.example;

import org.testng.annotations.*;

public class Test1 {
    @BeforeSuite
    void BeforeSuite(){
        System.out.println("Before Suite");
    }
    @AfterSuite
    void AfterSuite(){
        System.out.println("After Suite");
    }
    @BeforeTest
    void BeforeTest(){
        System.out.println("Before Test");
    }
    @AfterTest
    void AfterTest(){
        System.out.println("After Test");
    }
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
    void test1()
    {
        System.out.println("This is test1");
    }
    @Test
    void test2(){
        System.out.println("This is test2");
    }
    @Test
    void test3(){
        System.out.println("This is test3");
    }
    @AfterMethod
    void AfterMethod(){
        System.out.println("This will run after the method");
    }

}
