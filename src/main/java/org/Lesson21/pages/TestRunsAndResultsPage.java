package org.Lesson21.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestRunsAndResultsPage extends BasePage {
    private By testRunButton = By.xpath("//div[@class='summary-title text-ppp']//a[contains(text(), 'Test Run 2/3/2022')]");


    public TestRunsAndResultsPage(WebDriver webDriver) {
        super(webDriver);
    }
    public TestRunsAndResultsPage clickOnTestRun(){
        findElement(webDriver, testRunButton).click();
        return this;
    }
}
