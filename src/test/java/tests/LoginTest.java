package tests;

import io.qameta.allure.*;
import org.testng.annotations.Test;
import steps.LoginSteps;

@Owner("Kazak Ivan")
@Epic("Smoke test")
@Feature("LoginTest")
public class LoginTest extends BaseTest{

    @Test(description = "Filling of the login form with valid date")
    @Severity(value = SeverityLevel.BLOCKER)
    public void validAuthentication() {
        loginSteps
                .openLoginPage()
                .loginWithValidData();
    }


}
