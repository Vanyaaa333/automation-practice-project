package steps;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import pages.ModalPages.AddToCartModalPage;
import pages.ShoppingCartPage;
import pages.CatalogPages.WomenCatalogPage;

import static pages.ModalPages.AddToCartModalPage.CONTINUE_SHOPPING_BUTTON;
import static pages.ModalPages.AddToCartModalPage.PROCEED_TO_CHECKOUT_BUTTON;

public class AddToCartModalPageSteps extends AbstractStep{

    protected AddToCartModalPage addToCartModalPage = new AddToCartModalPage(driver,3);
    protected WomenCatalogPage womenCatalog = new WomenCatalogPage(driver,3);
    protected ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver,3);

    public AddToCartModalPageSteps(WebDriver driver) {
        super(driver);
    }

    @Step("Click continue shopping button")
    public AddToCartModalPageSteps clickContinueShoppingButton() {
        addToCartModalPage.clickButton(womenCatalog,CONTINUE_SHOPPING_BUTTON);
        womenCatalog.isPageLoadedWaiter();
        return this;
    }

    @Step("Click proceed to checkout button")
    public AddToCartModalPageSteps openCartWithClickingProceedToCheckoutButton() {
        addToCartModalPage.clickButton(womenCatalog,PROCEED_TO_CHECKOUT_BUTTON);
        shoppingCartPage.isPageLoadedWaiter();
        return this;
    }

}
