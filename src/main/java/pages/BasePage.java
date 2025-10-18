package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    protected void waitForClickable(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    protected void waitForDisplayed(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    protected void elementClick(WebElement element) {
        waitForClickable(element);
        element.click();
    }

    protected void enterText(WebElement element, String text) {
        waitForDisplayed(element);
        element.clear();
        element.sendKeys(text);
    }
}
