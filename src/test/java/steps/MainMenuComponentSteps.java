package steps;

import components.MainMenuComponent;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.CatalogPages.WomenCatalogPage;

import static components.MainMenuComponent.WOMEN_PAGE_BUTTON;

public class MainMenuComponentSteps extends AbstractStep{

    protected MainMenuComponent mainMenuComponent = new MainMenuComponent(driver,3);
    protected WomenCatalogPage womenCatalog = new WomenCatalogPage(driver,3);

    public MainMenuComponentSteps(WebDriver driver) {
        super(driver);
    }

    @Step("Open women catalog page with Main menu button")
    public MainMenuComponentSteps openWomenCatalogPageWithMainMenuButton() {
        mainMenuComponent.openPageOfMainMenu(WOMEN_PAGE_BUTTON);
        successfulLoadingPage(womenCatalog);
        return this;
    }

    @Step("Checking that product cart is empty")
    public MainMenuComponentSteps isCartEmpty() {
        Assert.assertEquals(mainMenuComponent.getActualProductNumberInCart(),"","Cart isn't empty, delete all products to continue");
        return this;
    }

    @Step("Checking that product number is right")
    public MainMenuComponentSteps isProductNumberInCartRight(String expectedProductNumber) {
        Assert.assertEquals(mainMenuComponent.getActualProductNumberInCart(),expectedProductNumber,"Product number in cart isn't right");
        return this;
    }

}
