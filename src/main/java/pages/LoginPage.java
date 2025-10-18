package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    public By loginOrCreateAccountBtn = By.cssSelector("[data-cy='LoginHeaderText']");
    public By signInByEmailBtn = By.cssSelector("[data-cy='signInByMailButton']");
    public By emailInputBox = By.cssSelector("[for='username']~div input");
    public By continueBtn = By.cssSelector("[data-cy='continueBtn']");
    public By passwordInputBox = By.id("password");
    public By loginBtn = By.cssSelector("[data-cy='login']");
    public By mobileNumberPageCloseIcon = By.className("mybizLoginClose");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

}
