package org.Lesson21.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestAQAPage extends BasePage {
    private By testRunsAndResultsTab = By.xpath("//a[@id='navigation-runs']");

    public TestAQAPage(WebDriver webDriver) {
        super(webDriver);
    }
    public TestAQAPage clickOnTestRunsAndResultsTab(){
        findElement(webDriver, testRunsAndResultsTab).click();
        return this;
    }
}
