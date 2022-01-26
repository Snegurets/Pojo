package org.Lesson21.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{
    private By emailField = By.xpath("");
    private By passwordField = By.xpath("");


    public void inputEmail(WebDriver webDriver, String email){
        findElement(webDriver, emailField).sendKeys("");
    }

    public void inputPassword(WebDriver webDriver, String password){

    }
}
