package pages.ProductBuyingPages;

import constants.PagesConstants;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;

@Log4j2
public class OrderConfirmationPage extends BasePage {

    private static final By ODER_CONFIRMATION_PAGE_LABEL = By.xpath("//h1[text()='Order confirmation']");
    public static final By SUCCESSFUL_PRODUCT_BUYING_LABEL_LOCATOR = By.xpath("//strong[contains(.,'Your order on My Store is complete.')]");
    public static final String SUCCESSFUL_PRODUCT_BUYING_LABEL = "Your order on My Store is complete.";

    public OrderConfirmationPage(WebDriver driver, int timeOutInSeconds) {
        super(driver, timeOutInSeconds);
    }

    @Override
    public void isPageLoadedWaiter() {
        log.info("Checking that the Order confirmation page was opened");
        explicitlyWait.until(ExpectedConditions.visibilityOfElementLocated(ODER_CONFIRMATION_PAGE_LABEL));
    }

    @Override
    public BasePage openPage() {
        log.info("Open Order confirmation Page {}", PagesConstants.ODER_CONFIRMATION_PAGE_URL);
        driver.get(PagesConstants.ODER_CONFIRMATION_PAGE_URL);
        return this;
    }

}


