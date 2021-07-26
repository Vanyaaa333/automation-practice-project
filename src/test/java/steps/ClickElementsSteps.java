package steps;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import pages.*;
import pages.ProductBuyingPages.*;

import static pages.ProductBuyingPages.AddressPage.PROCEED_TO_CHECKOUT_SHIPPING_PAGE_BUTTON;
import static pages.ProductBuyingPages.BankWirePaymentPage.CONFIRM_ODER_BUTTON;
import static pages.ProductBuyingPages.PaymentPage.PAY_BY_BANK_WIRE_BUTTON;
import static pages.ProductBuyingPages.ShippingPage.AGREE_TO_THE_TERMS_CHECKBOX;
import static pages.ProductBuyingPages.ShippingPage.PROCEED_TO_CHECKOUT_BUTTON;
import static pages.ShoppingCartPage.PROCEED_TO_CHECKOUT_ADDRESSES_BUTTON;


public class ClickElementsSteps extends AbstractStep{

    private final AddressPage addressPage = new AddressPage(driver,3);
    private final ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver,3);
    private final ShippingPage shippingPage = new ShippingPage(driver,3);
    private final PaymentPage paymentPage = new PaymentPage(driver,3);
    private final BankWirePaymentPage bankWirePaymentPage = new BankWirePaymentPage(driver,3);
    private final OrderConfirmationPage orderConfirmationPage = new OrderConfirmationPage(driver,3);

    public ClickElementsSteps(WebDriver driver) {
        super(driver);
    }

    @Step("Checking that the Address page was opened")
    public ClickElementsSteps openAddressesPage() {
        shoppingCartPage.clickButton(shoppingCartPage, PROCEED_TO_CHECKOUT_ADDRESSES_BUTTON);
        successfulLoadingPage(addressPage);
        return this;
    }

    @Step("Click to I agree to the terms")
    public ClickElementsSteps clickToAgreeToTheTermsCheckbox() {
        shippingPage.clickButton(shippingPage, AGREE_TO_THE_TERMS_CHECKBOX);
        return this;
    }

    @Step("Checking that the Shipping page was opened")
    public ClickElementsSteps openShippingPage() {
        addressPage.clickButton(addressPage, PROCEED_TO_CHECKOUT_SHIPPING_PAGE_BUTTON);
        successfulLoadingPage(shippingPage);
        return this;
    }

    @Step("Checking that the Payment page was opened")
    public ClickElementsSteps openPaymentPage() {
        shippingPage.clickButton(shippingPage, PROCEED_TO_CHECKOUT_BUTTON);
        successfulLoadingPage(paymentPage);
        return this;
    }

    @Step("Checking that the Bank wire payment page was opened")
    public ClickElementsSteps openBankWirePaymentPage() {
        paymentPage.clickButton(paymentPage, PAY_BY_BANK_WIRE_BUTTON);
        successfulLoadingPage(bankWirePaymentPage);
        return this;
    }

    @Step("Checking that the Oder confirmation page was opened")
    public ClickElementsSteps openOderConfirmationPage() {
        bankWirePaymentPage.clickButton(bankWirePaymentPage, CONFIRM_ODER_BUTTON);
        successfulLoadingPage(orderConfirmationPage);
        return this;
    }

}
