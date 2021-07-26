package pages.ProductPages;

import constants.PagesConstants;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;

@Log4j2
public class SummerDressesPage extends BasePage {

    private static final By SUMMER_DRESSES_LABEL = By.xpath("//span[contains(.,'Summer Dresses')]");

    public SummerDressesPage(WebDriver driver, int timeOutInSeconds) {
        super(driver, timeOutInSeconds);
    }

    @Override
    public void isPageLoadedWaiter() {
        log.info("Checking that the Summer Dresses page was opened");
        explicitlyWait.until(ExpectedConditions.visibilityOfElementLocated(SUMMER_DRESSES_LABEL));
    }

    @Override
    public BasePage openPage() {
        log.info("Open Summer Dresses Page {}", PagesConstants.SUMMER_DRESSES_PAGE_URL);
        driver.get(PagesConstants.SUMMER_DRESSES_PAGE_URL);
        return this;
    }
}

