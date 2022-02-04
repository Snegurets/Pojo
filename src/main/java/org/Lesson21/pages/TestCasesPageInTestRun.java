package org.Lesson21.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestCasesPageInTestRun extends BasePage{
    private By addResultButton = By.xpath("//a[@id='addResult']");
    private By resultStatus = By.xpath("//div[@class='change-meta']/span[contains(text(), 'Failed')]");

    public TestCasesPageInTestRun(WebDriver webDriver) {
        super(webDriver);
    }
    public TestCasesPageInTestRun clickOnAddResultButton(){
        findElement(webDriver, addResultButton).click();
        return this;
    }
    public TestCasesPageInTestRun verifyStatus(){
        String verifyStatus = webDriver.findElement(resultStatus).getText().trim();
        Assert.assertEquals(verifyStatus, "Failed");
        return this;
    }
}
