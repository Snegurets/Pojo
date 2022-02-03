package org.Lesson21.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestCasesPage extends BasePage {
    private By addTestCaseButton = By.xpath("//a[@id='sidebar-cases-add']");

    public TestCasesPage(WebDriver webDriver) {
        super(webDriver);
    }

    public TestCasesPage clickOnAddTestCaseButton(){
        findElement(webDriver, addTestCaseButton).click();
        return this;
    }
}
