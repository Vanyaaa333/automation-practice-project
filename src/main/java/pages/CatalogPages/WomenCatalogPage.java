package pages.CatalogPages;

import constants.PagesConstants;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;

@Log4j2
public class WomenCatalogPage extends BasePage {

    private static final By WOMEN_SHOP_LABEL = By.xpath("//span[contains(.,'Women')]");

    public WomenCatalogPage(WebDriver driver, int timeOutInSeconds) {
        super(driver, timeOutInSeconds);
    }

    @Override
    public void isPageLoadedWaiter() {
        log.info("Checking that the WOMEN page was opened");
        explicitlyWait.until(ExpectedConditions.visibilityOfElementLocated(WOMEN_SHOP_LABEL));
    }

    @Override
    public BasePage openPage() {
        log.info("Open WOMEN Page {}", PagesConstants.WOMEN_SHOP_PAGE_URL);
        driver.get(PagesConstants.WOMEN_SHOP_PAGE_URL);
        return this;
    }

}
