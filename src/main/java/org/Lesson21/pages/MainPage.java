package org.Lesson21.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class MainPage extends BasePage {
    private By testCasesButton = By.xpath("//a[contains(text(), 'Test Cases')]");
    private By testAQAButton = By.xpath("//div[@class='column summary-column flex-projects-2']//a[contains(text(), 'TestAQA')]");

    public MainPage(WebDriver webDriver) {
        super(webDriver);
    }

    public MainPage clickOnTestCasesButton(){
      findElement(webDriver, testCasesButton).click();
        return this;
    }
    public MainPage cliclOnTestAQAButton(){
        findElement(webDriver, testAQAButton).click();
        return this;
    }

}
