package org.Lesson20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class HWTest extends BaseTest{

    @Test
    public void firstTest(){
        webDriver.get("https://www.gurock.com/testrail/");
        WebElement aboutGurockTab = webDriver.findElement(By.xpath("//a[contains(text(),'About Gurock')]"));
        scrollToElement(webDriver, aboutGurockTab);
        aboutGurockTab.click();
        String verifyText= webDriver.findElement(By.xpath("//a[@class='secondary-link']")).getText().trim();
        Assert.assertEquals(verifyText, "Learn more about the Idera, Inc. leadership team");

    }

    @Test
    public void secondTest(){
        webDriver.get("https://www.gurock.com/testrail/");
        WebElement jobsTab = webDriver.findElement(By.xpath("//a[contains(text(),'Jobs')]"));
        scrollToElement(webDriver, jobsTab);
        jobsTab.click();
        String verifyTextOnButton = webDriver.findElement(By.xpath("//a[@class='btn btn-medium btn-outline-blue']")).getText().trim();
        Assert.assertEquals(verifyTextOnButton, "Browse open positions");

    }

    @Test
    public void thirdTest(){
        webDriver.get("https://www.gurock.com/testrail/");
        WebElement contactTab = webDriver.findElement(By.xpath("//a[@href='/testrail/about/contact']"));
        scrollToElement(webDriver, contactTab);
        contactTab.click();
        webDriver.getPageSource().contains("Registration Number:");

    }
    @Test
    public void fourthTest(){
        webDriver.get("https://www.gurock.com/testrail/");
        WebElement legalTab = webDriver.findElement(By.xpath("//a[contains(., 'Legal')]"));
        scrollToElement(webDriver, legalTab);
        legalTab.click();

        List<String> tabs = new ArrayList<>(webDriver.getWindowHandles());
        webDriver.switchTo().window(tabs.get(1));
        findElement(webDriver, By.xpath("//a[@id='ui-id-4']")).click();
        String verifyTextOnButton = webDriver.findElement(By.xpath("//a[@href='/legal/reportus']")).getText().trim();
        Assert.assertEquals(verifyTextOnButton, "Report the use of Unlicensed Software");
        webDriver.close();
        webDriver.switchTo().window(tabs.get(0));
    }
    @Test
    public void fifthTest(){
        webDriver.get("https://www.gurock.com/testrail/");
        WebElement complianceTab = webDriver.findElement(By.xpath("//a[contains(., 'Compliance')]"));
        scrollToElement(webDriver, complianceTab);
        complianceTab.click();
        String verifyTextOnButton = webDriver.findElement(By.xpath("//span[@style='background-color: transparent;']")).getText().trim();
        Assert.assertEquals(verifyTextOnButton, "TestRail SOC 2 Compliance & Certification");


    }
}