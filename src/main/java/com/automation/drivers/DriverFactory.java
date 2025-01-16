
package com.automation.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

public class DriverFactory {

//    public static WebDriver getDriver(String browser) {
//        WebDriver driver = null;
//        switch (browser.toLowerCase()) {
//            case "chrome":
//                System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver");
//                ChromeOptions options = new ChromeOptions();
//                options.addArguments("--headless", "--no-sandbox", "--disable-dev-shm-usage");
//                driver = new ChromeDriver(options);  // No remote URL, local ChromeDriver
//                break;
//            case "firefox":
//                driver = new FirefoxDriver();  // Local FirefoxDriver
//                break;
//            default:
//                System.out.println("Unsupported browser. Defaulting to Chrome.");
//                driver = new ChromeDriver();  // Default to local ChromeDriver
//                break;
//        }
//        return driver;
//    }


    public static WebDriver getDriver(String browser) {
        WebDriver driver = null;
        switch (browser.toLowerCase()) {
            case "chrome":
                String chromeDriverPath = System.getenv("CHROME_DRIVER_PATH");  // Get from environment variable
                if (chromeDriverPath == null) {
                    chromeDriverPath = "src/test/resources/driver/chromedriver";  // Default fallback path
                }
                System.setProperty("webdriver.chrome.driver", chromeDriverPath);

                ChromeOptions options = new ChromeOptions();
                options.addArguments("--headless", "--no-sandbox", "--disable-dev-shm-usage");
                driver = new ChromeDriver(options);  // No remote URL, local ChromeDriver
                break;
            case "firefox":
                driver = new FirefoxDriver();  // Local FirefoxDriver
                break;
            default:
                System.out.println("Unsupported browser. Defaulting to Chrome.");
                driver = new ChromeDriver();  // Default to local ChromeDriver
                break;
        }
        return driver;
    }
}
    