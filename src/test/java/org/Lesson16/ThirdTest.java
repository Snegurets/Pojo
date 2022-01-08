package org.Lesson16;

import org.testng.annotations.*;

public class ThirdTest {

    @BeforeGroups
    public void beforeGroups(){
        System.out.println("BeforeGroups");
    }

    @BeforeMethod
    public void beforeMethodPrecondition(){
        System.out.println("BeforeMethod");
    }

    @Test(groups = "smoke1")
    public void thirdTest(){
        System.out.println("Hello third test");
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
