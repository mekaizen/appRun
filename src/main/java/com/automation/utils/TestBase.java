
package com.automation.utils;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import com.automation.drivers.DriverFactory;

public class TestBase {

    public WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = DriverFactory.getDriver("chrome");
       // driver.manage().window().maximize();
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
    