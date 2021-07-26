package tests.MyAccountTests;

import io.qameta.allure.*;
import org.testng.annotations.Test;
import tests.PreconditionsForSomeTests;

@Owner("Kazak Ivan")
@Epic("Smoke test")
@Feature("MyAddressesTests")
public class MyAddressesTests extends PreconditionsForSomeTests {

    @Test(description = "Add new address")
    @Severity(value = SeverityLevel.NORMAL)
    public void addingNewAddressTest() {
        myAddressesSteps
                .clickMyAddressesButton()
                .clickAddNewAddressButton()
                .fillNewAddressFields()
                .clickSaveNewAddressButton();
    }

}
