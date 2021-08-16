package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class PreconditionsForSomeTests extends BaseTest{
    @BeforeClass
    @Override
    public void setup(){
        super.setup();
    }

    @BeforeMethod
    public void login() {
        loginSteps
                .openLoginPage()
                .loginWithValidData();
    }

    @AfterMethod
    @Override
    public void openNewPage(){
        super.openNewPage();
    }
}


