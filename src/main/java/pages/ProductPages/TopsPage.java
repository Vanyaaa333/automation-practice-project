package pages.ProductPages;

import constants.PagesConstants;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;

@Log4j2
public class TopsPage extends BasePage {

    private static final By TOPS_LABEL = By.xpath("//span[contains(.,'Tops')]");

    public TopsPage(WebDriver driver, int timeOutInSeconds) {
        super(driver, timeOutInSeconds);
    }

    @Override
    public void isPageLoadedWaiter() {
        log.info("Checking that the Tops page was opened");
        explicitlyWait.until(ExpectedConditions.visibilityOfElementLocated(TOPS_LABEL));
    }

    @Override
    public BasePage openPage() {
        log.info("Open Tops Page {}", PagesConstants.TOPS_PAGE_URL);
        driver.get(PagesConstants.TOPS_PAGE_URL);
        return this;
    }
}

