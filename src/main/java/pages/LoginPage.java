package pages;

import constants.PagesConstants;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

@Log4j2
public class LoginPage extends BasePage{

    private final By INPUT_EMAIL = By.id("email");
    private final By PASSWORD = By.id("passwd");
    public final By LOGIN_BUTTON = By.id("SubmitLogin");

    public LoginPage(WebDriver driver, int timeOutInSeconds) {
        super(driver, timeOutInSeconds);
    }

    @Override
    public void isPageLoadedWaiter() {
        log.info("Checking that the Login page was opened");
        explicitlyWait.until(ExpectedConditions.visibilityOfElementLocated(LOGIN_BUTTON));
    }

    @Override
    public LoginPage openPage() {
        log.info("Open Login Page {}", PagesConstants.LOGIN_PAGE_URL);
        driver.get(PagesConstants.LOGIN_PAGE_URL);
        return this;
    }

    public void authentication(String email, String password) {
        log.info("Send text {} to text field {}", INPUT_EMAIL, "email");
        driver.findElement(INPUT_EMAIL).sendKeys(email);
        log.info("Send text {} to text field {}", PASSWORD, "password");
        driver.findElement(PASSWORD).sendKeys(password);
        log.info("Click {}", LOGIN_BUTTON);
        driver.findElement(LOGIN_BUTTON).click();
    }

}
