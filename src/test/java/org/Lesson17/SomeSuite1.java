package org.Lesson17;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SomeSuite1 {
    WebDriver driver;
    @BeforeClass
    public void driverInit(){
        driver = BaseTest.getDriver();
    }


    @Test
    public void firstVerify(){

        driver.get("https://parabank.parasoft.com/");
        driver.navigate().refresh();
        Assert.assertTrue(driver.getTitle().contains("ParaBank | Welcome | Online Banking"), "this page does not contains any 'ParaBank | Welcome | Online Banking'");
    }

    @Test
    public void firstVerify1() {
        driver.get("https://www.selenium.dev/");
        Assert.assertEquals("Selenium", driver.getTitle());

    }

    @AfterClass
    public void tearDowm() {
        driver.quit();
    }
}
