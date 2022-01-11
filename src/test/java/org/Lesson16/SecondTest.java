package org.Lesson16;

import org.testng.annotations.*;

public class SecondTest {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("BeforeSuite");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("BeforeTest");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("BeforeClass");
    }

    @BeforeGroups
    public void beforeGroups(){
        System.out.println("BeforeGroups");
    }

    @BeforeMethod
    public void beforeMethodPrecondition(){
        System.out.println("BeforeMethod");
    }

    @Test(groups = "regression")
    public void secondTest(){
        System.out.println("Hello second test");
    }

    @AfterMethod
    public void afterMethodPostcondition(){
        System.out.println("AfterMethod");
    }

    @AfterGroups
    public void afterGroups(){
        System.out.println("AfterGroups");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("AfterClass");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("AfterTest");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("AfterSuite");
    }
}
