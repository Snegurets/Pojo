package org.Lesson21.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddResultPage extends BasePage {
    private By statusDropDown = By.xpath("//div[@id='addResultStatus_chzn']");
    private By valueInStatusDropDown = By.xpath("//li[@id='addResultStatus_chzn_o_3']");
    private By addResultButton = By.xpath("//div[@id='addResultButtons']");


    public AddResultPage(WebDriver webDriver) {
        super(webDriver);
    }

    public AddResultPage chooseStatusInDropDown(){
        findElement(webDriver, statusDropDown).click();
        findElement(webDriver, valueInStatusDropDown).click();
        return this;
    }
    public AddResultPage clickOnAddResultButton(){
        findElement(webDriver, addResultButton).click();
        return this;
    }
}
