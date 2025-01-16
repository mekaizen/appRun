
package com.automation.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;

public class DriverFactory {

    public static WebDriver getDriver(String browser) {
        WebDriver driver = null;
        
        switch (browser.toLowerCase()) {
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "firefox":

                driver = new FirefoxDriver();
                break;
            default:
                System.out.println("Unsupported browser. Defaulting to Chrome.");
                driver = new ChromeDriver();
                break;
        }
        
        return driver;
    }
}
    