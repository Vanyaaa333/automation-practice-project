package steps;

import elements.NewUserFormElements.RegisterFormInputCheckBoxes;
import elements.NewUserFormElements.RegisterFormInputFields;
import elements.NewUserFormElements.RegisterFormInputRadio;
import elements.NewUserFormElements.RegisterFormSelectElements;
import io.qameta.allure.Step;
import models.NewUserModel.NewUserModel;
import models.NewUserModel.RegisterFormPatternsModel;
import org.openqa.selenium.WebDriver;
import pages.MyAccountPages.MyAccountPage;
import pages.MyAccountPages.MyAddressPage;
import pages.MyAccountPages.YourAddressesPage;

import static pages.MyAccountPages.MyAccountPage.MY_ADDRESSES_BUTTON;
import static pages.MyAccountPages.MyAddressPage.ADD_NEW_ADDRESS_BUTTON;
import static pages.MyAccountPages.YourAddressesPage.SAVE_BUTTON;

public class MyAddressesSteps extends AbstractStep{

    protected MyAddressPage myAddressPage = new MyAddressPage(driver,3);
    protected YourAddressesPage yourAddressesPage = new YourAddressesPage(driver,3);
    protected MyAccountPage myAccountPage = new MyAccountPage(driver,3);

    public MyAddressesSteps(WebDriver driver) {
        super(driver);
    }

    @Step("Click to my addresses button, and check that opening right page")
    public MyAddressesSteps clickMyAddressesButton() {
        myAccountPage.clickButton(myAddressPage,MY_ADDRESSES_BUTTON);
        successfulLoadingPage(myAddressPage);
        return this;
    }

    @Step("Click to add new addresses button, and check that opening right page")
    public MyAddressesSteps clickAddNewAddressButton() {
        myAddressPage.clickButton(yourAddressesPage,ADD_NEW_ADDRESS_BUTTON);
        successfulLoadingPage(yourAddressesPage);
        return this;
    }

    @Step("Fill new address form fields")
    public MyAddressesSteps fillNewAddressFields() {
            new RegisterFormInputFields(driver,RegisterFormPatternsModel.AddressFirstName).fillInputField(NewUserModel.AddressFirstName);
            new RegisterFormInputFields(driver,RegisterFormPatternsModel.AddressLastName).fillInputField(NewUserModel.AddressLastName);
            new RegisterFormInputFields(driver,RegisterFormPatternsModel.Address).fillInputField(NewUserModel.Address);
            new RegisterFormInputFields(driver,RegisterFormPatternsModel.City).fillInputField(NewUserModel.City);
            new RegisterFormSelectElements(driver,RegisterFormPatternsModel.State).chooseSelectedOption(NewUserModel.State);
            new RegisterFormInputFields(driver,RegisterFormPatternsModel.PostCode).fillInputField(NewUserModel.ZipCode);
            new RegisterFormSelectElements(driver,RegisterFormPatternsModel.Country).chooseSelectedOption(0);
            new RegisterFormInputFields(driver,RegisterFormPatternsModel.MobilePhone).fillInputField(NewUserModel.MobilePhone);
            new RegisterFormInputFields(driver,RegisterFormPatternsModel.HomePhone).fillInputField(NewUserModel.HomePhone);
            new RegisterFormInputFields(driver,RegisterFormPatternsModel.Alias).fillInputField(NewUserModel.AddressAlias);
            return this;
    }

    @Step("Click to save new address button, and check that opening right page")
    public MyAddressesSteps clickSaveNewAddressButton() {
        yourAddressesPage.clickButton(myAddressPage,SAVE_BUTTON);
        successfulLoadingPage(myAddressPage);
        return this;
    }


}
