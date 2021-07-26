package pages.ProductPages;

import constants.PagesConstants;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;

@Log4j2
public class EveningDressesPage extends BasePage {

    private static final By EVENING_DRESSES_LABEL = By.xpath("//span[contains(.,'Evening Dresses')]");

    public EveningDressesPage(WebDriver driver, int timeOutInSeconds) {
        super(driver, timeOutInSeconds);
    }

    @Override
    public void isPageLoadedWaiter() {
        log.info("Checking that the Evening Dresses page was opened");
        explicitlyWait.until(ExpectedConditions.visibilityOfElementLocated(EVENING_DRESSES_LABEL));
    }

    @Override
    public BasePage openPage() {
        log.info("Open Evening Dresses Page {}", PagesConstants.EVENING_DRESSES_PAGE_URL);
        driver.get(PagesConstants.EVENING_DRESSES_PAGE_URL);
        return this;
    }
}

