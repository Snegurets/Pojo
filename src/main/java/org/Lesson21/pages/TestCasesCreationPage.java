package org.Lesson21.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestCasesCreationPage extends BasePage{

    private By titleField = By.xpath("//input[@id='title']");
    private By templateDropDown = By.xpath("//div[@id='template_id_chzn']");
    private By valueInDropDown = By.xpath("//li[@id='template_id_chzn_o_1']");
    private By preconditionsField = By.xpath("//div[@id='custom_preconds_display']");
    private By addTestCaseButton = By.xpath("//button[@id='accept']");


    public TestCasesCreationPage(WebDriver webDriver) {
        super(webDriver);
    }
    public TestCasesCreationPage fillTitle(){
        findElement(webDriver,titleField).sendKeys("New Test Case");
        return this;
    }
    public TestCasesCreationPage chooseTemplateInDropDown(){
        findElement(webDriver, templateDropDown).click();
        findElement(webDriver, valueInDropDown).click();
        return this;
    }
    public TestCasesCreationPage fillPreconditions(){
        findElement(webDriver, preconditionsField).sendKeys("New Test Case");
        return this;
    }
    public TestCasesCreationPage clickOnAddTestCaseButton(){
        findElement(webDriver, addTestCaseButton).click();
        return this;
    }
    public TestCasesCreationPage verifyTextMessage(){
        webDriver.getPageSource().contains("Successfully added the new test case.");
        return this;
    }
}
