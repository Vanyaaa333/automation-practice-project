package steps;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import pages.LoginPage;
import pages.MyAccountPages.MyAccountPage;

import static constants.ConstantsForLoginTests.*;
import static pages.LoginPage.INVALID_DATA_ERROR;

public class LoginSteps extends AbstractStep{

    protected LoginPage loginPage = new LoginPage(driver,3);
    protected MyAccountPage myAccountPage = new MyAccountPage(driver,3);

    public LoginSteps(WebDriver driver) {
        super(driver);
    }

    @DataProvider
    public static Object[][] invalidLoginData() {
        return new Object[][]{
                {VALID_EMAIL, INVALID_PASSWORD},
                {INVALID_EMAIL, VALID_PASSWORD},
                {EMPTY_EMAIL_FIELD, VALID_PASSWORD},
                {VALID_EMAIL, EMPTY_PASSWORD_FIELD},
                {INVALID_EMAIL_SCRIPT, VALID_PASSWORD},
                {INVALID_EMAIL_HTML_TAG, VALID_PASSWORD},
                {INVALID_EMAIL_DIFFERENT_SYMBOLS, VALID_PASSWORD},
                {EMAIL_WITH_WHITESPACES_TEXT, VALID_PASSWORD}
        };
    }

    @Step("Open login page")
    public LoginSteps openLoginPage() {
        loginPage.openPage();
        successfulLoadingPage(loginPage);
        return this;
    }

    @Step("Authentication with valid data")
    public void loginWithValidData() {
        loginPage.authentication(VALID_EMAIL, VALID_PASSWORD);
        successfulLoadingPage(myAccountPage);
    }

    @Step("Authentication with invalid data")
    public void loginWithInvalidData(String email, String password) {
        loginPage.authentication(email, password);
        loginPage.isAlertOpen(INVALID_DATA_ERROR);
        successfulLoadingPage(loginPage);
    }

}
