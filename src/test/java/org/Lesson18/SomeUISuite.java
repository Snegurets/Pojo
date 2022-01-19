package org.Lesson18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SomeUISuite extends BaseTest {

    @Test
    public void firstTest() {
        webDriver.get("http://automationpractice.com/");
        By signIn = By.xpath("//a[@class='login']");
        webDriver.findElement(signIn).click();

        //TODO generate random email, and check register form is displayed
        webDriver.findElement(By.xpath("//input[@id='email_create']")).sendKeys("everdobuste@vusra.com");
        webDriver.findElement(By.xpath("//button[@id='SubmitCreate']")).click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        Assert.assertTrue(webDriver.getCurrentUrl().contains("account-creation"));
        webDriver.findElement(By.xpath("//form[@id='account-creation_form']"));


        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void firstTest1() {
        webDriver.get("http://automationpractice.com/");
        By signIn = By.xpath("//a[@class='login']");
        webDriver.findElement(signIn).click();

        //TODO verify that error 'email already exist' is displayed
        webDriver.findElement(By.xpath("//input[@id='email_create']")).sendKeys("example@email.com");
        webDriver.findElement(By.xpath("//button[@id='SubmitCreate']")).click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        Assert.assertTrue(webDriver.findElement(By.id("create_account_error")).getText().contains("An account using this email address has already been registered. Please enter a valid password or request a new one."));



        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
