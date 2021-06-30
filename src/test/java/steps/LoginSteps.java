package steps;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import utils.PropertiesUtil;

@Log4j2
public class LoginSteps extends AbstractStep{

    LoginPage loginPage = new LoginPage(driver,5);
    private final String VALID_EMAIL = PropertiesUtil.getSystemProperty("valid_email");
    private final String VALID_PASSWORD = PropertiesUtil.getSystemProperty("valid_password");

    public LoginSteps(WebDriver driver) {
        super(driver);
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
        //successfulLoadingPage(homePage);
    }

//    @Step("Authentication with invalid data")
//    public void authenticationWithInvalidData(String email, String password) {
//        loginPage.sendData(email, password);
//        loginPage.alertOpen(ERROR_ALERT);
//        validateComponentIsLoaded(loginPage);
//    }
//
//    @Step("Authentication with valid empty data")
//    public void authenticationWithEmptyData() {
//        loginPage.sendData("", "");
//        loginPage.alertOpen(ENTER_PASSWORD_ERROR_ALERT);
//        loginPage.alertOpen(ENTER_EMAIL_ERROR_ALERT);
//        validateComponentIsLoaded(loginPage);
//    }
//
//    @Step("Authentication with valid empty password")
//    public void authenticationWithEmptyPassword() {
//        loginPage.sendData(VALID_PASSWORD, "");
//        loginPage.alertOpen(ENTER_PASSWORD_ERROR_ALERT);
//        validateComponentIsLoaded(loginPage);
//    }
//
//    @Step("Authentication with valid empty email")
//    public void authenticationWithEmptyEmail() {
//        loginPage.sendData("", VALID_PASSWORD);
//        loginPage.alertOpen(ENTER_EMAIL_ERROR_ALERT);
//        validateComponentIsLoaded(loginPage);
//    }

}
