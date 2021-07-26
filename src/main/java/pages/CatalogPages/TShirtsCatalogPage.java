package pages.CatalogPages;

import constants.PagesConstants;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;

@Log4j2
public class TShirtsCatalogPage extends BasePage {

    private static final By T_SHIRTS_LABEL = By.xpath("//span[contains(.,'T-shirts')]");

    public TShirtsCatalogPage(WebDriver driver, int timeOutInSeconds) {
        super(driver, timeOutInSeconds);
    }

    @Override
    public void isPageLoadedWaiter() {
        log.info("Checking that the T-Shirts page was opened");
        explicitlyWait.until(ExpectedConditions.visibilityOfElementLocated(T_SHIRTS_LABEL));
    }

    @Override
    public BasePage openPage() {
        log.info("Open T-Shirts Page {}", PagesConstants.T_SHIRTS_PAGE_URL);
        driver.get(PagesConstants.T_SHIRTS_PAGE_URL);
        return this;
    }
}
