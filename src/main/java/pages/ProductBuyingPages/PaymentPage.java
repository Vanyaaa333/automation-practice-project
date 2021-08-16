package pages.ProductBuyingPages;

import constants.PagesConstants;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;

@Log4j2
public class PaymentPage extends BasePage {

    private static final By PAYMENT_PAGE_LABEL = By.xpath("//h1[contains(.,'Please choose your payment method')]");
    public static final By PAY_BY_BANK_WIRE_BUTTON = By.xpath("//a[@class='bankwire']");
    public static final By PAY_BY_CHECK_BUTTON = By.xpath("//a[@class='//a[@class='cheque']']");

    public PaymentPage(WebDriver driver, int timeOutInSeconds) {
        super(driver, timeOutInSeconds);
    }

    @Override
    public void isPageLoadedWaiter() {
        log.info("Checking that the Payment page was opened");
        explicitlyWait.until(ExpectedConditions.visibilityOfElementLocated(PAYMENT_PAGE_LABEL));
    }

    @Override
    public BasePage openPage() {
        log.info("Open Payment Page {}", PagesConstants.PAYMENT_PAGE_URL);
        driver.get(PagesConstants.PAYMENT_PAGE_URL);
        return this;
    }

}