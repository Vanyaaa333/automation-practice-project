package steps;

import elements.NewUserFormElements.RegisterFormInputCheckBoxes;
import elements.NewUserFormElements.RegisterFormInputFields;
import elements.NewUserFormElements.RegisterFormInputRadio;
import elements.NewUserFormElements.RegisterFormSelectElements;
import io.qameta.allure.Step;
import models.NewUserModel.NewUserModel;
import models.NewUserModel.RegisterFormPatternsModel;
import org.openqa.selenium.WebDriver;
import pages.CreateAnAccountPage;
import pages.LoginPage;
import pages.MyAccountPages.MyAccountPage;

import static pages.CreateAnAccountPage.REGISTER_BUTTON_LABEL;

public class CreatingNewUserSteps extends AbstractStep{

    protected LoginPage loginPage = new LoginPage(driver,3);
    protected CreateAnAccountPage createAnAccountPage = new CreateAnAccountPage(driver,3);
    protected MyAccountPage myAccountPage = new MyAccountPage(driver,3);

    public CreatingNewUserSteps(WebDriver driver) {
        super(driver);
    }

    @Step("Filling new user email and clicking 'Create an account' button")
    public CreatingNewUserSteps fillNewUserEmailAndClickCreateButton() {
        loginPage.fillNewUserEmailAndClickCreateButton(NewUserModel.EmailAddress);
        successfulLoadingPage(createAnAccountPage);
        return this;
    }

    @Step("Fill new user register form")
    public CreatingNewUserSteps fillRegisterFields(){
        new RegisterFormInputRadio(driver, RegisterFormPatternsModel.TitleMr).clickSelectField();
        new RegisterFormInputFields(driver,RegisterFormPatternsModel.FirstName).fillInputField(NewUserModel.FirstName);
        new RegisterFormInputFields(driver,RegisterFormPatternsModel.LastName).fillInputField(NewUserModel.LastName);
        new RegisterFormInputFields(driver,RegisterFormPatternsModel.Password).fillInputField(NewUserModel.Password);
        new RegisterFormSelectElements(driver,RegisterFormPatternsModel.BirthDay).chooseSelectedOption(NewUserModel.BirthDay);
        new RegisterFormSelectElements(driver,RegisterFormPatternsModel.BirthMonth).chooseSelectedOption(NewUserModel.BirthMonth);
        new RegisterFormSelectElements(driver,RegisterFormPatternsModel.BirthYear).chooseSelectedOption(NewUserModel.BirthYear);
        new RegisterFormInputCheckBoxes(driver,RegisterFormPatternsModel.ReceiveOffers).clickOnSelectedCheckbox();
        new RegisterFormInputCheckBoxes(driver,RegisterFormPatternsModel.NewsLetterSignUp).clickOnSelectedCheckbox();
        new RegisterFormInputFields(driver,RegisterFormPatternsModel.AddressFirstName).fillInputField(NewUserModel.AddressFirstName);
        new RegisterFormInputFields(driver,RegisterFormPatternsModel.AddressLastName).fillInputField(NewUserModel.AddressLastName);
        new RegisterFormInputFields(driver,RegisterFormPatternsModel.Address).fillInputField(NewUserModel.Address);
        new RegisterFormInputFields(driver,RegisterFormPatternsModel.City).fillInputField(NewUserModel.City);
        new RegisterFormSelectElements(driver,RegisterFormPatternsModel.State).chooseSelectedOption(NewUserModel.State);
        new RegisterFormInputFields(driver,RegisterFormPatternsModel.PostCode).fillInputField(NewUserModel.ZipCode);
        new RegisterFormSelectElements(driver,RegisterFormPatternsModel.Country).chooseSelectedOption(NewUserModel.Country);
        new RegisterFormInputFields(driver,RegisterFormPatternsModel.MobilePhone).fillInputField(NewUserModel.MobilePhone);
        new RegisterFormInputFields(driver,RegisterFormPatternsModel.Alias).fillInputField(NewUserModel.AddressAlias);
        return this;
    }

    @Step("Clicking register button and checking is registration success")
    public CreatingNewUserSteps clickingRegisterButton() {
        createAnAccountPage.clickButton(myAccountPage,REGISTER_BUTTON_LABEL);
        successfulLoadingPage(myAccountPage);
        return this;
    }

}
