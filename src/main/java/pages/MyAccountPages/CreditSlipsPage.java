package pages.MyAccountPages;

import constants.PagesConstants;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;

@Log4j2
public class CreditSlipsPage extends BasePage {

    private static final By CREDIT_SLIPS_PAGE_LABEL = By.xpath("//h1[contains(.,'Credit slips')]");

    public CreditSlipsPage(WebDriver driver, int timeOutInSeconds) {
        super(driver, timeOutInSeconds);
    }

    @Override
    public void isPageLoadedWaiter() {
        log.info("Checking that the Credit slips page was opened");
        explicitlyWait.until(ExpectedConditions.visibilityOfElementLocated(CREDIT_SLIPS_PAGE_LABEL));
    }

    @Override
    public BasePage openPage() {
        log.info("Open Credit slips Page {}", PagesConstants.CREDIT_SLIPS_PAGE_URL);
        driver.get(PagesConstants.CREDIT_SLIPS_PAGE_URL);
        return this;
    }

}

