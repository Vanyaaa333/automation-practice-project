package pages.ProductPages;

import constants.PagesConstants;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;

@Log4j2
public class CasualDressesPage extends BasePage {

    private static final By CASUAL_DRESSES_LABEL = By.xpath("//span[contains(.,'Casual Dresses')]");

    public CasualDressesPage(WebDriver driver, int timeOutInSeconds) {
        super(driver, timeOutInSeconds);
    }

    @Override
    public void isPageLoadedWaiter() {
        log.info("Checking that the Casual Dresses page was opened");
        explicitlyWait.until(ExpectedConditions.visibilityOfElementLocated(CASUAL_DRESSES_LABEL));
    }

    @Override
    public BasePage openPage() {
        log.info("Open Casual Dresses Page {}", PagesConstants.CASUAL_DRESSES_PAGE_URL);
        driver.get(PagesConstants.CASUAL_DRESSES_PAGE_URL);
        return this;
    }
}
