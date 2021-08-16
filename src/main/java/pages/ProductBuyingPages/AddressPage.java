package pages.ProductBuyingPages;

import constants.PagesConstants;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;

@Log4j2
public class AddressPage extends BasePage {

    private static final By ADDRESS_PAGE_LABEL = By.xpath("//h1[contains(.,'Addresses')]");
    public static final By PROCEED_TO_CHECKOUT_SHIPPING_PAGE_BUTTON = By.xpath("//button//span[contains(.,'Proceed to checkout')]");

    public AddressPage(WebDriver driver, int timeOutInSeconds) {
        super(driver, timeOutInSeconds);
    }

    @Override
    public void isPageLoadedWaiter() {
        log.info("Checking that the Address page was opened");
        explicitlyWait.until(ExpectedConditions.visibilityOfElementLocated(ADDRESS_PAGE_LABEL));
    }

    @Override
    public BasePage openPage() {
        log.info("Open Address Page {}", PagesConstants.ADDRESS_PAGE_URL);
        driver.get(PagesConstants.ADDRESS_PAGE_URL);
        return this;
    }

}

