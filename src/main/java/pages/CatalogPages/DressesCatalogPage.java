package pages.CatalogPages;

import constants.PagesConstants;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;

@Log4j2
public class DressesCatalogPage extends BasePage {

    private static final By DRESSES_LABEL = By.xpath("//span[contains(.,'Dresses')]");

    public DressesCatalogPage(WebDriver driver, int timeOutInSeconds) {
        super(driver, timeOutInSeconds);
    }

    @Override
    public void isPageLoadedWaiter() {
        log.info("Checking that the Dresses page was opened");
        explicitlyWait.until(ExpectedConditions.visibilityOfElementLocated(DRESSES_LABEL));
    }

    @Override
    public BasePage openPage() {
        log.info("Open Dresses Page {}", PagesConstants.DRESSES_PAGE_URL);
        driver.get(PagesConstants.DRESSES_PAGE_URL);
        return this;
    }
}
