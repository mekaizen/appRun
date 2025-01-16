
package com.automation.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

public class DriverFactory {

    public static WebDriver getDriver(String browser) {
        WebDriver driver = null;
        String remoteUrl = System.getProperty("remoteUrl");
try {
    switch (browser.toLowerCase()) {
        case "chrome":
            if (remoteUrl != null && !remoteUrl.isEmpty()) {
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("--headless", "--no-sandbox", "--disable-dev-shm-usage");
                driver = new RemoteWebDriver(new URL(remoteUrl), chromeOptions);
            } else {
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("--headless", "--no-sandbox", "--disable-dev-shm-usage");
                driver = new ChromeDriver(chromeOptions);
            }
            break;
        case "firefox":

            driver = new FirefoxDriver();
            break;
        default:
            System.out.println("Unsupported browser. Defaulting to Chrome.");
            driver = new ChromeDriver();
            break;
    }
}catch (Exception e){
    e.printStackTrace();
}
        return driver;
    }
}
    