package org.Lesson21;


import org.Lesson21.pages.*;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestRailTest extends BaseTest {
//    @Test
//    public void testLoginForm(){
//        By passwordField = By.xpath("//input[@id = 'password']");
//
//        webDriver.get("https://www.gurock.com/testrail/");
//        findElement(webDriver, By.xpath("//a[contains(text(), 'My Account')]"));
//        findElement(webDriver, By.xpath("//input[@id = 'email']")).sendKeys("juspujurzo@vusra.com");
//        findElement(webDriver, passwordField).sendKeys("Abc4267131");
//        findElement(webDriver, By.xpath("//button[contains(text(), 'Login')]")).click();
//
//        boolean isPasswordFieldEmpty = findElement(webDriver, passwordField).getAttribute("value").isEmpty();
//        Assertions.assertThat(isPasswordFieldEmpty).as("Password field should be an empty").isTrue()
//
//    }

    @Test
    public void firstTest(){

       new LoginPage(webDriver, "https://juspujurzo.testrail.io/index.php?/auth/login/")
               .inputEmail("juspujurzo@vusra.com")
               .inputPassword("Abc4267131")
               .clickOnLoginButton();
       new MainPage(webDriver)
               .clickOnTestCasesButton();
       new TestCasesPage(webDriver)
               .clickOnAddTestCaseButton();
       new TestCasesCreationPage(webDriver)
               .fillTitle()
               .chooseTemplateInDropDown()
               .fillPreconditions()
               .clickOnAddTestCaseButton()
               .verifyTextMessage();

    }

    @Test
    public void secondTest(){
        new LoginPage(webDriver, "https://juspujurzo.testrail.io/index.php?/auth/login/")
                .inputEmail("juspujurzo@vusra.com")
                .inputPassword("Abc4267131")
                .clickOnLoginButton();
        new MainPage(webDriver)
                .cliclOnTestAQAButton();
        new TestAQAPage(webDriver)
                .clickOnTestRunsAndResultsTab();
        new TestRunsAndResultsPage(webDriver)
                .clickOnTestRun();
        new TestRunPage(webDriver)
                .clickOnTestCase();
        new TestCasesPageInTestRun(webDriver)
                .clickOnAddResultButton();
        new AddResultPage(webDriver)
                .chooseStatusInDropDown()
                .clickOnAddResultButton();
        new TestCasesPageInTestRun(webDriver)
                .verifyStatus();

    }

}
