
package com.automation.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.automation.utils.TestBase;

public class WebTest extends TestBase {

    @Test
    public void testGoogleSearch() {
        driver.get("https://www.google.com");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement e = driver.findElement(By.name("q"));
        e.sendKeys("Selenium WebDriver");
        new Actions(driver).sendKeys(e, Keys.ENTER).perform();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e1) {
            throw new RuntimeException(e1);
        }
        Assert.assertTrue(driver.getTitle().contains("Selenium WebDriver"));

    }
}
    