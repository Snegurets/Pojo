package org.Lesson19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Random;

public class SomeUISuite extends BaseTest {

    @Test
    public void firstTest() {
        webDriver.get("https://theautomationzone.blogspot.com/");
        By chooseFile = By.xpath("//input[@id='photo']");
        webDriver.findElement(chooseFile).sendKeys("C:\\pojoproject\\src\\main\\resources\\test.txt");

    }

    @Test
    public void secondTest(){
        webDriver.get("https://theautomationzone.blogspot.com/");
        List<WebElement> checkboxes = webDriver.findElements(By.xpath("//div[@class='divTableCell']/input[@type='checkbox']"));
        WebElement randomCheckbox = checkboxes.get(new Random().nextInt(checkboxes.size()));
        randomCheckbox.click();

    }

    @Test
    public void thirdTest(){
        webDriver.get("http://automationpractice.com/");
        List<WebElement> tabs = webDriver.findElements(By.xpath("//div[@id='block_top_menu']/ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li"));
        WebElement randomTabs = tabs.get(new Random().nextInt(tabs.size()));
        randomTabs.click();

        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
