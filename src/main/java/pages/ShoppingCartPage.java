package pages;

import constants.PagesConstants;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

@Log4j2
public class ShoppingCartPage extends BasePage{

    private static final By SHOPPING_CART_LABEL = By.cssSelector("#cart_title");
    public static final By ACTUAL_ADDED_PRODUCT_NAME_LOCATOR = By.xpath("//td//p[@class='product-name']//a");
    public static final By ACTUAL_ADDED_PRODUCT_AVAILABILITY_LOCATOR = By.xpath("//td/span[@class='label label-success']");
    public static final By DELETE_PRODUCT_BUTTON = By.cssSelector(".icon-trash");
    public static final By PROCEED_TO_CHECKOUT_ADDRESSES_BUTTON = By.xpath("//p[@class='cart_navigation clearfix']//a[@title='Proceed to checkout']");

    public ShoppingCartPage(WebDriver driver, int timeOutInSeconds) {
        super(driver, timeOutInSeconds);
    }

    @Override
    public void isPageLoadedWaiter() {
        log.info("Checking that the SHOPPING CART page was opened");
        explicitlyWait.until(ExpectedConditions.visibilityOfElementLocated(SHOPPING_CART_LABEL));
    }

    @Override
    public BasePage openPage() {
        log.info("Open SHOPPING CART Page {}", PagesConstants.SHOPPING_CART_PAGE_URL);
        driver.get(PagesConstants.SHOPPING_CART_PAGE_URL);
        return this;
    }

}
