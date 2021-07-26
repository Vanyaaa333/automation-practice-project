package tests.ProductTests;

import io.qameta.allure.*;
import models.ProductModels.BlouseModel;
import org.testng.annotations.Test;
import steps.ActionsWithProductSteps;
import tests.PreconditionsForSomeTests;

@Owner("Kazak Ivan")
@Epic("Smoke tests")
@Feature("ProductAddingTest")
public class ActionsWithProductTests extends PreconditionsForSomeTests {

    public void preconditionsForSomeTests(){
        mainMenuComponentSteps
                .openWomenCatalogPageWithMainMenuButton()
                .isCartEmpty();
    }

    @Test(description = "Add new product test",dataProvider = "productModels", dataProviderClass = ActionsWithProductSteps.class)
    @Severity(value = SeverityLevel.BLOCKER)
    public void addNewProductTest(String color,
                                  String categories,
                                  String availability,
                                  String composition,
                                  String condition,
                                  String style,
                                  String name) {
        preconditionsForSomeTests();
        actionsWithProductSteps
                .selectCatalogCheckboxes(color, categories, availability,composition, condition, style)
                .addSelectedProductToCart(name);
        addToCartModalPageSteps
                .openCartWithClickingProceedToCheckoutButton();
        actionsWithProductSteps
                .checkingProductAdd(name, availability);
    }

    @Test(description = "Delete added product test")
    @Severity(value = SeverityLevel.CRITICAL)
    public void deleteAddedProductTest() throws InterruptedException {
        preconditionsForSomeTests();
        actionsWithProductSteps
                .addSelectedProductToCart(BlouseModel.Name);
        addToCartModalPageSteps
                .openCartWithClickingProceedToCheckoutButton();
        actionsWithProductSteps
                .checkingProductAdd(BlouseModel.Name, BlouseModel.Availability);
        actionsWithProductSteps
                .deleteProduct();
        mainMenuComponentSteps
                .isCartEmpty();
    }

    @Test(description = "Get more selected product information test")
    @Severity(value = SeverityLevel.CRITICAL)
    public void getMoreSelectedProductInfoTest() {
        preconditionsForSomeTests();
        actionsWithProductSteps
                .getSelectedProductInformation(BlouseModel.Name);
    }

    @Test(description = "Full product buying flow")
    @Severity(value = SeverityLevel.BLOCKER)
    public void fullProductBuyingTest() {
        preconditionsForSomeTests();
        actionsWithProductSteps
                .addSelectedProductToCart(BlouseModel.Name);
        addToCartModalPageSteps
                .openCartWithClickingProceedToCheckoutButton();
        actionsWithProductSteps
                .checkingProductAdd(BlouseModel.Name, BlouseModel.Availability);
        clickElementsSteps
                .openAddressesPage()
                .openShippingPage()
                .clickToAgreeToTheTermsCheckbox()
                .openPaymentPage()
                .openBankWirePaymentPage()
                .openOderConfirmationPage();
        actionsWithProductSteps
                .isProductBuyingSuccess();
    }


}
