package pages.ProductBuyingPages;

import constants.PagesConstants;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;

@Log4j2
public class CheckPaymentPage extends BasePage {

    private static final By CHECK_PAYMENT_PAGE_LABEL = By.xpath("//h3[contains(.,'Check payment')]");
    private static final By CHECK_PAYMENT_CONFIRM_BUTTON = By.xpath("//span[text()='I confirm my order']");

    public CheckPaymentPage(WebDriver driver, int timeOutInSeconds) {
        super(driver, timeOutInSeconds);
    }

    @Override
    public void isPageLoadedWaiter() {
        log.info("Checking that the Check payment page was opened");
        explicitlyWait.until(ExpectedConditions.visibilityOfElementLocated(CHECK_PAYMENT_PAGE_LABEL));
    }

    @Override
    public BasePage openPage() {
        log.info("Open Check payment Page {}", PagesConstants.CHECK_PAYMENT_PAGE_URL);
        driver.get(PagesConstants.CHECK_PAYMENT_PAGE_URL);
        return this;
    }

}

