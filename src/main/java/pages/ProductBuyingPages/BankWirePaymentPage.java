package pages.ProductBuyingPages;

import constants.PagesConstants;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;

@Log4j2
public class BankWirePaymentPage extends BasePage {

    private static final By BANK_WIRE_PAYMENT_PAGE_LABEL = By.xpath("//h3[contains(.,'Bank-wire payment.')]");
    public static final By CONFIRM_ODER_BUTTON = By.xpath("//span[contains(.,'I confirm my order')]");

    public BankWirePaymentPage(WebDriver driver, int timeOutInSeconds) {
        super(driver, timeOutInSeconds);
    }

    @Override
    public void isPageLoadedWaiter() {
        log.info("Checking that the Bank wire payment page was opened");
        explicitlyWait.until(ExpectedConditions.visibilityOfElementLocated(BANK_WIRE_PAYMENT_PAGE_LABEL));
    }

    @Override
    public BasePage openPage() {
        log.info("Open Bank wire payment Page {}", PagesConstants.BANK_WIRE_PAYMENT_PAGE_URL);
        driver.get(PagesConstants.BANK_WIRE_PAYMENT_PAGE_URL);
        return this;
    }

}

