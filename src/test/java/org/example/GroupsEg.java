package org.example;

import org.testng.annotations.Test;

public class GroupsEg {

    @Test(groups = "regression")
    void method1(){
        System.out.println("This is Method 1");
    }
    @Test(groups = "critical")
    void method2(){
        System.out.println("This is Method 2");
    }
    @Test(groups = "critical")
    void method3(){
        System.out.println("This is Method 3");
    }
    @Test(groups = "regression")
    void method4(){
        System.out.println("This is Method 4");
    }
    @Test(groups = {"critical","regression"})
    void method5(){
        System.out.println("This is Method 5");
    }
    @Test(groups = "critical")
    void method6(){
        System.out.println("This is Method 6");
    }


//Grouping is not possible in junit
}
