package pages;

import constants.PagesConstants;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

@Log4j2
public class LoginPage extends BasePage{

    private static final By INPUT_EMAIL = By.id("email");
    private static final By PASSWORD = By.id("passwd");
    private static final By LOGIN_BUTTON = By.id("SubmitLogin");
    private static final By EMAIL_FIELD_TO_CREATE_ACCOUNT = By.id("email_create");
    private static final By CREATE_AN_ACCOUNT_BUTTON = By.id("SubmitCreate");
    public static final By INVALID_DATA_ERROR = By.xpath("//div[@class='alert alert-danger']//p[contains(.,'There is 1 error')]");


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

    public void isAlertOpen(By alert) {
        log.info("Checking that the alert was opened");
        explicitlyWait.until(ExpectedConditions.visibilityOfElementLocated(INVALID_DATA_ERROR));
    }

    public void fillNewUserEmailAndClickCreateButton(String emailAddress) {
        log.info("Send text {} to text field {}", EMAIL_FIELD_TO_CREATE_ACCOUNT, "Email address");
        driver.findElement(EMAIL_FIELD_TO_CREATE_ACCOUNT).sendKeys(emailAddress);
        log.info("Click {}", CREATE_AN_ACCOUNT_BUTTON);
        driver.findElement(CREATE_AN_ACCOUNT_BUTTON).click();
    }

}
