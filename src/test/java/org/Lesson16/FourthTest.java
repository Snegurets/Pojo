package org.Lesson16;

import org.testng.annotations.*;

public class FourthTest {

    @BeforeGroups
    public void beforeGroups(){
        System.out.println("BeforeGroups");
    }

    @BeforeMethod
    public void beforeMethodPrecondition(){
        System.out.println("BeforeMethod");
    }

    @DataProvider (name = "dataProvider" )
    public Object[][] dataProviderMethod() {

        return new Object[][] { { "data one" }, { "data two" } };
    }

    @Test(groups = "dataProvider", dataProvider = "dataProvider")
    public void fourthTest(String data) {
        System.out.println("Data is: " + data);
    }

    @AfterMethod
    public void afterMethodPostcondition(){
        System.out.println("AfterMethod");
    }

    @AfterGroups
    public void afterGroups(){
        System.out.println("AfterGroups");
    }

}

