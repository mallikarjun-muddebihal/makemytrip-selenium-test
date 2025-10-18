package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class DriverFactory {
    public static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static void initDriver(String browserName) {
        switch (browserName.toLowerCase()) {
            case "chrome":
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("--disable-notifications");
                chromeOptions.addArguments("--disable-popup-blocking");
                driver.set(new ChromeDriver(chromeOptions));
                break;
            case "edge":
                driver.set(new EdgeDriver());
                break;
            default:
                throw new IllegalArgumentException("Browser not supported: " + browserName);
        }
        getDriver().manage().window().maximize();
        getDriver().manage().deleteAllCookies();
    }

    public static WebDriver getDriver() {
        return driver.get();
    }

    public void quitDriver() {
        if (driver.get() != null) {
            driver.get().quit();
        }
    }
}
