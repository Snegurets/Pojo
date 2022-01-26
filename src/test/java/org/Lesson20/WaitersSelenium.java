package org.Lesson20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class WaitersSelenium extends BaseTest {

    @Test
    public void threedSleep(){
    webDriver.get("http://automationpractice.com/");
    findElement(webDriver, By.xpath("//input[@id='email_create']")).sendKeys("everdobuste@vusra.com");
    findElement(webDriver, By.xpath("//button[@id='SubmitCreate']"), 10L).click();
    waitForElementClicable(webDriver, By.xpath("//button[@id='submitAccount']")).click();

//    WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(5));
//    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='submitAccount']"))).click();

//    Wait<WebDriver> wait = new FluentWait<>(webDriver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(5));
//    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='submitAccount']"))).click();
    }

    @Test
    public void testScrolling(){
        webDriver.get("https://www.gurock.com/testrail/");
        WebElement we = webDriver.findElement(By.xpath("//a[contains(., 'Legal')]"));
        scrollToElement(webDriver, we);
        we.click();

        List<String> tabs = new ArrayList<>(webDriver.getWindowHandles());
        webDriver.switchTo().window(tabs.get(1));
        findElement(webDriver, By.xpath("//a[@id='ui-id-3']")).click();

    }

}
