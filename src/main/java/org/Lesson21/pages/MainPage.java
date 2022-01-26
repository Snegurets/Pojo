package org.Lesson21.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends BasePage {
    public void clickOnMyAccountLink(WebDriver webDriver){
        findElement(webDriver, By.xpath("//a[contains(text(), 'My Account']")).click();
    }

}
