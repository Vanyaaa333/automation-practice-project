package pages.ModalPages;

import constants.PagesConstants;
import elements.AbstractElement;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;
import utils.LocatorsUtil;

@Log4j2
public class AddToCartModalPage extends BasePage {

    private static final By SUCCESSFULLY_ADDED_PRODUCT_TO_CART_LABEL = By.xpath("//h2[contains(.,'Product successfully added')]");
    public static final By CONTINUE_SHOPPING_BUTTON = By.xpath("//span[@title='Continue shopping']");
    public static final By PROCEED_TO_CHECKOUT_BUTTON = By.xpath("//a[@title='Proceed to checkout']");

    public AddToCartModalPage(WebDriver driver, int timeOutInSeconds) {
        super(driver, timeOutInSeconds);
    }

    @Override
    public void isPageLoadedWaiter() {
        log.info("Checking that the Add to cart modal page was opened");
        explicitlyWait.until(ExpectedConditions.visibilityOfElementLocated(SUCCESSFULLY_ADDED_PRODUCT_TO_CART_LABEL));
    }

    @Override
    public BasePage openPage() {
        return this;
    }

}
