package steps;

import elements.CatalogElements.CatalogCheckboxes;
import elements.ProductElement;
import io.qameta.allure.Step;
import models.ProductModels.PrintedDressModel;
import models.ProductModels.PrintedSummerDressModel;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import pages.ProductBuyingPages.OrderConfirmationPage;
import pages.ProductPages.ProductInformationPage;
import pages.ShoppingCartPage;

import static pages.ProductBuyingPages.OrderConfirmationPage.SUCCESSFUL_PRODUCT_BUYING_LABEL;
import static pages.ProductBuyingPages.OrderConfirmationPage.SUCCESSFUL_PRODUCT_BUYING_LABEL_LOCATOR;
import static pages.ShoppingCartPage.*;

public class ActionsWithProductSteps extends AbstractStep{

    protected ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver,3);
    protected ProductInformationPage productInformationPage = new ProductInformationPage(driver,3);
    protected OrderConfirmationPage orderConfirmationPage = new OrderConfirmationPage(driver,3);

    public ActionsWithProductSteps(WebDriver driver) {
        super(driver);
    }

    @DataProvider()
    public static Object[][] productModels() {
        return new Object[][]{
                {PrintedSummerDressModel.Color, PrintedSummerDressModel.Categories, PrintedSummerDressModel.Availability, PrintedSummerDressModel.Composition, PrintedSummerDressModel.Condition, PrintedSummerDressModel.Style, PrintedSummerDressModel.Name},
                {PrintedDressModel.Color, PrintedDressModel.Categories, PrintedDressModel.Availability, PrintedDressModel.Composition, PrintedDressModel.Condition, PrintedDressModel.Style, PrintedDressModel.Name},
                //{PrintedChiffonDressModel.Color, PrintedChiffonDressModel.Categories, PrintedChiffonDressModel.Availability, PrintedChiffonDressModel.Composition, PrintedChiffonDressModel.Condition, PrintedChiffonDressModel.Style, PrintedChiffonDressModel.Name},
                //{BlouseModel.Color, BlouseModel.Categories, BlouseModel.Availability, BlouseModel.Composition, BlouseModel.Condition, BlouseModel.Style, BlouseModel.Name},
                //{FadedShortSleeveTShirtsModel.Color, FadedShortSleeveTShirtsModel.Categories, FadedShortSleeveTShirtsModel.Availability, FadedShortSleeveTShirtsModel.Composition, FadedShortSleeveTShirtsModel.Condition, FadedShortSleeveTShirtsModel.Style, FadedShortSleeveTShirtsModel.Name},
        };
    }


    @Step("Select catalog checkboxes to find product")
    public ActionsWithProductSteps selectCatalogCheckboxes(String color,
                                                           String categories,
                                                           String availability,
                                                           String composition,
                                                           String condition,
                                                           String style) {
        new CatalogCheckboxes(driver, color).selectCheckbox();
        new CatalogCheckboxes(driver, categories).selectCheckbox();
        new CatalogCheckboxes(driver, availability).selectCheckbox();
        new CatalogCheckboxes(driver, composition).selectCheckbox();
        new CatalogCheckboxes(driver, condition).selectCheckbox();
        new CatalogCheckboxes(driver, style).selectCheckbox();
        return this;
    }

    @Step("Add new product to cart")
    public ActionsWithProductSteps addSelectedProductToCart(String productName) {
        new ProductElement(driver,productName).addProductToCart();
        return this;
    }

    @Step("Get more information about selected product")
    public ActionsWithProductSteps getSelectedProductInformation(String productName) {
        new ProductElement(driver,productName).getMoreProductInformationToCart();
        successfulLoadingPage(productInformationPage);
        return this;
    }

    @Step("Checking that the product was added")
    public ActionsWithProductSteps checkingProductAdd(String productName, String productAvailability) {
        Assert.assertEquals(shoppingCartPage.getActualLocatorText(ACTUAL_ADDED_PRODUCT_NAME_LOCATOR),productName, "Incorrect text");
        Assert.assertEquals(shoppingCartPage.getActualLocatorText(ACTUAL_ADDED_PRODUCT_AVAILABILITY_LOCATOR), productAvailability, "Incorrect text");
               return this;
    }

    @Step("Delete added product")
    public void deleteProduct() {
        shoppingCartPage.clickButton(shoppingCartPage,DELETE_PRODUCT_BUTTON);
    }

    @Step("Checking that product buying is success")
    public void isProductBuyingSuccess() {
        Assert.assertEquals(orderConfirmationPage.getActualLocatorText(SUCCESSFUL_PRODUCT_BUYING_LABEL_LOCATOR),SUCCESSFUL_PRODUCT_BUYING_LABEL,
                "Product buying has failed");
    }

}
