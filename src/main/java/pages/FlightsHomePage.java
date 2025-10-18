package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FlightsHomePage extends BasePage{
    public By navigationIcons = By.cssSelector(".chHeaderContainer .headerIcons .headerIconTextAlignment");
    public By flightFromInputBox = By.cssSelector(".fltWidgetSection #fromCity");
    public By flightToInputBox = By.cssSelector(".fltWidgetSection #toCity");
    public By todayDate = By.className("DayPicker-Day--today");
    public By search = By.cssSelector(".searchWidgetContainer .widgetSearchBtn");
    public By overLayPopUp = By.cssSelector(".commonOverlay .overlayCrossIcon");
    
    public FlightsHomePage(WebDriver driver) {
        super(driver);
    }
}
