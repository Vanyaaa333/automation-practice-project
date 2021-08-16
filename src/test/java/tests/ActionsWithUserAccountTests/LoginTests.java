package tests.ActionsWithUserAccountTests;

import io.qameta.allure.*;
import org.testng.annotations.Test;
import steps.LoginSteps;
import tests.BaseTest;

@Owner("Kazak Ivan")
@Epic("Smoke test")
@Feature("LoginTest")
public class LoginTests extends BaseTest {

    @Test(description = "Filling of the login form with valid date")
    @Severity(value = SeverityLevel.BLOCKER)
    public void validAuthentication() {
        loginSteps
                .openLoginPage()
                .loginWithValidData();
    }

    @Test(description = "Filling of the login form with invalid date",dataProvider = "invalidLoginData", dataProviderClass = LoginSteps.class)
    @Severity(value = SeverityLevel.BLOCKER)
    public void authenticationWithInvalidCredentials(String login, String password) {
        loginSteps
                .openLoginPage()
                .loginWithInvalidData(login,password);
    }

}
