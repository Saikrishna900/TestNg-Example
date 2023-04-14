package org.example;

import org.testng.annotations.DataProvider;

public class Dataclass1 {
    @DataProvider(name="mylogindata")
    public Object[][] gettingData(){
        Object[][] data = {{11917851,"Saikrishna","saikrishna@gmail.com"},{1323232,"john","johnsmith@gmail.com"},};
        return data;
    }
}
