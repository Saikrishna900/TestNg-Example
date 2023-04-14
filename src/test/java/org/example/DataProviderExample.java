package org.example;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {
//    @DataProvider(name="mylogindata")
//    public Object[][] gettingData(){
//        Object[][] data = {{11917851,"Saikrishna","saikrishna@gmail.com"},{1323232,"john","johnsmith@gmail.com"},};
//        return data;
//    }
    @Test(dataProvider = "mylogindata",dataProviderClass = Dataclass1.class)
    public void loginform(int reg,String name,String email){
        System.out.println(reg+" "+name+" "+email);
    }
}
