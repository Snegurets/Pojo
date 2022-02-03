package org.Lesson21.pages;

import org.openqa.selenium.WebDriver;

public class BasePage extends WebHelpers {
    WebDriver webDriver;

   public BasePage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

   public BasePage(WebDriver webDriver, String url) {
        webDriver.get(url);
        this.webDriver = webDriver;
    }

}
