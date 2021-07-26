package tests.ActionsWithUserAccountTests;

import io.qameta.allure.*;
import org.testng.annotations.Test;
import tests.BaseTest;

@Owner("Kazak Ivan")
@Epic("Smoke test")
@Feature("Creating new account")
public class RegisterNewUserTests extends BaseTest {

    @Test(description = "Creating new user")
    @Severity(value = SeverityLevel.BLOCKER)
    public void creatingNewUserAccountTest() {
        loginSteps
                .openLoginPage();
        creatingNewUserSteps
                .fillNewUserEmailAndClickCreateButton()
                .fillRegisterFields()
                .clickingRegisterButton();
    }

}
