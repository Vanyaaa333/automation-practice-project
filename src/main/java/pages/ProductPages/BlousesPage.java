package pages.ProductPages;

import constants.PagesConstants;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;

@Log4j2
public class BlousesPage extends BasePage {

    private static final By BLOUSES_LABEL = By.xpath("//span[contains(.,'Blouses')]");

    public BlousesPage(WebDriver driver, int timeOutInSeconds) {
        super(driver, timeOutInSeconds);
    }

    @Override
    public void isPageLoadedWaiter() {
        log.info("Checking that the Blouses page was opened");
        explicitlyWait.until(ExpectedConditions.visibilityOfElementLocated(BLOUSES_LABEL));
    }

    @Override
    public BasePage openPage() {
        log.info("Open Blouses Page {}", PagesConstants.BLOUSES_PAGE_URL);
        driver.get(PagesConstants.BLOUSES_PAGE_URL);
        return this;
    }
}


