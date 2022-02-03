package org.Lesson21.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestRunPage extends BasePage{
    private By testCase = By.xpath("//a[contains(text(), 'fjjfj')]");

    public TestRunPage(WebDriver webDriver) {
        super(webDriver);
    }

    public TestRunPage clickOnTestCase(){
        findElement(webDriver, testCase).click();
        return this;
    }
}
